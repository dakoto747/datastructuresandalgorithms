package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;
import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;
import com.dakoto.datastructuresandalgorithms.algorithms.sort.Sort;
import com.dakoto.datastructuresandalgorithms.datastructures.BinaryHeap;

import java.util.*;

public class DirectedAdjancencyList<T> implements ShortestPath<T>, Search<T>, Sort {

    private Map<T, GraphNode<T>> nodes;

    public DirectedAdjancencyList()
    {
        nodes = new HashMap<>();
    }

    public void addNode(T node)
    {
        nodes.put(node, new GraphNode<>(node));
    }

    public void addEdge(GraphNode<T> source, double weight, GraphNode<T> destination)
    {
        GraphNode<T> sourceNode = (nodes.containsKey(source.getValue()))? nodes.get(source.getValue()) : source;
        GraphNode<T> destinationNode = (nodes.containsKey(destination.getValue()))? nodes.get(destination.getValue()) : destination;

        //todo: add check for duplicated edges
        sourceNode.addEdge(weight, destinationNode);
        nodes.put(source.getValue(), sourceNode);
        nodes.put(destination.getValue(), destinationNode);
    }

    public void addEdge(T source, double weight, T destination)
    {
        GraphNode<T> sourceNode = (nodes.containsKey(source))? nodes.get(source) : new GraphNode<>(source);
        GraphNode<T> destinationNode = (nodes.containsKey(destination))? nodes.get(destination) : new GraphNode<>(destination);

        //todo: add check for duplicated edges
        sourceNode.addEdge(weight, destinationNode);
        nodes.put(source, sourceNode);
        nodes.put(destination, destinationNode);
    }

    @Override
    public void topologicalSort() {

    }

    @Override
    public void dijkstraSearch(T sourceNode, T destinationNode)
    {
        BinaryHeap nodesThatNeedToBeProcessed = new BinaryHeap<>(BinaryHeap.BinaryHeapType.MIN);
        // to compute this, DFS between source and destination, keep track of vertices, and add vertex to
        // nodesThatNeedToBeProcessed when found.

        /*
         * a directed acyclic graph, is a finite directed graph with no directed cycles.
         * That is, it consists of finitely many vertices and edges, with each edge directed from one vertex to another,
         * such that there is no way to start at any vertex v and follow a consistently-directed sequence of edges that
         * eventually loops back to v again. Equivalently, a DAG is a directed graph that has a topological ordering, a
         * sequence of the vertices such that every edge is directed from earlier to later in the sequence.
         */


    }

    @Override
    public void bellmanFordSearch(T sourceNode, T destinationNode) {

    }

    @Override
    public void aStar(T sourceNode, T destinationNode) {

    }

    @Override
    public boolean isAcyclic() {
        return false;
    }

    @Override
    public void test() {

    }

    @Override
    public void empty() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public List<T> toList() {
        return null;
    }
}
