package org;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    //Stack Operations using linked list (Use Case 1&2)
    //Add to front (for stack push) (Use Case 1)
    public void push(E data){
        Node<E> newNode=new Node<>(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Pop the element form the list (and also pop will return the value)(UseCase 2)
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E top=head.data;
        head=head.next;
        return top;
    }

    //Peek top of the element in the stack(UseCase 2)
    public E peek(){
        if(isEmpty()){
            return null;
        }
        return head.data;
    }

    //Checking the weather node is empty or not
    public boolean isEmpty(){
        return head==null;
    }

    //Queue operations using linked list like enqueue and dequeue

    //Enqueue adds to the end of the queue
    public void enqueue(E data){
        Node<E> newNode=new Node<>(data);
        if(tail==null){
            head=tail=newNode;//Queue is empty
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    //Dequeue removes from the front
    public E dequeue(){
        if(head==null){
            System.out.println("Queue is Empty...");
            return null;
        }
        E value=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return value;
    }

    // Print the queue
    public void printQueue() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }



}
