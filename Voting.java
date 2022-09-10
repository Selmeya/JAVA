import java.util.Scanner;
class Voting {

    public static void main(String[] args){
      int age,i;
    Scanner n=new Scanner(System.in);
    System.out.print("enter your age:");
    age=n.nextInt();
    if(age>=18)
   {
     System.out.print("The person is eligible to vote");
   }
    else
     {
       i=18-age;
       System.out.print("You are allowed to vote after"+i+"years ");
    }
  }
}
    
    