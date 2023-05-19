package BitwiseOperator;

public class FindingBase {
    public static void main(String[] args) {
        int a=16 ;
        System.out.println(baseDigit(a));
    }
    public static int baseDigit(int n){
        return (int) (Math.log(n)/Math.log(2))+1;
    }
}
