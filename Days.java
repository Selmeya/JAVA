import java.util.Scanner;
public class Days {

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the days::\n");

        int dd = in.nextInt();
        int yy;
        int ww;

        yy = (dd / 365);
        ww = (dd % 365) / 7;
        dd = dd- ((yy * 365) + (ww));

        System.out.println("\n" + yy + " Year, " + ww + " Weeks, and " + dd + " Days\n");
    }
}