package com.dakoto.datastructuresandalgorithms.datastructures.trees;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;
import com.dakoto.datastructuresandalgorithms.datastructures.Queue;

/**
 *
 *
 *
 */
public class BinaryTree<T> implements Tree<T>, Search<T>, Cloneable{

    protected T value;

    protected BinaryTree<T> leftChild;

    protected BinaryTree<T> rightChild;

    public BinaryTree(){}

    public BinaryTree(T rootValue){

        this.value = rootValue;
    }

    protected BinaryTree(BinaryTree<T> another)
    {
        value = another.getValue();
        leftChild = another.getLeftChild();
        rightChild = another.getRightChild();
    }

    public Object clone()
    {
        return new BinaryTree<>(this);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTree<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTree<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTree<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTree<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public void levelOrderTraverse() {

        //this is breadth-first search

        Queue<BinaryTree<T>> nodes = new Queue<BinaryTree<T>>();
        nodes.enqueue(this);

        while(!nodes.isEmpty()){

            BinaryTree<T> currentNode =nodes.dequeue();
            visit(currentNode);

            if(currentNode.rightChild != null){
                nodes.enqueue(rightChild);
            }

            if(currentNode.leftChild != null){
                nodes.enqueue(leftChild);
            }
        }
    }

    public void visit(BinaryTree node){
        System.out.println(node.getValue());
    }

    public void inOrderTraverse(){
        this.leftChild.inOrderTraverse();
        visit(this);
        this.rightChild.inOrderTraverse();
    }

    @Override
    public void preOrderTraverse() {
        visit(this);
        this.leftChild.preOrderTraverse();
        this.rightChild.preOrderTraverse();
    }

    @Override
    public void postOrderTraverse() {
        this.leftChild.postOrderTraverse();
        this.rightChild.postOrderTraverse();
        visit(this);
    }

    @Override
    public void insert(T node) {

    }

    @Override
    public int getHeight() {

        int left = (this.leftChild != null)? this.leftChild.getHeight() : 0;
        int right = (this.rightChild != null)? this.rightChild.getHeight() : 0;

        return Math.max(left, right) + 1;
    }

    @Override
    public T getLeftMostElement() {
        return getLeftMostNode().getValue();
    }

    @Override
    public T getRightMostElement() {
        return getRightMostNode().getValue();
    }

    @Override
    public BinaryTree<T> getLeftMostNode() {
        if(this.value == null) {
            return null;
        }
        if(this.leftChild == null){
            return this;
        }
        BinaryTree<T> buffer = this;

        while(buffer.leftChild != null){
            buffer = buffer.leftChild;
        }
        return buffer;
    }

    @Override
    public BinaryTree<T> getRightMostNode() {
        if(this.value == null) {
            return null;
        }
        if(this.rightChild == null){
            return this;
        }
        BinaryTree<T> buffer = this;

        while(buffer.rightChild != null){
            buffer = buffer.rightChild;
        }
        return buffer;
    }


    @Override
    public void test() {

    }

    @Override
    public void empty() {

    }

    @Override
    public boolean isEmpty() {
        return this.value == null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean breadthFirstSearch(T searchKey) {
        return false;
    }

    @Override
    public boolean depthFirstSearch(T searchKey) {
        return false;
    }

    @Override
    public boolean search(T searchKey) {
        return false;
    }
}
