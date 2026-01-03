package com.stacksandqueues.circulartourproblem;
import java.util.Scanner;

public class CircularTourApp {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter number of petrol pumps: ");
		int n=sc.nextInt();

		PetrolPump[] pumps=new PetrolPump[n];

		for(int i=0;i<n;i++){
			System.out.print("Enter petrol and distance for pump "+i+": ");
			int petrol=sc.nextInt();
			int distance=sc.nextInt();
			pumps[i]=new PetrolPump(petrol,distance);
		}

		int start=CircularTour.findStart(pumps);

		if(start==-1)
			System.out.println("No possible tour");
		else
			System.out.println("Start at pump index: "+start);

		sc.close();
	}
}
