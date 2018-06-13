package com.dakoto.datastructuresandalgorithms.algorithms.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;

public interface Graph<T> extends ShortestPath<T>{


    default void printAllNodeConnections(T sourceNode, T destinationNode){

    }

    default boolean isCyclic(){

        return false;
    }

}
