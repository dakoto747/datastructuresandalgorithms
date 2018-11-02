package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;
import com.dakoto.datastructuresandalgorithms.datastructures.*;
import com.dakoto.datastructuresandalgorithms.datastructures.Queue;

import java.util.*;

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


    private HashMap<GraphNode<T>, Set<GraphNode<T>>> adjancencyList = new HashMap<>();

    public boolean visited = false;

    public void addNode(T node, T child){

    }

    public void addNode(T node, Set<T> adjacentNodes){

    }

    public void deleteNode(){

    }

    public Set<GraphNode<T>> getAllNodes()
    {
        return this.adjancencyList.keySet();
    }


    public boolean breadthFirstSearch(T searchKey){

        return false;
    }

    public void visitNode(GraphNode node){

    }

    public boolean breadthFirstSearch(GraphNode root, GraphNode destination)
    {

        //In BFS, node a visits each of a's neighbors before visiting any of their neighbors.
        // You can think of this as searching level by level out from a.
        // An iterative solution involving a queue usually works best,

        com.dakoto.datastructuresandalgorithms.datastructures.Queue<GraphNode> queue = new Queue<>();
        queue.enqueue(root);

        while(!queue.isEmpty())
        {
            GraphNode value = queue.dequeue();

            value.setVisited(true);

            for(GraphNode node : this.adjancencyList.get(value))
            {

                if(!node.isVisited())
                {
                    queue.enqueue(node);
                }
            }

        }
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

        return searchNode(searchKey, this.getAllNodes(), this.adjancencyList, new ArrayList<>());
    }

    public boolean searchNode(T searchKey,
                              Set<GraphNode<T>> nodes,
                              Map<GraphNode<T>, Set<GraphNode<T>>> adjancencyList,
                              List<T> visited){



        for(GraphNode node : nodes){

            if(!visited.contains(node)){

//                visited.add(node);

                if(node.equals(searchKey)){
                    return true;
                }

                //todo: fix this:
                for(GraphNode child : adjancencyList.get(node)){
                    return searchNode(searchKey, nodes, adjancencyList, visited);
                }
            }
        }

        return false;
    }

    public void dfs(GraphNode node, GraphNode destination)
    {
        if(node == destination){
            System.out.println();
        }
        else if(!node.isVisited()){
            node.setVisited(true);
            for(GraphNode child : adjancencyList.get(node)){
                dfs(child, destination);
            }
        }

    }

    public boolean bloombergInterviewQuestion(GraphNode source, GraphNode destination)
    {
        for(GraphNode node : adjancencyList.get(source))
        {
            dfs(node, destination);
        }
        return false;
    }
}
