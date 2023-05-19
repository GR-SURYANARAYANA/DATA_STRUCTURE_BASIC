package FewBasicPractice;

import java.util.Scanner;

public class GenLinkList<T> {
    Scanner in =new Scanner(System.in);
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private T value;
        private Node next;
    }

    public void insertAtFront(){
        Node temp=new Node();
        System.out.println("Enter the item to be inserted ");
        temp.value= (T) in.next();
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
    public void insertAtEnd(){
        Node temp=new Node();
        System.out.println("Enter the item to be inserted ");
        temp.value= (T) in.next();
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
    public void search(){
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


    public static void main(String[] args) {
        GenLinkList<Object> l=new GenLinkList<>();
        Scanner in =new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1.Insert At Front    2.Inset At End");
            System.out.println("3.Delete At Front    4.Delete At End");
            System.out.println("5.Display            6.Search");
              System.out.print("7.Exit               8.Length and sum\nChoice :");
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
