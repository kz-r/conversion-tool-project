import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ipLookup {
    private String ipAddress;

    public ipLookup(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void lookup() {
        try {
            String URL = "http://ip-api.com/json/" + ipAddress;

            URL url = new URL(URL);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");


            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);


            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            formatResponse(response.toString());

            con.disconnect();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void formatResponse(String response) {
        System.out.println("\nFormatted API Response:");
        System.out.println("----------------------");
        response = response.replace("{", "{\n  ");
        response = response.replace(",", ",\n  ");
        response = response.replace("}", "\n}");
        System.out.println(response);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }

        String ipAddress = args[0];
        ipLookup ipLookup = new ipLookup(ipAddress);
        ipLookup.lookup();
    }
}
