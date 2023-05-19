package Recursion.Strings;

public class SubStringWork {
    public static void main(String[] args) {
    String original="surya";
        System.out.println(substring(original,1,original.length()));
    }
    public static String substring(String original,int start,int end){
        if(start==end){
            return "";
        }
        char ch=original.charAt(start);
        return ch+substring(original,start+1,end);
    }

}
