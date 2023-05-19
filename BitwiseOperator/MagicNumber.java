package BitwiseOperator;

public class MagicNumber {
    public static void main(String[] args) {
        int a=3;
        System.out.println(magicNo(a));
    }
    public static int magicNo(int n){
        int magicNo=0;
        for(int i=1;n!=0;i++){
            magicNo= (int) (magicNo+Math.pow(5,i)*(n&1));
            n=n>>1;
        }
        return magicNo;
    }
}
