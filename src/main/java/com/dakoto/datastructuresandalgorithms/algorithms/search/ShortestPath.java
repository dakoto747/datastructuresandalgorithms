package com.dakoto.datastructuresandalgorithms.algorithms.search;

import com.dakoto.datastructuresandalgorithms.datastructures.graph.Graph;

public interface ShortestPath<T> extends Graph<T> {


    /*
     * A path is a sequence of edges and each of those edges has to be in the set of Edges E of the graph
     */


    default void findShortestPathInDirectedAcyclicGraph(T source, T destination)
    {
        dijkstraSearch(source, destination);
    }

    default void findShortestPathInCyclicGraph(T source, T destination)
    {
        bellmanFordSearch(source, destination);
    }
}
