package com.company;
//stack using arrays
public class stack_data_structure {
    int top;
    int a[];
    int capacity;

    public stack_data_structure(int capacity) {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }
    public void push(int data) throws Exception {
        if(top > capacity-1){
            throw new Exception("Bhaii full zala na rao");
        }
        top++;
        a[top] = data;
    }
    public int pop() throws Exception {
        if (top == -1){
            throw new Exception("Nahiye na bhau element mazyakde ekpn");
        }
        int result = a[top];
        top--;
        return result;
    }
    public int peck() throws Exception{
        if (top == -1){
            throw new Exception("Nahiye na bhau element mazyakde ekpn");
        }
        return a[top];
    }

    public static void main(String[] args) {
        stack_data_structure s1 = new stack_data_structure(3);
        try {
            s1.push(3);
            s1.push(6);
            s1.push(9);
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
            System.out.println(s1.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
