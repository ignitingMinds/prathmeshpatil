package com.company;
class node1 {
    node1 next;
    int element;


    public node1(node1 next, int element) {
        this.next = next;
        this.element = element;
    }
}
public class LinLis{
    node1 head = null;
    public void add_start(int element){

        if(head == null){
            head = new node1(null,element);
        }
        else {
            head = new node1(head,element);
        }
    }
    public void print_lin(){
        while (head != null){
            System.out.println(head.element);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinLis L = new LinLis();
        L.add_start(5);
        L.add_start(6);
        L.add_start(7);
        L.add_start(8);
        L.add_start(9);
        L.add_start(10);
        L.print_lin();
    }
}

