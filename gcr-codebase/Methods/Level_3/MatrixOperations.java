public class MatrixOperations{

    //method to create a random matrix
    public static int[][] createRandomMatrix(int rows,int cols){
        int matrix[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*10); //0 to 9
            }
        }
        return matrix;
    }
    
    //method to add two matrices
    public static int[][] addMatrices(int a[][],int b[][]){
        int result[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
        return result;
    }
    
    //method to subtract two matrices
    public static int[][] subtractMatrices(int a[][],int b[][]){
        int result[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                result[i][j]=a[i][j]-b[i][j];
            }
        }
        return result;
    }
    
    //method to multiply two matrices
    public static int[][] multiplyMatrices(int a[][],int b[][]){
        int result[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    
    //method to display matrix
    public static void displayMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        
        int rows=3;
        int cols=3;
        
        //creating random matrices
        int matrixA[][]=createRandomMatrix(rows,cols);
        int matrixB[][]=createRandomMatrix(rows,cols);
        
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        
        //addition
        System.out.println("\nAddition of Matrices:");
        int add[][]=addMatrices(matrixA,matrixB);
        displayMatrix(add);
        
        //subtraction
        System.out.println("\nSubtraction of Matrices:");
        int sub[][]=subtractMatrices(matrixA,matrixB);
        displayMatrix(sub);
        
        //multiplication
        System.out.println("\nMultiplication of Matrices:");
        int mul[][]=multiplyMatrices(matrixA,matrixB);
        displayMatrix(mul);
    }
}
