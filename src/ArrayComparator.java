
public class ArrayComparator {

    public int n = 0;

    public boolean compare(int tablica1[][], int tablica2[][]) {
        if (tablica1.length == tablica2.length) {
        n++;
        }
        for (int i = 0; i < tablica1.length; i++) {
                if (tablica1[i].length == tablica2[i].length) {
                n++;
                }
            }
            for (int i = 0; i < tablica1.length; i++) {
                        for (int j = 0; j < tablica1[i].length ; j++) {
                            if (tablica1[i][j] == tablica2[i][j]) {
                            n++;
                        }
                }
            }
        if (n == (1 + (tablica1.length) + (tablica1[0].length)+(tablica1[1].length))){
            return true;
        }
        else {
            return false;
        }
    }
}


