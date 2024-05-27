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

    public double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result*= x;
            countPower.increment();
        }
        return result;
    }

    public static double fastPower(double x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return fastPower(x * x, n / 2);
        else
            return x * fastPower(x * x, (n - 1) / 2);
    }
}