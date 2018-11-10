package com.dakoto.datastructuresandalgorithms.tips;

public class Tips2 {
    /*
     *  1.  For example, if the string is aabccdeeaa, then there are six character sequences. It's slow because string concatenation operates in 0(n^2)
     *  	use StringBuilder
     *  2. devilInDetails: can the length of strings hellp? does working backrward help, does the count of chars help?
     *  	does the property of the count of chars(e.g even or odd) help?
     *  3. can we use the int(ASCII/UTF) representation to our advantage?
     *  4. remember just because you have more than one loop doesn't mean worse complexity, it may just mean O(2N)
     *  5. hashtables can be easily index into
     *  6. recursive solutions are often cleaner but less optimal.
     *  7. k-th to last : 2 pointers
     *  8. leverage resources. think two scans = O(2N) think duplicates, think indexing, think two arrays around a pivot or modulus(partition or rotate) ;
     *     think like homer simpsons/a simpsons writer: be resourceful; your brain is infinite; program it;
     *     watch cartoons (tom and jerry) and draw: activate right brain, mix left and right
     *  9. think! don't get hung on looking-for past solutions or shoe-horning past sols
     * 10. most significant digit: (number-(number%10))/10
     * 11. the runner technique
     * 12. palindrome/rotation : even number, two lists, pivots. duplicate
     * 		Think about the specific properties of the problem: how to mathematically represent them ;
     * 		the answer is in the question or the brute force; brute force first.
     * 13. with stacks and queues, stay focused on the operations that define those data structures
     * 14. Trees: fast and sorted insertions/lookups ; Trees are sorted alternatives to lists, maps, key-value pairs(case and point: TreeMap)
     * 15. think specific and pedantic, not spiritual
     * 16. Modularize code may help
     * 17. stack LIFO(useful in implementing reverseLists)
     * 18. to create string windows, use two pointers; you can store array index as map value, just use containskey(0 properly
     * 19. middle out (palindrome) or backward
     * max min ops
     * charAt(i) - '0'
     * queue: level order traverse
     *
     * most significant digit: (number-(number%10))/10
     */

    /*
     * problem properties:
     * datatypes
     * length
     * operations (they influence edge cases) stack, queue
     * other representation forms: strings as ASCII, states as graph, digits in tries
     *  unique: think numbers/xor/binary/ascii
     *
     * number properties:
     * even/odd
     * modulus
     * xor
     * bit manipulation(masks, bit shift, two's complement)
     *
     * leverage
     * topological sort: loop unrolling
     * hashing
     * frequency lists
     * lookup tables
     * multiple scans O(2N)
     * working backwards
     * indexing(BSTs)
     * sorting
     * TOPOLOGICAL SORT
     * use linkedlist/arraylist to implement queue/stack
     * binary search
     * memoization
     * replace recursion with "while" ?
     * runner technique
     * regexes
     *
     * state brute force, even if it's painfully obvious(with hashtables and such).
     *
     *
     * Quicksort: n^2 nlogn
     * Mergesort: nlogn
     * radixsort:
     * insertion sort: n^2
     * bucket sort:
     * bubble sort:
     * binary search: logn
     *
     * BST insert: O(N)
     * BST search: O(N) worst case
     *
     * think specific and pedantic, not spiritual
     *
     *
     * DFS and BFS aren't only for graphs
     *
     * methods of traversing datastrucures:
     *  1. Iteratively
     *  2. Runnners
     *  3. index manipulation
     *  4. dfs
     *  5. bfs
     *
     * Note that pre-order and other forms of tree traversal are a form of DFS.
     * The key difference is that when implementing this algorithm for a graph, we must check if the node has been visited.
     * If we don't, we risk getting stuck in an infinite loop.
     *
     * uses of graphs:
     *
     *
     * most data structures are dynamic programming tasks
     * - merge-sort: dynamic programming
     * - tree traversal (apart from level order traverse): dynamic programming
     * - insertion, etc.
     * - break down implementations into smaller problems
     *
     *
     * if the the problem is too large, break it down into sub problems instead of using multiple if-elses
     *
     *
     * what are heaps used for?
     *
     * can you break the problem into classes and methods that make it easier on you ? like in Langton's Ant
     *
     * do the housekeeping in place. stop skipping the house keeping. the tracker variables, etc like total in mergesort
     *
     *
     *

     */
}
