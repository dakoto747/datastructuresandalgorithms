package com.dakoto.datastructuresandalgorithms.datastructures;

import java.util.Map;

public class DisjointSetForest<T> //Wrapper
{

/*
alternative implementation: https://github.com/Todd-Davies/UnionFind/blob/master/src/com/todddavies/unionfind/UnionFind.java

A.K.A Union Find.

    Have a bunch of nodes.

    some of which are connected.

    is there a path between two given nodes?

    what/which groups of nodes are connected

    it lets us find if two things are connected.


    think sets/disjoint sets
    OPS:

    Makeset: add objects to the datastructure
    union: link objects together
    Find: are objects connected?

*/

    /*
       https://en.wikipedia.org/wiki/Disjoint-set_data_structure

       A disjoint-set forest consists of a number of elements each of which stores an id, a parent pointer, and,
       in efficient algorithms, either a size or a "rank" value.

       The parent pointers of elements are arranged to form one or more trees, each representing a set. If an element's
       parent pointer points to no other element, then the element is the root of a tree and is the representative member
       of its set. A set may consist of only a single element. However, if the element has a parent, the element is part
       of whatever set is identified by following the chain of parents upwards until a representative element
       (one without a parent) is reached at the root of the tree.

       Forests can be represented compactly in memory as arrays in which parents are indicated by their array index.


       Disjoint-set data structures model the partitioning of a set, for example to keep track of the connected components
       of an undirected graph. This model can then be used to determine whether two vertices belong to the same component,
       or whether adding an edge between them would result in a cycle.
       The Union–Find algorithm is used in high-performance implementations of unification.



     */


    private Map<T, DisjointSetTree> elementMap;

    public void makeSet(T element)
    {
        if(!elementMap.containsKey(element))
        {
            DisjointSetTree disjointSetTree = new DisjointSetTree(element);
            disjointSetTree.setParent(disjointSetTree);

            elementMap.put(element, disjointSetTree);
        }

        //The MakeSet operation makes a new set by creating a new element with
        //
        // a unique id,
        // a rank of 0,
        // and a parent pointer to itself.
        //
        // The parent pointer to itself indicates that the element is the representative member of its own set.
        // The MakeSet operation has O(1) time complexity, so initializing n sets has O(n) time complexity.
        //
        // Pseudocode:

        //function MakeSet(x)
        //   if x is not already present:
        //     add x to the disjoint-set tree
        //     x.parent := x
        //     x.rank   := 0
        //     x.size   := 1
    }

    public DisjointSetTree find(T elementValue)
    {
        DisjointSetTree element = elementMap.get(elementValue);

        if(element.parent != element){
            element.parent = find((T) element.getParent().getElement());
        }

        return element.parent;

        // Find(x) follows the chain of parent pointers from x up the tree until it reaches a root element,
        // whose parent is itself.
        // This root element is the representative member of the set to which x belongs, and may be x itself.

        // Pseudocode:

        // function Find(x)
        //   if x.parent != x
        //     x.parent := Find(x.parent)
        //   return x.parent
    }

    public boolean find(T item1, T item2)
    {
        return find(item1) == find(item2);
    }

    public void union(T zero, T one)
    {

        DisjointSetTree zerosRoot = elementMap.get(zero).find();

        DisjointSetTree onesRoot = find(one);

        if(zerosRoot == onesRoot) return;

        //get the smaller tree and store it in onesRoot
        if(zerosRoot.getRank() < onesRoot.getRank())
        {
            DisjointSetTree temp = zerosRoot;
            zerosRoot = onesRoot;
            onesRoot = temp;
        }

        //merge
        onesRoot.setParent(zerosRoot);

        if(zerosRoot.getRank() == onesRoot.getRank())
        {
            zerosRoot.setRank(zerosRoot.getRank() + 1);
        }

        // Union(x,y) uses Find to determine the roots of the trees x and y belong to.
        // If the roots are distinct, the trees are combined by attaching the root of one to the root of the other.
        // If this is done naively, such as by always making x a child of y, the height of the trees can grow as {\displaystyle O(n)} O(n).
        // To prevent this union by rank or union by size is used.

        // Union by rank always attaches the shorter tree to the root of the taller tree.
        // Thus, the resulting tree is no taller than the originals unless they were of equal height,
        // in which case the resulting tree is taller by one node.

        // Union by rank
        // To implement union by rank, each element is associated with a rank.
        // Initially a set has one element and a rank of zero.
        // If two sets are unioned and have the same rank, the resulting set's rank is one larger; otherwise,
        // if two sets are unioned and have different ranks, the resulting set's rank is the larger of the two.
        // Ranks are used instead of height or depth because path compression will change the trees' heights over time.

        // Union by size
        // Union by size always attaches the tree with fewer elements to the root of the tree having more elements.


        //Pseudocode:

        // function Union(x, y)
        //   xRoot := Find(x)
        //   yRoot := Find(y)
        //
        //   // x and y are already in the same set
        //   if xRoot == yRoot
        //       return
        //
        //   // x and y are not in same set, so we merge them
        //   if xRoot.rank < yRoot.rank
        //     xRoot, yRoot := yRoot, xRoot // swap xRoot and yRoot
        //
        //   // merge yRoot into xRoot
        //   yRoot.parent := xRoot
        //   if xRoot.rank == yRoot.rank:
        //     xRoot.rank := xRoot.rank + 1
    }


    public class DisjointSetTree<T> //element
    {
    /*
        A disjoint-set forest consists of a number of elements each of which stores an id, a parent pointer, and,
       in efficient algorithms, either a size or a "rank" value.

       The parent pointers of elements are arranged to form one or more trees, each representing a set. If an element's
       parent pointer points to no other element, then the element is the root of a tree and is the representative member
       of its set. A set may consist of only a single element. However, if the element has a parent, the element is part
       of whatever set is identified by following the chain of parents upwards until a representative element
       (one without a parent) is reached at the root of the tree.

     */

        private T element;

        private DisjointSetTree parent;

        private long rank;

        public DisjointSetTree(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public DisjointSetTree getParent() {
            return parent;
        }

        public void setParent(DisjointSetTree parent) {
            this.parent = parent;
        }

        public long getRank() {
            return rank;
        }

        public void setRank(long rank) {
            this.rank = rank;
        }


        public DisjointSetTree find(DisjointSetTree element)
        {

            DisjointSetTree parent = element.getParent();

            if(parent != element){
                parent = find(element.getParent());
            }

            return parent;

            // Find(x) follows the chain of parent pointers from x up the tree until it reaches a root element,
            // whose parent is itself.
            // This root element is the representative member of the set to which x belongs, and may be x itself.

            // Pseudocode:

            // function Find(x)
            //   if x.parent != x
            //     x.parent := Find(x.parent)
            //   return x.parent
        }

        public DisjointSetTree find()
        {

            DisjointSetTree parent = this.getParent();

            if(parent != this)
            {
                parent = parent.find();
            }
            return parent;
        }


    }
}
