import java.io.*;
import java.util.*;

public class MeanMedianMode_ofArray {
   public static void main(String[] args) {
    List<Integer>li=new ArrayList<>();
    Scanner a=new Scanner(System.in);
    System.out.println("enter the number of elements");
    int m=a.nextInt();
    for(int i=0;i<m;i++){
     li.add(a.nextInt());
    }
    int sum=li.stream().mapToInt(Integer::intValue).sum();
    float m1=m;
    float mean=sum/m1;
    System.out.println("Mean="+mean);
    int c1=0,mode=0,median=0;
    for(int i=0;i<m;i++){
     int c=Collections.frequency(li,li.get(i));
     if(c>c1){
      c1=c;
      mode=li.get(i);
     }
    }
    Collections.sort(li);
    if(m%2==0){
     float median1=(li.get((m/2)-1)+li.get((m/2)-1)+1)/2;
     System.out.println("Median="+median1);
    }
    else{
     int mid=(m+1)/2;
     median=li.get(mid-1);
     System.out.println("Median="+median);
    }
    System.out.println("mode="+mode);
   }
  }

