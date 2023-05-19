package FewBasicPractice;

import java.util.Scanner;

public class DFS {
    static int[][] arr;
    int n;
    static int[] v;
    public static void create(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of nodes ");
        int n=in.nextInt();
        arr=new int[n+1][n+1];
        System.out.println("Enter the adjacent matrix");
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        v=new int[n+1];
        System.out.println("Enter the source ");
        dfs(in.nextInt());
            display();
    }
    public static void dfs(int source){
        v[source]=1;
        for(int i=0;i<v.length;i++)
            if(arr[source][i]==1 && v[i]==0){
                System.out.println(source+"--->"+i);
                dfs(i);
            }
    }
    public static void display(){
        for(int i=0;i< arr.length;i++){
            if(v[i]==1)
                System.out.println(i+" reachable");
            else
                System.out.println(i+" not reachable ");
        }
    }
    public static void main(String[] args) {
        create();
    }
}
