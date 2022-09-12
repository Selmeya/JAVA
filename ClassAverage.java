import java.util.Scanner;
public class ClassAverage{
 public static void main(String[]args){
  System.out.println("Enter the marks obtained in Math : ");
  Scanner s = new Scanner(System.in);
  int Math = s.nextInt();
  System.out.println("Enter the marks obtained in English: ");
  Scanner e = new Scanner(System.in);
  int Eng = e.nextInt();
  System.out.println("Enter the marks obtained in Science: ");
  Scanner l  = new Scanner(System.in);
  int Sci = l.nextInt();
  System.out.println("Enter the marks obtained in SoSt :  ");
  Scanner m = new Scanner (System.in);
  int SoSt = m.nextInt();
  System.out.println("Enter the marks obtained in Hindi: ");
  Scanner i = new Scanner(System.in);
  int Hin= i.nextInt();
  int Total = Math+Eng+Sci+SoSt+Hin;
  double Avg = (Total/5);
  if (Avg >= 90){
    System.out.println("Grade S");
  }
  else if (Avg < 90 && Avg>= 80){
    System.out.println("Grade A");
  }
  else if( Avg < 80 && Avg >= 70){
    System.out.println("Grade B");
  }
  else if (Avg < 70 && Avg>= 60){
     System.out.println("Grade C");
  }
  else if ( Avg <60 && Avg >= 50){
     System.out.println("Grade D");
  }
  else{
     System.out.println("Grade F");
  }
  System.out.println("Total : "+Total);
  System.out.println("Average Marks obtained : "+Avg);
 }
}
 
    