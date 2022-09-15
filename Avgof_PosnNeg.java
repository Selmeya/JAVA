import java.util.Scanner;
public class Avgof_PosnNeg{
  public static void main(String[] args) {
   try{
   Scanner s=new Scanner(System.in);
   int v2=0;
   double i1=0,i2=0,n=0,n1=0,n2=1;
   int a=-1;
   double si,as;
   while(v2!=1)
   {
    System.out.println("Enter an number");
    v2=s.nextInt();
    if(v2>=0)
    {
     n1=n1+v2;
     i1=i1+1;
    }
    else
    {
     n2=n2+v2;
     i2=i2+1;
    }
  }
  si=n2/i2;
  as=n1/i1;
  System.out.println("Total average of negative numbers:"+si);
  System.out.println("Total average of positve numbers:"+as);
 }
 catch(Exception e)
 {
  System.out.println("Invalid");
 }
}
}
