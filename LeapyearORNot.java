import java.util.Scanner;
public class LeapyearORNot{
  public static void main(String[]args){
    int date,month, year;
    Scanner s = new Scanner(System.in);
    date = s.nextInt();
    Scanner e = new Scanner(System.in);
    month = e.nextInt();
    Scanner l = new Scanner(System.in);
    year = l.nextInt();
    System.out.println(date+"/"+month+"/"+year);
    if (month == 00){
      System.out.println("Give correct month");
    }
    else if (month > 12){
      System.out.println("Give correct month");
    }
    else if ( date == 00 ){
       System.out.println("Give correct date");
    }
    else if ( date >31 ){
       System.out.println("Give correct date");
    }
    else if (year%4 == 0 && year%100 !=0){
      System.out.println("Given year is a leap year");
    }
    else if (year%400 ==0){
       System.out.println("Given year is a leap year");
    }
    else{
      System.out.println("Given year is a non leap");
    }
   }
}  