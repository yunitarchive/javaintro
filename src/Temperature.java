public class Temperature {
    private double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemptCelcius() {
        return (temperature - 32) * 9/5;
    }

    public void exhibitTemptCelcius() {
        double currentCelcius = getTemptCelcius();
        System.out.println("The current Celsius temperature is: " + currentCelcius + " while the original Fahrenheit temperature is: " + temperature);
    }
}
