import java.time.ZonedDateTime;
import java.time.ZoneId;
public class TimeZones{
    public static void main(String[] args){
	
        //current time in GMT
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
		
        //current time in IST
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		
        //current time in PST
        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los Angeles"));
		
		//printing the results 
        System.out.println("Current Time in GMT: "+gmt);
        System.out.println("Current Time in IST: "+ist);
        System.out.println("Current Time in PST: "+pst);
    }
}
