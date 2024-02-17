package com.company;
import java.util.Scanner;
class Nodee{
    Nodee left,right;
    int data;
    public Nodee(int data){
        this.data = data;
    }
}

public class Tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Nodee root = createTree();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);

    }
    static Nodee createTree(){
        Nodee root = null;
        int data = sc.nextInt();
        if(data==-1) return null;
        root = new Nodee(data);
        System.out.println("Enter left data for " + data);
        root.left = createTree();
        System.out.println("Enter right data for " + data);
        root.right = createTree();
        return root;
    }
    static void inOrder(Nodee root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void preOrder(Nodee root){
        if(root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Nodee root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
    


}
