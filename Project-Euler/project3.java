package eulerFirstPage;

import java.util.Scanner;

public class project3 {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("identify small one range : ");
        // int smallRange = scan.nextInt() ;

        // System.out.println("identify large one range : ");
        // int largeRange = scan.nextInt() ;

        int counter = 0;
        double sum = 0;
        boolean isPrime = true;

        // finding all prime numbers ;
        for (double i = 2; i < 300; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (300 % i == 0) {
                    counter++;
                    sum += i;
                }
            }
        }
        System.out.println("count : " + counter);
        System.out.println("sum  : " + sum);
    }
}
