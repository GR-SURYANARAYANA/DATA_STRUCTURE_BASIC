package BitwiseOperator;

public class LeftRightShift {
    public static void main(String[] args) {
        //Any number left shift <<1 then it is double its number
        //result=pow(2,number of left shift)*12
        int a=5;//0100--->1001
        //-5-->0101 1010 1011
        System.out.println(a<<4);
        //Any number right shift >>1 then that is equal to its half
        //result =number/pow(2,number of right shift)
        System.out.println(a>>2);
        System.out.println(~a);
    }
}
