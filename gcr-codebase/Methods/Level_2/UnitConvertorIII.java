import java.util.Scanner;
public class UnitConvertorIII{

    //method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius=(farhenheit-32)*5/9;
        return farhenheit2celsius;
    }
    
    //method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit=(celsius*9/5)+32;
        return celsius2farhenheit;
    }
    
    //method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms=0.453592;
        return pounds*pounds2kilograms;
    }
    
    //method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms){
        double kilograms2pounds=2.20462;
        return kilograms*kilograms2pounds;
    }
    
    //method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters=3.78541;
        return gallons*gallons2liters;
    }
    
    //method to convert liters to gallons
    public static double convertLitersToGallons(double liters){
        double liters2gallons=0.264172;
        return liters*liters2gallons;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user inputs
        System.out.print("Enter temperature in Fahrenheit: ");
        double f=sc.nextDouble();
        System.out.println("Fahrenheit to Celsius: "+convertFarhenheitToCelsius(f));
        
        System.out.print("Enter temperature in Celsius: ");
        double c=sc.nextDouble();
        System.out.println("Celsius to Fahrenheit: "+convertCelsiusToFarhenheit(c));
        
        System.out.print("Enter weight in pounds: ");
        double pounds=sc.nextDouble();
        System.out.println("Pounds to Kilograms: "+convertPoundsToKilograms(pounds));
        
        System.out.print("Enter weight in kilograms: ");
        double kilograms=sc.nextDouble();
        System.out.println("Kilograms to Pounds: "+convertKilogramsToPounds(kilograms));
        
        System.out.print("Enter volume in gallons: ");
        double gallons=sc.nextDouble();
        System.out.println("Gallons to Liters: "+convertGallonsToLiters(gallons));
        
        System.out.print("Enter volume in liters: ");
        double liters=sc.nextDouble();
        System.out.println("Liters to Gallons: "+convertLitersToGallons(liters));
    }
}
