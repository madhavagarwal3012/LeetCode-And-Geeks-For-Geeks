class Solution {
    public double[] convertTemperature(double Celsius) {
        double Temperature[] = new double[2];
        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.80 + 32.00;

        Temperature[0] = Kelvin;
        Temperature[1] = Fahrenheit;

        return Temperature;
    }
}