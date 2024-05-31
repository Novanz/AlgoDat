public class BruchTest {
    public static void prettyCompare(int n) {
        if (n == 0) {
            System.out.println("Objekte sind gleich.");
        } else if (n == -1) {
            System.out.println("Objekt 1 ist kleiner als Objekt 2");
        } else {
            System.out.println("Objekt 1 ist großer als Objekt 2");
        }
    }
    public static void main(String[] args) {
        /*
          Konstruktor Tests:
          Test1: Null als Bruch
          Test2: Ganze Zahl als Bruch
          Test3: Bruchzahl
          Test4: Bruchzahl mit 0 als Nenner
         */
        System.out.println("Konstruktor Tests:\n");
        System.out.println("Null als Bruch :");
        Bruch b0 = new Bruch();
        System.out.println("SOLL:\t 0 / 1");
        System.out.println("IST:\t" + b0 + "\n");

        Bruch b1 = new Bruch(7);
        System.out.println("Ganze Zahl als Bruch :");
        System.out.println("SOLL:\t 7 / 1");
        System.out.println("IST:\t" + b1 + "\n");

        Bruch b2 = new Bruch(6, 9);
        System.out.println("Bruchzahl:");
        System.out.println("SOLL:\t 6 / 9");
        System.out.println("IST:\t" + b2 + "\n");

        System.out.println("Bruchzahl mit 0 als Nenner:");
        System.out.println("SOLL:\t Fehlermeldung");
        System.out.print("IST:\t ");
        try {
            Bruch b3 = new Bruch(6, 0);
        } catch (ArithmeticException e) {
            System.out.println("Teilen durch 0 ist nicht erlaubt!\n");
        }

        /*
          Arithmetische Operationen:
          Test1: Addition
          Test2: Subtraktion
          Test3: Multiplikation
          Test4: Umkehren
          Test5: Division
         */

        System.out.println("Arithmetische Operationen:\n");
        System.out.println("Addition:");
        Bruch b4 = b1.add(b2);
        System.out.println("SOLL:\t 23 / 3");
        System.out.println("IST:\t" + b4.toString() + "\n");

        System.out.println("Subtraktion:");
        Bruch b5 = b1.sub(b2);
        System.out.println("SOLL:\t 19 / 3");
        System.out.println("IST:\t" + b5.toString() + "\n");

        System.out.println("Multiplikation:");
        Bruch b6 = b1.mult(b2);
        System.out.println("SOLL:\t 14 / 3");
        System.out.println("IST:\t" + b6.toString() + "\n");

        System.out.println("Umkehren:");
        Bruch b7 = b6.reverse();
        System.out.println("SOLL:\t 3 / 14");
        System.out.println("IST:\t" + b7.toString() + "\n");

        System.out.println("Division:");
        Bruch b8 = b6.div(b1);
        System.out.println("SOLL:\t 14 / 21");
        System.out.println("IST:\t" + b8.toString() + "\n");
        System.out.println("Compare b7 to b8");
        prettyCompare(b7.compareTo(b7));// gleich
        prettyCompare(b7.compareTo(b8));// kleiner
        prettyCompare(b8.compareTo(b7));// großer
    }
}
