package BitwiseOperator;

public class PascalTriangleSum {
    public static void main(String[] args) {
        int a=10;
        System.out.println(sum(a)) ;
    }
    public static int sum(int n){
        return 1<<(n-1);
    }
}
