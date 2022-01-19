package com.bridgelabz;

class Node{
    //class representing node
    int data;
    Node next;
    //constructor
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackQueue {
    //it will content Linklist
    private Node head;

    public StackQueue(){
        this.head=null;
    }
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head =newNode;

        }else {
            newNode.next=head;
            head=newNode;
        }
    }
    public void showList(){
        if (head == null){
            System.out.println("Stack is Empty");
        }else {
            Node temp =head;
            while (temp != null){
                System.out.println(temp.data+ "-> ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {

        StackQueue stack = new StackQueue();
        // insert Stack value
        stack.insertFirst(70);
        stack.insertFirst(30);
        stack.insertFirst(56);
        stack.showList();
    }
}


