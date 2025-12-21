public class MatrixAdvancedOperations{

    //method to create a random matrix
    public static double[][] createRandomMatrix(int rows,int cols){
        double matrix[][]=new double[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=(int)(Math.random()*10)+1;
            }
        }
        return matrix;
    }
    
    //method to find transpose of a matrix
    public static double[][] transposeMatrix(double matrix[][]){
        double transpose[][]=new double[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    
    //method to find determinant of 2x2 matrix
    public static double determinant2x2(double matrix[][]){
        return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
    }
    
    //method to find determinant of 3x3 matrix
    public static double determinant3x3(double matrix[][]){
        return matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
    }
    
    //method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double matrix[][]){
        double det=determinant2x2(matrix);
        double inverse[][]=new double[2][2];
        
        inverse[0][0]= matrix[1][1]/det;
        inverse[0][1]=-matrix[0][1]/det;
        inverse[1][0]=-matrix[1][0]/det;
        inverse[1][1]= matrix[0][0]/det;
        
        return inverse;
    }
    
    //method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double matrix[][]){
        double det=determinant3x3(matrix);
        double inverse[][]=new double[3][3];
        
        inverse[0][0]=(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])/det;
        inverse[0][1]=(matrix[0][2]*matrix[2][1]-matrix[0][1]*matrix[2][2])/det;
        inverse[0][2]=(matrix[0][1]*matrix[1][2]-matrix[0][2]*matrix[1][1])/det;
        
        inverse[1][0]=(matrix[1][2]*matrix[2][0]-matrix[1][0]*matrix[2][2])/det;
        inverse[1][1]=(matrix[0][0]*matrix[2][2]-matrix[0][2]*matrix[2][0])/det;
        inverse[1][2]=(matrix[0][2]*matrix[1][0]-matrix[0][0]*matrix[1][2])/det;
        
        inverse[2][0]=(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0])/det;
        inverse[2][1]=(matrix[0][1]*matrix[2][0]-matrix[0][0]*matrix[2][1])/det;
        inverse[2][2]=(matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0])/det;
        
        return inverse;
    }
    
    //method to display matrix
    public static void displayMatrix(double matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        
        //2x2 Matrix operations
        double matrix2x2[][]=createRandomMatrix(2,2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix2x2));
        
        double det2=determinant2x2(matrix2x2);
        System.out.println("Determinant: "+det2);
        
        if(det2!=0){
            System.out.println("Inverse:");
            displayMatrix(inverse2x2(matrix2x2));
        }
        
        //3x3 Matrix operations
        double matrix3x3[][]=createRandomMatrix(3,3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix3x3));
        
        double det3=determinant3x3(matrix3x3);
        System.out.println("Determinant: "+det3);
        
        if(det3!=0){
            System.out.println("Inverse:");
            displayMatrix(inverse3x3(matrix3x3));
        }
    }
}
