import java.util.Scanner;
public class Perfect_Numbers{
   public static void main(String[]args){
     int number,i ,result=0;
     System.out.print("Given number : ");
     Scanner sc = new Scanner(System.in);
     number = sc.nextInt();
     for(i=1;i<=number;i++){
       if (number%i ==0){
           result = result+i;
       }
      }
      if(result == 2*number){
           System.out.println("It's a perfect number");
      }
      else{
          System.out.println("It's not a perfect number");
      }
  }
}
        