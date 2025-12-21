public class SpringSeason{

    public static void main(String[]args){
        
        int month=Integer.parseInt(args[0]);
        int day=Integer.parseInt(args[1]);
        
        //method calling 
        boolean isSpring=checkSpringSeason(month,day);
        
        //display results
        if(isSpring){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
    
    //method to check spring season with all the conditions
    public static boolean checkSpringSeason(int month,int day){
        if((month==3&&day>=20)||(month==4)||(month==5)||(month==6&&day<=20)){
            return true;
        }else{
            return false;
        }
    }
}
