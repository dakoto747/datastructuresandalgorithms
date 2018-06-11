package com.dakoto.datastructuresandalgorithms.tips;


public class Tips {
//	CtCi page 102
    // https://peteris.rocks/blog/algorithm-programming-tips-and-tricks/
    // think of how to create array windows.
    //brute force first. it's better to solve the problem than not solve it at all;
// difference between ++i and i++
//    array tips:
//    base case and build.
    // ways of traversing an array:
//        1. index (for loop)
//        2. if you need to compute differences, start from 1, instead of 0 (removes necessity for if-statement)
//        3. array.length - (anynumber{1, 2, currentIndex})
//        4. see if a boolean tracker can help
//        5. Use sum and differences ;; for seq a,b,c; a-b + b-c = a-c
//        6. set theory, permutations, combinations
//
//    somtimes it's better to use a while loop than a for loop, or modify the loop invariant
//    useful math sequences and formulas:

//    there are edge case questions, algorithms questions, data structures questions, data structures and algorithms


//    arrays: play with runners, trackers, modulus, hashmaps, sequence math, indexes and loop invariants
//    characters: xor
//    digits: 10 and modulus, xor, bit manipulation,
//    stacks: reverse, implement with linked lists(reset head), read from back to front,
//    queues: implement with linkedlist(keep track of head and tail, update tail),
//    trees: depth first search,
//    misc: Math.max
//    search: hashmap, binary, pivot, add/duplicate
//    linkedlist: be reference aware
//    prefix tree: quick lookup
//
// PROBLEM REPRESENTATION: CONVERT YOUR PROBLEM TO MATCH MATH/CS/DATA-STRUCTURES AND ALGORITHMS
    //after optimization think like an intruder? edge cases and building a gate using math
    //use first order logic and math to validate design; software architecture, github project. user management, role, customer, customer account, workflow, etc as use case; show how new features affect things

    // MIXING LOOPS, TRACKERS, AND LOOP INVARIANTS

    //keeping track of maximum

//    BUD, base case and build, DIY, simplify and generalize, data structure brainstorm.

    public void lessonsLearned(){

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
         * 12. palindrome/rotation : even number, two lists, pivots.
         * 		Think about the specific properties of the problem: how to mathematically represent them ;
         * 		the answer is in the question or the brute force; brute force first.
         * 13. with stacks and queues, stay focused on the operations that define those data structures
         * 14. Trees: fast and sorted insertions/lookups ; Trees are sorted alternatives to lists, maps, key-value pairs(case and point: TreeMap)
         * 15. think specific and pedantic, not spiritual
         * 16. Modularize code may help
         * 17. in linked lists, runner technique is implemented using  next.next or next.next.next
         */

        /*
         * problem properties:
         * datatypes
         * length
         * operations (they influence edge cases)
         * other representation forms: strings as ASCII, states as graph, digits in tries
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
         * map reduce
         *
         * math.max, math.abs, modulus, middle = start+finish/2 or
         *
         * frequency lists
         * lookup tables
         * multiple scans O(2N)
         * indexing(BSTs)
         * sorting
         * binary search
         * memoization
         *
         * state brute force, even if it's painfully obvious(with hashtables and such).
         *
         * Quicksort: n^2 nlogn
         * Mergesort: nlogn
         * radixsort:
         * insertion sort: n^2
         * bucket sort:
         * bubble sort:
         * binary search: logn
         *
         * think specific and pedantic, not spiritual
         *
         * Articulate your thoughts, nuances, and subtext. Communicate!
         */
    }

    public void computeParity(){
        /*
         * The parity of a sequence of bits is 1 if the number of 1s in the sequence is odd; otherwise it is 0.
         * Parity checks are used to detect single bit errors in data storage and communication
         *
         * How would you go about computing the parity of a very large number of 64-bit nonnegative integer?
         */


    }

    public void uniqueCharacters(){
        /*
         * Is Unique: Implement an algorithm to determine if a string has all unique characters.
         * What if you cannot use additional data structures?
         */
    }

    public void permutation(){
        /*
         * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
         */
    }

    public void URLify(){
        /*
         * URLify: Write a method to replace all spaces in a string with '%20'.
         * You may assume that the string has sufficient space at the end to hold the additional characters,
         * and that you are given the "true" length of the string.
         * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
         * EXAMPLE
         * Input: "Mr 3ohn Smith 13 Output: "Mr%203ohn%20Smith"
         */
    }

    public void palindromePermutation(){
        /*
         * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin- drome.
         * A palindrome is a word or phrase that is the same forwards and backwards.
         * A permutation is a rearrangement of letters.
         * The palindrome does not need to be limited to just dictionary words.
         *
         * EXAMPLE
         * Input: Tact Coa
         * Output: True (permutations: "taco cat", "atco eta", etc.)
         * Hints: #106,
         *
         * even amount of all chars
         * integer xor
         */
    }

    public void oneAway(){
        /*
         * One Away: There are three types of edits that can be performed on strings:
         * insert a character, remove a character, or replace a character.
         * Given two strings, write a function to check if they are one edit (or zero edits) away.
         *
         * EXAMPLE
         * pale, pie -> true
         * pales, pale -> true
         * pale, bale -> true
         * pale, bake -> false
         */

//		answer: dp?
    }

    public void stringCompression(){
        /*
         * String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
         * For example, the string aabcccccaaa would become a2blc5a3,
         * If the "compressed" string would not become smaller than the original string,
         * your method should return the original string.
         * You can assume the string has only uppercase and lowercase letters (a - z).
         *
         */
    }

    public void rotateMatrix(){
        /*
         *
         * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
         * write a method to rotate the image by 90 degrees. Can you do this in place?
         *
         */
    }

    public void zeroMatrix(){
        /*
         *
         * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
         */
    }

    public void stringRotation(){
        /*
         * String Rotation; Assume you have a method i s S u b s t r i n g which checks
         * if one word is a substring of another.
         * Given two strings, si and s2,
         * write code to check if s2 is a rotation of si using only one call to isSubst ring
         * [e.g., "waterbottle" is a rotation oP'erbottlewat"),
         *
         *
         */
    }


    public void removeDups(){
		/*
		 *
		 * Remove Dups: Write code to remove duplicates from an unsorted linked list. FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
		 */
    }

    public void deleteMiddleNode(){
		/*
		 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
EXAMPLE
SOLUTION
Input: the node c from the linked list a->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a- >b->d->e->f
		 */
    }

    public void partition(){
		/*
		 * Partition; Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal tox. If x is contained within the list, the values of x only need to be after the elements less than x (see below). The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
EXAMPLE
input: 3 -> S -> 8 -> 5 -> 10 -> 2 -> 1[partition=5] Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
		 */

        //manage 2 linked lists one pointing to els < the other >
    }
}
