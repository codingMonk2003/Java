public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 9, -13 };

        int toFind = 6;
        boolean found = false;
        for (int n : arr) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(toFind + " is present");
        } else {
            System.out.println(toFind + " is not present");
        }
    }
}
