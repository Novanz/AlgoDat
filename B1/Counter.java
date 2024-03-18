//Counter Klasse aus dem Script
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
    //Aufrgabe 2
    public void decrement() {
        x--;
    }
}
