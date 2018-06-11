package com.dakoto.datastructuresandalgorithms.datastructures.Trees;

import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;

public interface Tree extends DataStructure {

    void levelOrderTraverse();

    void inOrderTraverse();

    void preOrderTraverse();

    void postOrderTraverse();

    void insert();

    int getHeight();

}
