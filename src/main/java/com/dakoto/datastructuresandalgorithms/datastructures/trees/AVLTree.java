package com.dakoto.datastructuresandalgorithms.datastructures.trees;

public class AVLTree<T extends Comparable> extends BinarySearchTree<T>{
/*

https://www.youtube.com/watch?v=jDM6_TnYIqE


An AVL tree
STORES(in each node) the height of the subtree rooted at this node.
Then for any node, we can check if it is height balanced: that the height of the left subtree and the height of the right
subtree differ by no more than one. This prevents situations where the tree gets too lopsided

            balance(n) = n.left - n.right.height
                        -1 <= balance(n) <= 1
 */

// rotation is always only done on 3 nodes


    public static enum TreeImbalanceType{LEFT_RIGHT_HEAVY, LEF_LEFT_HEAVY, RIGHT_LEFT_HEAVY, RIGHT_RIGHT_HEAVY, BALANCED};


    public AVLTree(T node) {
        super(node);
    }


    /*
    CONSISTENCY: https://youtu.be/jDM6_TnYIqE?t=1610

    when we LEFT ROTATE, we reinsert the RIGHT CHILD of the new root; that's all we have to worry about for consistency; https://youtu.be/jDM6_TnYIqE?t=1610
          C: newRight(current Root)
           /                      \
     A: newRoot(current left)    D: new Rights right Child
         /                \
 B: newLeft            E: new right's Left Child E
 (current left's Child)

      we want

       A
      / \
    B    C
        / \
       E   D

    watch video for more clarification



    when we RIGHT ROTATE, we reinsert the LEFT CHILD of the new root

     */

    // rotation is always only done on 3 nodes
    public void leftRotate()
    {
        //new root is the left child.

        // detach this root for reassignment
        AVLTree<T> truncatedNewRight = new AVLTree<T>(this.getValue());
        truncatedNewRight.setRightChild(this.getRightChild());

        //REASSIGN new root's right child
        //1. assign new root's right child
        truncatedNewRight.setLeftChild(this.leftChild.getRightChild());

        //2. remove new roots right child
        this.leftChild.setRightChild(null);

        // reassign this to the new root: it's left child
        this.setValue(this.leftChild.getValue());
        this.setLeftChild(this.leftChild.getLeftChild());
        this.setRightChild(truncatedNewRight);

    }

    // rotation is always only done on 3 nodes
    public void rightRotate()
    {
        //new root is the right  child;

        //detach this root for reassignment
        AVLTree<T> truncatedNewLeft = new AVLTree<>(this.getValue());
        truncatedNewLeft.setLeftChild(this.getLeftChild());


        //REASSIGN new root's left child
        //assign the new right child to the new left child
        truncatedNewLeft.setRightChild(this.rightChild.getLeftChild());

        //remove new roots left child
        this.rightChild.setLeftChild(null);

        this.setValue(rightChild.getValue());
        this.setRightChild(rightChild.getRightChild());
        this.setLeftChild(truncatedNewLeft);

    }

    public TreeImbalanceType getTreeImbalanceType()
    {
        if(getNodeBalance() == 2)
        {
            return TreeImbalanceType.LEFT_RIGHT_HEAVY;
        }
        else if(getNodeBalance() == -2)
        {
            return TreeImbalanceType.RIGHT_LEFT_HEAVY;
        }
        else{
            return TreeImbalanceType.BALANCED;
        }
    }


    public void balance(){

        switch (getTreeImbalanceType()){
            case BALANCED: return;

            case LEFT_RIGHT_HEAVY:

                ((AVLTree)this.leftChild).leftRotate();
                this.rightRotate();

                break;

            case RIGHT_LEFT_HEAVY:

                ((AVLTree)this.rightChild).rightRotate();
                this.leftRotate();

                break;

            case LEF_LEFT_HEAVY:

                this.rightRotate();

                break;

            case RIGHT_RIGHT_HEAVY:

                this.leftRotate();

                break;
        }
    }

    public int getNodeBalance(){

        int left = (this.leftChild != null)? this.leftChild.getHeight() : 0;
        int right = (this.rightChild != null)? this.rightChild.getHeight() : 0;

        return left - right;
    }

    @Override
    public void insert(T node){

        if(this.value == null)
        {
            this.value = node;
        }
        else if(node.compareTo(this.value) > 0)
        { //handle left child
            //that means it's less than our node's value; refer to ComparablePrimer for more info
            if(this.leftChild == null)
            {
                this.leftChild = new AVLTree<T>(node);
            }
            else {
                this.leftChild.insert(node);
            }
        }
        else if(node.compareTo(this.value) < 0)
        { //handle right child
            //that means it's greater than our node's value; refer to ComparablePrimer for more info

            if(this.rightChild == null)
            {
                this.rightChild = new AVLTree<T>(node);
            }
            else {
                this.rightChild.insert(node);
            }
        }
        this.balance();

    }
}
