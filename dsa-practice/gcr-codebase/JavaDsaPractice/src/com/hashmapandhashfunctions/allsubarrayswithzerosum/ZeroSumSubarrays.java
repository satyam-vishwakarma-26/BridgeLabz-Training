package com.hashmapandhashfunctions.allsubarrayswithzerosum;
import java.util.HashMap;
import java.util.ArrayList;

class ZeroSumSubarrays {

	//find zero sum subarrays
	static void findSubarrays(int[] arr){
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
		int sum=0;

		//initialize for sum zero
		map.put(0,new ArrayList<>());
		map.get(0).add(-1);

		for(int i=0;i<arr.length;i++){
			sum+=arr[i];

			//check repeated sum
			if(map.containsKey(sum)){
				for(int index:map.get(sum)){
					System.out.println("Subarray: "+(index+1)+" to "+i);
				}
			}

			//store index
			map.putIfAbsent(sum,new ArrayList<>());
			map.get(sum).add(i);
		}
	}
}
