import java.util.Scanner;
public class RockPaperScissors{

    //method to get computer choice
    public static String getComputerChoice(){
        int choice=(int)(Math.random()*3);
        if(choice==0){
            return "rock";
        }else if(choice==1){
            return "paper";
        }else{
            return "scissors";
        }
    }
    
    //method to find winner
    public static String findWinner(String user,String computer){
        if(user.equals(computer)){
            return "Draw";
        }
        if(
            (user.equals("rock")&&computer.equals("scissors"))||
            (user.equals("paper")&&computer.equals("rock"))||
            (user.equals("scissors")&&computer.equals("paper"))
        ){
            return "User";
        }
        return "Computer";
    }
    
    //method to calculate stats and percentage
    public static String[][] calculateStats(int userWins,int computerWins,int totalGames){
        String result[][]=new String[2][3];
        
        double userPercent=(userWins*100.0)/totalGames;
        double computerPercent=(computerWins*100.0)/totalGames;
        
        userPercent=Math.round(userPercent*100.0)/100.0;
        computerPercent=Math.round(computerPercent*100.0)/100.0;
        
        result[0][0]="User";
        result[0][1]=String.valueOf(userWins);
        result[0][2]=String.valueOf(userPercent);
        
        result[1][0]="Computer";
        result[1][1]=String.valueOf(computerWins);
        result[1][2]=String.valueOf(computerPercent);
        
        return result;
    }
    
    //method to display results
    public static void displayResults(String games[][],String stats[][]){
        System.out.println("\nGame\tUser\tComputer\tWinner");
        for(int i=0;i<games.length;i++){
            System.out.println(
                (i+1)+"\t"+
                games[i][0]+"\t"+
                games[i][1]+"\t\t"+
                games[i][2]
            );
        }
        
        System.out.println("\nPlayer\tWins\tWin Percentage");
        for(int i=0;i<stats.length;i++){
            System.out.println(
                stats[i][0]+"\t"+
                stats[i][1]+"\t"+
                stats[i][2]+"%"
            );
        }
    }

    public static void main(String[]args){
        
        //Scanner class and object
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        
        String games[][]=new String[n][3];
        
        int userWins=0;
        int computerWins=0;
        
        for(int i=0;i<n;i++){
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user=sc.next().toLowerCase();
            
            String computer=getComputerChoice();
            String winner=findWinner(user,computer);
            
            games[i][0]=user;
            games[i][1]=computer;
            games[i][2]=winner;
            
            if(winner.equals("User")){
                userWins++;
            }else if(winner.equals("Computer")){
                computerWins++;
            }
        }
        
        String stats[][]=calculateStats(userWins,computerWins,n);
        
        displayResults(games,stats);
    }
}
