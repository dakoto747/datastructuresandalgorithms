package com.dakoto.datastructuresandalgorithms;

public class MathCombinatoricsAndProbability {
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
        if(n % 2 == 0)
        {
            return n*((n+1)/2);
        }
        else
        {
            return (n*(n+1))/2;
        }
    }

    public int sumOfPowersOf2(int n)
    {
        return (2^(n-1)) - 1;
    }

    /* **********************    primes     ************************ /
     *
     * every positive integer can be decomposed into a product of primes. Note that many of these primes have an exponent of zero.
     *
     * Checking for Primality
     *    This question is so common that we feel the need to specifically cover it. The naive way is to simply iterate
     *    from 2 through n -1, checking for divisibility on each iteration. A small but important improvement is to
     *    iterate only up through the square root of n.
     *
     * Generating a list of Primes
     *    The Sieve of Eratosthenes is a highly efficient way to generate a list of primes. It works by recognizing that
     *    all non-prime numbers are divisible by a prime number. We start with a list of all the numbers up through some
     *    value max. First, we cross off all numbers divisible by 2. Then, we look for the next prime (the next non-crossed off number)
     *    and cross off all numbers divisible by it. By crossing off all numbers divisible by 2, 3, 5, 7, 11, and so on,
     *    we wind up with a list of prime numbers from 2 through max.
     *
     */




    /* **********************    probability     ************************ /
     *     ___________________________
     *    |         |       |         |
     *    |    A    | A ∩ B |    B    |
     *    |_________|_______|_________|
     *
     *
     *   Let's look at a Venn diagram to visualize two events A and B. The areas of the two circles represent their
     *   relative probability, and the overlapping area is the event {A and B}.
     *
     *
     * Probability of A and B
     *   Imagine you were throwing a dart at this Venn diagram. What is the probability that you would land in the
     *   intersection between A and B? If you knew the odds of landing in A, and you also knew the percent of A
     *   that's also in B (that is, the odds of being in B given that you were in A), then you could express the probability as:
     *
     *                      p(A and B)= p(B given A) p(A)
     *
     *   For example, imagine we were picking a number between 1 and 10 (inclusive). What's the probability of picking an
     *   even number and a number between 1 and 57 The odds of picking a number between 1 and 5 is 50%, and the odds of
     *   a number between 1 and 5 being even is 40%. So, the odds of doing both are:
     *
     *                      p(x is even and x <= 5)
     *                      = P(x is even given x <= 5) P(x <= 5)
     *                      = (2/5) * (1/2)
     *                      = 1/5
     *
     *   Observe that since     P(A and B) = P(B given A) P(A) = P(A given B) P(B)    you can express the probability of
     *   A given B in terms of the reverse :
     *
     *                     P(A given B) = (P(B given A) P(A) ) / P(B)
     *
     *   the above equation is Bayes Theorem
     *
     *
     * Probability of A or B
     *   Now, imagine you wanted to know what the probability of landing in A or B is. If you knew the odds of landing
     *   in each individually, and you also knew the odds of landing in their intersection, then you could
     *   express the probability as:
     *
     *                     P(A or B)= P(A) + P(B) - P(A and B)
     *
     *   Logically, this makes sense. If we simply added their sizes, we would have double-counted their intersection.
     *   We need to subtract this out. We can again visualize this through a Venn diagram:
     *
     *
     *     ___________________________
     *    |         |       |         |
     *    |    A    | A ∩ B |    B    |
     *    |_________|_______|_________|
     *
     *
     *   For example, imagine we were picking a number between 1 and 10 (inclusive). What's the probability of picking
     *   an even number or a number between 1 and 5? We have a 50% probability of picking an even number and a 50%
     *   probability of picking a number between 1 and 5. The odds of doing both are 20%. So the odds are:
     *
     *                     P(x is even or x <=5)
     *                     = P(x is even) + P(x <= 5) - P(x is even and x <= 5)
     *                     = 1/2 + 1/2 - 1/5
     *                     = 4/5
     *
     *   From here, getting the special case rules for independent events and for mutually exclusive events is easy.
     *
     * Independence
     *   If A and B are independent (that is, one happening tells you nothing about the other happening), then
     *   P (A and B) = P(A) P(B).This rule simply comes from recognizing that P(B given A) = P(B), since A
     *   indicates nothing about B.
     *
     * Mutual Exclusivity
     *   If A and B are mutually exclusive (that is, if one happens, then the other cannot happen),
     *   then P (A or B) = P(A) + P(B) . This is because P(A and B) = 0, so this term is removed from the earlier
     *   P(A or B) equation. Many people, strangely, mix up the concepts of independence and mutual exclusivity.
     *   They are entirely different. In fact, two events cannot be both independent and mutually exclusive
     *   (provided both have probabilities greater than 0). Why? Because mutual exclusivity means that if one happens
     *   then the other cannot. Independence, however, says that one event happening means absolutely nothing about the
     *   other event. Thus, as long as two events have non-zero probabilities, they will never be both mutually exclusive and independent.
     *
     *   If one or both events have a probability of zero (that is, it is impossible). then the events are both
     *   independent and mutually exclusive. This is provable through a simple application of the definitions
     *   (that is, the formulas) of independence and mutual exclusivity.
     *
     *
     */

}
