import java.util.*;
class FizzBuzzz{
 public static void main(String[] args){
  List<String> sl=new ArrayList<>();
  Scanner s=new Scanner(System.in);
  int e=s.nextInt();
  for(int i=1;i<=e;i++){
   if(i%3==0||i%5==0){
    if(i%3==0&&i%5==0){
     sl.add("FIZZBUZZ");
    }
    else if(i%3==0){
     sl.add("FIZZ");
    }
    else if(i%5==0){
     sl.add("BUZZ");
    }
   }
   else{
    sl.add(Integer.toString(i));
   }
  }
  System.out.println(sl);
 }
}

