public class Palindrome {
    public static void main(String[] args) {
        String str="aabaa";
        int start=0;
        int end=str.length()-1;

        System.out.println(pal(start,end,str));
    }
    public static boolean pal(int start,int end,String str){
        while(start<end){
            char S=str.charAt(start);
            char E=str.charAt(end);
            if(S!=E){
                return false;

            }
            start=start+1;
            end=end-(1);

        }
        return true;
    }
}
