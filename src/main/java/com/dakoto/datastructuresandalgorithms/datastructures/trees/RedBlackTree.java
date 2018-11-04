package com.dakoto.datastructuresandalgorithms.datastructures.trees;

public class RedBlackTree<T extends Comparable> extends BinarySearchTree<T>{
/*
BST data structure with extra color field for each node satisfying Red Black properties:

1. Every node is either red or black
2. The root and leaves are all black
3. Every red node has a black parent; every red node has two black children
4. All simple paths from a node x to a descendant leaf of x have the same number of black nodes


uses less memory than most other balancing trees, can rebalance faster and thus, are more desirable when trees are modified frequently.
downside: they do not ensure quite as strict balancing, but balancing is still good enough to ensure o(logN) operations
 */

    //satisfying the first property;
    public static enum RedBlackNodeColor{RED, BLACK};

    private RedBlackNodeColor nodeColor;


    public RedBlackNodeColor getNodeColor(){
        return this.nodeColor;
    }

    public void setNodeColor(RedBlackNodeColor nodeColor){
        this.nodeColor = nodeColor;
    }



    @Override
    public void insert(T node)
    {
        /*
        In AVL tree insertion, we used rotation as a tool to do balancing after insertion caused imbalance. In Red-Black tree, we use two tools to do balancing.

        1) Recoloring
        2) Rotation

        We try recoloring first, if recoloring doesn’t work, then we go for rotation. Following is detailed algorithm.
        The algorithms has mainly two cases depending upon the color of uncle. If uncle is red, we do recoloring.
        If uncle is black, we do rotations and/or recoloring.

        Color of a NULL node is considered as BLACK.

        Let x be the newly inserted node.
        1) Perform standard BST insertion and make the color of newly inserted nodes as RED.
        2) If x is root, change color of x as BLACK (Black height of complete tree increases by 1).
        3) ) Do following if color of x’s parent is not BLACK or x is not root.
             a) If x’s uncle is RED (Grand parent must have been black from property 4)
                (i) Change color of parent and uncle as BLACK.
                (ii) color of grand parent as RED.
                (iii) Change x = x’s grandparent, repeat steps 2 and 3 for new x.


                            grandparent(B)
                                /\
                               /  \
                       parent(R)   uncle(R)
                        /\             /\
                       /  \         nil  nil
          current_node(R)  nil

         */


    }

}
