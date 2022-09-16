import java.util.Scanner;
public class Duplicatein_Array{
 public static void main(String[] args) {
  try{
   int i,j,x=1;
   Scanner l=new Scanner(System.in);
   System.out.println("Enter no of elements in array:");
   int m =l.nextInt();
   int arr[]=new int[m];
   for(i=0;i<m;i++)
   {
    System.out.print("Enter element "+(i+1)+" =");
    arr[i]=l.nextInt();
   }
   for(i=0;i<m;i++)
   {
    if(arr[i]==0)
    {
     x=0;
    }
  }
  for(i=0;i<m;i++)
  {
   for(j=0;j<i;j++)
   {
    if(arr[i]==arr[j])
    {
      System.out.print(" "+arr[i]);
     arr[i]=0;
     arr[j]=0;
    } 
   }
  }
   if(x==0)
   {
    System.out.print("0");
   }
   for(i=0;i<m;i++)
   {
    if(arr[i]!=0)
    { 
     System.out.print(" "+arr[i]);
    }
   }
  }
  catch(Exception e)
  {
   System.out.println("Invalid");
  }
 }
}
