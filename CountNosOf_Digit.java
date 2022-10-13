import java.util.*;
class CountNosOf_Digit{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        try{
            int l=s.nextInt();
            int c=0;
            while(l!=0){
                l=l/10;
                c++;
            }
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
