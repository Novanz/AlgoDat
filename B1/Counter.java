//Counter Klasse aus dem Script
public class Counter {
    private int x; // Zählerstand
    private int current;
    
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

    public void save() {
        current = x;
    }

    public void restore() {
        if(current < 0 ) {
           System.out.println("Fehler");
       x = current;     
    }
}
