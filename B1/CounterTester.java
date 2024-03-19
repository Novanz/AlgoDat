public class CounterTester {
    public static void main(String[] args) {
        Counter a = new Counter(); // Erzeugen eines Zählers a
//        Counter b = new Counter(); // Erzeugen eines Zählers b
     
        for(int i = 0; i < 10; ++i) {
            a.increment(); // Hochzählen von a
        }
        a.save();// Aktueler Wert wird gesichert(hier 10)
         
        for(int i = 5; i > 0; i--) {
            a.decrement(); // Runterzählen von a
        }
     
        System.out.println("a=" + a.get() + " | soll: 5" ); // Liefert: a=5
        a.restore();
        System.out.println("a (nach restore)=" + a.get() + " | soll: 10"); // Liefert: a=10
        a.reset();
        System.out.println("a (nach reset)=" + a.get()); // Liefert?
    }
}
