import java.util.Arrays;
import java.util.Scanner;
public class SortStringin_Alpha{
  public static void main(String args[]){
    Scanner s  = new Scanner(System.in);
    int e;
    System.out.println("Enter the number of elements: ");
    e=s.nextInt();
    String sel[] = new String[e];
    System.out.println("Enter the String: ");
    Scanner s1 = new Scanner(System.in);
    for (int i=0;i<e;i++){
      sel[i]=s1.nextLine();
    }
     for(int i = 0;i<e; i++){
       for(int j = i+1;j<e;j++){
         if(sel[i].compareTo(sel[j])>0){
           String temp = sel[i];
           sel[i] = sel [j];
           sel[j] = temp;
         }
       }
      }
      System.out.println(Arrays.toString(sel));
  }
}
  
     

