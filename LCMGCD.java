import java.util.*;
 
class LCMGCD
{
	public static void main(String args[])
	{
	    	int N1,N2;
	    	int GCD,LCM,Rem,Numerator,Denominator;
 		Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter two Numbers");
	    	N1=sc.nextInt();
		N2=sc.nextInt();
	    	if (N1>N2)
		{	
        		Numerator=n1;
        		Denominator=n2;
    		}
    		else
    		{
       			Numerator=n2;
       		 	Denominator=n1;
	    	}
	    	Rem=Numerator%Denominator;
    		while(Rem!=0)
    		{
    	   		Numerator=Denominator;
   		     	Denominator=Rem;
       		 	Rem=Numerator%Denominator;
    		}
    		GCD = Denominator;
    		LCM = N1*N2/GCD;
    		System.out.println("GCD of "+N1+" and "+N2+" = "+GCD);
    		System.out.println("LCM of "+N1+" and "+N2+" = "+LCM);
	}
