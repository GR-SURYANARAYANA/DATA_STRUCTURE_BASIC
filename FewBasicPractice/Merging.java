package FewBasicPractice;

import java.util.Arrays;

public class Merging {
    public static void main(String[] args) {
        int []a={2,3,4,5,6,7,8,9,10};
        int []b={1,2,3,4,5,6,7,10,12};
        int []c=Merge(a,b);
        System.out.println(Arrays.toString(c));
    }
    public static int[] Merge(int[] a, int[] b){
       int []arr=new int[a.length+b.length];
        for(int i = 0; i < a.length; i++) {
            arr[i]=a[i];
        }
        for (int i = a.length; i <a.length+b.length ; i++) {
            arr[i]=b[i-a.length];
        }
        return arr;
    }
}
