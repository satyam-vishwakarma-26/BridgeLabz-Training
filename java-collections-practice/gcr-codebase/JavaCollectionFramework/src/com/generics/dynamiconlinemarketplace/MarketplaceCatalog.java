package com.generics.dynamiconlinemarketplace;
import java.util.*;
// Catalog that can hold multiple product types
public class MarketplaceCatalog{
    private List<Product<? extends Category>> catalog=new ArrayList<>();
    // Add product safely
    public void addProduct(Product<? extends Category> product){
        catalog.add(product);
        System.out.println("Product added to catalog");
    }
    // Display all products
    public void displayCatalog(){
        for(Product<? extends Category> p:catalog){
            p.display();
        }
    }
 // Check if catalog is empty
    public boolean isEmpty(){
        return catalog.isEmpty();
    }
    // Get last added product
    public Product<? extends Category> getLastProduct(){
        return catalog.get(catalog.size()-1);
    }

}
