package com.dakoto.datastructuresandalgorithms.Questions;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;
import com.dakoto.datastructuresandalgorithms.datastructures.Stack;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 *  Sources:
 *      1. https://gist.github.com/jayant91089/97587cfdbb8de413e59761859295efed
 */

//BRUTE FORCE
public class BloombergQuestions {

    public static int bestTimeToBuyAndSellStock(int[] stocks){
        /*

        Say you have an array for which the ith element is the price of a given stock on day i.

        If you were only permitted to complete at most one transaction
        (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

        Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5

        max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

        Example 2: Input: [7, 6, 4, 3, 1] Output: 0

        In this case, no transaction is done, i.e. max profit = 0.
     */

        int max = 0;
        for(int i = 0; i < stocks.length-1; i++){

            for(int j = i; j < stocks.length; j++){
                max = Math.max(stocks[j]- stocks[i], max);
            }
        }

        int min = stocks[0] ;
        int maxProfit = 0;

        for(int i = 1; i < stocks.length; i++){
            maxProfit = Math.max(maxProfit, stocks[i] - min);
            min = Math.max(min, stocks[i]);
        }
        return maxProfit;
    }


    public static SinglyLinkedList<Integer> addTwoNumbers(SinglyLinkedList<Integer> a, SinglyLinkedList<Integer> b){
        /*
            hint: use 2 stacks and a carry variable..

            You are given two non-empty linked lists representing two non-negative integers.
            The most significant digit comes first and each of their nodes contain a single digit.
            Add the two numbers and return it as a linked list.

            You may assume the two numbers do not contain any leading zero, except the number 0 itself.

            Follow up: What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

            Example:

            Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 8 -> 0 -> 7
         */

        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        while(a != null){
            stackA.push(a.getValue());
            a = a.next();
        }
        while(b != null){
            stackB.push(b.getValue());
            b = b.next();
        }

        System.out.println("$$");
        stackA.traverse();
        System.out.println("$$");
        stackB.traverse();
        System.out.println("$$");

        int sum = 0;
        SinglyLinkedList<Integer> returnList = null;
        boolean carry = false;
        while(stackA.getSize() != 0 || stackB.getSize() != 0 || carry ){

            if(carry){
                sum+=1;
            }

            if(stackA.getSize() != 0){
                sum += stackA.pop().getValue();
            }
            if(stackB.getSize() != 0){
                sum += stackB.pop().getValue();
            }
            if(sum > 9){
                carry = true;
                sum = sum%10 ;
            }else{
                carry = false;
            }

            if (returnList == null){

                returnList = new SinglyLinkedList<Integer>(sum);
            }else{

                SinglyLinkedList<Integer> buffer = new SinglyLinkedList<>(sum);
                buffer.setNext(returnList);
                returnList = buffer;
            }
            sum = 0;
        }
        return returnList;

    }

    public static SinglyLinkedList<Integer> createSinglyLinkedListFromInteger(int integer){

        int digit = integer % 10;
        integer /= 10;

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(digit);

        while(integer > 9){
            digit = integer % 10;
            SinglyLinkedList<Integer> buffer = new SinglyLinkedList<>(digit);
            buffer.setNext(list);
            list = buffer;
            integer /= 10;
        }
        SinglyLinkedList<Integer> buffer = new SinglyLinkedList<>(integer);
        buffer.setNext(list);

        return buffer;
    }
    public void copyListWithRandomPointer(){
        /*

            A linked list is given such that each node contains an additional random pointer which could
            point to any node in the list or null.

            Return a deep copy of the list.
         */

    }

    public void romanToInteger(){
        /*

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Notes: canonical numbers (numbers described by a single letter): I = 1 V = 5 X = 10 L = 50 C = 100 D = 500 M = 1000

Additive rule: Use left to right descending value canonical numbers to represent number e.g. XVII = 17

Subtractive rule: In case additive rule returns more than 4 same characters in a row, write next larger canonical numeral and prefix numeral sequence to subtract. e.g. IIII = 4 is written as IV (5-1)
         */
    }

    public void busTicket(){
        /*
        Questions
https://discuss.leetcode.com/topic/41061/tickets-needed-to-get-minimum-cost/2

You want to buy public transport tickets for the upcoming month.
You know exactly the days on which you will be travelling.
The month has 30 days and there are three types of ticket:

1-day ticket, costs 2, valid for one day;
7-day ticket, costs 7, valid for seven consecutive days (e.g. if the first valid day is X, then the last valid day is X+6);
30-day ticket, costs 25, valid for all thirty days of the month.
You want to pay as little as possible.

You are given a sorted (in increasing order) array A of dates when you will be travelling. For example, given:

A[0] = 1
A[1] = 2
A[2] = 4
A[3] = 5
A[4] = 7
A[5] = 29
A[6] = 30

You can buy one 7-day ticket and two 1-day tickets. The two 1-day tickets should be used on days 29 and 30.
The 7-day ticket should be used on the first seven days of the month.
The total cost is 11 and there is no possible way of paying less.

Write a function:

class Solution { public int solution(int[] a); }

that, given a zero-indexed array A consisting of N integers that specifies days on which you will be traveling, returns the minimum amount of money that you have to spend on tickets for the month.

For example, given the above data, the function should return 11, as explained above.

Assume that:
-N is an integer within the range [0..30];

-each element of array A is an integer within the range [1..30];

-array A is sorted in increasing order;

-the elements of A are all distinct.
         */
    }

    public static int maximumStock(int[] prices){ /// this can be accomplished with maximum subarray
        /*
        Say you have an array for which the ith element is the price of a given stock on day i.

        Design an algorithm to find the maximum profit. You may complete as many transactions as you like
        (ie, buy one and sell one share of the stock multiple times).
        However, you may not engage in multiple transactions at the same time
        (ie, you must sell the stock before you buy again).


        can I use this for futures?

        Analysis
        Simple Strategy - BUY if it is increasing next day and SELL otherwise
        https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/discuss/134360/Python-3-Simple-Strategy-BUY-if-it-is-increasing-next-day-and-SELL-otherwise
         */

        int profit = 0, x;

//        [3,5,61,57,2,67,1,9, 1000]
//        {3, 693,5,61,57,2,67,7,700, 100};
//        once you find a lower price, fall back; hold the minimum
        int min = prices[0];
        boolean hold = true;

        for(int i = 1; i < prices.length-1; i++){

            if(!hold){
                //you've should have sold yesterday, because no profit would have been made, buy new minimum;
                profit+=prices[i-1] - min;
                min = prices[i];
            }


            if(prices[i] < prices[i+1]){
                //price is increasing tomorrow;

                hold = true;
            }else{

                hold = false;
            }
            if(prices[i-1] < min){
                // is yesterday's price lower than minimum?
                min = prices[i-1];
            }else if(prices[i] < min){
                // is today's price lower than minimum?
                min = prices[i];
            }
        }
        if(hold) profit += prices[prices.length - 1] - min;


        return profit;
    }

    public int[] maxSubArray(int[] original){
        /*
        Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

        For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.

        click to show more practice.

        More practice: If you have figured out the O(n) solution,
        try coding another solution using the divide and conquer approach, which is more subtle.
         */

        return null;

    }


    public int missingNumber(){
        /*

        Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
        find the one that is missing from the array.
        For example, Given nums = [0, 1, 3] return 2.

        Note: Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
         */
        return 0;
    }

    public static void main(String args[]){



        System.out.println("Create singly linkedlist start");
        SinglyLinkedList<Integer> list = createSinglyLinkedListFromInteger(7243);
        SinglyLinkedList<Integer> list1 = createSinglyLinkedListFromInteger(564);
        addTwoNumbers(list, list1).traverse();
        System.out.println("Create singly linkedlist end");

        int profit = 0;

        int prices[] = {3, 693,5,61,57,2,67,7,700, 1000};
//        int prices[]={2,67,7,700};
//        sort it and sum all the differences;
        int b[] = {7, 1, 5, 3, 6, 4};

        int c[] = {7, 6, 4, 3, 1};

        System.out.println("stocks start");
        System.out.println("prices A:"+bestTimeToBuyAndSellStock(prices));
        System.out.println("prices B:"+bestTimeToBuyAndSellStock(b));
        System.out.println("prices C:"+bestTimeToBuyAndSellStock(c));
        System.out.println("stocks end");

        for(int i = 1; i < prices.length; i++){
            profit += Math.max(prices[i]-prices[i-1],0);
        }

        System.out.println(Instant.now().truncatedTo( ChronoUnit.MICROS ).toString());
        System.out.println();
        System.out.println(Instant.now().truncatedTo( ChronoUnit.NANOS).toEpochMilli());
        System.out.println();
        System.out.println(Instant.now().truncatedTo( ChronoUnit.MICROS).toEpochMilli());
        System.out.println(String.valueOf(Instant.now().truncatedTo( ChronoUnit.MICROS).toEpochMilli()).length());
        System.out.println(maximumStock(prices));

        System.out.println(profit);

        System.out.println(maxProfit(prices));

        char[] s = {'a', 'b', 'c', 'a', 'b', 'c', 'b', 'b'};

        for(int i = 1; i < s.length; i++){

            System.out.print(s[0]^s[i-1]); // xor means only true if the it's a valid or mean false if the same
            System.out.println("#"+i);
        }

    }


    public static int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices == null || prices.length == 0) return 0;
        int hold = 0;
        boolean have = false;
        int earn = 0;
        for(int i = 0; i < prices.length - 1; i++){
            int money = prices[i + 1] - prices[i];
            System.out.println("Earn Before: "+earn);
            System.out.println("Profit: "+money);

            if(money > 0){
                if(!have){
                    hold = prices[i];
                    have = true;

                    System.out.println("Hold: "+hold);
                    System.out.println("Earn if: "+earn);

                }
            }
            else if(money < 0){
                if(have){
                    earn += prices[i] - hold;
                    have = false;
                    System.out.println("Earn else: "+earn);

                }
            }
        }


        if(have) earn += prices[prices.length - 1] - hold;

        return earn;

    }
}
