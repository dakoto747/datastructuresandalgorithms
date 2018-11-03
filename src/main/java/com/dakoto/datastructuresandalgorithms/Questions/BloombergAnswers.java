package com.dakoto.datastructuresandalgorithms.Questions;

import com.dakoto.datastructuresandalgorithms.datastructures.LinkedLists.SinglyLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BloombergAnswers {


    public static int bestTimeToBuyAndSellStock(int[] stocks) {
        /*

        Say you have an array for which the ith element is the price of a given stock on day i.

        If you were only permitted to complete at most one transaction
        (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

        Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5

        max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

        Example 2: Input: [7, 6, 4, 3, 1] Output: 0

        In this case, no transaction is done, i.e. max profit = 0.
     */



//        brute force:
//        nested loop to store differences in a sorted thing such as TreeMap

//        ArrayList<Integer> prices = new ArrayList<>();

        int profit = 0;
        for(int i = 0; i < stocks.length-1; i++){
            for(int j = i+1; j < stocks.length; j++){
//                prices.add(stocks[j]-stocks[i]);
                profit = Math.max(profit, stocks[j]-stocks[i]);
            }
        }
//        Collections.sort(prices);
//        return Math.max(0, prices.get(prices.size() - 1));
        return profit;

/*        optimized ... .clearly, this is dogshit
        int min = stocks[0] ;
        int maxProfit = 0;

        for(int i = 1; i < stocks.length; i++){
            maxProfit = Math.max(maxProfit, stocks[i] - min);

            min = stocks[i]<min ? stocks[i]:min;
            min = Math.max(min, stocks[i]);
        }
//        return maxProfit;*/
    }


    public static SinglyLinkedList<Integer> addTwoNumbers(SinglyLinkedList<Integer> a, SinglyLinkedList<Integer> b) {
        /*

            You are given two non-empty linked lists representing two non-negative integers.
            The most significant digit comes first and each of their nodes contain a single digit.
            Add the two numbers and return it as a linked list.

            You may assume the two numbers do not contain any leading zero, except the number 0 itself.

            Follow up: What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

            Example:

            Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 8 -> 0 -> 7
         */

        int firstNumber = a.getValue();
        int secondNumber = b.getValue();
        a = a.next();
        b = b.next();
        while(a != null){
            firstNumber = (firstNumber * 10 ) + a.getValue();
            a = a.next();
        }

        while(b != null){
            secondNumber = (secondNumber * 10 ) + b.getValue();
            b = b.next();
        }

        int sum = firstNumber + secondNumber;

        SinglyLinkedList<Integer> ret = new SinglyLinkedList<>(sum % 10);

        sum = sum / 10;
        SinglyLinkedList<Integer> current = new SinglyLinkedList<>();

        while(sum > 0){
            current = new SinglyLinkedList<>(sum % 10);
            current.setNext(ret);
            ret = current;
            sum = sum /10;
        }
        return current;
    }

    public static int[] moveZeros(int []array){
        /*
        Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of
        the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note: You must do this in-place without making a copy of the array. Minimize the total number of operations.
*/

        int zeroCount = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 0)zeroCount++;
            else{
                array[i - zeroCount] = array [i];
                array[i] = 0;
            }
        }

        return array;
    }


    public static void twoSum(int[] array, int target){
        /*

        Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:
        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].

         */

        outer:  for(int i = 0; i < array.length - 1; i++){
            int remainder = target - array[i];

            inner: for(int j = i + 1; j < array.length; j++){
                if(remainder == array[j]){
                    System.out.println("["+i+", "+j+"]");
//                    break inner;
//                    break outer;
                    return;
                }
                System.out.println("continued inner");
            }
            System.out.println("continued outer");
        }

    }


    public static void printAllPermutations(int number){
        /*
            given a number, print all of it's permutations
        */

        String num = String.valueOf(number);

        List<String> permutations = new ArrayList<>();

        /*
        1. store the permutations of all the pairs of digits.
        2. for each digit, if the digit is not in a permutation, prefix it with the permutations ...
         and store the results in a new list and then repeat until the length of the permutation is the same as the digit,
         so the base case is actually  all the numbers in the digits
        //add that digit until it reaches the length?
         */

//        [1,2, 3]
        /*
            12 - 3
            13 - 2
            21 - 3
            23 - 1
            31 - 2
            32 - 1

            231
            321
            213
            123

            complexity: N^N

            optimize: shift every digit until it reaches the end
         */

        for(int i = 0; i < num.length(); i++){
            char shift = num.charAt(i);

            String tempNum = num;
            String tempNum1 = num;
            System.out.println(shift);
            for(int j = i+1; j < num.length(); j++){
                char[] chars = tempNum.toCharArray();
                chars[j-1] = chars[j];
                chars[j] = shift;
                tempNum = new String(chars);
                System.out.println(tempNum);
            }

            for(int k = 0; k < i-1; k++){
                System.out.println("i: "+i);
                char[] chars = tempNum.toCharArray();

                if(i == num.length()-1){
                    chars[i] = chars[k];
                    chars[k] = shift;

                }else if(k != 0){

                    chars[k - 1] = chars[k];
                    chars[k] = shift;
                }
                tempNum = new String(chars);
                System.out.println(tempNum);

            }
        }


    }

    public static int baseCase(int number){

        return ((number%10)*10) + (number/10);
    }


    public static void main(String args[]){
        //1. tests for bes time to buy and sell stocks

        int prices[] = {3, 693,5,61,57,2,67,7,700, 1000};
        int prices2[] = {7, 1, 5, 3, 6, 4};
        int prices3[] = {7, 6, 4, 3, 1};
        System.out.println(bestTimeToBuyAndSellStock(prices));
        System.out.println(bestTimeToBuyAndSellStock(prices2));
        System.out.println(bestTimeToBuyAndSellStock(prices3));


        //2. tests for add two numbers
        System.out.println("add two numbers start");
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>().createFromInteger(7243);
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>().createFromInteger(564);
        addTwoNumbers(list, list1).traverse();
        System.out.println("add two numbers end");


        //3. test for moveZeros
        System.out.println("Move zeros");
        System.out.println(Arrays.toString(moveZeros(new int[]{0, 1, 0, 3, 12})));
        System.out.println("Move zeros");

        //4. test for twoSum
        System.out.println("two sum start");
        twoSum(new int[]{2, 7, 11, 15}, 9 );
//        twoSum(new int[]{0, 1, 0, 3, 12}, 4 );
        System.out.println("two sum end");


        //5. test for print all permutations
        System.out.println("print all perms start");
        printAllPermutations(123);
        System.out.println("print all perms end");

    }


}



