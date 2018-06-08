package com.dakoto.datastructuresandalgorithms;

public class Main {

    public static void main(String args[]){

        int a = 0;
        int b = 1;
        int sum = a+b;
        while(sum < 80){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }
    }
}
