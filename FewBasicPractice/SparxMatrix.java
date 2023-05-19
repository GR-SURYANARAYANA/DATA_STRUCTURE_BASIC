package FewBasicPractice;

import java.util.Scanner;

public class SparxMatrix {
    public static class Node{
        int row;
        int col;
        int val;

        @Override
        public String toString() {
            return "FewBasicPractice.Node{" +
                    "row=" + row +
                    ", col=" + col +
                    ", val=" + val +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int rows=in.nextInt();
        System.out.println("Enter the columns ");
        int columns=in.nextInt();
        System.out.println("Enter the values ");
        int values=in.nextInt();

        Node []arr=new Node[values+1];
        System.out.println("Enter the value of row column value\n");
        for(int i=0;i<arr.length;i++){
             arr[i]= new Node();
            if(i==0){
                arr[i].col=columns;
                arr[i].row=rows;
                arr[i].val=values;
            }
            else{
                System.out.print("arr["+i+"]");
                arr[i].row=in.nextInt();
                arr[i].col=in.nextInt();
                arr[i].val=in.nextInt();
            }
        }
        for(int i=1;i<arr.length;i++){
            int temp=arr[i].row;
            arr[i].row=arr[i].col;
            arr[i].col=temp;
        }
        for (int i = 1; i < arr.length -1; i++)
            for(int j=1;j< arr.length;j++)
                if(arr[i].row<arr[j].row ){
                    Node temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

        for (int i = 0; i < arr.length ; i++)
            System.out.println(arr[i]);
    }
}
