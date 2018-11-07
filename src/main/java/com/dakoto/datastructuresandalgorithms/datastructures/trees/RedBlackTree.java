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


Black Height
We call the number of black nodes on any path from, but not including a node x down to a leaf the black-height of a node,
denoted bh(x).
 */

    //satisfying the first property;
    public static enum RedBlackNodeColor{RED, BLACK};

    public static enum RedBlackTreeImbalanceAxis{LEFT_LEFT, LEFT_RIGHT, RIGHT_LEFT, RIGHT_RIGHT}

    private RedBlackNodeColor nodeColor;

    private RedBlackTree parent;

    public static RedBlackTree sentinel = new RedBlackTree(RedBlackNodeColor.BLACK);

    public RedBlackTree(T value)
    {
        super(value);
        setLeftChild(sentinel);
        setRightChild(sentinel);
        setNodeColor(RedBlackNodeColor.RED);
    }

    public RedBlackTree(T value, RedBlackTree parent)
    {
        this(value);
        this.parent = parent;
    }

    public RedBlackTree(RedBlackNodeColor color)
    {
        this.nodeColor = color;
    }

    public static RedBlackTree getSentinel()
    {
    /*
        For a red-black tree T , the sentinel T: nil is an object with the same attributes as an ordinary node in the
        tree. Its color attribute is BLACK, and its other attributes—p, left, right, and key—can take on arbitrary values.
        As Figure 13.1(b) shows, all pointers to NIL are replaced by pointers to the sentinel T:nil.
        We use the sentinel so that we can treat a NIL child of a node x as an ordinary node whose parent is x.
        Although we instead could add a distinct sentinel node for each NIL in the tree,
        so that the parent of each NIL is well defined, that ap- proach would waste space.
        Instead, we use the one sentinel T:nil to represent all the NILs—all leaves and the root’s parent.
        The values of the attributes p, left, right, and key of the sentinel are immaterial, although we may set them
        during the course of a procedure for our convenience.
    */
        return sentinel;
    }


    public RedBlackNodeColor getNodeColor(){
        return this.nodeColor;
    }

    public void setNodeColor(RedBlackNodeColor nodeColor){
        this.nodeColor = nodeColor;
    }

    @Override
    public void insert(T newElement)
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

        //if node > this
        if(((T)getValue()).compareTo(newElement) == 1)
        {
            if(getLeftChild() == sentinel)
            {
                RedBlackTree newChild = new RedBlackTree(newElement, this);

                if(newChild.isInViolation())
                {
                    if(isRoot())
                    {
                        setNodeColor(RedBlackNodeColor.BLACK);
                        return;
                    }
                    if(getUncle().getNodeColor() == RedBlackNodeColor.RED) fixRedUncle(newChild);
                    else
                    {
                        switch (getImbalanceType())
                        {
                            case LEFT_LEFT:

                                getParent().leftRotate();
                                return;

                            case LEFT_RIGHT:

                                rightRotate();
                                getParent().getParent().leftRotate();
                                return;

                            case RIGHT_LEFT:

                                leftRotate();
                                getParent().getParent().rightRotate();
                                return;

                            case RIGHT_RIGHT:

                                rightRotate();
                                return;
                        }
                    }

                    getParent().getParent().leftRotate();
                    return;
                }
            }
            else
            {
                getLeftChild().insert(newElement);
            }
        }
        else
        {

        }
    }


    public void leftRotate()
    {
        if(this == sentinel) return;

        RedBlackTree newTruncatedRight = new RedBlackTree(getValue(), (RedBlackTree) getRightChild());
        newTruncatedRight.setRightChild(getRightChild());
        newTruncatedRight.setLeftChild(getLeftChild().getRightChild());
        setValue(getLeftChild().getValue());
        setRightChild(getLeftChild().getLeftChild());
        setLeftChild(newTruncatedRight);

        //set new root to black and its children to black

        setNodeColor(RedBlackNodeColor.BLACK);
        if(getLeftChild() != sentinel) ((RedBlackTree)getLeftChild()).setNodeColor(RedBlackNodeColor.RED);

        ((RedBlackTree)getRightChild()).setNodeColor(RedBlackNodeColor.RED);
    }

    public void rightRotate()
    {
        if(this == sentinel) return;

        RedBlackTree newTruncatedLeft = new RedBlackTree(getValue(), (RedBlackTree) getLeftChild());
        newTruncatedLeft.setLeftChild(getLeftChild());
        newTruncatedLeft.setRightChild(getRightChild().getLeftChild());
        setValue(getRightChild().getValue());
        setLeftChild(newTruncatedLeft);
        setRightChild(getRightChild().getRightChild());


        //set new root to black and its children to black

        if(getRightChild() != sentinel) ((RedBlackTree)getRightChild()).setNodeColor(RedBlackNodeColor.RED);

        ((RedBlackTree)getLeftChild()).setNodeColor(RedBlackNodeColor.RED);

    }


    public void fixRedUncle(RedBlackTree node)
    {
        if(node.isRoot())
        {
            node.setNodeColor(RedBlackNodeColor.BLACK);
            return;
        }

        while(node.getParent() != sentinel && node.isInViolation()){
            node.getParent().setNodeColor(RedBlackNodeColor.BLACK);
            node.getUncle().setNodeColor(RedBlackNodeColor.BLACK);
            if(node.getParent().getParent() != sentinel)
            {
                node.getParent().getParent().setNodeColor(RedBlackNodeColor.RED);
                fixRedUncle(node.getParent().getParent());
            }
        }
    }


    private RedBlackTree getUncle()
    {
        //parent value > than my value
        if(((T)getParent().getValue()).compareTo(getValue()) == -1)
        {
            return (RedBlackTree) getParent().getRightChild();
        }
        else
        {
            return (RedBlackTree) getParent().getLeftChild();
        }
    }

    private RedBlackTreeImbalanceAxis getImbalanceType()
    {
        if(isGreaterThanParent())
        {
            if(getParent().isGreaterThanParent()) return RedBlackTreeImbalanceAxis.RIGHT_RIGHT;
            else return RedBlackTreeImbalanceAxis.LEFT_RIGHT;
        }
        else
        {
            if(getParent().isGreaterThanParent()) return RedBlackTreeImbalanceAxis.RIGHT_LEFT;
            else return RedBlackTreeImbalanceAxis.LEFT_LEFT;
        }
    }

    private boolean isGreaterThanParent()
    {
        //isRightChildOfParent
        if(getParent() != sentinel)
        {
            return getValue().compareTo(getParent().getValue()) == -1;
        }

        return false;
    }


    private boolean isInViolation()
    {
        return getNodeColor() == RedBlackNodeColor.RED &&
               getParent().getNodeColor() == RedBlackNodeColor.RED;
    }

    private boolean isRoot()
    {
        return getParent() == sentinel;
    }

    public RedBlackTree getParent() {
        return parent;
    }

    public void setParent(RedBlackTree parent) {
        this.parent = parent;
    }


}
