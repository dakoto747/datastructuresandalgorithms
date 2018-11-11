package com.dakoto.datastructuresandalgorithms.datastructures.graph;

import com.dakoto.datastructuresandalgorithms.algorithms.search.Search;
import com.dakoto.datastructuresandalgorithms.algorithms.search.ShortestPath;
import com.dakoto.datastructuresandalgorithms.algorithms.sort.Sort;
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
11, 15

    // routes, friends, etc on linkedIn
    //always use examples! application based learning

 */
public class UndirectedAdjacencyList<T> implements ShortestPath<T>, Search<T>, Sort {


    private HashMap<T, Set<T>> adjancencyList = new HashMap<>();

    public boolean visited = false;

    public void addNode(T node, T adjacentNode)
    {
        Set<T> adjacentNodes;

        if(adjancencyList.containsKey(node))
        {
            adjancencyList.get(node).add(adjacentNode);
        }
        else
        {
            adjacentNodes = new HashSet<>(Arrays.asList(adjacentNode));
            adjancencyList.put(node, adjacentNodes);
        }
    }

    public void addBidirectionalNodes(T node, T adjacentNode)
    {
        addNode(node, adjacentNode);
        addNode(adjacentNode, node);
    }

    public void addNode(T node, Set<T> adjacentNodes){

    }

    public void deleteNode(){

    }

    public Set<T> getAllNodes()
    {
        return this.adjancencyList.keySet();
    }


    public boolean breadthFirstSearch(T searchKey){

        return false;
    }

    public void visitNode(GraphNode node){

    }

    public boolean breadthFirstSearch(T root, GraphNode destination, HashSet<T> visited)
    {

        //In BFS, node a visits each of a's neighbors before visiting any of their neighbors.
        // You can think of this as searching level by level out from a.
        // An iterative solution involving a queue usually works best,

        com.dakoto.datastructuresandalgorithms.datastructures.Queue<T> queue = new Queue<>();
        queue.enqueue(root);

        while(!queue.isEmpty())
        {
            T value = queue.dequeue();

            visited.add(value);

            for(T node : this.adjancencyList.get(value))
            {

                if(!visited.contains(node))
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

    public static void main(String args[])
    {
//        A <----> C
//        A <----> D
//        B <----> C
//        B <----> D

        UndirectedAdjacencyList<Character> adjacencyList = new UndirectedAdjacencyList<>();

        adjacencyList.addBidirectionalNodes('A', 'C');
        adjacencyList.addBidirectionalNodes('A', 'D');
        adjacencyList.addBidirectionalNodes('A', 'E');
        adjacencyList.addBidirectionalNodes('B', 'C');
        adjacencyList.addBidirectionalNodes('B', 'D');
        adjacencyList.addBidirectionalNodes('E', 'D');

        for(Map.Entry<Character, Set<Character>> entry : adjacencyList.adjancencyList.entrySet())
        {
            for(Character value : entry.getValue())
            {
                System.out.println(entry.getKey()+"--->"+value);
            }
        }

        adjacencyList.printAllRoutes('A', 'D');//.forEach(System.out::println);


    }


    public void printAllRoutesBFSHelper(T root, T destination, HashSet<T> visited,  StringBuilder currentRoute)
    {
        Queue<T> nodes = new Queue<>();
        nodes.enqueue(root);


        while(!nodes.isEmpty())
        {
            T currentNode = nodes.dequeue();
            currentRoute.append("->").append(currentNode);
            visited.add(currentNode);

            if(currentNode == destination)
            {
                System.out.println(currentRoute.toString());
                return;
            }

            for(T adjacentNode : adjancencyList.get(currentNode))
            {
                if(!visited.contains(adjacentNode))
                {
                    nodes.enqueue(adjacentNode);
                }
            }

        }

    }

    public void printAllRoutesDFSHelper(T root, T destination, HashSet<T> visited,
                                                   StringBuilder currentRoute, HashSet<String> routes)
    {


        if(root == destination)
        {
            System.out.println(currentRoute.toString());
            return;
        }

        for(T adjacentNode: adjancencyList.get(root))
        {
            if(!visited.contains(adjacentNode))
            {

                visited.add(adjacentNode);
                currentRoute.append("->").append(adjacentNode);

                if(adjacentNode == destination){
                    routes.add(currentRoute.toString());
                    System.out.println(currentRoute.toString());
                    return;
                }
                printAllRoutesDFSHelper(adjacentNode, destination, visited, currentRoute, routes);

            }
        }


    }

    public HashSet<String> printAllRoutes(T root, T destination)
    {
        HashSet<String> routes = new HashSet<>();

        for(T adjacent : adjancencyList.get(root))
        {
            printAllRoutesDFSHelper(adjacent, destination, new HashSet<T>(Arrays.asList(adjacent, root)),
                    new StringBuilder("->"+root+"->"+adjacent), new HashSet<String>());
        }

        System.out.println("printing BFS helper ... ");

        for(T adjacent : adjancencyList.get(root))
        {
            printAllRoutesBFSHelper(adjacent, destination, new HashSet<T>(Arrays.asList(adjacent, root)),
                    new StringBuilder("->"+root));
        }
        return routes;
    }


    public boolean searchNode(T searchKey,
                              Set<T> nodes,
                              Map<T, Set<T>> adjancencyList,
                              List<T> visited){



        for(T node : nodes){

            if(!visited.contains(node)){

//                visited.add(node);

                if(node.equals(searchKey)){
                    return true;
                }

                //todo: fix this:
                for(T adjacentNode : adjancencyList.get(node)){
                    return searchNode(searchKey, nodes, adjancencyList, visited);
                }
            }
        }

        return false;
    }

    public void dfs(T node, T destination, HashSet<T> visited)
    {
        if(node == destination){
            System.out.println();
        }
        else if(!visited.contains(node)){
            visited.add(node);
            for(T adjacentNode : adjancencyList.get(node)){
                dfs(adjacentNode, destination, visited);
            }
        }

    }

    public boolean bloombergInterviewQuestion(T source, T destination)
    {
        for(T node : adjancencyList.get(source))
        {
//            dfs(node, destination, );
        }
        return false;
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
