import java.util.Scanner;
public class Tableby_Thread{
  public static void main(String[] args){
   try{
    int s;
    int e;
    int i;
    int l;
    Scanner m = new Scanner(System.in);
    System.out.println("Enter the values of A and B ");
    s=m.nextInt();
    if(!m.hasNextInt()){
      System.out.println("Invalid");
      return;
    }
    e = m.nextInt();
    if(s<=0 && e<=0){
      System.out.println("INVALID");
    }
    else{
      for(i=1;i<=10;i++){
        l=s*i;
        System.out.println(s+ " * "+i+ " = " +l);
      }
      for(i=1;i<=10;i++){
        l=e*i;
        System.out.println(e+" * "+i+" = " +l);
      }
    }
  }
  catch( Exception e){
    System.out.println("INVALID Input" );
  }
 }
}