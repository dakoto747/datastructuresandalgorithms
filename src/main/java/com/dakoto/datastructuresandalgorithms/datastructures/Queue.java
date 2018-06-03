package com.dakoto.datastructuresandalgorithms.datastructures;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;

public class Queue<T> implements DataStructure {

    private SinglyLinkedList<T> head;

    private SinglyLinkedList<T> tail;

    private int size = 0;

    public void enqueue(T value){

        if(this.tail == null){

            this.head = this.tail = new SinglyLinkedList<T>(value); //show off pass by reference
        }else{

            SinglyLinkedList<T> newTail= new SinglyLinkedList<T>(value);
            this.tail.setNext(newTail);
            this.tail = newTail;
        }

        this.size++;
    }

    public SinglyLinkedList dequeue(){

        SinglyLinkedList<T> returnValue = this.head;

        this.head = this.head.next(); //show off pass by reference

        if (this.head == null){

            this.tail = null;
        }

        this.size--;

        return returnValue;
    }

    @Override
    public void test() {

        Queue<Integer> q = new Queue<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.traverse();
        q.dequeue();
        q.dequeue();
        q.traverse();
        q.enqueue(40);
        q.enqueue(50);
        q.traverse();
    }

    @Override
    public void traverse() {

        System.out.println("############################ traversing Queue");
        this.head.traverse();
        System.out.println("############################ done traversing Queue");
    }

    @Override
    public void empty() {

        System.out.println("############################ emptying");

        while(this.tail != null){

            SinglyLinkedList<T> node = this.dequeue();
            System.out.println(node.getValue());
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
