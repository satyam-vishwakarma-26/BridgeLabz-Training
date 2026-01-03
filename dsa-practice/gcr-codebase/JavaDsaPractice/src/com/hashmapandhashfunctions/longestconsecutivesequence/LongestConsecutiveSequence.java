package com.hashmapandhashfunctions.longestconsecutivesequence;
import java.util.HashMap;

class LongestConsecutiveSequence {

	//find longest consecutive length
	static int findLongest(int[] arr){
		HashMap<Integer,Boolean> map=new HashMap<>();

		//store elements
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],true);
		}

		int maxLength=0;

		for(int i=0;i<arr.length;i++){
			//start of sequence
			if(!map.containsKey(arr[i]-1)){
				int current=arr[i];
				int length=1;

				//check next elements
				while(map.containsKey(current+1)){
					current++;
					length++;
				}

				//update max
				if(length>maxLength){
					maxLength=length;
				}
			}
		}
		return maxLength;
	}
}
