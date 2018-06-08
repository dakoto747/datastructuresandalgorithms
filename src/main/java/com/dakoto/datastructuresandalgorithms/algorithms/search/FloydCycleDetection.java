package com.dakoto.datastructuresandalgorithms.algorithms.search;

public class FloydCycleDetection implements RunnerTechnique{

//    https://www.quora.com/How-does-Floyds-cycle-finding-algorithm-work-How-does-moving-the-tortoise-to-the-beginning-of-the-linked-list-while-keeping-the-hare-at-the-meeting-place-followed-by-moving-both-one-step-at-a-time-make-them-meet-at-starting-point-of-the-cycle
//    https://gist.github.com/jayant91089/97587cfdbb8de413e59761859295efed#287-find-the-duplicate-number
    // find the duplicate number is xor

/*
The "runner" (or second pointer) technique is used in many linked list problems.
The runner technique means that you iterate through the linked list with two pointers simultaneously,
with one ahead of the other.
The "fast" node might be ahead by a fixed amount, or it might be hopping multiple nodes for each one node that the "slow" node
iterates through.
Forexample,supposeyouhadalinkedlista - >a - >•••->a - >b - >b - >•••->b andyouwantedto 12n12n
rearrangeitintoa - >b - >a - >b - >•.•->a - >b•Youdonotknowthelengthofthelinkedlist(butyou 1122 nn
do know that the length is an even number).
You could have one pointer pl (the fast pointer) move every two elements for everyone move that p2 makes. When p l hits
the end of the linked list, p2 will be at the midpoint. Then, move p l back to the front and begin "weaving"the elements.
On each iteration, p2 selects an element and inserts it after pl.


in linked lists, runner technique is implemented using  next.next or next.next.next
 */
}
