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


    public void urlify()
    {

    }


    public static void main(String[] args)
    {

    }
}
