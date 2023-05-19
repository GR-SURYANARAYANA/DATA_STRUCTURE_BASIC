package FewBasicPractice;

import java.util.Scanner;

public class CircularLinkList<T>{
    private Node head;
    private Node tail;
    Scanner in=new Scanner(System.in);
    class Node{
        T value;
        Node next,previous;
    }
    public void insertAtFront(){
        Node temp=new Node();
        System.out.println("Enter the item to be inserted ");
        temp.value=(T)in.next();

        if(head==null){
            head=tail=temp;
            temp.next=temp.previous=head;
        }

        else{
            temp.next=head;
            temp.previous=tail;
            head=head.previous=temp;
            tail.next=head;
        }
    }
    public void insertAtEnd(){
        Node temp=new Node();
        System.out.println("Enter the item to be inserted ");
        temp.value=(T)in.next();
        if(head==null){
            head=tail=temp;
            temp.next=temp.previous=head;
        }
        else{
            temp.previous=tail;
            tail=tail.next=temp;
            tail.next=head;
            head.previous=tail;
        }
    }
    public void deleteAtFront(){
        if(head==null){
            System.out.println("Empty link list");
        }
        else if(head.next == head){
            head=null;
        }
        else{
            Node temp=head;
            head=head.next;
            head.previous=temp.previous;
            tail.next=head;
            temp.next=temp.previous=null;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty link list");
        }
        else if(head.next == head){
            head=null;
        }
        else{
            Node temp=tail;
            tail=tail.previous;
            tail.next=temp.next;
            head.previous=tail;
            temp.previous=temp.next=null;
        }
    }
    public void search() {
        System.out.println("Enter the item to be searched  ");
        T value = (T) in.next();
        if (head == null) {
            System.out.println("Empty link list");
        } else {
            if (value.equals(head.value)) {
                System.out.println("Element is found");
            } else {
                for (Node temp = head.next; temp != head; temp = temp.next)
                    if (value.equals((T) temp.value)) {
                        System.out.println("Element is found");
                    }
                System.out.println("Element is not found ");
            }
        }
    }
    public void display(){
     if(head==null)
         System.out.println("Empty circular queue");
     else if(head==head.next)
         System.out.println(head.value);
     else{
         System.out.print("The elements are : "+head.value);
         for(Node temp=head.next;temp!=head;temp=temp.next){
             System.out.print(" "+temp.value);
         }
         System.out.print("\nReverse order print : "+tail.value);
         for(Node temp=tail.previous;temp!=tail;temp=temp.previous) {
             System.out.print(" "+temp.value);
         }
     }
    }

    public Node getHead() {
        return head;
    }

    public void revdisplay(Node temp){
   if(temp!=head) {
       revdisplay(temp.next);
       System.out.print(" " + temp.value);
        }
    }


    public static void main(String[] args) {
        CircularLinkList<Object> l=new CircularLinkList<>();
        Scanner in =new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1.Insert At Front    2.Inset At End");
            System.out.println("3.Delete At Front    4.Delete At End");
            System.out.println("5.Display            6.Search");
            System.out.print("7.Revdisplay          8.Exit \nChoice :");
            int ch=in.nextInt();
            switch(ch){
                case 1 -> l.insertAtFront();
                case 2->l.insertAtEnd();
                case 3->l.deleteAtFront();
                case 4->l.deleteAtEnd();
                case 5->l.display();
                case 6->l.search();
                case 7 -> {
                    l.revdisplay(l.getHead().next);
                    System.out.print(" "+l.getHead().value);
                }
                case 8-> {return;}
                default -> System.out.println("Invalild choice ");

            }
        }
    }
}
