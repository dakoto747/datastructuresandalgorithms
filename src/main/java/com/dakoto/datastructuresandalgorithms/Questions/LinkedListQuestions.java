package com.dakoto.datastructuresandalgorithms.Questions;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;

public class LinkedListQuestions {

    /**
     *
     */
    class SinglyLinkedListNode {
        int data; SinglyLinkedListNode next;
        SinglyLinkedListNode(int d){
            this.data = d;
        }
    }

    public SinglyLinkedListNode reverseALinkedList(SinglyLinkedListNode head){
        //use a stack??? or reset next;
        // you need a buffer where you switch it
        //dynamic programming ... what's the base case?
        /*
        Reverse a singly linked list.
        Hint: A linked list can be reversed either iteratively or recursively. Could you implement both?
         */

        SinglyLinkedListNode buffer = head;
        SinglyLinkedListNode current = new SinglyLinkedListNode(head.data);

        while(buffer.next != null){

            // SinglyLinkedListNode temp = current.data; // this won't work(pass by reference) , create a copy
            SinglyLinkedListNode temp = new SinglyLinkedListNode(current.data); //create a copy
            temp.next = current.next; //create a copy

            //you need a buffer where you switch it i.e
            // starting from the first,
            //switch the first to it's next and it's next, to itself
            current.next = temp; //switch
            current.data = buffer.next.data; //switch

            buffer = buffer.next;
        }

        return current;
    }
}
