package com.dakoto.datastructuresandalgorithms.dynamic.programming;

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