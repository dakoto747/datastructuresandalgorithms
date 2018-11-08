package TreesAndGraphs;

import TreesAndGraphs.GraphImplementations.DirectedGraph;
import TreesAndGraphs.GraphNode;

public class Questions {
	/**
	 * COMMUNICATE IDEAS PROPERLY(PART OF A TEAM) YOU’RE IN CHARGE
	 * BE CO-OPERATIVE AND PLEASANT TO WORK WITH. 
	 * THINK OUT LOUD!!!!!
	 * when given large input in a question, come up with little representative example
	 * BUD, DIY, Simplify & Generalize, Base case and build, data structure brainstorm 
	 * ALWAYS START AND THINK OF BASE CASE AND BUILD (BREAK PROBLEM INTO SMALLER PROBLEMS)
	 * YOU CAN IMAGINE HOW IMPORTANT EDGE CASES ARE FOR GOOGLE!!! verse yourself properly in finding them 
	 * 
	 * EDGE CASES: THINK LIKE AN ADVESARY WHO WANTS TO BREAK YOUR CODE 
	 * 
	 * FOCUS ON PROBLEM SOLVING SKILLS 
	 * 
	 * 
	 * 0. Create examples, Always start with base cases, draw, edge cases and test cases, restate question in your words to make sure you understood. MAKE SURE to take ALL QUESTION DETAILS into account.
	 * 1. State BRUTE force; MAKE SURE to take ALL QUESTION DETAILS and USED DATA STRUCTURESinto account. 
	 * 2. State brute force COMPLEXITY 
	 * 3. State BUD 
	 * 4. State Optimization. Try to THINK FRESH and avoid SHOEHORNING previous solutions; you can use previous knowledge though.
	 * 5. State Optimization COMPLEXITY 
	 * 6. (Optional) Optimize optimization if complexity isn't good enough (approaching O(logN)).
	 * 
	 * R7. Check hints.  
	 * R8. Restate Optimization 
	 * R9. Restate Complexity 
	 * 
	 * R10.(Optional) Optimize optimization if complexity isn't good enough (approaching O(logN)). 
	 * 
	 * STUCK? EXPLAIN THOUGHT PROCESS OUT LOUD, ask questions, Re-think/Retrace steps
	 * 1. Go over question details again
	 * 2. Explain thought process out loud, ask questions, Re-think/Retrace steps
	 * 3. Think if you're shoe-horning 
	 * 4. Ask for time to think 
	 * 5. Ask for hints
	 * 
	 * KEYS
	 * # General life, interview and study step/tips
	 * R# Steps/tips only applied when reading "Cracking the Coding Interview" or similar study
	 * 
	 * 
	 *  
	 */
	TEMPLATE: 

		//################################ DRAW, BASE CASE, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	
	public static void main(String args[]){
		
	}
	
	/**
	 * 
	 * @param directed_graph
	 * @param node1
	 * @param node2
	 */
	public void routeBetweenNodes(DirectedGraph directed_graph, GraphNode node1, GraphNode node2){
		/**
		 * Route Between Nodes: 
		 * 
		 * Given a directed graph, 
		 * design an algorithm to find out whether there is route between two nodes
		 */
		
//		1. for each node in node1's children 
//			a) check if you bump into node two
//			b) if you do flag and break
//			c) if you don't, return false

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void minimalTree(int []array){
		/**
		 * Minimal Tree: 
		 * 
		 * Given a sorted(increasing order) array with unique integer elements, 
		 * write an algorithm to create a binary search tree with minimal height 
		 */
//		1. find median index of array, 
//		2. insert remaining elements 

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void listOfDepths(Tree binary_tree){
		/**
		 * List of Depths: 
		 * 
		 * Given a binary tree, 
		 * design an algorithm which creates a linked list of all the nodes at each depth 
		 * (e.g., if you have a tree with depth D, you'll have D linked lists).
		 */
		
		//this is probably a log thing. 

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void pathsWithSum(tree binary_tree){
		/**
		 * 4.12
		 * Paths with sum: 
		 * 
		 * You are given a binary tree in which each node contains an integer value (which might be positive or negative). 
		 * Design an algorithm to count the number of paths that sum to a given value. 
		 * The path does not need to start or end at the root or a leaf, but it must go downwards(traveling only from parent nodes to child nodes).
		 * 
		 * 
		 * Hints: #6, # 14, #52, #68, #77, #87, #94, #103, #108, #115
		 */
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 in order traverse with path_sum variable, 
		 for each node
		     add  node value to path_sum variable and compare it with sumToBeFound
		     pass path_sum variable to children and repeat procedure
		     repeat procedure with node as root node and new path_sum variable initialised to 0, but keep global "found" variable same
		     
		 TIME COMPLEXITY 
		  	Tree traversal complexity: O(N^2) (number of nodes in tree)
		  	
		 BOTTLENECKS 
		 	
		 UNNECESSARY WORK 
		 	repeat procedure with node as root node and new path_sum variable initialised to 0, but keep global "found" variable same
		 DUPLICATE WORK
		 	repeat procedure with node as root node and new path_sum variable initialised to 0, but keep global "found" variable same
		*/
		
		//################################ MY OPTIMIZATION #########################################/
		
		/*
		 1. Binary search heuristics? not useful because of negative numbers and paths can be from any node as long as they're downward
		 2. keep list of parent nodes values in path and then it becomes a sub problem of finding out if any sub-array sums up to given value(); 
		 	starting by adding up from last value in array(current node)
		 	MAKE SURE YOU DON'T REPEAT PATHS 
		 	Complexity: O(NlogN)
		 */
	}
	
	public void randomNode(){
		/**
		 * 4.11
		 * Random Node: 
		 * 
		 * You are implementing a binary tree class from scratch with, in addition to [insert, find and delete], 
		 * has a method getRandomNode() which returns a random node from the tree.
		 * All nodes should be equally likely to be chosen. 
		 * Design and implement an algorithm for [getRandomNode()], and explain how you would implement the rest of the methods.
		 * Hints: #42, #54, #62, #75, #89, #99, #112, #119 
		 */
		 RandomNodeQuestion.getRandomNode();

			//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
			
			//################################ MY BRUTE FORCE ##########################################/
			/*
			 Each node has a uid and tree root variable which stores the hashmap of all nodes; 
			 on insert, uid is created and inserted into hashmap 
			 on delete, uid is deleted from hashmap
			 
			 TIME COMPLEXITY 
		  	 
		 	 BOTTLENECKS 
		 	 
		 	 UNNECESSARY WORK 
		 	 
		 	 DUPLICATE WORK
		 	 
		 	 HINTS: each node must know the size of the nodes on the left and the size of the nodes on the right
		 	 It's easy to keep track of this size information on inserts and deletes. We can just store a s i z e variable in each node.
		 	 Increment s i z e on inserts and decrement it on deletes.
		 	 
			*/
		
			//################################ MY OPTIMIZATION #########################################/
			/*
			 
			 TIME COMPLEXITY 
			
			*/
	}
	
	public void checkSubtree(Tree T1, Tree T2){
		/**
		 * 4.10
		 * Check Subtree: 
		 * 
		 * T1 and T2 are two very large binary trees, with T1 much bigger than T2.
		 * Create an algorithm to determine if T2 is a subtree of T1. 
		 * 
		 * ## A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2. 
		 * ## That is, if you cut of the tree at node n, the two trees would be identical. 
		 * 
		 * Hint: #4 #11 #18 #31 #37 
		 * 
		 * Therefore, two trees are iden- tical if they have the same pre-order traversal.
		 */
		
		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 	i. init a boolean flag
		 	ii. find root of T2 in T1 
		 	iii. compare nodes of both trees as you traverse; i.e modify traversal algorithm to take two nodes as arguments and then return false once one of the nodes don't match.
		 	     Global return is your node boolean comparison value && left result && right result  
		 
		 issue is I don't know an efficient binary find in a tree that isn't balanced 
		 let's optimise that
		 
		 
		 preferrable preorder traversal
		 return the search function itself or false?
		 
		  private Value search(Node x, Key key, int ht) {
        Entry[] children = x.children;

        // external node
        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (eq(key, children[j].key)) return (Value) children[j].val;
            }
        }

        // internal node
        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || less(key, children[j+1].key))
                    return search(children[j].next, key, ht-1);
            }
        }
        return null;
    }
    
		 TIME COMPLEXITY 
		 O(N+M)
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void buildOrder(){
		/**
		 * Build Order: 
		 * 
		 * You are given a list of projects and a list of dependencies (which is a list of pairs of projects where the first project is dependent on the second project). 
		 * All of a project's dependencies must be built before the project is. 
		 * Find a build order that will allow the projects to be built. If there is no valid build order, return an error.
		 * 
		 * EXAMPLE 
		 * Input: 
		 * 	  projects: a, b, c, d, e, f
		 * 	  dependencies: (d, a), (b, f), (d, b), (a, f), (c, d)
		 * Output: f, e, a, b, d, c
		 * 
		 * Hints: #26, #47, #60, #85, #125, #133
		 */

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 find the dependencies for every letter 
		 have a hashmap where the key is the letter  and the value is the number of dependencies 
		 
		 linked list of dependencies?
		 
		 build a directed graph?
		 if there are any cycles in the graph, it means it's not possible 
		 
		 find node that has no dependency 
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void bstSequences(){
		/**
		 * 4.9
		 * BST Sequence: 
		 * 
		 * A binary search tree was created by traversing through an array from left to right and inserting each element.
		 * Given a binary search tree with distinct elements, print all possible arrays that could have led to this tree. 
		 * EXAMPLE
		 * Input: 
		 * 			2
		 * 		  #   #
		 *       1     3
		 *      
		 * Output: {2, 1, 3}, {2, 3, 1} 
		 * Hints: #39, #48, #66, #82
		 */

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		/*
		 * From left to right 
		 * argument binary tree 
		 * 
		 */
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 for each level, create all array combinations
		 return combination, merge each combination with parent node; 
		 switch left and right child values and combine with yours. 
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void firstCommonAncestor(){
		/**
		 * First Common Ancestor: 
		 * 
		 * Design an algorithm and write code to find the first common ancestore of two nodes in a binary tree. 
		 * Avoid storing additional nodes in a data structure. 
		 * NOTe: This is not necessarily a binary search tree. 
		 */

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void checkBalanced(Tree binary_tree){
		/**
		 * Check Balanced: 
		 * 
		 * Implement a function to check if a binary tree is balanced. 
		 * For the purpose of this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any node never differ by more than one
		 */

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void validateBST(Tree binary_tree){
		/**
		 * Validate BST: 
		 * 
		 * implement a function to check if a binary tree is a binary search tree.
		 */

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
	
	public void successor(Tree binary_search_tree){
		/**
		 * Successor: 
		 * 
		 * Write an algorithm to find the "next" node (i.e., in-oder successor) of a  given node in a binary search tree.
		 */
		

		//################################ DRAW, TEST CASES, EDGE CASES AND KEY QUESTION DETAILS #############################/
		
		//################################ MY BRUTE FORCE ##########################################/
		/*
		 
		 TIME COMPLEXITY 
	  	 
	 	 BOTTLENECKS 
	 	 
	 	 UNNECESSARY WORK 
	 	 
	 	 DUPLICATE WORK
	 	 
		*/
	
		//################################ MY OPTIMIZATION #########################################/
		/*
		 TIME COMPLEXITY 
		
		*/
	}
}
