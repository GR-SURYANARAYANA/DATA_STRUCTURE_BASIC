package BitwiseOperator;

public class nthBit {
    public static void main(String[] args) {
        int a=17;//10001
        int n=3;
        int shift=(1<<n-1);
        System.out.println((a&shift));
    }
}
