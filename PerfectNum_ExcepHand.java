import java.util.*;
class PerfectNum_ExcepHand{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       System.out.println("Enter the integer");
       try{
       int e=s.nextInt();
       int sum=0;
       for(int i=1;i<e;i++){
        if(e%i==0){
            sum =sum+i;
        }
       }
       s.close();
       if(sum==e){
        System.out.println("Perfect number");
       }
       else{
        System.out.println("Not perfect number");
       }
    }
    catch(Exception e){
        System.out.println("Enter the integer number");
    }
  }
}
