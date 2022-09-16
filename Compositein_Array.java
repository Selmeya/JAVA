import java.util.Scanner;
public class Compositein_Array {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements in the array");
  int m=s.nextInt();
  int array[]=new int[m];
  System.out.println("Enter the elements of the array one by one");
  int i,j,x,k,rk=0;
  for(i=0;i<m;i++)
  {
   array[i]=s.nextInt(); 
  }
  for(i=0;i<m;i++)
  {
   k=0;
   for(j=2;j<array[i];j++)
   {
    if(array[i]%j==0)
    {
     k=k+1;
    }
   }
   if(k>0)
   {
    rk=rk+1;
   }
  }
  System.out.println("total no of composite numbers are="+rk);
 }
}
