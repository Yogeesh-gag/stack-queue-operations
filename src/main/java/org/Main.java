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

        while(!l1.isEmpty()){
            System.out.println(l1.peek());
            l1.pop();
        }
    }
}
