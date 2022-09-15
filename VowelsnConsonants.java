import java.io.*;
import java.util.*;
public class VowelsnConsonants{ 
 public static void main(String[] args) { 
  try{
      System.out.println("Enter an String:");
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      String S = br.readLine();
      String m=" ";
      String l=" ";
      int x=S.length();
      int i;
      for(i=0;i<x;i++)
      {
 
       if((S.charAt(i)=='a')||(S.charAt(i)=='e')||(S.charAt(i)=='i')||(S.charAt(i)=='o')||(S.charAt(i)=='u')||(S.charAt(i)=='A')||(S.charAt(i)=='E')||(S.charAt(i)=='I')||(S.charAt(i)=='U'))
       {
        m=m+S.charAt(i)+' ';
       }
       else
       {
        l=l+S.charAt(i)+' '; 
       }
    }
    System.out.println("Consonants-: "+l); 
    System.out.println("Vowels-: "+m); 
  }
  catch (Exception e)
  {
   System.out.println(e);
  } 
 } 
}