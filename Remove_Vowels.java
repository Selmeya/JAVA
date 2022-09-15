import java.util.Scanner;
class Remove_Vowels{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string:");
    String e=s.nextLine();
    e=e.replaceAll("[aeiouAEIOU]","");
    System.out.println("The string without vowel is:"+e);
  }
}