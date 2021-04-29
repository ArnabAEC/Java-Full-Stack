//Java Program to calculate compound interest

public class P20{
	public static void main(String[] args){
		double p = 8000;
		double r = 3;
		double t = 2;
		
		System.out.println(P.problem(p,r,t));
	}
}	

class P{
	static double problem(double p, double r, double t){
		return p*Math.pow((1+r/100),t)-p;
	}	
}