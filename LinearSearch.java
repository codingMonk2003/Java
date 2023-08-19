public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,76,5,9,1};
        int target=9;
        int ans;

        ans=linearS(arr,target);
        System.out.println(ans);
    }
     public static int linearS(int[] arr,int target){
        int n=arr.length;
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
