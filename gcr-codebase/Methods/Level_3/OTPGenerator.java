public class OTPGenerator{

    //method to generate 6 digit OTP
    public static int generateOTP(){
        return (int)(Math.random()*900000)+100000;
    }
    
    //method to check uniqueness
    public static boolean isUnique(int otp[]){
        for(int i=0;i<otp.length;i++){
            for(int j=i+1;j<otp.length;j++){
                if(otp[i]==otp[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[]args){
        
        int otp[]=new int[10];
        
        //generating OTPs
        for(int i=0;i<10;i++){
            otp[i]=generateOTP();
        }
        
        System.out.print("Generated OTPs: ");
        for(int i=0;i<otp.length;i++){
            System.out.print(otp[i]+" ");
        }
        System.out.println();
        
        //checking uniqueness
        if(isUnique(otp)){
            System.out.println("All OTPs are unique");
        }else{
            System.out.println("Duplicate OTPs found");
        }
    }
}


