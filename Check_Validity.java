import java.util.Scanner;
class Check_Validity{
  public static void main(String[]args){
    System.out.println("Enter the user name: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println("Re-enter the username: ");
    Scanner e = new Scanner(System.in);
    String l = sc.nextLine();
    if(s==l){
       System.out.println("Username is valid");
    }
    else{
       System.out.println("Username is invalid");
    }
}
}
    