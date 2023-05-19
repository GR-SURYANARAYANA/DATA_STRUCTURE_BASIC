package BitwiseOperator;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a=2;
        System.out.println("Is it odd?"+isOdd(a));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
