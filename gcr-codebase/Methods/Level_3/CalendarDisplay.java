import java.util.Scanner;
public class CalendarDisplay{

    //method to get month name
    public static String getMonthName(int month){
        String months[]={
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
        return months[month-1];
    }
    
    //method to check leap year
    public static boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        }else if(year%100==0){
            return false;
        }else if(year%4==0){
            return true;
        }
        return false;
    }
    
    //method to get number of days in a month
    public static int getDaysInMonth(int month,int year){
        int daysInMonth[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2&&isLeapYear(year)){
            return 29;
        }
        return daysInMonth[month-1];
    }
    
    //method to get first day of the month (0=Sun,1=Mon,...)
    public static int getFirstDay(int month,int year){
        int d=1;
        int y=year;
        int m=month;
        
        if(m<3){
            m=m+12;
            y=y-1;
        }
        
        int k=y%100;
        int j=y/100;
        
        int day=(d+(13*(m+1))/5+k+(k/4)+(j/4)+(5*j))%7;
        
        //convert to Sunday based index
        return (day+6)%7;
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        //Taking user input
        System.out.print("Enter month (1-12): ");
        int month=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        
        String monthName=getMonthName(month);
        int days=getDaysInMonth(month,year);
        int firstDay=getFirstDay(month,year);
        
        //display calendar header
        System.out.println("\n   "+monthName+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        //first loop for indentation
        for(int i=0;i<firstDay;i++){
            System.out.print("    ");
        }
        
        //second loop to print days
        for(int day=1;day<=days;day++){
            System.out.printf("%3d ",day);
            if((day+firstDay)%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
