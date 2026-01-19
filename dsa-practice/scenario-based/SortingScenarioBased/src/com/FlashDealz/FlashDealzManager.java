package com.FlashDealz;
import java.util.*;

// Manages products and quick sort logic
public class FlashDealzManager{
    private ArrayList<Product> products=new ArrayList<>();

    // Add product to flash sale
    public void addProduct(String name,double discount){
        products.add(new Product(name,discount));
        System.out.println("Product added");
    }
    
    // Sort products by discount using quick sort
    public void sortByDiscount(){
        if(products.size()>1){
            quickSort(0,products.size()-1);
            System.out.println("Products sorted by discount");
        }
    }
    
    // Quick sort recursive method
    private void quickSort(int low,int high){
        if(low<high){
            int pivotIndex=partition(low,high);
            quickSort(low,pivotIndex-1);
            quickSort(pivotIndex+1,high);
        }
    }
    
    // Partition logic based on discount (descending)
    private int partition(int low,int high){
        double pivot=products.get(high).discount;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(products.get(j).discount>=pivot){
                i++;
                Product temp=products.get(i);
                products.set(i,products.get(j));
                products.set(j,temp);
            }
        }
        Product temp=products.get(i+1);
        products.set(i+1,products.get(high));
        products.set(high,temp);
        return i+1;
    }
    
    // Display all products
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products available");
            return;
        }
        for(Product p:products){
            p.display();
        }
    }
}
