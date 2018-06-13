package com.dakoto.datastructuresandalgorithms.algorithms.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList<T> implements Search<T> {
//use examples: bank structure as graph, prefix tree, etc.
    // routes, friends, etc on linkedlist
    //always use examples! application based learning

    public HashMap<T, ArrayList<T>> adjancencyList = new HashMap<>();

    public ArrayList<T> nodes;

    public boolean visited = false;

    public void addNode(){

    }

    public void deleteNode(){

    }


    public Boolean depthFirstSearch(T searchKey) {
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

        return searchNode(searchKey, this.nodes, this.adjancencyList, new ArrayList<>());
    }

    public boolean searchNode(T searchKey,
                              ArrayList<T> nodes,
                              HashMap<T,
                              ArrayList<T>> adjancencyList,
                              ArrayList<T> visited){

        for(T node : nodes){

            if(!visited.contains(node)){

                visited.add(node);

                if(node.equals(searchKey)){
                    return true;
                }
                for(T child : adjancencyList.get(node)){
                    return searchNode(searchKey, nodes, adjancencyList, visited);
                }
            }
        }

        return false;
    }

}
