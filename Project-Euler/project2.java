package eulerFirstPage;

import java.util.Scanner;

public class project2 {

    // recrusive function for fibonnaci
    public static int fibonnaci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return fibonnaci(x - 1) + fibonnaci(x - 2);

        }

    }

    public static void main(String[] args) {
        int counterFull = 0;
        int counterEven = 0;
        double sum = 0;

        // loop to not pass 4 millon
        for (int j = 1; fibonnaci(j) < 4000000; j++) {
            counterFull++; // full numbers piece
            if (fibonnaci(j) % 2 == 0) {
                counterEven++; // even numbers piece
                sum += fibonnaci(j);
                System.out.print(fibonnaci(j) + " , ");
            }
        }
        System.out.println("all numbers : " + counterFull);

        System.out.println("\ncount of evens in series :" + counterEven);
        System.out.println("result : " + sum);
    }
}
