package com.company;
class Node{
    int element;
    Node next;

    public Node(int element, Node ad) {
        this.element = element;
        this.next = ad;

    }
}
public class Linked_List {
    Node head;
    public void add_end(int element){
        if(head == null){
            head = new Node(element , null);
        }
        else{
            head = new Node(element,head);
        }

    }
    public void add_start(int element){
        if(head == null){
            head = new Node(element , null);}
        else{
            head = new Node(element,head);
        }
    }
    public void Print_LL(){

        while (head != null) {
            System.out.println(head.element);
            head=head.next;

        }
    }

    public static void main(String[] args) {
	// write your code here
        Linked_List e1= new Linked_List();
        e1.add_start(369);
        e1.add_end(3);
        e1.add_end(6);
        e1.add_end(9);
        e1.Print_LL();



    }
}
