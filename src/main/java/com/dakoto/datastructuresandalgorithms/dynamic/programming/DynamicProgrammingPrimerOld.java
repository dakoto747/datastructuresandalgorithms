package com.dakoto.datastructuresandalgorithms.dynamic.programming;

public class DynamicProgrammingPrimerOld {

    //also think about backtracking
    //n-choose-k
    /**
    YOU MUST REWATCH ALL THE VIDEOS!!!!

    https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-19-dynamic-programming-i-fibonacci-shortest-paths/ 

    https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-20-dynamic-programming-ii-text-justification-blackjack/ 

    https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-21-dp-iii-parenthesization-edit-distance-knapsack/ 

    https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-22-dp-iv-guitar-fingering-tetris-super-mario-bros/
    
     */


    public String main_intuition = "Permutations: k in n ways to do things; the guesses usually have to do with the k things";
    public String dpSteps(){
        return "define subproblems"+
                "\n define guesses (all choices and solves part of subproblem)"+
                "\n define recurrence; define DP"+
                "\n memoize or build bottom up"+
                "\n Remember, we guess EVERYTHING!"+
                "\n parent pointers: remember which guess was best"+
                "\n validate with topological sort: for bottom-up approaches only!";
    }

    public String general5Steps(){
        return  "\n Step 1. define subproblems"+
                "\n Step 2. define guesses (all choices and solves part of solution)"+
                "\n Step 3. define recurrence; define the Dynamic Program"+
                "\n Step 4. Recurse or memoize| check that the recurrence is acyclic, validate with topo-sort if you're doing bottom up "+
                "\n Step 5. Solve the original problem!"+
                "\n ...."+
                "\n Complexity = time per sub-problem * number of subproblems"+
                "\n ...."+
                "\n validate with topological sort: for bottom-up approaches only!"+
                "\n ...."+
                "\n Step 1 is one of the hardest parts of DP ... with some practise, Step 2 is pretty easy ... Step 1 is usually where most of the insight comes in. "+
                "\n ...."+
                "\n Note that he often starts with Step 2 first"+
                "\n ...."+
                "";

    }

    public String generalTipsForStep1StringsOrSequences(){
        return "\n Tips for Step 1: how to choose subproblems for STRINGS or SEQUENCES"+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "";
    }



    public String generalTipsForStep1(){
        return "\n Tips for Step 1: how to choose subproblems"+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "\n ...."+
               "";
    }

    public String moreIntuition(){

        return "Intuition of of recursion is remembering that there is a call STACK. and that function calls are references on that stack"+
               "\n Recursion: I want to do this thing again and get the output and add it to this."+ 
               "\n because I've calculated(this calculations is sometimes the guessing in DP) the 1/nth answer here, I need the 1/n-1th answer to complete this answer(nth answer)"+

               "\n or, assuming n-1th part of my problem is solved, how do we solve 'n'?"+

               "\n Sometimes we want to work from back to front of 'N' or front to back: Assume part of it is solved, how to we solve the next bit? this gives insight on the kind of input and recurrence we want to make "+

               "\n Solving the next bit usually involves the bit of 'doing ALL possible guesses'"+

               "\n Guessing works because we memoize it"+

               "\n Visualize a Directe Acyclic Graph(DAG) of the solution. Nodes are decisions and paths/edges usually have weightings of the reward for the decision and we want to figure the shortest path. ";
    }

    public String methods(){
        return "suffixes, prefixes, substrings(same as suffixes? changing size)";
    }
    public String uses(){
        return "Strings, sequences, edit distance(dna, spelling/auto-correct, largest subsequence),"
                + "\n usually find the best way to do things situation";
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


class TextJustification{

}


class TowerOfHanoi{

    /*
    HAVE FUN WITH IT. 

        The towers are represented using stacks. 


        what are we guessing? 
         - 
        what is recurrence? 
         - recursion - 1/nth part of problem + 1/n-1th part of problem 
         given the next disk and the stack, where to place it. 
         given disk i and it's current stack, figure out where to put it next. 
         given the top and length of each stack, find out the best movement: i.e. what stat
         guess every move and calculate the minimum move. 


~~~~~> some people think through code; it's okay to mention that. 

         guess 
         - assuming we want to figure t
         s

    */

    
    int cost(int disk, Stack stack){
        
        if(stack.peek() >= disk){
            return 0;
        }else{
            return Integer.MAXIMUM_VALUE;
        }
    }

    public Stack[] nextMove(Stack[] stacks){
        
        Stack stack1 = stacks[0];
        Stack stack2 = stacks[1];
        Stack stack3 = stacks[2];

        int cost = cost(stack1.pop(), stack2); 
        nextMove = next
    }
}

class KnapsackProblem {

    /*
    Recursion: I want to do this thing again and get the output and add it to this. 

    because I've calculated(this calculations is sometimes the guessing in DP) the 1/nth answer here, I need the 1/n-1th answer to complete this answer(nth answer)

    or, assuming n-1th part of my problem is solved, how do we solve "n"?

    Sometimes we want to work from back to front of "N" or front to back: Assume part of it is solved, how to we solve the next bit? this gives insight on the kind of input and recurrence we want to make 

    Solving the next bit usually involves the biti of "doing ALL possible guess"

    Visualize a Directe Acyclic Graph(DAG) of the solution. Nodes are decisions and paths/edges usually have weightings of the reward for the decision and we want to figure the shortest path. 

    */ 
}


class LongestWords{

    /*
    Given a list of words, write a program to find the longest word made of other words in the list.
    
    "para", "sit", "parasit", "parasitic", "ic"

    put the words in a hashmap with words as the key and frequency as the value
    
    */

    baseCase(String[] words){
        String[] sorted; 

        for(int i = 0; i < words.length; i++){

        }
    }
    

}


class StringLengthComparator implements Comparable<String>{
    String string = "";
    public StringLengthComparator(String string){
        this.string = string; 
    }

    public int compareTo(String otherString){ 
        
        return this.string.length() - otherString.length(); 
    } 
}