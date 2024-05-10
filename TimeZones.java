import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TimeZones {

    public List<String> listTimeZones(String continent, String City) {
        List<String> timeZones = new ArrayList<>();

        try {

            String URL = "http://worldtimeapi.org/api/timezone/" + continent + "/" + City;

            URL url = new URL(URL);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");


            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String jsonString = response.toString();
            String[] zonesArray = jsonString.split(",");
            for (String zone : zonesArray) {
                timeZones.add(zone.trim());
            }

            con.disconnect();
        } catch (Exception x) {
            x.printStackTrace();
        }

        return timeZones;
    }
}
