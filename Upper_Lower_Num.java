import java.util.*;
class Upper_Lower_Num{
   public static void main(String[] args){
     Scanner a=new Scanner(System.in);
     String s=" ";
     int s1=0,s2=0,s3=0;
     while(s.charAt(0)!='*'){
      System.out.println("Enter any character:");
      s=a.next();
      if(Character.isUpperCase(s.charAt(0))){
       s1++;
      }
      else if(Character.isLowerCase(s.charAt(0))){
          s2++;
      }
      else if(Character.isDigit(s.charAt(0))){
         s3++;
      }
   }
   System.out.println("Total number of Upper case="+s1);
   System.out.println("Total number of Lower case="+s2);
   System.out.println("Total number of Digits="+s3);
 }
}
