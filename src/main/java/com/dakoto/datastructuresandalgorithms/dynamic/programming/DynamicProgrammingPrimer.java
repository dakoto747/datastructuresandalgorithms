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
