public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= ((2 * n) - 1); col++) {
                if (col <= (n - row)) {
                    System.out.print("  ");
                } else if (col <= (n - 1 + row) && col >= (n - row)) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
