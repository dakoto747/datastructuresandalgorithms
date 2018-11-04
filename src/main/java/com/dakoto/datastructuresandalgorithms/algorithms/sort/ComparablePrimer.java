package com.dakoto.datastructuresandalgorithms.algorithms.sort;

public class ComparablePrimer implements Comparable<Object>{
/*

https://examples.javacodegeeks.com/java-basics/java-comparable-example/

Java provides the Comparable interface, which contains only one method, called compareTo.
This method compares two objects, in order to impose an order between them.

Specifically, it returns a negative integer, zero, or a positive integer
to indicate that the input object
                                is less than, equal or greater than the existing object.
 */
    @Override
    public int compareTo(Object foreigner) {
/**
 *
 *  in short it asks : is the foreigner greater than me ?
 *
 * if incoming object: foreigner is less than this class's instance, return -1
 * if incoming object: foreigner is equal to this class's instance, return 0
 * if incoming object: foreigner is greater than this class's instance, return 1
 *
 * for example if this is an integer 5 and incoming obfect foreinger is 2, the out put of 5.compareTo(2) = -1
 * for example if this is an integer 5 and incoming obfect foreinger is 5, the out put of 5.compareTo(5) = 0
 * for example if this is an integer 5 and incoming obfect foreinger is 7, the out put of 5.compareTo(7) = 1
 *
 * therefore output -1 means foreign object is less than
 *           output 0 means foreign object is equal
 *           output 1 means foreign object is greater than
 * compareTo basically asks the question, is foreigner greater than or equal to local? if yes, return a positive value
 */
        return 0;
    }
}
