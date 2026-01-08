package com.week3.dsa;

public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void insertAtBeginning(int num){
        Node nextNode = new Node(num);
        nextNode.next = head;
        head = nextNode;
    }

    public void insertAfter(Node preNode, int num){
        Node afterNode = new Node(num);
        if(preNode == null){
            System.out.println("Previous node cannot be null");
            return;
        }
        afterNode.next = preNode.next;
        preNode.next = afterNode;
    }

    public void insertAtEnd(int num){
        Node end = new Node(num);
        if(head == null){
            head = end;
            Node last = head;
        }
        end.next = null;


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);
        list.insertAfter(list.head.next, 4);
        list.insertAtEnd(5);
    }
}
