package com.dakoto.datastructuresandalgorithms.algorithms.search;

import com.dakoto.datastructuresandalgorithms.datastructures.graph.Graph;

public interface ShortestPath<T> extends Graph<T> {

    default void findShortestPathInAcyclicGraph(T source, T destination)
    {
        dijkstraSearch(source, destination);
    }

    default void findShortestPathInCyclicGraph(T source, T destination)
    {
        bellmanFordSearch(source, destination);
    }
}
