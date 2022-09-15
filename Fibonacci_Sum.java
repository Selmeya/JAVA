import java.util.*;
class Fibonacci_Sum{
 public static void main(String[] args){
 int s=0;
 int e=1;
 int l=s+e;
 Scanner sb=new Scanner(System.in);
 System.out.print("enter the number:");
 int n=sb.nextInt();
 List<Integer>li=new ArrayList<>();
 li.add(s);
 li.add(e);
 for(int i=0;i<(n*2)-1;i++){
 l=s+e;
 s=e;
 e=l;
 li.add(l);
 }

 int Sum=0;
 for(int i=0;i<li.size();i++){
 if(i%2==0){

 Sum=Sum+li.get(i);
 }
 }
 System.out.println("sum of even fibonacci is="+Sum);
 }
}