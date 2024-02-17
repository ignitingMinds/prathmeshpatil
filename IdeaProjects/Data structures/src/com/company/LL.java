package com.company;
class nod2 {
    int ele;
    nod2 next;

    public nod2(int ele, nod2 next) {
        this.ele = ele;
        this.next = next;
    }

}

public class LL {
    nod2 head;
    nod2 tail;

    public void add_at_start(int element) {
        if (head == null) {
            head = new nod2(element, null);
            tail = head;
        } else {
            head = new nod2(element, head);
            if (head.next == null){
                tail = head;
            }
        }

    }
    public void adddd(int element) {
        if (tail == null) {
            head = new nod2(element, null);
            tail = head;
        }
        else {
            nod2 second_last = tail;
            tail = new nod2(element, null);
            second_last.next=tail;
        }
    }

    public void print_linked_list() {
        while (head != null) {
            System.out.println(head.ele);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        // write your code here
        LL e1 = new LL();
        e1.add_at_start(3);
        e1.add_at_start(6);
        e1.add_at_start(9);
        e1.adddd(3);
        e1.adddd(6);
        e1.adddd(9);
        e1.print_linked_list();

    }
}




