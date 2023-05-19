package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
    }
    public static int fact(int n){
        return (n<=1)?1:n*fact(n-1);
    }
    public static int sum(int n){
        return (n==0)?0:n+sum(n-1);
    }
}
