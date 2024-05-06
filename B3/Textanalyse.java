import static java.lang.Character.toUpperCase;

public class Textanalyse {
    public static char gross(char c) {
        return toUpperCase(c);
    }
    public static void main(String[] args) {
        int[] ascii = new int[128]; // So wird es gleich mit Nullen befüllt
        System.out.println("Es sind " + args.length + " Argumente");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + " hat Länge: " + args[i].length());
        }


        for (String arg : args) {
            for (int j = 0; j < arg.length(); j++) {
               // ascii[(gross(arg.charAt(j)))]++; // Vorgaben einhalten
                ascii[(arg.charAt(j))]++;
            }
        }

        System.out.println("\nHäufigkeit der Zeichen");
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0) {
                System.out.println((char) i + " kommt " + ascii[i] + " mal vor");
            }
        }
    }
}
