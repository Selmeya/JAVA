import java.util.Scanner;
public class MtoN
{
 public static void main(String[] args)
 {
 Scanner sb=new Scanner(System.in);
 System.out.println("to print the numbers from M to N by skipping K numbers in between");
 System.out.println("Enter the values of M,N,and K");
 int S,E,K,i,j,b=-5,s,e,t;
 s=sb.nextInt();
 e=sb.nextInt();
 K=sb.nextInt();
 System.out.println("The result is");
 if(s!=e)
 {
 if(e<s)
 {
 S=e;
 E=s;
 }
 else
 {
 S=s;
 E=e;
 }
 for(i=S;i<=E;i++)
 {
 System.out.println(i+" ");
 i=i+K;
 }

 }
 else
 {
 System.out.println("zero");
 }
}
}