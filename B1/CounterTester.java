public class CounterTester {
    public static void main(String[] args) {
        Counter a = new Counter(); // Erzeugen eines Zählers a
        Counter b = new Counter(); // Erzeugen eines Zählers b
     
        for(int i = 0; i < 10; ++i) {
            a.increment(); // Hochzählen von a
        }
//            a.increment(); // Nochmaliges Hochzählen von a
     
        System.out.println("a=" + a.get()); // Liefert: a=2
        System.out.println("b=" + b.get()); // Liefert: b=0
        a.reset();
        System.out.println("a (nach reset)=" + a.get()); // Liefert?
    }
}
