package com.dakoto.datastructuresandalgorithms.datastructures.trees;

import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;

/*
//use examples: bank employee heirarchy, prefix tree, etc.,
 */
public interface Tree<T> extends DataStructure {

    void levelOrderTraverse();

    void inOrderTraverse();

    void preOrderTraverse();

    void postOrderTraverse();

    void insert(T node);

    int getHeight();

    T getLeftMostElement();

    T getRightMostElement();

    Tree<T> getLeftMostNode();

    Tree<T> getRightMostNode();


}
