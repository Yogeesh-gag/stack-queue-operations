package org;

public class Main {
    public static void main(String[] args) {

        System.out.println("Stack Operation :");
        //Creating the linked list object of class to acces the method and perform operation
        LinkedList l1=new LinkedList();

        //Pushing the element to stack using the linked list
        l1.push(70);
        l1.push(30);
        l1.push(56);

        //Removing the elements from the stack and printing the elements
        while(!l1.isEmpty()){
            System.out.println(l1.peek());
            l1.pop();
        }

        //Performing the Queue operation
        l1.enqueue(56);
        l1.enqueue(30);
        l1.enqueue(70);

        //Printing the elements in the Queue
        l1.printQueue();

        //removing the elements from the queue and printing the remaining elements
        l1.dequeue();
        l1.printQueue();
    }
}
