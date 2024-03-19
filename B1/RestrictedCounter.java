//Counter Klasse aus dem Script
public class RestrictedCounter extends Counter {
    private int x; // Zählerstand
    private int current;
    private int maxCapacity;
    
    public RestrictedCounter(int maxCapacity) { // Konstruktor
       x = 0;
       current = -1;
       this.maxCapacity = maxCapacity;
    }
    public void increment() { // Hochzählen
        try {
            if(freeCapacity() <= 0 ) {
//              System.out.println("Fehler");
                throw new Exception("Fehler: maximale Kapazität überschrieten!");
            } else {
                x++;
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
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

    public int freeCapacity() {
        return maxCapacity - x;
    }
}
