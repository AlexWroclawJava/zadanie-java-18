public class ArrayTest {

    public static void main(String[] args) {

        int[][] tablica1 = {{1, 0, 3}, {2, 4}};
        int[][] tablica2 = {{1, 0, 3}, {1, 4}};

        ArrayComparator arrayComparator = new ArrayComparator();
        if (arrayComparator.compare(tablica1, tablica2)){
            System.out.println("Tablice są identyczne");
        } else {
            System.out.println("Tablice NIE są identyczne");
        }
    }
}