package BitwiseOperator;

public class PowerOfTwo {
    public static void main(String[] args) {
        int a=4;
        System.out.println("Is it power of 2?"+pow(a));
    }
    public static boolean pow(int n){
        return (n&(n-1))==0;
    }
}
