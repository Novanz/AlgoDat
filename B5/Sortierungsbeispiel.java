public class Sortierungsbeispiel {
    public static void main(String[] args) {
        Integer[] a= {15, 3, 8, 9, 20, 70, 4, 6};
        Sortierung.mergeSort(a);
        System.out.print("a: ");
        Sortierung.printArray(a);
//        for (int i=0; i<a.length; ++i)
//            System.out.print(a[i] + " ");
        System.out.println();
    }
}