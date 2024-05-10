public class WeightConversion {
    private double weight;

    public WeightConversion(double weight) {
        this.weight = weight;
    }
    public static double poundsToKilograms(double pounds) {
        return Math.round(pounds * 0.45359237);
    }

    public static double kilogramsToPounds(double kilograms) {
        return Math.round(kilograms * 2.20462262185);
    }
}
