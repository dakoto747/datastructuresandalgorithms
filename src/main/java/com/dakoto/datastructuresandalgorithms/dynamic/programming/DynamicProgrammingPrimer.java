package com.dakoto.datastructuresandalgorithms.dynamic.programming;

import com.dakoto.datastructuresandalgorithms.datastructures.Stack;
public class DynamicProgrammingPrimer {

    //also think about backtracking
    //n-choose-k
    public String main_intuition = "Permutations: k in n ways to do things; the guesses usually have to do with the k things";
    public String dpSteps(){
        return "define subproblems"+
                "\n define guesses (all choices and solves part of subproblem)"+
                "\n define recurrence; define DP"+
                "\n memoize or build bottom up"+
                "\n validate with topological sort";
    }

    public String methods(){
        return "suffixes, prefixes, substrings(same as suffixes? changing size)";
    }
    public String uses(){
        return "Strings, sequences, edit distance(dna, spelling/auto-correct, largest subsequence),"
                + "\n usually find the best way to do things situation";
    }

    
    public String otherTips(){
        return "When you hear a problem beginning with the following statements, it's often(though not always) a good candidate for recursion:"+
               "\n Design an algorithm to compute the nth ... "+
               "\n Write code to list the first n ...."+
               "\n Implement a method to compute all ... "+
               "\n Sequences ..."+
               "\n find the minimum number of .... (edits, etc)"+
               "\n find the maximum value for the size: fitting things into.... (knapsack, etc)"+
               "\n find the optimized order .... (Text justification, etc)"+
               "\n ...."+
               "\n you can do a top-down approach"+
               "\n you can do a bottom-up approach"+
               "\n you can do a half and half (think binary-search and mergesort)"+
               "\n "+
               "\n "+
               "\n COMPUTE A NUMBER, OR A POSITION OR AN ORDERING OR OPTIMIZED "+
               "";
    }
}


class TowersOfHanoi{
    /*
        Guess (assuming half of it is solved): 
        given three stacks, which disk to move and where to put it. 
            We need to guess: 
            1. which disk to move and where 

            We need to define the cost: 
            1. reducing the disks on the 1st tower 
            2. reducing the disks on the 2nd tower 
            3. placing the disks on the 3rd tower 
            4. placing a disk on a smaller disk 
            5. keep a disk in place 

            Get the largest disk to the bottom of the 3rd tower 

        Subproblems
            1. the order in which to move the disks 
e

        Guess2: 
            we want to guess where to put the next disk, based on????
            we already know where we can move or what disks that can move. 
            But the question is: let's say we have two moves available, if we make move 1, 
            will it move us towards solving the problem of clearing the ground for the bottom disk? 

            maybe I should ignore the disks 

            given a tower and a subsequence/substring of disks, how do I move those disks to the next towers


            we are finding the sequences of moves 

            recurrence: 
            min(DP(towers, move)+cost()

            cost is the number of moves we make, we want to minimize the number of moves we make 

            the cost is to find the minimal number of moves to move  
    */

    public void dp(Stack<Integer>[] towers){
        Stack<Integer> tower1 = towers[0];
    }
    void superCase(Stack<Integer> tower1, Stack<Integer> tower2, Stack<Integer> tower3){
        
        int towerHeight = tower1.getSize(); 

        while(!tower1.isEmpty()){
            /*
                you want tower 3 to imagine it's tower 1 and use tower 1 and tower 2 

            */ 
            towerHeight = tower1.getSize(); 
            int baseCaseCount = 2;
            for(int i = 0; i < baseCaseCount; i++){
                baseCase(tower1, tower2, tower3);
            }
        }
        superCase(tower2, tower1, tower3);
    }

    void baseCase(Stack<Integer> tower1, Stack<Integer> tower2, Stack<Integer> tower3){
        /*
            two disks. 
            use tower 2 as a buffer.
        */
        
        // buffer
        boolean pushed = canPushDiskToTower(tower1.pop(), tower2);
        if(!pushed){
            // try tower 3
            pushed = canPushDiskToTower(tower1.pop(), tower3);
        } 
        // use the buffer as the first tower 
        baseCase(tower2, tower3, tower1);
        // base 
        // boolean pushedBase = canPushDiskToTower(tower1.pop(), tower3);
        // use the last as the buffer tower 
        baseCase(tower1, tower3, tower2);

        // next 
        // boolean pushedTop = canPushDiskToTower(tower2.pop(), tower3);
        // use the buffer as the first tower 
        baseCase(tower2, tower1, tower3);
    }

    boolean canPushDiskToTower(int disk, Stack<Integer> tower){
        if(tower.peek() > disk){
            tower.push(disk);
            return true; 
        }
        return false;
    }

    class EightQueens{
        /*
        for every position on the board, place a queen there and find the maximum number of positions you can put a queen next 
        and so on for those 
        */

    }
}



class MinimumCoinsForAmountProblem{

    public static int minimumCoinsForAmountProblem(int amount){

        int[] sortedListOfCoins; 

        int amount_left = amount;
        boolean keep_looking = true;
        int coin_count = 0;

        for (int i = sortedListOfCoins.length - 1; i > 0 && keep_looking; i--){
            
            amount_left = amount % sortedListOfCoins[i];
            coin_count = amount / sortedListOfCoins;
            keep_looking = ! coin_count > 0;
        }
        return current_coin_count+minimumCoinsForAmountProblem(amount_left);
    }
}

// test
class LongestCommonSubsequenceProblem{
    public static int longestSubsequence(String string1, String string2){
        if(string1.charAt(0) == string2.charAt(0)){
            return 1 + longestSubsequence(string1.substring(1), string2.substring(1));
        }else {
            return Math.max(
                longestSubsequence(
                    string1.substring(0), 
                    string2.substring(1)
                ),
                longestSubsequence(
                    string1.substring(1), 
                    string2.substring(0)
                ),
            );
        }
    }
}