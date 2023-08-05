public class Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                char ch = (char) (64 + row);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
