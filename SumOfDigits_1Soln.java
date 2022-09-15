import java.util.Scanner;  
public class SumOfDigits_1Soln 
{  
  public static void main(String arg[])  
  {  
  long num, Sum;
  int digit;
  System.out.println("Enter N value : ");
  Scanner sa = new Scanner(System.in);
  digit = sa.nextInt();  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter a " +digit+" digit number: ");    
  num=sc.nextLong();    
  for(Sum=0; num!=0; num=num/10)  
  {      
    Sum = Sum + num % 10;  
  }  
  System.out.println("Sum of"+digit+ " number: "+Sum);  
}  
}