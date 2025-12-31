import java.util.Scanner;
 public class DigitalWatchSimulation{
	 
	public static void main(String [] args){
	
	//Loop for Hour 
	for(int hour=0;hour<=24; hour++){
		
		//Loop for Minits 
		for(int minit=0;minit<=60;minit++){
		   
		   if(hour == 13 && minit==0){
				System.out.println("Power cut !! Watch Stopped");
				break;
				}
			System.out.println("The Current Time is "+hour+" : "+minit);
		}
		if(hour==13){
			break;
			}
	}
}
}	
			
	