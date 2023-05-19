package FewBasicPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the rows and column ");
        int rows=in.nextInt();
        int columns=in.nextInt();
        int[][] arr =new int[rows][columns];
        System.out.println("Enter the matrix");
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Before transpose");
//        for(int i=0;i<arr.length;i++){
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(" "+arr[i][j]);
//            }
//            System.out.println();
//        }
        int[][] newarr =new int[columns][rows];
        for(int i=0;i<newarr.length;i++){
            for (int j = 0; j < newarr[i].length; j++) {
                newarr[i][j]=arr[j][i];
            }
        }
        System.out.println("after  transpose");
//        for(int i=0;i<newarr.length;i++){
//            for (int j = 0; j < newarr[i].length; j++) {
//                System.out.print(" "+newarr[i][j]);
//            }
//            System.out.println();
//        }
    }
}
/*
* row    0 1 2 3 4
*
* col 0  1 0 6 3 5
* col 1  0 0 0 2 3
* col 2  9 8 6 0 0

*  row    0 1 2
* col  0  1 0 9
* col  1  0 0 8
* col  2  6 0 6
* col  3  3 2 0
* col  4  5 3 0 */