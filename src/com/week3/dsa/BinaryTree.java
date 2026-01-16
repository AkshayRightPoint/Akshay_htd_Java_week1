package com.week3.dsa;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
       left = right = null;
    }
}


public class BinaryTree {
    static int idx = -1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);

        System.out.print("Preorder  : ");
        preOrder(root);

        System.out.print("Inorder   : ");
        inOrder(root);

        System.out.print("Postorder : ");
        postOrder(root);
    }

    public static void preOrder(Node root){
        if(root == null){
            System.out.println(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            System.out.println(-1 + " ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            System.out.println(-1 + " ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
