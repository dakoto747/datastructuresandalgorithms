package com.dakoto.datastructuresandalgorithms.datastructures.graph;

/**
 * Created by dakoto on 02/11/2018.
 */
public class GraphNode<T> {

    private T value;

    private boolean visited;

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
}
