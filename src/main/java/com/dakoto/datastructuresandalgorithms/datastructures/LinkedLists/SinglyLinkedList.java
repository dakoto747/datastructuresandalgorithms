package com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists;

import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;
import com.dakoto.datastructuresandalgorithms.datastructures.bugs.List;

public class SinglyLinkedList<T> implements DataStructure, List {

    private T value;

    private SinglyLinkedList<T> nextNode;

    private boolean ishead;

    private int size;


    public SinglyLinkedList() {
    }

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

    @Override
    public SinglyLinkedList<Integer> createFromInteger(int integer){

        int digit = integer % 10;
        integer /= 10;

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(digit);

        while(integer > 9){
            digit = integer % 10;
            SinglyLinkedList<Integer> buffer = new SinglyLinkedList<>(digit);
            buffer.setNext(list);
            list = buffer;
            integer /= 10;
        }
        SinglyLinkedList<Integer> buffer = new SinglyLinkedList<>(integer);
        buffer.setNext(list);

        return buffer;
    }

    @Override
    public SinglyLinkedList<T> detectCycle(){

//  1. Create two pointers, FastPointer and SlowPointer.
//  2. Move FastPointer at a rate of 2 steps and SlowPointer at a rate of 1 step.
//  3. When they collide, move SlowPointer to LinkedListHead. Keep FastPointer where it is.
//  4. Move SlowPointer and FastPointer at a·rate of one step. Return the new collision point.

        SinglyLinkedList<T> list = createDeepCopy();
        SinglyLinkedList<T> slowPointer = list;
        SinglyLinkedList<T> fastPointer = list;// can't handle tiny lists, refactor this

        while(fastPointer != null && fastPointer.next() != null){
            //prone to stackoverflow error if there is no cycle || count the number of times slow pointer has seen the head or null
            slowPointer = slowPointer.next();
            fastPointer = fastPointer.next().next();

            if(fastPointer.getValue() == slowPointer.getValue()){
                break;
            }
        }

        if(fastPointer == null || fastPointer.next() ==null){

            return null;
        }else{

            slowPointer = list;
            while(fastPointer.getValue() != slowPointer.getValue()){
                fastPointer = fastPointer.next();
                slowPointer = slowPointer.next();
            }
            return fastPointer;
        }
    }

    @Override
    public SinglyLinkedList<T> createDeepCopy(){

        SinglyLinkedList<T> copy = new SinglyLinkedList<>(this.value);

        SinglyLinkedList<T> copyBuffer = new SinglyLinkedList<>();
        SinglyLinkedList<T> buffer = this.next();

        while(buffer != null){
            copy.setValue(buffer.value);
            copy = copy.next();
            buffer = buffer.next();
        }

        return copy;
    }
}
