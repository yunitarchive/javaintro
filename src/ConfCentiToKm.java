public class ConfCentiToKm {
    private double centival;

    public ConfCentiToKm(double centival) {
        this.centival = centival;
    }

    public double convertToKm() {
        return centival / 100000;
    }


}
