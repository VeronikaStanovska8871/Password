package sk.kosickaakademia.stanovska.projectmath.cyklus;

public class Main {
    public static void main(String[] args) {
        int x = 1000;
            while ( x<=9999) {
                x = x + 1;
                int c1 = x % 10;
                int c2 = (x / 10) % 10;
                int c3 = (x / 100) % 10;
                int c4 = (x / 1000) % 10;
                if (c1 != c2 && c2 != c3 && c3 != c1 && c4 != c3 && c4 != c2 && c4 != c1) {
                    if (x%3!=0)
                        if (x%2!=0)
                            if (x%113==0)
                                System.out.print(x + " ");

                }
            }
    }
}






