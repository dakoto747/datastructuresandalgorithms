package com.dakoto.datastructuresandalgorithms.algorithms.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class AdjacencyList<T> implements Graph<T>, Search<T> {


    public HashMap<T, List<T>> adjancencyList = new HashMap<>();

    public List<T> nodes;

    public boolean visited = false;

    public void addNode(T node, T child){

    }

    public void addNode(T node, ArrayList<T> children){

    }

    public void deleteNode(){

    }


    public boolean breadthFirstSearch(T searchKey){

        return false;
    }

    public boolean depthFirstSearch(T searchKey) {
        /* this seems to be for trees
        The pseudocode below implements DFS.

        void search(Node root) {
            if (root == nUll) return; visit(root);
            root. visited = true;
            for each (Node n in root.adjacent) {
                if(!n.visited){
                    search(n);
                }
            }
        */
//todo: also try "frontier approach"

        return searchNode(searchKey, this.nodes, this.adjancencyList, new ArrayList<>());
    }

    public boolean searchNode(T searchKey,
                              List<T> nodes,
                              Map<T, List<T>> adjancencyList,
                              List<T> visited){

        for(T node : nodes){

            if(!visited.contains(node)){

                visited.add(node);

                if(node.equals(searchKey)){
                    return true;
                }

                //todo: fix this:
                for(T child : adjancencyList.get(node)){
                    return searchNode(searchKey, nodes, adjancencyList, visited);
                }
            }
        }

        return false;
    }

}
