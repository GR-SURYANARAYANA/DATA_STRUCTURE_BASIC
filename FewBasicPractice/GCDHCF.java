package FewBasicPractice;

public class GCDHCF {
    public static void main(String[] args) {
        int a = 99;
        int b = 27;
        int gcd = GCD(a, b);
        int lcm=((a*b)/gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static int GCD(int a,int b){
        return (b==0)?a:GCD(b,a%b);
    }
}
