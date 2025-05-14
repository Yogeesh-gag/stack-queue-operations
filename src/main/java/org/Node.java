package org;

public class Node<E> {
    E data;
    Node<E> next;

    //Constructor to initialize the variable
    Node(E data){
        this.data=data;
        this.next=null;
    }
}
