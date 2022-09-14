import java.util.Scanner;

public class Special_Char {
	private static Scanner sc;
	public static void main(String[] args) {
		String alpdigispl_str;
		int i, alpha, digit, spl;
		alpha = digit = spl = 0;
		char ch;
		
		Scanner s= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		alpdigispl_str = s.nextLine();
		
		for(i = 0; i < alpdigispl_str.length(); i++)
		{
			ch = alpdigispl_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alpha++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alpha);
		System.out.println("Number of Digit Characters     =  " + digit);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}