package Recursion;
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digitSumIs(121));
        System.out.println(digitMulIs(1234));
        System.out.println(digitRevIs(12345));
    }
    public static int digitSumIs(int n){
        int rem = n % 10;
        return (n==0)?0: rem + digitSumIs(n/10);
    }
    public static int digitMulIs(int n){
        int rem = n % 10;
        return (n==0)?1: rem *digitMulIs(n/10);
    }
    public static int digitRevIs(int n){
        int digit= (int) Math.log10(n);
        int power=(int)Math.pow(10,digit);
        if(digit==0)
            return n;
        return (n/power)+digitRevIs(n%power)*10;
    }
}
