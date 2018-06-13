package com.dakoto.datastructuresandalgorithms.datastructures.Trees;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;

public class BinaryTree<T> implements Tree, Search<T> {

    private T value;

    private BinaryTree<T> leftChild;

    private BinaryTree<T> rightChild;

    public BinaryTree(T headValue){

        this.value = headValue;
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

    }

    public void inOrderTraverse(){
        this.leftChild.inOrderTraverse();
        System.out.println(getValue());
        this.rightChild.inOrderTraverse();
    }

    @Override
    public void preOrderTraverse() {
        System.out.println(getValue());
        this.leftChild.preOrderTraverse();
        this.rightChild.preOrderTraverse();
    }

    @Override
    public void postOrderTraverse() {
        this.leftChild.postOrderTraverse();
        this.rightChild.postOrderTraverse();
        System.out.println(getValue());
    }

    @Override
    public void insert() {

    }

    @Override
    public int getHeight() {

        int left = (this.leftChild != null)? this.leftChild.getHeight() : 0;
        int right = (this.rightChild != null)? this.rightChild.getHeight() : 0;

        return Math.max(left, right) + 1;
    }

    @Override
    public void test() {

    }

    @Override
    public void empty() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Boolean breadthFirstSearch(T searchKey) {
        return null;
    }

    @Override
    public Boolean depthFirstSearch(T searchKey) {
        return null;
    }

    @Override
    public Boolean search(T searchKey) {
        return null;
    }
}
