public class Sortierungsbeispiel {
    public static void main(String[] args) {
        Integer[] a = {15, 3, 8, 9, 20, 70, 4, 6};
        Sortierung.mergeSort(a);
        System.out.print("a: ");
        Sortierung.printArray(a);
//        for (int i=0; i<a.length; ++i)
//            System.out.print(a[i] + " ");
        System.out.println();

        String[] strArr = {"banana", "apple", "orange", "grape"};
        System.out.println("Original Text:");
        Sortierung.printArray(strArr);
        Sortierung.mergeSort(strArr);
        System.out.println("Sortierter Text:");
        Sortierung.printArray(strArr);

        String text = "Testen Sie Ihre Implementierung für Felder von Strings";
        String[] strArr1 = text.split("\\s+");
        System.out.println("Original Text:");
        Sortierung.printArray(strArr1);
        Sortierung.mergeSort(strArr1);
        System.out.println("Sortierter Text:");
        Sortierung.printArray(strArr1);

        Bruch[] fracArr = new Bruch[5];
        for (int i = 0; i < 5; i++) {
            fracArr[i] = new Bruch((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
        }
        System.out.println("Original Array:");
        for (Bruch frac : fracArr) {
            System.out.print("\t" + frac + "\t|");
        }
        System.out.println();
        Sortierung.mergeSort(fracArr);
        System.out.println("Sortierter Array:");
        for (Bruch frac : fracArr) {
            System.out.print("\t" + frac + "\t|");
        }
        System.out.println();

    }
}