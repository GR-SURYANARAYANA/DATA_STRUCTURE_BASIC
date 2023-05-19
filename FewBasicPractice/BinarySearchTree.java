package FewBasicPractice;

import java.util.Scanner;

public class BinarySearchTree {
    private Node root;
    private Node temp;
    Scanner in=new Scanner(System.in);
    class Node{
        int value;
        Node left,right;
    }
    public void create(){
        System.out.println("Enter the number of value to be insertd ");
        int n=in.nextInt();
        System.out.println("Enter the values below : ");
        for(int i=0;i<n;i++){
            insert(in.nextInt());
        }
    }
    public void preorder(Node ptr){
       if(ptr==null)
           return;
        System.out.print(" "+ptr.value);
       preorder(ptr.left);
       preorder(ptr.right);
    }
    public void postorder(Node ptr){
        if(ptr==null)
            return;
        postorder(ptr.left);
        postorder(ptr.right);
        System.out.print(" "+ptr.value);
    }
    public void inorder(Node ptr){
        if(ptr==null)
            return;
        inorder(ptr.left);
        System.out.print(" "+ptr.value);
        inorder(ptr.right);
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int key){
        temp=new Node();
        temp.value=key;
        if(root==null)
            root=temp;
        else{
            Node previous = null,present=root;
            while(present!=null){
                previous=present;
                if(key==root.value)
                    return;
                else if(root.value<key)
                    present=present.right;
                else
                    present=present.left;
            }
            if(previous.value<key)
                previous.right=temp;
            else
                previous.left=temp;
        }

    }

    public static void main(String[] args) {
        BinarySearchTree t=new BinarySearchTree();
        t.create();
        t.preorder(t.getRoot());
        t.inorder(t.getRoot());
        t.postorder(t.getRoot());
    }
}
