package com.dakoto.datastructuresandalgorithms.datastructures;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;

import java.util.List;

public class Queue<T> implements DataStructure {
//reset tail
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

    public T dequeue(){

        T returnValue = this.head.getValue();

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

            T node = this.dequeue();
            System.out.println(node);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public List toList() {
        return null;
    }
}
