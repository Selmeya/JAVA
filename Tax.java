import java.util.Scanner;
public class Tax{
  public static void main(String[] args) {
    int r,s;
    try{
      Scanner e=new Scanner(System.in);
      System.out.println("Enter the income:");
      int l=e.nextInt();
      if(l<0)
      {
        System.out.println("Invalid");
      }
      else if(l==0)
      {
        System.out.println("No tax:0");
      }
     else if((0<l)&&(l<150001))
     {
       System.out.println("No tax:0");
     }
     else if((150000<l)&&(l<300001))
     {
       r=(l/100)*10;
       System.out.println("tax:"+r);
     }
     else if((300000<l)&&(l<500001))
     {
      r=(l/100)*20;
      System.out.println("tax:"+r);
     }
     else{
       r=(l/100)*30;
       System.out.println("tax:"+r);
     }
   }
   catch(Exception e)
   {
     System.out.println("Invalid");
   }
 }
} 
