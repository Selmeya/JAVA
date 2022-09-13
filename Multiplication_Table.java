import java.util.Scanner;
public class Multiplication_Table{
  public static void  main(String[]args){
    int num,rows;
    System.out.print("M = ");
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    System.out.print("N=");
    Scanner e = new Scanner(System.in);
    rows = e.nextInt();
    for (int i = 1; i <= rows;i++){
      System.out.print(i+"X"+num+"=" +num*i+"\n");
      
    }
  }
} 