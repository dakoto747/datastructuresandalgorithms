package com.dakoto.datastructuresandalgorithms.algorithms.sort;

import java.util.List;

public interface Sort<T> {

    void topologicalSort();

    default List<T> mergeSort(List<T> elements){

        return null;
    }


    default List<T> quickSort(List<T> elements){

        return null;
    }
}
