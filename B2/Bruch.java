public class Bruch implements Comparable<Bruch> {
    private int num; // Zähler
    private int denom; // Nenner

    /* Konstruktor */
    public Bruch(int num, int denom) {
        if (denom != 0) { // Gultiger Bruch
            if (denom < 0) { // Nenner negativ => Bruch negativ
                this.num = -num;
                this.denom = -denom;
            } else {
                this.num = num;
                this.denom = denom;
                reduce(); // kürzen mittels ggT()
            }
        } else { // Nenner = 0
            throw new ArithmeticException();
        }
    }

    public Bruch() { // 0 als Bruch
        this.num = 0;
        this.denom = 1;
    }

    public Bruch(int num) { // Ganze Zahlen als Bruch
        this.num = num;
        this.denom = 1;
    }

    /* getter(redundant) */
    public int getN() {
        return num;
    }

    public int getD() {
        return denom;
    }

    /* printer */
    public String toString() {
        return num + " / " + denom;
    }

    /* Arithmetik */
    public Bruch add(Bruch other) {
        int num = this.num * other.denom + other.num * this.denom;
        int denom = this.denom * other.denom;
        return new Bruch(num, denom);
    }

    public Bruch sub(Bruch other) {
        int num = this.num * other.denom - other.num * this.denom;
        int denom = this.denom * other.denom;
        return new Bruch(num, denom);
    }

    public Bruch mult(Bruch other) {
        int num = this.num * other.num;
        int denom = this.denom * other.denom;
        return new Bruch(num, denom);
    }

    public Bruch reverse() {
        return new Bruch(denom, num);
    }

    public Bruch div(Bruch other) {
        return mult(other.reverse());
    }

    /* sonstige Hilfsmethoden */
    // TODO: clone()
    private int ggt() { // ggT iterativ
        int a = Math.abs(num); // falls Zähler negativ
        int b = denom;

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return ((b == 0) ? a : b);
    }

    private void reduce() {
        if (num != 0) {
            int ggt = ggt();
            num /= ggt;
            denom /= ggt;
        } else {
            denom = 1;
        }
    }

    public double toDouble() {
        return (double) num / (double) denom;
    }

    public boolean equals(Bruch other) {
        return num == other.num & denom == other.denom;
    }

    public int compareTo(Bruch other) {
        if (this.equals(other)) {
            return 0;
        }
        return this.toDouble() > other.toDouble() ? 1 : -1;
    }
}
