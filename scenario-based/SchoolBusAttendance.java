import java.util.Scanner;

public class SchoolBusAttendance {
    public static void main(String[]args) {

        // Taking user inputs
        Scanner sc = new Scanner(System.in);

        String Students[]= {
            "Satyam", "Naman", "Rishabh", "Saud", "Supriya",
            "Jack", "Rohan", "Shiva", "Raghu", "Sudha"
        };

        char attendance[] = new char[10];
        int totalPresent=0;
        int totalAbsent=0;

        int i=0;
		//Loop for storing the status of the students 
        for (String s : Students) {
            System.out.println(s + ": is present or absent (P/A)");
            attendance[i] =sc.next().charAt(0); 
            i++;
        }
		//computing the totals
        for (char status : attendance) {
            if (status=='P') { 
                totalPresent++;
            } else {
                totalAbsent++;
            }
        }
		//Printing the results 
        for (int j=0; j<10; j++) {
            System.out.println(Students[j] + " is " + attendance[j]);
        }

        System.out.println("Total Student Present: " + totalPresent);
        System.out.println("Total Student Absent: " + totalAbsent);

    }
}
