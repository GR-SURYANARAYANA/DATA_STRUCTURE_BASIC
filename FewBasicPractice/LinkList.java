package FewBasicPractice;

import java.util.Scanner;

public class LinkList {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private int value;
        private Node next;
    }

    public void insertAtFront(int val){
        Node temp=new Node();
        temp.value=val;
        if(head==null)
            head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    public void display(){
        if(head==null)
            System.out.println("empty link list");
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
        }
    }
    public void insertAtEnd(int val){
       Node temp=new Node();
        temp.value=val;
        if(head==null)
            head=tail=temp;
        else{
            tail=tail.next=temp;
        }

    }
    public void deleteAtFront(){
        if(head==null)
            System.out.println("Empty link list");
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
    }
    public void deleteAtEnd(){
        if(head==null)
            System.out.println("Empty link list");
        else{
            if(head.next==null)
                head=null;
            else{
                Node temp;
                for(temp=head;temp.next!=tail;temp=temp.next);
                tail=temp;
                tail.next=null;
            }
        }
    }
    public void lengthSum(){
        if(head==null)
            System.out.println("Empty link list");
        else{
            int sum=0;
             Node temp=head;
            while(temp!=null){
                sum+=(int)temp.value;
                size++;
                temp=temp.next;
            }
            System.out.println("Sum is  : "+sum);
            System.out.println("Size is : "+size);
        }
    }

    public static void main(String[] args) {
        LinkList l=new LinkList();
        Scanner in =new Scanner(System.in);
        while(true){
            System.out.println("1.Insert At Front    2.Inset At End");
            System.out.println("3.Delete At Front    4.Delete At End");
            System.out.println("5.Display            6.Length and sum");
            System.out.println("7.Exit\nchoice");
            int ch=in.nextInt();
            switch(ch){
                case 1 -> {
                    System.out.println("Enter the value to insert ");
                    int value=in.nextInt();
                    l.insertAtFront(value);
                }
                case 2->{
                    System.out.println("Enter the value to insert ");
                    int value=in.nextInt();
                    l.insertAtEnd(value);
                }
                case 3->l.deleteAtFront();
                case 4->l.deleteAtEnd();
                case 5->l.display();
                case 6->l.lengthSum();
                case 7-> {return;}
                default -> System.out.println("Invalild choice ");

            }
        }

    }
}
