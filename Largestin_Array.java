import java.util.Scanner;
public class Largestin_Array{
 public static void main(String[] args)
 {
  try{
   int i,u;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter no of elements in array:");
   int l =s.nextInt();
   int arr[]=new int[l];
   for(i=0;i<l;i++)
   {
    System.out.print("Enter element "+(i+1)+" =");
    arr[i]=s.nextInt();
   }
   u=arr[0];
   for(i=1;i<l;i++)
   {
    if(u<arr[i])
    {
     u=arr[i];
    }
   }
   System.out.println("The largest number is="+u);
  }
  catch(Exception e)
  {
   System.out.println("invalid");
  }
 }
}