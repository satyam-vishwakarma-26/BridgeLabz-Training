package com.BudgetWise;
import java.util.*;
import java.time.LocalDate;
// Test class for BudgetWise system
public class BudgetWiseApp{
    public static void main(String[] args){
        HashMap<String,Double> limits=new HashMap<>();
        limits.put("Food",5000.0);
        limits.put("Travel",3000.0);
        Budget monthly=new MonthlyBudget(20000,15000,limits);
        monthly.addExpense(new Transaction(2000,"EXPENSE",LocalDate.now(),"Food"));
        monthly.addExpense(new Transaction(3500,"EXPENSE",LocalDate.now(),"Travel"));
        monthly.generateReport();
        monthly.detectOverspend();
        Budget annual=new AnnualBudget(240000,180000,limits);
        annual.addExpense(new Transaction(90000,"EXPENSE",LocalDate.now(),"General"));
        annual.generateReport();
        annual.detectOverspend();
    }
}
