package com.EduResults;
import java.util.*;

// Manages student lists and merge sort
public class EduResultsManager{
    private ArrayList<Student> students=new ArrayList<>();

    // Add student record
    public void addStudent(String name,int score){
        students.add(new Student(name,score));
        System.out.println("Student added");
    }
    
    // Generate final rank list using merge sort
    public void generateRankList(){
        if(students.size()>1){
            mergeSort(0,students.size()-1);
            System.out.println("Final rank list generated");
        }
    }
    
    // Merge sort divide step
    private void mergeSort(int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(left,mid);
            mergeSort(mid+1,right);
            merge(left,mid,right);
        }
    }
    // Merge step with stability (higher score first)
    private void merge(int left,int mid,int right){
        ArrayList<Student> temp=new ArrayList<>();
        int i=left;
        int j=mid+1;
        while(i<=mid&&j<=right){
            if(students.get(i).score>=students.get(j).score){
                temp.add(students.get(i));
                i++;
            }else{
                temp.add(students.get(j));
                j++;
            }
        }
        while(i<=mid){
            temp.add(students.get(i));
            i++;
        }
        while(j<=right){
            temp.add(students.get(j));
            j++;
        }
        for(int k=0;k<temp.size();k++){
            students.set(left+k,temp.get(k));
        }
    }
    
    // Display rank sheet
    public void displayRanks(){
        if(students.isEmpty()){
            System.out.println("No student data available");
            return;
        }
        int rank=1;
        for(Student s:students){
            System.out.print("Rank "+rank+": ");
            s.display();
            rank++;
        }
    }
}
