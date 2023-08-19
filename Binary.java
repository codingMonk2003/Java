public class Binary {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 14, 23, 77 };
        int target = 14;
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    public static int binary(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        if (n == 0) {
            return -1;
        }
        while (start <= end) {
            int mid;
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
