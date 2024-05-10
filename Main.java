import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean on = true;
        int choice;
        int ans;
        do {
            System.out.println("[ToolPack]");
            System.out.println("1) Temperature Conversion\n" +
                    "2) Weight Conversion\n" +
                    "3) Time Lookup\n" +
                    "4) Currency Conversion\n" +
                    "5) Distance Conversion\n" +
                    "--(Optional fun Tools)--\n" +
                    "6) IP Lookup tool\n" +
                    "7) Spinning DoughNut\uD83D\uDC40(Does not stop)\n" +
                    "8) EXIT");
            choice = obj.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1) Fahrenheit -> Celsius\n" +
                            "2) Celsius -> Fahrenheit");
                    ans = obj.nextInt();
                    switch (ans){
                        case 1:
                            System.out.println("Enter Fahrenheit");
                            double f = obj.nextDouble();
                            System.out.println("Your Celsius is: " + TempConversion.fahrenheitToCelsius(f));
                            break;
                        case 2:
                            System.out.println("Enter Celsius");
                            double c = obj.nextDouble();
                            System.out.println("Your Fahrenheit is: " + TempConversion.celsiusToFahrenheit(c));
                            break;
                        default:
                            System.out.println("Choose (1-2)");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1) Lb -> Kg\n" +
                            "2) Kg -> Lb");
                    ans = obj.nextInt();
                    switch (ans){
                        case 1:
                            System.out.println("Enter Lb");
                            double lb = obj.nextDouble();
                            System.out.println("Your Kilograms are: " + WeightConversion.poundsToKilograms(lb));
                            break;
                        case 2:
                            System.out.println("Enter Kg");
                            double kg = obj.nextDouble();
                            System.out.println("Your Pounds is: " + WeightConversion.kilogramsToPounds(kg));
                            break;
                        default:
                            System.out.println("Choose (1-2)");
                            break;
                    }
                    break;
                case 3:
                    TimeZones timeZoneLister = new TimeZones();

                    String continent, city;
                    System.out.println("What Continent?\n" +
                            "Ex: (America, Africa, Asia, Europe, Antarctica, Australia, Indian, Pacific, Atlantic)");
                    continent = obj.next();
                    System.out.println("What City?");
                    city = obj.next();

                    List<String> timeZones = timeZoneLister.listTimeZones(continent, city);

                        System.out.println("Time for " + city + ":");
                    for (String timeZone : timeZones) {
                        System.out.println(timeZone);
                    }
                    break;
                case 4:
                    System.out.println("1) GBP -> USD\n" +
                            "2) USD -> GBP");
                    ans = obj.nextInt();
                    switch (ans){
                        case 1:
                            System.out.println("Enter GBP");
                            double gbp = obj.nextDouble();
                            System.out.println("Your USD is: " + currencyConvert.GBPTOUSD(gbp));
                            break;
                        case 2:
                            System.out.println("Enter USD");
                            double usd = obj.nextDouble();
                            System.out.println("Your GBP is: " + currencyConvert.USDTOGBP(usd));
                            break;
                        default:
                            System.out.println("Choose (1-2)");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1) FT -> CM\n" +
                            "2) CM -> FT");
                    ans = obj.nextInt();
                    switch (ans){
                        case 1:
                            System.out.println("How many FT?");
                            double ft = obj.nextDouble();
                            System.out.println("Your CM are: " + DistanceConversion.FT_to_CM(ft));
                            break;
                        case 2:
                            System.out.println("How many CM?");
                            double cm = obj.nextDouble();
                            System.out.println("Your FT are: " + DistanceConversion.CM_to_FT(cm));
                            break;
                        default:
                            System.out.println("Choose (1-2)");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Enter an IP Address...");
                    String ip = obj.next();
                    ipLookup.main(new String[]{ip});
                    break;
                case 7:
                    doughnut.main(new String[0]);
                    break;
                case 8:
                    System.out.println("See you soon!");
                    on = false;
                    break;
                default:
                    System.out.println("Not a Valid Option. Try again!");
                    break;
            }
        }while (on);
    }
}