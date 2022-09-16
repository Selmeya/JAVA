import java.util.Scanner;
public class Numberof_DaysinMonth {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int Number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int Month = input.nextInt();

        System.out.print("Input a year: ");
        int Year = input.nextInt();

        switch (Month) {
            case 1:
                MonthOfName = "January";
                Number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0))) {
                    Number_Of_DaysInMonth = 29;
                } else {
                    Number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                Number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                Number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                Number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                Number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                Number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                Number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                Number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                Number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                Number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                Number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + Year + " has " + Number_Of_DaysInMonth + " days\n");
    }
}