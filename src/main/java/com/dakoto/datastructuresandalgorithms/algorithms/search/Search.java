package com.dakoto.datastructuresandalgorithms.algorithms.search;

public interface Search<T> {
//DFS and BFS aren't only for graphs

    default Boolean breadthFirstSearch(T searchKey){

        return false;
    }

    default Boolean depthFirstSearch(T searchKey){
        /*
        Note that pre-order and other forms of tree traversal are a form of DFS.
        The key difference is that when implementing this algorithm for a graph,
        we must check if the node has been visited.
        If we don't, we risk getting stuck in an infinite loop.

         */
        return false;
    }

    default Boolean search(T searchKey){

        return false;
    }
}
