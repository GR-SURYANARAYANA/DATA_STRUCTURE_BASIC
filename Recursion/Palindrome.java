package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String value = String.valueOf(121);
        boolean palindrome = palindrome(value,0,value.length()-1);
        System.out.println(palindrome);
    }
    public static boolean palindrome(String value,int s,int e){
        if(s==e)
            return true;
        char intialChar = value.charAt(s);
        char lastChar = value.charAt(e);
        if(intialChar == lastChar)
            return palindrome(value,s+1,e-1);
        return false;
    }
}
