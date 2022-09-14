import java.util.Scanner;

public class ATM_Notes
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       int A,A1,B,B1,C,C1,D,D1,X;
       System.out.println("Enter the 1st Denomination:");
       A=s.nextInt();
       System.out.println("Enter the 1st Denomination number of notes");
       A1=s.nextInt();
       System.out.println("Enter the 2nd Denomination:");
       B=s.nextInt();
       System.out.println("Enter the 2nd Denomination number of notes");
       B1=s.nextInt();
       System.out.println("Enter the 3rd Denomination:");
       C=s.nextInt();
       System.out.println("Enter the 3rd Denomination number of notes");
       C1=s.nextInt();
       System.out.println("Enter the 4th Denomination:");
       D=s.nextInt();
       System.out.println("Enter the 4th Denomination number of notes");
       D1=s.nextInt();
       X=((A*A1)+(B*B1)+(C*C1)+(D*D1));
       System.out.println("Total Available Balance in ATM:"+X);
     }
}
