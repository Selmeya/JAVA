import java.util.Scanner;
public class Frequencyof_ElementsinArray {
  public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter no of elements in the array");
   int m=s.nextInt();
   int array[][]=new int[m][2];
   System.out.println("Enter the elements of the array");
   int i,j;
   for(i=0;i<m;i++)
   {
    array[i][0]=s.nextInt();
   }
   for(i=0;i<m;i++)
   {
    array[i][1]=1;
   }
   for(i=0;i<m;i++)
   {
    for(j=i+1;j<m;j++)
    {
     if(array[i][0]==array[j][0])
     {
      array[j][0]=-1;
      array[i][1]=array[i][1]+1;
     }
    }
   }
   System.out.println("The output table is:=");
   System.out.println("Element | Frequency");
   System.out.println("---------------------");
   for(i=0;i<m;i++)
   {
    if(array[i][0]!=-1)
    {
     System.out.println(" "+array[i][0]+" | "+array[i][1]); 
    }
   }
 }
}
