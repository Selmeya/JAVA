import java.util.Scanner;
public class Bonus {
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the grade of the employee");
   char c = in.next().charAt(0);
   if (c == 'A') {
     System.out.println("Enter the employee salary");
     int s = in.nextInt();
     if (s < 10000) {
       int Bonus = s / 7;
       int Total = s + Bonus;
       System.out.println("BONUS= " + Bonus);
      System.out.println("Total to be paid=" + Total);
     } else {
        int Bonus = s / 5;
        int Total = s + Bonus;
        System.out.println("BONUS= " + Bonus);
        System.out.println("Total to be paid=" + Total);
       }
   } else if (c == 'B') {
       System.out.println("Enter the employee salary");
       int e = in.nextInt();
       if (e < 10000) {
          int Bonus = e / 12;
          int Total = e + Bonus;
          System.out.println("BONUS=" + Bonus);
          System.out.println("Total to be paid=" + Total);}
       else {
         int Bonus = e / 10;
         int Total = e + Bonus;
         System.out.println("BONUS=" + Bonus);
         System.out.println("Total to be paid=" + Total);}
       }
 }
}