package com.company;

public class graph {
    public static void main(String[] args) {
        int v=5;
        int e = 6;
        int[][] t = new int[v][e] ;
        System.out.println(t);
    }
    static void add_edge(int a[][], int source, int destination){
        a[source][destination] = 1;
        a[destination][source] = 1;
    }
}
