package com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists;

public class DoublyLinkedList<T> extends SinglyLinkedList<T> {

    private boolean head;

    private boolean tail;

    private DoublyLinkedList<T> previous;


    public DoublyLinkedList(T headValue) {
        super(headValue);
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public DoublyLinkedList<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedList<T> previous) {
        this.previous = previous;
    }
}
