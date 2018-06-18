package com.dakoto.datastructuresandalgorithms.datastructures.trees;

/**
 * uses:
 *  think of this as a sorted list, that sorts on insert.
 *  remember it's BINARY nature(2's) which may come useful in questions
 *  you can't perform binary search on them if they aren't balanced
 *
 *
 *
 */
public class BinarySearchTree<T extends Comparable> extends BinaryTree<T> {

    public BinarySearchTree(){}

    public BinarySearchTree(T rootValue) {
        super(rootValue);
    }

    @Override
    public void traverse() {

    }


    @Override
    public void insert(T node){
        if(this.value == null){

            this.value = node;
        }else if(node.compareTo(this.value) > 0){ //handle left child
            //that means it's less than our node's value; refer to ComparablePrimer for more info
            if(this.leftChild == null){

                this.leftChild = new BinarySearchTree<T>(node);
            }else{

                this.leftChild.insert(node);
            }
        }else if(node.compareTo(this.value) < 0) { //handle right child
            //that means it's greater than our node's value; refer to ComparablePrimer for more info

            if(this.rightChild == null){

                this.rightChild = new BinarySearchTree<T>(node);
            }else{

                this.rightChild.insert(node);
            }
        }
    }

    public T getSecondLargestElement(){
//        https://stackoverflow.com/questions/11425352/second-max-in-bst
        /*
       137
       /
      42
       \
        99
         */
        BinaryTree<T> rightmost = this.getRightMostNode();
        if (rightmost.leftChild != null) {
            return rightmost.leftChild.getRightMostElement();
        } else{
                return rightmost.parent
            }
    }

    public T getNthLargestElement(){

        if(this.value == null) {
            return null;
        }
        if(this.rightChild == null){
            return this.value;
        }

        BinaryTree<T> buffer = this, runner = this;

        while(runner != null && runner.rightChild != null){
            buffer = buffer.rightChild;
            runner = buffer.rightChild.rightChild;
        }
        return buffer.value;
    }

    @Override
    public void test(){

    }

}
