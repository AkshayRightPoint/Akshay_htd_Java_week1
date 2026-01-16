package com.week3.dsa.problem.solving;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.left.right = new Node(6);
        root.left.left.left = new Node(6);

        System.out.println("Longest height of tree is - > "+ height(root));

    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int heightLeft = height(root.left);
        int heightRight = height(root.right);

        return Math.max(heightLeft, heightRight) +1;
    }
}
