package com.student.studentportel.hari;

public class LinkList {
    Node head; // null
    public void next(int i) {
        Node data = new Node(i);
        if(head == null){
            head = data;
        }else{
            Node temp = head;

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = data;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

class Node{
    int val;
    Node next;

    Node(int n){
        this.val = n;
    }
    Node(){}
}
