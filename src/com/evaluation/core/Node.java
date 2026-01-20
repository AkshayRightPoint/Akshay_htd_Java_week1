package com.evaluation.core;

/** Reverse a Singly Linked List */

 public class Node {
     int data;
     Node next;
     Node(int data){
         this.data = data;
         this.next = null;
     }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List -> ");
        printList(head);

        head =reverseLinkedList(head);

        System.out.println("Reverse Order -> ");
        printList(head);


        }

    public  static Node reverseLinkedList(Node head){
         Node previous = null;
         Node current = head;
         Node next = null;
         while (current !=null){
             next = current.next;
             current.next = previous;
             previous = current;
             current = next;
         }
         return previous;
    }

    public static void printList( Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

}
