//Java Program to calculate power of a number
public class P12{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		
		System.out.println(P.problem(a,b));
	}
}	

class P{
	static int problem(int a, int b){
		int pow = 1;
		for(int i=1; i<=b; i++){
			pow *= a;
		}
		return pow;
	}	
}