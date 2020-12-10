package eulerFirstPage;

public class project6 {

    public static void main(String[] args) {

        int squareSum = 0;
        int sum = 0;
        int naturalSum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
            naturalSum += i;
        }
        System.out.println(sum);

        int result = (int) (Math.pow(naturalSum, 2) - sum);
        System.out.println("result = >" + result);
    }

}
