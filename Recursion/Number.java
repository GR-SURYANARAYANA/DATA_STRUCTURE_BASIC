package Recursion;

public class Number {
    public static void main(String[] args) {
        System.out.println("Print in perfect order ");
        printNumber(5);
        System.out.println("Reverse order  is ");
        revPrintNumber(5);
    }
    public static void printNumber(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNumber(--n);
    }
    public static void revPrintNumber(int n){
        if(n==0)
            return;
        revPrintNumber(n-1);
        System.out.println(n);
    }
}
