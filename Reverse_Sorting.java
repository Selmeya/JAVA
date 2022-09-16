import java.util.Scanner;
class Reverse_Sorting{
 public static void main(String[] args){
 Scanner s=new Scanner(System.in);
 String sel=s.nextLine();
 int n=sel.length();
 char temp;
 char array[]=sel.toCharArray();
 for(int i=0;i<n;i++){
 for(int j=0;j<n;j++){
 if(array[i]>array[j]){
 temp=array[i];
 array[i]=array[j];
 array[j]=temp;
 }
 }
 }
 s.close();
 String sel1=new String(array);
 System.out.println(sel1);
 }
}