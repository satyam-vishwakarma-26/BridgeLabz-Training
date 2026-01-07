package com.Searching.binarysearch;


import java.util.Scanner;

public class SearchIn2DMatrix{

    //method to search target
    public static boolean searchMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;

        int left=0;
        int right=rows*cols-1;

        while(left<=right){
            int mid=(left+right)/2;

            int row=mid/cols;
            int col=mid%cols;

            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }

    //main method
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();

        int[][] matrix=new int[r][c];

        System.out.println("Enter matrix elements (row-wise sorted):");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter target value to search: ");
        int target=sc.nextInt();

        boolean found=searchMatrix(matrix,target);

        if(found){
            System.out.println("Target value found in matrix");
        }else{
            System.out.println("Target value not found in matrix");
        }
    }
}
