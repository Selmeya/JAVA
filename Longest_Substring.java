import java.util.*;
class Longest_Substring{
   
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        String s=e.nextLine();
        e.close();
        String str[]=new String[s.length()];
        int k=0;
        int Max=0;
 
        str[0]=Character.toString(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int l=0;

            for(int j=0;j<=k;j++){
                if(str[j].charAt(0)==s.charAt(i)){
                    l++;
                }
            }
            if(l==0){
                
                k++;
                str[k]=Character.toString(s.charAt(i));
                
            }
             if(l!=0||i==s.length()-1){
            
                if(Max<k){
                    Max=k;
                }
                k=0;
                str[k]=Character.toString(s.charAt(i));
            }

            
        }
        System.out.println(Max+1);
    }
    }
