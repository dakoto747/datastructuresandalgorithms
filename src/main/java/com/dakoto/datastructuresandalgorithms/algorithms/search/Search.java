package com.dakoto.datastructuresandalgorithms.algorithms.search;

public interface Search<T> {

//DFS and BFS aren't only for graphs, you can use them on various data structures

    default boolean breadthFirstSearch(T searchKey){

        return false;
    }

    default boolean breadthFirstSearch(T root, T destination){

        return false;
    }

    default boolean depthFirstSearch(T searchKey){
        /*
        Note that pre-order and other forms of tree traversal are a form of DFS.
        The key difference is that when implementing this algorithm for a graph,
        we must check if the node has been visited.
        If we don't, we risk getting stuck in an infinite loop.

    The depth-first search will find all non-cyclical paths between two nodes
         */

        return false;
    }

    default boolean depthFirstSearch(T root, T destination){

        return false;
    }

    default boolean search(T searchKey){

        return false;
    }
}
