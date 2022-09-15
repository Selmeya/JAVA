import java.util.Scanner;
public class PerfectNumber_tillN
{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter no.of perfect numbers you want print:--");
    try{
      int m=s.nextInt();
      int i,x=0,j;
      if(m==0)
      {
       System.out.println("The result is-: 0");
      }
      else if(m>0)
      {
       int n=0;
       for(j=2;j<100000000;j++)
       {
       if(n<m) 
          x=1;
          for(i=2;i<j;i++)
          {
           if(j%i==0)
           {
            x=x+i;
           }
          }
          if(x==j)
          {
           System.out.print(","+j);
           n=n+1;
          }
       }
     }
     else 
     {
      System.out.println("Invalid");
     }
   }
   catch(Exception e)
   {
    System.out.println("Invalid");
   }
 }
}