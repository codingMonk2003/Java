public class FactorsNegative {
    public static void main(String[] args) {
        int num = -6;
        System.out.print("The factors of " + num + " are ");
        for (int i = num; i <= Math.abs(num); i++) {
            if (i == 0) {
                continue;
            } else {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
