package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(10200,0));
    }
    public static int countZeros(int n,int count){
        int rem = n % 10;
        if(n==rem)
            return count;
        if(rem==0)
            count = ++count;
        return countZeros(n/10,count);
    }
}
