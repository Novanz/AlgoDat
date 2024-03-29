//Counter Klasse aus dem Script
public class Counter {
    private int x; // Zählerstand
    private int current;
    
    public Counter() { // Konstruktor
       x = 0;
       current = -1;
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
        if(x < 0) {
            x--;
        }
    }

    public void save() {
        current = x;
    }

    public void restore() {
        try {
            if(current < 0 ) {
//              System.out.println("Fehler");
                throw new Exception("Fehler");
            } else {
                x = current;
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
