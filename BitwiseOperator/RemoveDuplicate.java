package BitwiseOperator;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //xor value
        //a^1==~a
        //a^0==a
        //a^a==0
        int []arr={2,2,3,4,4,6,3,2,1,2,1};
        System.out.println(nonDuplicate(arr));
    }
    public static int nonDuplicate(int []arr){
        int result=0;
        for (int a:arr) {
            result^=a;
        }
        return result;
    }
}
