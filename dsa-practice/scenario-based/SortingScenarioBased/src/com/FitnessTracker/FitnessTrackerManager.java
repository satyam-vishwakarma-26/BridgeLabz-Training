package com.FitnessTracker;
import java.util.*;

// Manages users and bubble sort leaderboard
public class FitnessTrackerManager{
    private ArrayList<UserSteps> users=new ArrayList<>();
    // Add or update user steps
    public void addUser(String name,int steps){
        users.add(new UserSteps(name,steps));
        System.out.println("User steps recorded");
    }

    // Bubble Sort by steps (descending)
    public void sortLeaderboard(){
        int n=users.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(users.get(j).steps<users.get(j+1).steps){
                    UserSteps temp=users.get(j);
                    users.set(j,users.get(j+1));
                    users.set(j+1,temp);
                }
            }
        }
        System.out.println("Leaderboard updated");
    }
    
    // Display leaderboard
    public void displayLeaderboard(){
        if(users.isEmpty()){
            System.out.println("No step data available");
            return;
        }
        int rank=1;
        for(UserSteps u:users){
            System.out.print("Rank "+rank+": ");
            u.display();
            rank++;
        }
    }
}
