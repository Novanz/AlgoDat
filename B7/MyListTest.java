public class MyListTest {
    public static void main(String[] args) {
        // Vorgegebene Test
        MyList<Integer> l = new MyList<>();
        for (int i = 1; i <= 10; ++i) {
            l.add(8 * i);
        }
        l.remove(2);
        for (int i = l.size() - 1; i >= 0; --i)
            System.out.print(" " + l.get(i));
        System.out.println();

        // Test mit eigener Klasse
        MyList<Bruch> bruchMyList = new MyList<>();
        for (int i = 0; i < 10; i++) {
            bruchMyList.add(new Bruch((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1));
        }
        System.out.println("Bruche:");
        for (Object frac : bruchMyList) {
            System.out.print("\t" + frac + "\t");
        }
        System.out.println();
        System.out.println("current size " + bruchMyList.size());
        // Test MyList.remove(int i)
        System.out.print("Removed Element: ");
        System.out.println(bruchMyList.remove(5));
        System.out.println("Bruche after remove:");
        for (Object frac : bruchMyList) {
            System.out.print("\t" + frac + "\t");
        }
        System.out.println();
        System.out.println("current size " + bruchMyList.size());
        //System.out.println(bruchMyList.size());
        // Test exceptions
        try {
            System.out.println(bruchMyList.remove(11));
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(bruchMyList.get(11));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
