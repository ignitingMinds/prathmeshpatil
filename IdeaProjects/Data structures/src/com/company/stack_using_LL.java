package com.company;

public class stack_using_LL {
    Linked_List node = new Linked_List();
    public void push(int data){
        node.add_start(data);

    }
    public int pop(){
        if(node.head == null){
            try {
                throw new Exception("Element nahiye ekpn");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int result = node.head.element;
        node.head = node.head.next;
        return result;
    }

    public static void main(String[] args) {
        stack_using_LL sl1 = new stack_using_LL();
        sl1.push(3);
        sl1.push(6);
        sl1.push(9);

        System.out.println(sl1.pop());
        System.out.println(sl1.pop());
        System.out.println(sl1.pop());
    }

}
