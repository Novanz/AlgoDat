public class PowerFunctions {
    private int exponent;
    private double zahl;
    private Counter countPower;
    private Counter countFastPower;

    public PowerFunctions(int exponent, double zahl) {
        this.exponent = exponent;
        this.zahl = zahl;
        this.countPower = new Counter(); // init with 0, see Counter def
        this.countFastPower = new Counter();
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public double getZahl() {
        return zahl;
    }

    public void setZahl(double zahl) {
        this.zahl = zahl;
    }

    public Counter getCountPower() {
        return countPower;
    }

    public void setCountPower(Counter countPower) {
        this.countPower = countPower;
    }

    public Counter getCountFastPower() {
        return countFastPower;
    }

    public void setCountFastPower(Counter countFastPower) {
        this.countFastPower = countFastPower;
    }

    static double power(double x, int n ) {
        double result = x;
        for (int i = 0; i < n; i++) {
            result*= x;
        }
        return result;
    }
}