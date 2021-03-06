package com.dakoto.datastructuresandalgorithms.datastructures;

import java.util.List;

public interface DataStructure<T> {

    void test();

    default void traverse(){};

    void empty();

    boolean isEmpty();

    int getSize();

    default String printBestCaseRuntimeForOperations()
    {
        return "Big Omega / lowerbound";
    }

    default String printWorstCaseRuntimeForOperations()
    {
        return "Big O / Upperbound";
    }

    default String printAverageRuntimeForOperations()
    {
        return "Big Theta / Big O plus Big Theta";
    }

    List<T> toList();
}
