import java.util.Scanner;
public class Conversion_of_Days
{
    public static void main(String args[])
    {
        int s, year, week, day;
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        s = e.nextInt();
        year = s / 365;
        s = s % 365;
        System.out.println("No. of years:"+year);
        week = s / 7;
        s = s % 7;
        System.out.println("No. of weeks:"+week);
        day = s;
        System.out.println("No. of days:"+day);
    }
}