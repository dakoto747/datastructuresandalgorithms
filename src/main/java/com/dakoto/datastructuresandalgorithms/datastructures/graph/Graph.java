package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;
import com.dakoto.datastructuresandalgorithms.datastructures.DataStructure;


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

    void dijkstraSearch(T sourceNode, T destinationNode);

    void bellmanFordSearch(T sourceNode, T destinationNode);

    void aStar(T sourceNode, T destinationNode);

    boolean isAcyclic();


}
