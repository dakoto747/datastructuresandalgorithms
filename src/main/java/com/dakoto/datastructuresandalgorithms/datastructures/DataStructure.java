package com.dakoto.datastructuresandalgorithms.datastructures;

public interface DataStructure {

    void test();

    default void traverse(){};

    void empty();

    boolean isEmpty();

    int getSize();

}
