package FewBasicPractice;

import java.util.Scanner;

public class DoubleLinkList<T>{
    Scanner in=new Scanner(System.in);
    private Node head,tail;
    class Node{
        private T value;
        private Node next,previous;

        @Override
        public String toString() {
            return "FewBasicPractice.Node{" +
                    "value=" + value +
                    '}';
        }
    }
    public void insertAtFront(){
        System.out.println("Enter the item to be inserted ");
        Node temp=new Node();
        temp.value=(T)in.next();
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=head.previous=temp;
        }
    }
    public void insertAtEnd(){
        System.out.println("Enter the item to be inserted ");
        Node temp=new Node();
        temp.value=(T)in.next();

        if(head==null){
            head=tail=temp;
        }
        else{
            temp.previous=tail;
            tail=tail.next=temp;
        }
    }
    public void deleteAtFront(){
        if(head==null)
            System.out.println("Empty double link list");
        if(head.next==null)
            head=null;
        else{
            Node temp=head;
            head=head.next;
            head.previous=temp.next=null;
        }
    }
    public void deleteAtEnd(){
        if(head==null)
            System.out.println("Empty double link list");
        if(head.next==null)
            head=null;
        else{
            Node temp=tail;
            tail=tail.previous;
            temp.next=tail.previous=null;
        }
    }
    public void display(){
        if(head==null)
            System.out.println("Empty double link list");
        else{
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print(temp+" ");
            }
            System.out.println();
            for(Node temp=tail;temp!=null;temp=temp.previous){
                System.out.print(temp+" ");
            }
        }
    }
    public void search(){
        if(head==null)
            System.out.println("Empty link list can't be searched");
        else{
            System.out.println("Enter the item to be searched ");
            T key=(T)in.next();
            Node temp=head;
            while(temp!=null){
                if(key.equals(temp.value)){
                    System.out.println("Yeah it is found man!!");
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Element doesn't  found");
        }
    }
    public static void main(String[] args) {
        DoubleLinkList<Object> l=new DoubleLinkList<>();
        Scanner in =new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1.Insert At Front    2.Inset At End");
            System.out.println("3.Delete At Front    4.Delete At End");
            System.out.println("5.Display            6.Search");
            System.out.print("7.Exit \nChoice :");
            int ch=in.nextInt();
            switch(ch){
                case 1 -> l.insertAtFront();
                case 2->l.insertAtEnd();
                case 3->l.deleteAtFront();
                case 4->l.deleteAtEnd();
                case 5->l.display();
                case 6->l.search();
                case 7-> {return;}
                default -> System.out.println("Invalild choice ");

            }
        }
    }
}
