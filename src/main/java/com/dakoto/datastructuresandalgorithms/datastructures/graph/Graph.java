package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;
import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;

import java.util.HashSet;


/**
 *
 * example uses:
 *  social networking
 *  organizations organograms
 *  web crawling
 *  network representation/broadcast /routes/shortest path
 *  garbage collection
 *  model checking
 *      for instance, you have a piece of code or circuit and you wanna prove that it does what
 *      you actually think it does. The graph is all the possible states that your circuit or
 *      program could have. You start from some initial state and you wanna know among all the states
 *      you can run, does it have some property
 *  checking mathematical conjectures(graph of every possible input to a theorem)
 *  Solving puzzles and games(rubik's cube)
 *


 // routes, friends, etc on linkedIn
 //always use examples! application based learning

 */
public interface Graph<T> extends DataStructure<T> {


    default void printAllNodeConnections(T sourceNode, T destinationNode){

    }

    default boolean isCyclic(){

        return false;
    }

    default void dijkstraSearch(T sourceNode, T destinationNode)
    {
        /*
         *A path is a sequence of edges and each of those edges has to be in the set of Edges E of the graph
         *
         *
         * shortest path is infinity otherwise .... update as you go along
         *
         *     +A---2------E-----4
         *   1/ +\ \_       \     \
         *   /  | \  \5      \ 4   \
         *  s  1|  \  \_+C    \     \
         *   +\ |  /3    +     \     +
         *   2 \| /      | 2   /      F
         *      B+        \   /      +
         *      |_________+D+-      /
         *          1      |_____1_/
         *
         *
         * s = source
         * v = vertex or node
         * d(u) = current weight
         * d(s) = 0 (because it's the source and we haven't moved anywhere)
         * d(vs) = infinity ; as you visit each node, you change this value to the weight so far.
         *
         * we need to find the sequence of vertices that corresponds to the minimum weight path by:
         * 1. defining the predecessor relationship
         *      d(v): current weight
         *      Y(v): predecessor vertex on the current best path to Y(s): Nil
         *
         *      d is something you want to change to delta eventually
         *      "the d number and the predecessor number"
         *
         *      Y(s) is what we eventually want due to "best" description.
         *
         *      "When you're working to find the path, you have some particular path that happens to be
         *       the current best path. And that's a sequence you can get by following the predecessors,
         *       so once you're at a particular vertex `e`, you can look at Y(e) and if that points you
         *       to vertex c, if you look at Y(c), it might point you to a .... etc In the graph drawn,
         *       Y(e) points to a and Y(a) -> S which is the best path"
         *
         */
        double currentWeight;


    }

    default void relax(double currentShortestPathCost, GraphNode<T> currentNode, HashSet<GraphNode<T>> path)
    {
        /*
         * a directed acyclic graph, is a finite directed graph with no directed cycles.
         * That is, it consists of finitely many vertices and edges, with each edge directed from one vertex to another,
         * such that there is no way to start at any vertex v and follow a consistently-directed sequence of edges that
         * eventually loops back to v again. Equivalently, a DAG is a directed graph that has a topological ordering, a
         * sequence of the vertices such that every edge is directed from earlier to later in the sequence.
         */

        for(Edge edge : currentNode.getEdges())
        {

        }
//        if(currentNode)
    }

    void bellmanFordSearch(T sourceNode, T destinationNode);

    void aStar(T sourceNode, T destinationNode);

    boolean isAcyclic();


}
