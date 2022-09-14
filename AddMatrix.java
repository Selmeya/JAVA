import java.io.*; 
   
 class AddMatrix { 
  
     static void printMatrix(int S[][], 
                             int rowSize, 
                             int colSize) 
     { 
         for (int i = 0; i < rowSize; i++) { 
             for (int j = 0; j < colSize; j++) 
                 System.out.print(S[i][j] + " "); 
   
             System.out.println(); 
         } 
     } 
   
     static int[][] add(int E[][], int L[][], 
                        int size) 
     { 
         int i, j; 
         int M[][] = new int[size][size]; 
   
         for (i = 0; i < size; i++) 
             for (j = 0; j < size; j++) 
                 M[i][j] = E[i][j] + L[i][j]; 
   
         return M; 
     } 
     public static void main(String[] args) 
     { 
         int size = 2; 
   
         int E[][] = { { 1, 2}, 
                       { 5, 3}};  
         System.out.println("\nMatrix A:"); 
         printMatrix(E, size, size); 
   
         int L[][] = { { 2, 3}, 
                       { 4, 1}}; 
         System.out.println("\nMatrix B:"); 
         printMatrix(L, size, size); 
  
         int M[][] = add(E, L, size); 
  
         System.out.println("\nResultant Matrix:"); 
         printMatrix(M, size, size); 
     } 
}
 