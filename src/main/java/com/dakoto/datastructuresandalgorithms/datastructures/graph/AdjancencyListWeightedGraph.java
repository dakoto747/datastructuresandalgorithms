package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;
import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;
import com.dakoto.datastructuresandalgorithms.algorithms.sort.Sort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdjancencyListWeightedGraph<T> implements ShortestPath<T>, Search<T>, Sort {

    private Map<T, GraphNode<T>> nodes;

    public AdjancencyListWeightedGraph()
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
    public void dijkstraSearch(T sourceNode, T destinationNode) {

    }

    @Override
    public void bellmanFordSearch(T sourceNode, T destinationNode) {

    }
}
