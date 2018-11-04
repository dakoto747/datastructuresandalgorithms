package com.dakoto.datastructuresandalgorithms.datastructures.trees;

import java.util.HashMap;
import java.util.Map;

public class PrefixTree<T extends Character> {
/*
Symbol tables with string keys. Could use standard symbol table implementation. Instead, exploit additional structure of string keys.
Customized searching algorithms for strings (and other keys represented as digits). Goal: as fast as hashing, more flexible
than binary search trees. Can efficiently support additional operations including prefix and wildcard matching,
e.g., IP routing table wants to forward to 128.112.136.12, instead forwards to 128.112 which is longest matching prefix
that it knows about. Side benefit: fast and space-efficient string searching.
 */

// T is usually a character
    private Map<Character, PrefixTree> children;

    private char character;

    private boolean terminates;

    public PrefixTree()
    {
        children = new HashMap<>();

    }

    public PrefixTree(T character)
    {
        this();
        this.character = character;
    }


    public void addWord(String word)
    {
        if(word == null || word.isEmpty()) return;


         char currentChar = word.charAt(0);

         PrefixTree child = children.get(currentChar);

         if(child == null)
         {
             child = new PrefixTree(currentChar);
             children.put(currentChar, child);
         }
         if(word.length() > 1)
         {
             child.addWord(word.substring(1));
         }
         else {
             child.setTerminates(true);
         }
    }
    /*
    https://www.youtube.com/watch?v=zIjfhVPRZCg

    ctci page 651

    any sort of question that has some word validation to it.

    e.g. walk through this scrabble board and find all the words
         or
         given this list of strings, find all the celebrity names

         don't look up each prefix from the root; build up on past calls; like if you want to prompt a user that no word starts with "CALP"
          - keep state within trie
          - return the node back to the caller
            - is 'A' a child of 'C'? is 'L' a child of 'CA'?
     */
    public boolean isCompleteWord(){
        return terminates;
    }

    public boolean isTerminates() {
        return terminates;
    }

    public void setTerminates(boolean terminates) {
        this.terminates = terminates;
    }

    public static void main(String args[])
    {
        //this is in order to illustrate optimized look ups

        
    }
}
