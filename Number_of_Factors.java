import java.util.Scanner;
public class Number_of_Factors {

  public static void main(String[] args) {
    int number;
    int count = 0;
    Scanner sc = new Scanner (System.in);
    number= sc.nextInt();
    System.out.print("Given Number: ");

    System.out.print("Number of Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {
      if (number % i == 0) {
        count++;
        
      }
     
    }
    System.out.println(count);
  }
}