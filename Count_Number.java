import java.util.Scanner;
class Count_Number{
  public static void main(String[] args){
   try{
     int S,Count = 0;
     Scanner l= new Scanner(System.in);
     System.out.print("Enter a Number: ");
     S = l.nextInt();
     while (S!=0){
       Count++;
       S=S/10;
     }
     System.out.println("\n The Total Number of Digits = "+Count);
   }catch(Exception e) {
    System.out.println("Something went wrong.");
   }
  }
}
