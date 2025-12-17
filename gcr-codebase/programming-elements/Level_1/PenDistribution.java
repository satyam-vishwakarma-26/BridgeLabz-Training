public class PenDistribution{
 public static void main(String [] args){
 
// Total Pen
 int Pen=14;
//Total Student
 int Student=3;


// Pen per Student
 int Pen_Per_Student=Pen/Student;
//Remaining Pen
 int Remaining_Pen=Pen%Student;

//Printing Pen distribution 
 System.out.println("The Pen Per Student is: " +Pen_Per_Student+ ",  and the remaining pen not distributed is: "+Remaining_Pen);


}
}