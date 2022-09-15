import java.util.Scanner;
class Palindrome {
 public static void main(String[] args) {
 Scanner n = new Scanner(System.in);
 String s = n.nextLine(), reverseStr = "";
 int sLength = s.length();
 for (int i = (sLength - 1); i >=0; --i) {
 reverseStr = reverseStr + s.charAt(i);}
 if (s.toLowerCase().equals(reverseStr.toLowerCase())) {
 System.out.println(s + " is a Palindrome String.");}
 else {
 System.out.println(s + " is not a Palindrome String.");}
 }
}