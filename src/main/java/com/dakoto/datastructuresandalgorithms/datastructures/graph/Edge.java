package com.dakoto.datastructuresandalgorithms.datastructures.graph;

public class Edge {

    private double weight;

    private GraphNode destination;

    public Edge(double weight, GraphNode destination)
    {
        this.weight = weight;
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GraphNode getDestination() {
        return destination;
    }

    public void setDestination(GraphNode destination) {
        this.destination = destination;
    }
}
