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
    //Checking the weather node is empty or not
    public boolean isEmpty(){
        return head==null;
    }


}
