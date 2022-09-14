import java.util.*;
class Number{
   public static void main(String[] args){
      Scanner a=new Scanner(System.in);
      int low=a.nextInt();
      int up=a.nextInt();
      List<Integer>li=new ArrayList<>();
      if(up>low){
         for(int i=low;i<=up;i++){
            double sqrt=Math.sqrt(i);
           
            if(sqrt-Math.floor(sqrt)==0&&fun(i)<10)
            li.add(i);
         }
      }
       
      System.out.println(li);
   }
public  static int fun(int i){
   int sum=0;
   while(i!=0){
      int rem=i%10;
      sum=sum+rem;
      i=i/10;
   }
   System.out.println(sum);
 }
}


