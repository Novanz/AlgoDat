public class Counter {
    private int x; // Zählerstand

    public Counter() { // Konstruktor
       x = 0;
    }
    public void increment() { // Hochzählen
       x++;
    }

    public int get() { // Auslesen
       return x;
    }

    public void reset() { // Zurücksetzen
        x = 0;
    }
}
