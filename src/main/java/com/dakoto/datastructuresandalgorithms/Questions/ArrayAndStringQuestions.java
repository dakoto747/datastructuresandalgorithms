package com.dakoto.datastructuresandalgorithms.Questions;

import java.util.HashMap;
import java.util.Map;

public class ArrayAndStringQuestions
{

    public void isUnique(String s)
    {
        /*
        implement an algorithm to determine if a string has all unique characters.
        What would you do if you cannot use additional datastructures?

        the xor method is only useful for palindrome? cuz 1 3 2 1 : will fail... 1 3 1 may succeed ?
         */

    }



    public boolean checkPermutations(String s1, String s2)
    {
        /*
        given two strings, write a method to decide if one is a permutation of the other.

        My solution:

        use a hashmap, store the character counts, if the character count at any point deletes to -1 return false

        complexity is O(2*s1.length)  best case

        in the case that all indexes in the hash map map to the same linked list
        O(2*s1.length ^ 2)

        */

        String falseString = "the strings aren't permutations of each other";

        if(s1.length() != s2.length())
        {
            System.out.println(falseString);
            return false;
        }
        else
        {
            Map<Character, Integer> charsInStringOne = new HashMap<>();

            for(char c : s1.toCharArray())
            {
                if(charsInStringOne.containsKey(c))
                {
                    charsInStringOne.replace(c, charsInStringOne.get(c) + 1);
                }
                else
                {
                    charsInStringOne.put(c, 1);
                }
            }

            for(char c : s2.toCharArray())
            {
                if(!charsInStringOne.containsKey(c) || charsInStringOne.get(c) < 1)
                {
                    System.out.println(falseString);
                    return false;
                }
                else
                {
                    charsInStringOne.replace(c, charsInStringOne.get(c) - 1);
                }
            }
        }

        System.out.println("The Strings are permutations of each other");

        return true;
    }


    public void urlify(String s)
    {
        /*
        write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
        at the end to hold the additional characters, and that you are given the "true" length of the string.

        if implementing in java, please use a character array so that you can perform this operation inplace

        input: mr john              smith
        output mr%20john%20smith

        the keyword here is that you are given the true length of the string; pay attention

         */

    }

    public void palindromePermutation(String s)
    {
        /*
        Given a string, write a function to check if it is a permutation of
        a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
        permutation is a rearrangement of letters. The palindrome does not need to be limited to just
        dictionary words.
        EXAMPLE
        Input: Tact Coa
        Output: True (permutations:"taco cat'; "atco cta '; etc.)
         */
    }

    public void oneAway()
    {
        /*
        One Away: There are three types of edits that can be performed on strings: insert a character,
        remove a character, or replace a character. Given two strings, write a function to check if they are
        one edit (or zero edits) away
         */


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
		 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
		 * FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?
		 */
    }

    public void deleteMiddleNode(){
		/*
		 * Delete Middle Node: Implement an algorithm to delete a node in the middle
		 * (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list,
		 * given only access to that node.
		 *
		 * EXAMPLE
		 * SOLUTION
		 * Input: the node c from the linked list a->b->c->d->e->f
		 * Result: nothing is returned, but the new linked list looks like a- >b->d->e->f
		 *
		 */
    }

    public void partition(){
		/*
		 * Partition; Write code to partition a linked list around a value x,
		 * such that all nodes less than x come before all nodes greater than or equal to x.
		 * If x is contained within the list, the values of x only need to be after the elements less than x (see below).
		 * The partition element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.
		 * EXAMPLE:
		 * input: 3 -> S -> 8 -> 5 -> 10 -> 2 -> 1[partition=5] Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
		 *
		 */

        //manage 2 linked lists one pointing to els < the other >
    }

    public void hashTable()
    {
        /*
         * Hash Table: Design and implement a hash table which uses chaining (linked lists) to handle collisions.
         *
         */
    }

    public void magicIndex()
    {
        /*
         * Magic Index: A magic index in an array A [e ... n -1] is defined to be an index such that
         * A[ i] = i.
         * Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
         *
         * FOLLOW UP: What if the values are not distinct?
         *
         */
    }

    public void sortedMatrix()
    {
        /*
         * 10.9.
         * Sorted Matrix Search: Given an M x N matrix in which each row and each column is sorted in ascending order,
         * write a method to find an element.
         *
         */
    }

    public void englishInt()
    {
        /*
         * 16.8
         * English Int: Given any integer, print an English phrase that describes the integer (e.g., "One Thousand, Two Hundred Thirty Four").
         *
         */
    }

    public void contigiousSequence()
    {
        /*
         * 16.17.
         * Contiguous Sequence: You are given an array of integers (both positive and negative). Find the contiguous
         * sequence with the largest sum. Return the sum.
         *
         * EXAMPLE
         * Input 2 ,-8, 3, -2, 4, -10
         * Output 5 (i.e., {3, -2, 4})
         *
         */
    }

    public void langtonsAnt()
    {
        /*
         * 16.22.
         * Langton's Ant: An ant is sitting on an infinite grid of white and black squares. It initially faces right.
         * At each step, it does the following:
         * (1) At a white square, flip the color of the square, turn 90 degrees right (clockwise), and move forward one unit.
         * (2) At a black square, flip the color of the square, turn 90 degrees left (counter-clockwise). and move forward one unit.
         *
         *
         * Write a program to simulate the first K moves that the ant makes and print the final board as a grid.
         * Note that you are not provided with the data structure to represent the grid. This is something you
         * must design yourself. The only input to your method is K. You should print the final grid and return
         * nothing. The method signature might be something like void printKMoves (int K).
         *
         */
    }

    public void missingNumber()
    {
        /*
         * 17.4.
         * An array A contains all the integers from 0 to n, except for one number which is missing.
         * In this problem, we cannot access an entire integer in A with a single operation. The elements of A are
         * represented in binary, and the only operation we can use to access them is "fetch the jth bit of A [ i] ,"
         * which takes constant time. Write code to find the missing integer. Can you do it inO(n) time?
         */
    }

    public void babyNames()
    {
        /*
         * 17.7.
         * Consider a simple data structure called BiNode, which has pointers to two other nodes.
         *
         *  public class BiNode {
         *     public BiNode nodel, node2;
         *     public int data;
         *  }
         *
         *  The data structure BiNode could be used to represent both a binary tree (where nodel is the left node and
         *  node2 is the right node) or a doubly linked list (where nodel is the previous node and node2 is the next node).
         *  Implement a method to convert a binary search tree (implemented with BiNode) into a doubly linked list.
         *  The values should be kept in order and the operation should be performed in place (that is, on the original data structure).
         *
         */
    }

    public void reSpace()
    {
        /*
         * 17.13.
         * Oh, no! You have accidentally removed all spaces, punctuation, and capitalization in a lengthy document.
         * A sentence Iike"I reset the computer. It still didn't boot!" became"iresetthecomputeri tstilldidntboot':
         * You'll deal with the punctuation and capitalization later; right now you need to re-insert the spaces.
         * Most of the words are in a dictionary but a few are not. Given a dictionary (a list of strings) and the
         * document (a string)' design an algorithm to unconcatenate the document in a way that minimizes the number of unrecognized characters.
         *
         * EXAMPLE:
         *   Input
         *     jesslookedjustliketimherbrother
         *     Output: (jess) looked just like (tim) her brother (7 unrecognized characters)
         */
    }

    public void wordTransformer()
    {
        /*
         * 17.22.
         * Given two words of equal length that are in a dictionary, write a method to transform one word into another
         * word by changing only one letter at a time. The new word you get in each step must be in the dictionary.
         *
         * EXAMPLE
         *   Input: DAMP, LIKE
         *   Output: DAMP -> LAMP -> LIMP -> LIME -> LIKE
         */
    }

    public void sparseSimilarity()
    {
        /*
         * 17.26.
         * The similarity of two documents (each with distinct words) is defined to be the size of the intersection divided by
         * the size of the union. For example, if the documents consist of integers, the similarity of {1, 5, 3} and {1, 7, 2, 3} is e. 4,
         * because the intersection has size 2 and the union has size 5.
         * We have a long list of documents (with distinct values and each with an associated ID) where the similarity is believed to be "sparse:'
         * That is, any two arbitrarily selected documents are very likely to have similarity O. Design an algorithm that
         * returns a list of pairs of document IDs and the associated similarity.
         * Print only the pairs with similarity greater than O. Empty documents should not be printed at all.
         * For simplicity, you may assume each document is represented as an array of distinct integers.
         *
         * EXAMPLE
         *   Input:
         *     13: {14, 15, 100, 9, 3}
         *     16: {32, 1, 9, 3, 5}
         *     19: {15, 29, 2, 6, 8, 7}
         *     24: {7, 10}
         *
         *   Output:
         *    ID1, ID2   SIMILARITY
         *     13, 19  :   0.1
         *     13, 16  :   0.25
         *     19, 24  :   0.14285714285714285
         *
         */
    }

    public static void main(String[] args)
    {

    }
}
