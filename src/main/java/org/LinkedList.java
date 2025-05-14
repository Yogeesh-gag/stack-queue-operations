package org;

public class LinkedList<E> {
    Node<E> head;

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

    //Pop the element form the list (and also pop will return the value)
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E top=head.data;
        head=head.next;
        return top;
    }

    //Peek top of the element in the statck
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
}
