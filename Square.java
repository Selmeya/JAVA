import java.util.Scanner;
class Square
{
  public static void main(String[] args) {
    int I,Jj;
    try{
     int X;
     Scanner s=new Scanner(System.in);
     System.out.println(" First Element as the number and Second Element as the Square of the number");
     System.out.println("Enter the values of m and n lower and uppper ranges");
     int M=s.nextInt();
     int N=s.nextInt();
     X=(N-M)+1;
     int K=M;
     int arr[][]=new int[X][5];
     System.out.println("The output is:");
     System.out.print("[");
     for(I=0;I<X;I++)
     {
      arr[I][0]=K;
      arr[I][1]=(K*K);
      K=K+1;
      System.out.print("("+arr[I][0]+",");
      System.out.print(arr[I][1]+"),");
    }
    System.out.print("]");
  }
  catch(Exception e)
  {
   System.out.println("Invalid");
  }
 }
}
