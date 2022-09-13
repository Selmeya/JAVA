import java.util.Scanner;
public class Composite_tillInterval{
  public static void main(String[]args){
    int start,end;
    System.out.print("A=");
    Scanner s = new Scanner(System.in);
    start = s.nextInt();
    System.out.print("B = ");
    Scanner e = new Scanner(System.in);
    end = e.nextInt();
    int count = 0;
    int i = 1;

    System.out.format("Composite Numbers between %d and %d:\n", start, end);
    for(start=start; start<=end; start++)
    {
    for(i=1; i<=start; i++)
    {
      if(start % i == 0)
     count++;
    }
    if(count > 2)
      System.out.format("%d ", start);
     count = 0;
   }
 }
}
