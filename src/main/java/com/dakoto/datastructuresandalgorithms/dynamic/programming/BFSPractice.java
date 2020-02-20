// BfsPractice
// depthFirstSearchPractice:
import java.util.*;

public class BFSPractice{


    public static void main(String[] args){

    }
    public void visit(Node node){
        System.out.println(node.value);
        node.visited = true; 
    }
    public void BFS(Graph graph){
        Node root = graph.nodes.stream().findFirst().get();

        Queue<Node> traversalQueue = new Queue<Node>(); 
        traversalQueue.add(root); 
        while(!traversalQueue.isEmpty()){
            Node current_node = traversalQueue.remove(); 
            visit(current_node); 
            for(Node node : current_node.ajdacentNodes){
                if(!node.visited){
                    traversalQueue.add(node);
                }
            }
        }
        
    }
}


class Graph{
    Set<Node> nodes = new HashSet<Node>(); 
}
class Node{
    public Set<Node> ajdacentNodes = new HashSet<Node>(); 
    public int value; 
    public boolean visited; 
    public void reset(){
        visited = false; 
    }

    public void addAdjacentNode(Node adjacentNode){
        this.ajdacentNodes.add(adjacentNode);
    }
}