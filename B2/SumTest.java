public class SumTest {
    public static Bruch sum() { // Berechne Summe $$\sum_{i=1}^{n}\frac{1}{i}$$ für n=10
        Bruch result = new Bruch(1); // Initialisieren mit 1
        for (int i = 2; i <= 10 ; i++) {
            result = result.add(new Bruch(1, i));
        }
        return result;
    }

    public static double sumDouble() { // Referenz
        double result = 1.0;
        for (int i = 2; i <= 10 ; i++) {
            result+= 1.0 / i;
        }
        return result;
    }

    public static int fak(int n) { // Hilfsfunktion die Fakultät von n berechnet
        int f = 1;
        for (int i = 1; i <= n ; i++) {
            f*= i;
        }
        return f;
    }

    public static Bruch euler() { // Berechne Eulersche Zahl mit vorgegebener Formel
        Bruch result = new Bruch(1); // Initialisieren mit 1
        for (int i = 1; i <= 8 ; i++) { // ACHTUNG! bei i > 8 wird int Zahlenbereich überschritten
            result = result.add(new Bruch(1, fak(i)));
        }
        return result;
    }
    public static void main(String[] args) {
        Bruch summe = sum();
        Bruch e = euler();
        System.out.println("Mit double berechnet:");
        System.out.println(sumDouble());
        System.out.println("Mit Klasse Bruch berechnet:");
        System.out.println(summe);
        System.out.println("Kontrolle:");
        System.out.println((double)summe.getN() / summe.getD());
        System.out.println("Eulersche Zahl:");
        System.out.println("Referenz Math.E = " + Math.E);
        System.out.println("Eigene Berechnung = " + e);
        System.out.println("Eigene Berechnung toDouble() = " + (double)e.getN() / e.getD());
    }
}
