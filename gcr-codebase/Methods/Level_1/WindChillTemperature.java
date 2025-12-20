import java.util.Scanner;
public class WindChillTemperature{

		//method to calculate wind chill temperature
    public static double calculateWindChill(double temp,double windSpeed){
	
        return 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(windSpeed,0.16);
    }
	
    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs for calculate
        System.out.print("Enter temperature: ");
        double temperature=sc.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed=sc.nextDouble();
        
        //method call
        double windChill=calculateWindChill(temperature,windSpeed);
        
        //display result about good temperature to chill
        System.out.println("Wind Chill Temperature: "+windChill);
    }
}
