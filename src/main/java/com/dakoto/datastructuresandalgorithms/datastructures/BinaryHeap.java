package com.dakoto.datastructuresandalgorithms.datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap<T extends Comparable> {

    /*
    a min heap is a complete binary tree (that is, totally filled other than the rightmost elements on the last level)
    where each node is smaller than its children. The root, therefore, is the minimum element in the tree

    we have two key operations on a min-heap: insert and extract_min
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


    public void fixTree() throws Exception{
        //  we 'fix' the tree by swapping the new element with its parent, until we find an appropriate spot for the
        //        element. We essentially bubble up the minimum element
        T rightMostElement = elements.get(elements.size()-1);

        //** get parent

        //make sure it's not the only element in the list
        if(getParentIndexOfElement(rightMostElement) > -1){
            //compare the parent to the child to see if it's less than; if it is, swap, if not, compare with sibling?

            if(getParentOfElement(rightMostElement).compareTo(rightMostElement) == -1){
                //swap
            }else if(getSiblingIndex(rightMostElement) > -){
                if()
            }
        }else{
            //if the sibling is empty, place it there for balance; but don't forget that it is supposed to be a complete
            //tree

            return;
        }

    }

    public T getParentOfElement(int elementIndex) throws Exception{
        if(elements.size() < 2){
            throw new Exception("Heap error: the heap only contains one element; fix your implementation");
        }
        return elements.get(elementIndex-1);
    }

    public T getParentOfElement(T element) throws Exception{
        if(elements.size() < 2){
            throw new Exception("Heap error: the heap only contains one element; fix your implementation");
        }
        return elements.get(elements.indexOf(element)-1);
    }

    public int getParentIndexOfElement(int elementIndex){
        return elementIndex-1;
    }

    public int getParentIndexOfElement(T element){
        return elements.indexOf(element) - 1;
    }

    public int getSiblingIndex(T element){
        // this should be able to return -1; so that we can insert and shift if it's not empty
        // we can simply use a plain binary tree.

        return elements.indexOf(element) - 2;
    }

    public int getSiblingIndex(int elementIndex){
        return elementIndex - 2;
    }




    public void insert(T element){
        // use an arraylist with the center element as the minimum? or an index of the center element
        /*
        when we insert into a min-heap we always start by inserting the element at the bottom. We insert at the rightmost
        spot so as to maintain the complete tree property.

        then we 'fix' the tree by swapping the new element with its parent, until we find an appropriate spot for the
        element. We essentially bubble up the minimum element
         */

        if(this.minimalElementIndex == -1){
            this.elements.add(element);
            return;
        }

        if(this.type == BinaryHeapType.MIN){
            T rightMostElement = elements.get(elements.size()-1);

            if(element.compareTo(rightMostElement) == -1) {
//            element greater than
                elements.add(element);
                fixTree();
            }else if(element.compareTo(another) == 1) {
//            element less than

            }else{

            }

        }else{
            if(element.compareTo(another) == -1) {
//            element greater than

            }

            if(element.compareTo(another) == 1) {
//            element less than

            }
        }

    }

}
