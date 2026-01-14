package com.BudgetWise;
import java.util.*;
// Base budget class
public abstract class Budget implements IAnalyzable{
    protected double income;
    protected double limit;
    protected HashMap<String,Double> categoryLimits;
    protected List<Transaction> transactions=new ArrayList<>();
    protected Budget(double income,double limit,HashMap<String,Double> categoryLimits){
        this.income=income;
        this.limit=limit;
        this.categoryLimits=categoryLimits;
    }
    // Add expense securely
    public void addExpense(Transaction t){
        if(t.getType().equalsIgnoreCase("EXPENSE")){
            transactions.add(t);
        }
    }
    // Calculate total expenses
    protected double totalExpenses(){
        double sum=0;
        for(Transaction t:transactions){
            sum+=t.getAmount();
        }
        return sum;
    }
    // Calculate net savings using operator
    public double calculateSavings(){
        return income-totalExpenses();
    }
}
