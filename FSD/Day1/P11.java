//Java Program to find quotient and remainder
public class P11{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		
		System.out.println(P.problem(a,b));
	}
}	

class P{
	static String problem(int a, int b){
		int q = a/b;
		int r = a%b;
		return "Qutient: "+q+" , Remainder: "+r;
	}	
}