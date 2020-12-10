package eulerFirstPage;

public class project5 {

    public static void main(String[] args) {

        int number;
        int counter = 0;
        boolean isOk = true;

        for (int i = 1; i < 232792561; i++) {
            isOk = true;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {

                    isOk = false;
                    break;

                }
            }
            if (isOk) {
                System.out.println(i);
            }

        }

    }

}
