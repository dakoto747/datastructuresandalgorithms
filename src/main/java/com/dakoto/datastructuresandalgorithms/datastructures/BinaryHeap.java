package com.dakoto.datastructuresandalgorithms.datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap<T extends Comparable> {

    /*


    Heap Data Structure is generally taught with Heapsort. Heapsort algorithm has limited uses because Quicksort is
    better in practice. Nevertheless, the Heap data structure itself is enormously used.
    Following are some uses other than Heapsort.

    Priority Queues: Priority queues can be efficiently implemented using Binary Heap because it supports insert(),
                     delete() and extractmax(), decreaseKey() operations in O(logn) time.
                     Binomoial Heap and Fibonacci Heap are variations of Binary Heap.
                     These variations perform union also in O(logn) time which is a O(n) operation in Binary Heap.
                     Heap Implemented priority queues are used in Graph algorithms
                     like Prim’s Algorithm and Dijkstra’s algorithm.

    Order statistics: The Heap data structure can be used to efficiently find the kth smallest (or largest) element in
                      an array. See method 4 and 6 of https://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/
                      for details.

    https://www.youtube.com/watch?v=t0Cq6tVNRBA


    a min heap is a complete binary tree (that is, totally filled other than the rightmost elements on the last level)
    where each node is smaller than its children. The root, therefore, is the minimum element in the tree

    we have two key operations on a min-heap: insert and extract_min

    it is ALWAYS complete because of the way we keep the indices of parents and children; we keep adding to the right ....
     */


    /*

    applications of heap

     */


    public static enum BinaryHeapType {MAX, MIN};

    private BinaryHeapType type;

    private int minimalElementIndex = -1;

    private List<T> elements;

    public BinaryHeap (BinaryHeapType type){
        this.type = type;
        elements = new ArrayList<>();
    }




    public void heapifyUp()
    {
        /*
        1. while there's a parent and heap is out of order. i.e. child less than parent(in MIN heap)
            walk upwards and update index
         */
        int elementIndex = elements.size() - 1;

        switch (type)
        {
            case MAX:
                while(hasParent(elementIndex) && (elements.get(elementIndex).compareTo(getParentOfElement(elementIndex))
                                                  == -1))
                {
                    swap(elementIndex, getParentIndexOfElement(elementIndex));
                    elementIndex = getParentIndexOfElement(elementIndex);
                }
                break;

            case MIN:

                while(hasParent(elementIndex) && (elements.get(elementIndex).compareTo(getParentOfElement(elementIndex))
                                                  == 1))
                {
                    swap(elementIndex, getParentIndexOfElement(elementIndex));
                    elementIndex = getParentIndexOfElement(elementIndex);
                }
                break;
        }

    }


    public void heapifyDown()
    {
        //bubble down the new root until we find it's right spot
        /*
        1. while you have children, keep walking down and trying to fix my heap.
            a. get the index of the smaller child (MIN heap)
            b. if you're smaller than your smaller child, return else, go to c. (MIN heap); get the minimal child and compare yourself
            c. swap yourself with your smaller child and update the index.


         */    
        int elementIndex = 0;

        switch (type)
        {
            case MAX:


                break;

            case MIN:

                while(hasLeftChild(elementIndex))
                {
                    int smallerChildIndex = getLeftChildIndexOfElement(elementIndex);

                    //is foreigner greater than me? i.e. left child greater?
                    if(hasRightChild(elementIndex) && getLeftChildOfElement(elementIndex).compareTo(getRightChildOfElement(elementIndex))
                                                                     == -1)
                    {
                        smallerChildIndex = getRightChildIndexOfElement(elementIndex);
                    }

                    // is smaller child greater than me?
                    if(elements.get(elementIndex).compareTo(elements.get(smallerChildIndex)) == 1){
                        swap(elementIndex, smallerChildIndex);
                    }
                    elementIndex = smallerChildIndex;
                }

                break;
        }

    }


    //    equations:
    //    parent index: (index-1)/2
    // leftchild index: (index*2)+1
    //rightChild index: (index*2)+2

    private T getParentOfElement(int elementIndex)
    {
        return elements.get((elementIndex-1)/2);
    }

    private int getParentIndexOfElement(int elementIndex){
        return (elementIndex-1)/2;
    }

    private boolean hasParent(int elementIndex)
    {
        return getParentIndexOfElement(elementIndex) >= 0;
    }


    public T getLeftChildOfElement(int elementIndex)
    {
        return elements.get((elementIndex*2)+1);
    }

    private int getLeftChildIndexOfElement(int elementIndex){
        return (elementIndex*2)+1;
    }

    private boolean hasLeftChild(int elementIndex)
    {
        return  getLeftChildIndexOfElement(elementIndex) < elements.size();
    }

    private T getRightChildOfElement(int elementIndex)
    {
        return elements.get((elementIndex*2)+2);
    }


    private int getRightChildIndexOfElement(int elementIndex){
        return (elementIndex*2)+2;
    }

    private boolean hasRightChild(int elementIndex)
    {
        return getRightChildIndexOfElement(elementIndex) < elements.size();
    }


    private void swap(int element1Index, int element2Index){

        T temp = elements.get(element1Index);

        elements.set(element1Index, elements.get(element2Index));
        elements.set(element2Index, temp);

    }

    public T peek()
    {
        if(elements.size() == 0) throw new IllegalStateException();

        return elements.get(0);
    }

    public T poll()
    {//remove minimal or maximum element
        if(elements.size() == 0) throw new IllegalStateException();

        T item = elements.get(0);

        //swap the last element(not largest; last element, meaning element in the last position of the tree) with the root element.
        //actually just remove the root element.
        //bubble down the new root until we find it's right spot
        T lastElement = elements.get(elements.size());
        elements.set(0, lastElement);
        elements.remove(elements.size()-1);

        heapifyDown();
        return item;
    }



    public void insert(T element)
    {
//        it is ALWAYS complete because of the way we keep the indices of parents and children; we keep adding to the right ....

        /*
        when we insert into a min-heap we always start by inserting the element at the bottom. We insert at the rightmost
        spot so as to maintain the complete tree property.

        then we 'fix' the tree by swapping the new element with its parent, until we find an appropriate spot for the
        element. We essentially bubble up the minimum element
         */

        elements.add(element);
        heapifyUp();
    }


}
