import java.util.Scanner;
class vowels{
 public static void main(String[]args)
  {
   String str;
   int count;
   count = 0;
   Scanner sc = new Scanner(System.in);
   str = sc.nextLine();
   for (int i = 0; i < str.length(); i++){
     if (str.charAt(i) =='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
     count++;
   }
     System.out.println("Number of vowels :"+count);
   
  }
}
