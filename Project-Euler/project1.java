package eulerFirstPage;

public class project1 {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for (int i = 1; i < 1000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                counter++;
                sum += i;
            }

        }
        System.out.println("piece  = " + counter);
        System.out.println("result = " + sum);

    }
}
