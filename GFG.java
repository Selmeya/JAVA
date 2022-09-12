import java.io.*;
 
class GFG
{
static void perfectSquares(int l, int r)
{
    for (int i = l; i <= r; i++)
    {
        if (Math.sqrt(i) == (int)Math.sqrt(i))
            System.out.print(i + " ");
    }
}
public static void main (String[] args)
{
    int l, r;
    System.out.print("l=");
    Scanner s = new Scanner (System.in);
    l = s.nextInt();
    System.out.print("r=");
    Scanner e = new Scanner (System.in);
    r = e.nextInt();
    perfectSquares(l, r);
}
