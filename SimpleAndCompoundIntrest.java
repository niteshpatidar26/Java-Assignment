import java.util.Scanner;
interface Simple
{
    double calSI(double P,double R,double T);
    double calCI(double P,double R,double T);
	 
}


public class SimpleAndCompoundIntrest implements Simple
{
	
	 double SI=0;
	 double CI=0;
	
	//override
	public double calSI(double P,double R,double T) 
	  {
		SI= (P*R*T)/100;
		return SI;
	  }

       //Override
	public double calCI(double P,double R,double T) 
	  {
		CI = P* Math.pow(1.0+R/100.0,T);
		return CI;
	  }
	
	public static void main(String[] args) 
	{
		
		SimpleAndCompoundIntrest Obj = new SimpleAndCompoundIntrest();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principle");
		double  P = sc.nextDouble();
		System.out.println("Enter Rate");
		double  R= sc.nextDouble();
		System.out.println("Enter Time ");
		double  T = sc.nextDouble();
		
                System.out.println("SI :"+Obj.calSI(P,R,T));
		System.out.println("CI :"+Obj.calCI(P,R,T));
		}
          }