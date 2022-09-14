import java.util.Scanner;
public class Factorialby_Recursion{
  public static void main(String[]args){
     int s;
     System.out.print("Enter the value of n : ");
     Scanner e = new Scanner(System.in);
     s=e.nextInt();
     long Factorial = multiplyNumbers(s);
     System.out.println("Factorial of " + s + " = " + Factorial);
    }
    public static long multiplyNumbers(int s)
    {
        if (s >= 1)
            return s * multiplyNumbers(s - 1);
        else
            return 1;
    }
}