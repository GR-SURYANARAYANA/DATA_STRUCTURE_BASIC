package Recursion;

public class LeetCodeEx {
    public static void main(String[] args) {
        System.out.println(steps(41,0));
    }
    public static int steps(int n,int step){
        if(n==0)
            return step;
        return steps((n%2==0)?n/2:n-1,++step);
    }
}
