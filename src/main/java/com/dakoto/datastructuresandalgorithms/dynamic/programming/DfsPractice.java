// depthFirstSearchPractice:
import java.util.*;

public class DfsPractice{


    public static void main(String[] args){

    }
    public void visit(Node node){
        System.out.println(node.value);
        node.visited = true; 
    }
    public void DFS(Graph graph){
        Node root = graph.nodes.stream().findFirst().get();

        Stack<Node> traversalStack = new Stack<Node>(); 
        traversalStack.push(root);
        while(!traversalStack.isEmpty()){
            Node current_node = traversalStack.pop(); 
            visit(current_node);
            Set<Node> ajdacentNodes = current_node.ajdacentNodes; 
            for(Node node : ajdacentNodes){
                if(!node.visited){
                    traversalStack.push(node);
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