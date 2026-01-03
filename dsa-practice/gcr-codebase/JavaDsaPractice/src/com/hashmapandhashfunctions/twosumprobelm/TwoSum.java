package com.hashmapandhashfunctions.twosumprobelm;
import java.util.HashMap;

class TwoSum {

	//find two indices
	static void findTwoSum(int[] arr,int target){
		HashMap<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++){
			int required=target-arr[i];

			//check complement
			if(map.containsKey(required)){
				System.out.println("Indices: "+map.get(required)+" and "+i);
				return;
			}

			//store index
			map.put(arr[i],i);
		}

		System.out.println("No valid pair");
	}
}
