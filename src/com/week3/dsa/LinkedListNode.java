package com.week3.dsa;

public class LinkedListNode {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next !=null ){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    public void deleteFirst(){
        head.next = head;
    }

    public void deleteLast(){
        Node secondLast = head;
        Node lastNode = head.next;
        while (head.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        if(head.next == null){
            head = null;
            return;
        }

        secondLast.next = null;
    }

    public void deleteNode(int position){
        if(head == null){
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
    }

    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }
    public static void main(String[] args) {
        LinkedListNode ll = new LinkedListNode();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        ll.addLast(4);
        ll.deleteFirst();
        ll.printList();
        ll.deleteLast();
        ll.printList();
        ll.deleteNode(2);
        ll.printList();
        ll.search(ll.head, 3);
        ll.printList();

    }
}
