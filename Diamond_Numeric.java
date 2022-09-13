import java.util.Scanner;
public class Diamond_Numeric{
  public static void main(String[] args)  {  
   int i, j, rows, num; 
   System.out.println("Enter the number to be printed: ");
   Scanner s = new Scanner(System.in);
   num = s.nextInt();
   Scanner sc = new Scanner(System.in);  
   System.out.print("Max number of time printed ");  
   rows = sc.nextInt();          
   for (i= 0; i<= rows-1; i++)  {  
     for (j=0; j<=i; j++)   {  
        System.out.print(num);  
     }   
     System.out.println("");   
   }   
   for (i=rows-1; i>=0; i--){  
      for(j=0; j <= i-1;j++){  
           System.out.print(num);  
      }  
      System.out.println("");  
   }  
 }  
} 
