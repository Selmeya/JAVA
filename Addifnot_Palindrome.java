import java.util.Scanner;
public class Addifnot_Palindrome
{
 public static void main(String[] args) {
  try{
   int Z;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number");
   int N=s.nextInt();
   int M=N;
   int A=hell(M);
   while(A!=M)
   {
    M=A+M;
    A=hell(M);
   }
   System.out.println("Answer"+A);
  }
  catch(Exception e)
  {
   System.out.println("Invalid");
  }
 }
 public static int hell(int x)
 {
  int y=0,r,i=10;
  while(x>0)
  { 
   r=x%10;
   y=y*i;
   y=y+r;
   x=x/10;
  }
  return y;
 }
}