package com.stacksandqueues.circulartourproblem;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class CircularTour {

	//find starting point
	static int findStart(PetrolPump[] pumps) {
		Queue<Integer> queue=new LinkedList<>();
		int surplus=0;
		int start=0;

		for(int i=0;i<pumps.length;i++){
			surplus+=pumps[i].petrol-pumps[i].distance;
			queue.offer(i);

			//remove pumps till surplus positive
			while(surplus<0&&!queue.isEmpty()){
				start=queue.poll()+1;
				surplus=0;
			}
		}

		return surplus>=0?start:-1;
	}
}