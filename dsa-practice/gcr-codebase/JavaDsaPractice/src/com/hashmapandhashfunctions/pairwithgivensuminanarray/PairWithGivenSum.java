package com.hashmapandhashfunctions.pairwithgivensuminanarray;
import java.util.HashMap;
import java.util.Scanner;

class PairWithGivenSum {

	//check pair exists
	static void checkPair(int[] arr,int target){
		HashMap<Integer,Boolean> map=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			int required=target-arr[i];

			//check required value
			if(map.containsKey(required)){
				System.out.println("Pair found: "+required+" + "+arr[i]+" = "+target);
				return;
			}

			//store current value
			map.put(arr[i],true);
		}

		System.out.println("No pair found");
	}
}
