public class Pattern1 {
    public static void main(String[] args) {
        int n =5;
        for (int row=1;row<=n;row++) {
            for (int col = 1; col <= (n*2)-1; col++) {
                if (col >= 1 && col <= (n - row)) {
                    System.out.print("  ");
                } else if (col == (n - row + 1)) {
                    for (int i = row; i <= ((2 * row) - 1); i++) {
                        System.out.print(i+" ");
                    }
                    for (int j = (2 * row) - 2; (j>0)&&(j >= row); j--) {
                        System.out.print(j+" ");
                    }
                }
            }
            System.out.println();

        }

    }
}
