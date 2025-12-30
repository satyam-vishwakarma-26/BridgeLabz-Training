import java.util.Scanner;

public class TemperatureLogger {

    public static void main(String[] args) {

		//Creating the Scanner object 
        Scanner sc = new Scanner(System.in);
        int temperature[]= new int[7];

		//taking user temperature
        for (int i=0; i<7; i++) {
            System.out.print("Enter the temperature of Day " +(i+1)+ " : ");
            temperature[i] = sc.nextInt();
        }

        int sum = 0;
        int maxTemperature = temperature[0];
		
		//Calculating Max temperature and sum of temperature
        for (int i=0; i<7; i++) {
            sum += temperature[i];

            if (maxTemperature<temperature[i]) {
                maxTemperature=temperature[i];
            }
        }

        double average = sum/7.0;

		//Printing the final results
        System.out.println("Average of temperature is: " + average);
        System.out.println("The Max Temperature is: " + maxTemperature);

       // sc.close();
    }
}
