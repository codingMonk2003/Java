public class FactorsPositive {
    public static void main(String[] args) {
        int num = 6;
        System.out.print("The factors of " + num + " are ");
        for (int i = 1; i <= num; i++) {

            if (i == num) {
                System.out.println(i + ".");

            } else if (num % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
