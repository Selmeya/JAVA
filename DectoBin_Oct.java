import java.util.Scanner;
public class DectoBin_Oct {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int Decimal = in.nextInt();
 String Binary = Integer.toBinaryString(Decimal);
 System.out.println("BINARY IS " + Binary);
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(Decimal));
 }
}
