package com.company;


import java.util.ArrayList;

public class Collection_ds {
    public static void main(String[] args) {
        ArrayList<Integer>List1 = new ArrayList<>();
        List1.add(5);
        for(int i=0; i<=100 ; i++) {
            List1.add(i);
        }
        System.out.println(List1.get(8));
        System.out.println(List1);
        System.out.println(List1.indexOf(99));
    }
}
