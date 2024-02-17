package com.company;
class double_node {
    double_node next;
    double_node previous;
    int element;

    public double_node(double_node next, double_node previous, int element) {
        this.next = next;
        this.previous = previous;
        this.element = element;
    }
}

public class doubly_linked_list {
    double_node head;
    double_node tail;
    public void add_element_at_start(int element){
        if(head==null){
            head = new double_node(null,null,element);
            tail = head;
        }
        else{
            double_node head_new = new double_node(head,null,element);
            head.previous = head_new;
            head = head_new;
            if(head.next == null){
                tail = head;
            }
        }
    }

    public void add_element_at_end(int element){
        if(tail==null){
            tail = new double_node(null,null,element);
            head = tail;
        }
        else{
            double_node second_last = tail;
            tail = new double_node(null,tail,element);
            second_last.next=tail;
        }
    }

    public void print_doubly_linked_list(){
        double_node temp = head;
        while (head.next != null){
            System.out.println(head.element);
            head = head.next;
        }
        System.out.println(tail.element);
        head = temp;
    }

    public void reverse_print_doubly_linked_list(){
        double_node temp1 = tail;
        while (tail.previous != null){
            System.out.println(tail.element);
            tail = tail.previous;
        }
        System.out.println(head.element);
        tail = temp1;
    }

    public static void main(String[] args) {
        doubly_linked_list D1 = new doubly_linked_list();
        D1.add_element_at_start(1);
        D1.add_element_at_start(2);
        D1.add_element_at_start(3);
        D1.add_element_at_start(4);
        D1.add_element_at_start(6);
        D1.add_element_at_end(1);
        D1.add_element_at_end(2);
        D1.add_element_at_end(3);
        D1.add_element_at_end(4);
        D1.add_element_at_end(9);
        D1.print_doubly_linked_list();
        D1.reverse_print_doubly_linked_list();
        System.out.println(D1.head.element);
        System.out.println(D1.tail.element);

    }
}


