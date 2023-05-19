package FewBasicPractice;

import java.util.Scanner;

public class BFS {
    static int[][] arr;
    int n;
    static int[] v;
    static int[] q;
    static int rear=0;
    static int front=1;
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
        q=new int[n+1];
        System.out.println("Enter the source ");
        bfs(in.nextInt());
        display();
    }
    public static void bfs(int source){
        q[++rear]=source;
        v[source]=1;
        while(front<=rear){
            int u=q[front++];
            for (int i = 1; i <v.length; i++) {
                    if(arr[u][i]==1 && v[i]==0){
                        v[i]=1;
                        q[++rear]=i;
                        System.out.println(u+"--->"+i);
                    }
            }
        }
    }
    public static void display(){
        for(int i=1;i< arr.length;i++){
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

