import java.util.*;
class Spl_Pattern{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of character to be entered: ");
        int e=s.nextInt();
        String arr[]=new String[e];
        for(int i=0;i<e;i++){
            arr[i]=s.next();
        }
        System.out.println("Max number of times to be printed");
        int e1=s.nextInt();
        s.close();
        for(int i=0;i<e1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i].charAt(0)+" ");
            }
            System.out.println();
        }
    }
}
