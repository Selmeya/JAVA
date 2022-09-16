class Bank{ 
 float getRateOfInterest(){return 0;} 
} 
class SBI extends Bank{ 
 float getRateOfInterest(){return 8.4f;} 
} 
class ICICI extends Bank{ 
 float getRateOfInterest(){return 7.3f;} 
} 
class AXIS extends Bank{ 
 float getRateOfInterest(){return 9.7f;} 
} 
class Rateof_Interest{ 
 public static void main(String args[]){ 
  Bank B; 
  B=new SBI(); 
  System.out.println("SBI Rate of Interest: "+B.getRateOfInterest()); 
  B=new ICICI(); 
  System.out.println("ICICI Rate of Interest: "+B.getRateOfInterest()); 
  B=new AXIS(); 
  System.out.println("AXIS Rate of Interest: "+B.getRateOfInterest()); 
 } 
}