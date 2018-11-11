package com.dakoto.datastructuresandalgorithms;

public class Combinatorics {
    //https://faculty.math.illinois.edu/~hildebr/408/408combinatorial.pdf

    public double factorial(int n)
    {

        double val = 1;

        for(int i = 0; i < n; i++)
        {
            val *= n;
            n--;
        }

        return val;
    }


    public double permutation(int n, int r)
    {
        return factorial(n)/factorial(n-r);
    }

    public double combination(int n, int r)
    {
        return factorial(n)/(factorial(r) * factorial(n-r));
    }

    public int sumOfNumbers0ToN(int n)
    {
        return (n*(n+1))/2;
    }

}
