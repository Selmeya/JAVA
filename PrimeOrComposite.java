import java.util.Scanner;
public class PrimeOrComposite {

public static void main(String[] args) {
   int num ;
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number:");
   num = input.nextInt();
   boolean isPrime = true;
   for(int i = 2; i <= num/2; i++)
   {

     if(num % i == 0)
     {
       isPrime = false;
       break;
     }
   }
   if (isPrime==true)
     System.out.println(num + " is a Prime number.");
   else
      System.out.println(num + " is not a Prime number\n(it is a Composite number.)");
  }
}