public class NullPointerExceptionDemo{
    //method to generate NullPointerException
	
    public static void generateException(){
        String text=null;
        //this will generate NullPointerException
        System.out.println(text.length());
    }    
    //method to handle NullPointerException
    public static void handleException(){
        String text=null;
        try{
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException handled: text is null");
        }
    }
    public static void main(String[]args){
        
        //calling method to generate exception
        try{
            generateException();
        }catch(Exception e){
            System.out.println("Exception occurred while generating NullPointerException");
        }    
        //calling method to handle exception
        handleException();
    }
}
