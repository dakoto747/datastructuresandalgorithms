package com.dakoto.datastructuresandalgorithms.algorithms.sort;

import java.util.List;
import java.util.Map;

//import GenericAlgorithms.Algorithm;


 public class MergeSort // implements Algorithm
 {

	 
		
//	@Override
	public String keywords() {
		return "MERGE TWO (SORTED) FINGER(S) COMPARE FIRST ELEMENTS AND POP(CHOP TIP OF FINGERS[VISUAL]) INTO LARGE"+
			   "main merge algorithm: 2 finger algorithm"+
			   "arguments: two sorted arrays"+
			   "compare first element in both arrays and pop minimum element into larger array from Array containing minimum element"+
			   "implemntation: SORT -> MERGESORT(A, start, end) -> MERGESORT; MERGESORT; MERGE(A, start, middle, end) / two finger";
	}
	
	public void sort(int array[]){
		mergeSort(array, 0, array.length);
	}
	
	public void mergeSort(int array[], int start, int end){
		
		if(start < end){
			int middle = (start+end)/2;
			mergeSort(array, start, middle);
			mergeSort(array, middle+1, end);
			optimalMerge(array, start, middle, end);
		}
	}
	
	
	
	public void merge(int[] sorted_array1, int[] sorted_array2) {
		//not optimal, this is for intuition purposes only; refer to optimalMerge for proper impl.
		
		int  return_arr[] = new int[sorted_array1.length + sorted_array2.length];
		
		
		int pointer1 = 0, pointer2 = 0; 
		
		
		for(int i = 0; i < return_arr.length; i ++){
		 if(sorted_array1[pointer1] < sorted_array2[pointer2]){
				return_arr[i] = sorted_array1[pointer1]; 
				pointer1++;
			}else{
				return_arr[i] = sorted_array2[pointer2]; 
				pointer2++;
			}
		}
	}
	
	
	public void optimalMerge(int[] array, int start, int middle, int end){
		int[] sorted_array1 = new int[middle - start]; //Arrays.copyOfRange(array, start, middle);
		int[] sorted_array2 = new int[end = middle];
		int x = 0, y = 0;
		
		for(int i = start; i < middle; i++){
			sorted_array1[x] = array[i];
			x++;
		}
		
		for(int i = middle+1; i < end; i++){
			sorted_array2[y] = array[i];
			y++;
		}
		
		int pointer1 = 0, pointer2 = 0; 
		
		for(int i = start; i < end; i ++){
		 if(sorted_array1[pointer1] < sorted_array2[pointer2]){
				array[i] = sorted_array1[pointer1]; 
				pointer1++;
			}else{
				array[i] = sorted_array2[pointer2]; 
				pointer2++;
			}
		}
	}
	
//	@Override
//	public modelOfComputation getModelOfComparison() {
//		return Algorithm.modelOfComputation.comparison_model;
//	}
//	@Override
//	public String intuition() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String associatedDataStructure() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public domain getDomain() {
//		return Algorithm.domain.divide_and_conquer;
//	}
//
//	@Override
//	public String proofOfCorrectness() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<String> exampleApplications() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Map<String, String> usefulDataStructuresForImpl() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getComplexity() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getReasonForComplexity() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<String> getOptimizations() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<String> getAlternatives() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
