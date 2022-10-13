import java.util.Scanner;
import java.util.Arrays;
public class Stringg_Operation{
  static void isAnagram(String s,String l){
    String a1=s.replaceAll("\\s","");
    String a2 =l.replaceAll("\\s","");
    boolean status = true;
    if(a1.length()!=a2.length()){
      status=false;
    }
    else{
      char[]ArrayA1=a1.toLowerCase().toCharArray();
      char[]ArrayA2=a2.toLowerCase().toCharArray();
      Arrays.sort(ArrayA1);
      Arrays.sort(ArrayA2);
      status = Arrays.equals(ArrayA1,ArrayA2);
    }
    if(status){
      System.out.println(a1+ " and " +a2+ " are anagrams");
    }
    else{
      System.out.println(a1+" and " +a2+ " are not anagrams"); 
    }
   }
   static void Lengthh(String s){
     int length = s.length();
     System.out.println(" Length : "+length);
   }
   static void ToLower(String s){
     System.out.println("The Lower case of the given string is "+s.toLowerCase());
   }
   static void ToUpper(String s){
     System.out.println("The Uppercase for the given string is "+s.toUpperCase());
   }
   static void LastWord(String l){
     String[] tokens = l.split(" ");
     System.out.println(tokens[tokens.length-1]);
   }
   static void Vowel(String s){
     System.out.println("Vowels : ");

     for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
              System.out.println( s.charAt(i) );  
            }
       
         
      }
    }
    static void Consonant(String s){
     System.out.println("Consonants: ");
     for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b' || s.charAt(i) == 'c' || s.charAt(i) == 'd' || s.charAt(i) == 'f' || s.charAt(i) == 'g'
                    || s.charAt(i) == 'h' || s.charAt(i) == 'j' || s.charAt(i) == 'k' || s.charAt(i) == 'l' || s.charAt(i) == 'm'|| s.charAt(i) == 'n' || s.charAt(i) == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r'
                    || s.charAt(i) == 's' || s.charAt(i) == 't' || s.charAt(i) == 'v' || s.charAt(i) == 'w' || s.charAt(i) == 'x'|| s.charAt(i) == 'y' || s.charAt(i) == 'z' || s.charAt(i) == 'B' || s.charAt(i) == 'C'
                    || s.charAt(i) == 'D' || s.charAt(i) == 'F' || s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'J'|| s.charAt(i) == 'K' || s.charAt(i) == 'L' || s.charAt(i) == 'M'|| s.charAt(i) == 'N' || s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R'
                    || s.charAt(i) == 'S' || s.charAt(i) == 'T' || s.charAt(i) == 'V' || s.charAt(i) == 'W' || s.charAt(i) == 'X'|| s.charAt(i) == 'Y' || s.charAt(i) == 'Z' ) {
             
                System.out.println( s.charAt(i) );
             
              }
       
         
      }
    }

  public static void main(String[] args){
   String s ;
   Scanner e = new Scanner (System.in);
   System.out.println("Enter any String : \n");
   s = e.nextLine();
   String l ;
   Scanner m = new Scanner (System.in);
   System.out.println("Enter any String : \n");
   l = m.nextLine();
   
   isAnagram(s,l);
   Lengthh(s);
   ToLower(s);
   ToUpper(s);
   LastWord(l);
   Vowel(s);
   Consonant(s);
 
  }
}
   
   