import java.util.Scanner;
public class Square_ofDecimal{
  public static void main(String[]args){
    double s;
    int square,cube;
    System.out.print("Given Number: ");
    Scanner e = new Scanner(System.in);
    s = e.nextDouble();
   
    System.out.println("Square Number: "+s*s);
   
    System.out.println("Cube Number: "+s*s*s);
  }
}
    