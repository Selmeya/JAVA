import java.util.Scanner;
public class Factorial{
  public static void main(String[]args){
    int fact,i,num;
    System.out.print("N =");
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    i = 1;
    fact = 1;
    while(i <= num){
        fact=fact*i;
        i++;
    }
    System.out.println("Factorial of"+num+"is"+fact);
   }
}
    