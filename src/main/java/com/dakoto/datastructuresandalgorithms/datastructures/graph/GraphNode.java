package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dakoto on 02/11/2018.
 */
public class GraphNode<T> {

    private T value;

    private boolean visited;

    private Set<Edge> edges;

    public GraphNode(T value)
    {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addEdge(double weight, GraphNode destination)
    {
        if(this.edges == null) this.edges = new HashSet<>();

        Edge edge = new Edge(weight, destination);

        edges.add(edge);
    }

    public Set<Edge> getEdges()
    {
        return edges;
    }
}
