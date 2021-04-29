//Java Program to calculate simple interest

public class P19{
	public static void main(String[] args){
		float p = 8000;
		float r = 3;
		float t = 2;
		
		System.out.println(P.problem(p,r,t));
	}
}	

class P{
	static float problem(float p, float r, float t){
		return p*r*t/100;
	}	
}