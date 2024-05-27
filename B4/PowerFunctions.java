public class PowerFunctions {
    private int exponent;
    private double zahl;
    private Counter countPower;
    private Counter countFastPower;

    public PowerFunctions() {
    }

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

    public int getCountPower() {
        return countPower.get();
    }

    public void setCountPower(Counter countPower) {
        this.countPower = countPower;
    }

    public int getCountFastPower() {
        return countFastPower.get();
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

    public double fastPower(double x, int n) {
        countFastPower.increment();
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return fastPower(x * x, n / 2);
        else
            return x * fastPower(x * x, (n - 1) / 2);
    }

    public void resetCounters() {
        this.countPower.reset();
        this.countFastPower.reset();
    }
}