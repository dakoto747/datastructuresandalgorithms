package com.dakoto.datastructuresandalgorithms.algorithms.search;

public interface ShortestPath<T> {

    default String findShortestPathInAcyclicGraph(){

        return null;
    }

    default String findShortestPathInCyclicGraph(){

        return null;
    }
}
