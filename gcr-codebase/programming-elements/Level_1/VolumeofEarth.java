public class  VolumeofEarth{
 public static void main(String [] args){
 
//Radius of Earth
double radius=6378;

// Calculation of Volume of Earth in Cubic Kilometres 
  double Cubic_Kilometer=((4/3)*Math.PI*radius*radius*radius);
//Calculation of Volume of Earth in Cubic Miles
 double Cubic_Miles=Cubic_Kilometer/(1.6*1.6*1.6);

//Printing Volume of Earth 
 System.out.println("The volume of earth in cubic kilometers is: " +Cubic_Kilometer+ ",  and cubic miles is: "+Cubic_Miles);


  }
}