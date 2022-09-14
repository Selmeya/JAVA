import java.util.Scanner;

public class ATM_Notes
{
    public static void main(String args[])
    {
        int amount, i2000=0, i500=0, i200=0, i100=0, count=0; 
        Scanner s = new Scanner(System.in);
 
        System.out.print("Enter The Amount in Rupees : \n\n");
        amount = s.nextInt();
 
    while(amount >= 2000) 
 { 
  i2000 = amount / 2000 ; 
  amount = amount % 2000;
  System.out.print("\nTotal Number Of 2000 Rupees Notes :"+ i2000) ;
  break ; 
 }
 while(amount >= 500) 
 { 
  i500 = amount / 500 ; 
  amount = amount % 500;
  System.out.print("\nTotal Number Of 500 Rupees Notes : "+ i500) ;
  break ; 
 } 
 while(amount >= 200) 
 { 
  i200 = amount / 200 ; 
  amount = amount % 200;
  System.out.print("\nTotal Number Of 200 Rupees Notes : "+ i200) ;
  break ; 
 } 
 while(amount >= 100) 
 { 
  i100 = amount / 100 ;
  amount = amount % 100; 
  System.out.print("\nTotal Number Of 100 Rupees Notes : "+ i100) ; 
  break ; 
 }  

 count = i2000 + i500 + i200 + i100;   
 System.out.print("\n\nTotal Number Of Notes Require : \n\n"+ count) ; 
 }
}