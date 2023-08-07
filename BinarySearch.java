public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,7,16,34,66};

        int ans;
        int target=16;
        ans=binarySearch(arr,target);
        if (ans==-1){
            System.out.println("Element not found in the array.");
        }
        else{
            System.out.println("Element found at the index position: "+ans);
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        int mid;

        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;

            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
