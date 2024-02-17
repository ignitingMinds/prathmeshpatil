package com.company;
import java.util.Scanner;
class Nodeee{
    Nodeee left,right;
    int dataa;
    public Nodeee(int dataa){
        this.dataa = dataa;
    }
}
public class trying_tree {
    static Scanner sc = null;
    static Nodeee createTree(){
        Nodeee root = null;
        System.out.print(" Enter root data");
        int data = sc.nextInt();
        root = new Nodeee(data);
        if(data == -1) return null;
        System.out.println("Enter left data for " +  data);
        root.left = createTree();
        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }
    static void inordertraversal(Nodeee root){
        if(root == null) return;
        inordertraversal(root.left);
        System.out.println(root.dataa);
        inordertraversal(root.right);
    }
    static void preordertraversal(Nodeee root){
        if(root == null) return;
        System.out.println(root.dataa);

        preordertraversal(root.left);
        preordertraversal(root.right);
    }
    static void postordertraversal(Nodeee root){
        if(root == null) return;
        postordertraversal(root.left);
        postordertraversal(root.right);
        System.out.println(root.dataa);

    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Nodeee root = createTree();
        System.out.println();
        inordertraversal(root);
        System.out.println();
        postordertraversal(root);
        System.out.println();
        preordertraversal(root);
    }

}

