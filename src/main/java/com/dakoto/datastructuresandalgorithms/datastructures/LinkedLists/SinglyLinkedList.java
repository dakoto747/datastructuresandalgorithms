package com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists;

import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;

public class SinglyLinkedList<T> implements DataStructure {

    private T value;

    private SinglyLinkedList<T> nextNode;

    private boolean ishead;

    private int size;


    public SinglyLinkedList(T headValue){

        this.value = headValue;
    }

    public SinglyLinkedList<T> next() {
        return nextNode;
    }

    public void setNext(SinglyLinkedList<T> next) {
        this.nextNode = next;
        this.size++;
    }

    public boolean isIshead() {
        return ishead;
    }

    public void setIshead(boolean ishead) {
        this.ishead = ishead;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public void test() {

    }

    @Override
    public void traverse(){

        SinglyLinkedList<T> buffer = this;
        while(buffer != null){

            System.out.println(String.valueOf(buffer.getValue()));
            buffer = buffer.next();
        }
    }

    @Override
    public void empty() {

//        while(this.next() != null){
//
//        }
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
