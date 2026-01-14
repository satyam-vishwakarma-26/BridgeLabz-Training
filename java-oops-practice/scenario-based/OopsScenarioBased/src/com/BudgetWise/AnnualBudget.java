package com.BudgetWise;
import java.util.*;
// Annual budget implementation
public class AnnualBudget extends Budget{
    public AnnualBudget(double income,double limit,HashMap<String,Double> categoryLimits){
        super(income,limit,categoryLimits);
    }
    // Annual report format
    public void generateReport(){
        System.out.println("Annual Budget Summary");
        System.out.println("Yearly Income: "+income);
        System.out.println("Yearly Expenses: "+totalExpenses());
        System.out.println("Yearly Savings: "+calculateSavings());
    }
    // Annual overspend detection
    public void detectOverspend(){
        if(totalExpenses()>limit){
            System.out.println("Annual budget limit exceeded");
        }else{
            System.out.println("Annual spending within limit");
        }
    }
}
