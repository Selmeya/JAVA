import java.util.Scanner;
import java.math.*;
public class Rootof_Square {
 public static void main(String[] args) {
  try{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter an number");
   int m=s.nextInt();
   double l=Math.sqrt(m);
   System.out.print("The answer is="+l+", ");
   System.out.println(-l);
  }
  catch(Exception e)
  {
   System.out.println("Invalid");
  }
 }
}