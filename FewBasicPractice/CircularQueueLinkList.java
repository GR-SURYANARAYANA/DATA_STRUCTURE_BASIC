package FewBasicPractice;

import java.util.Scanner;

public class CircularQueueLinkList<T> {
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
    public void display(){
        if(head==null)
            System.out.println("Empty circular queue");
        else if(head==head.next)
            System.out.println(head.value);
        else{
            System.out.print("The elements are : "+head.value);
            for(Node temp = head.next; temp!=head; temp=temp.next){
                System.out.print(" "+temp.value);
            }
            System.out.print("\nReverse order print : "+tail.value);
            for(Node temp = tail.previous; temp!=tail; temp=temp.previous)
                System.out.print(" "+temp.value);

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

    public static void main(String[] args) {
            CircularQueueLinkList<Object> l=new CircularQueueLinkList<>();
            Scanner in =new Scanner(System.in);
            while(true){
                System.out.println();
                System.out.println("1.Insert             2.Delete");
                System.out.println("3.Display            4.Search");
                System.out.print("5.Exit \nChoice :");
                int ch=in.nextInt();
                switch(ch){
                    case 1 -> l.insertAtFront();
                    case 2->l.deleteAtEnd();
                    case 3->l.display();
                    case 4->l.search();
                    case 5-> {return;}
                    default -> System.out.println("Invalild choice ");

                }
            }
    }
}
