//Java Program to find largest of three numbers using ternary operator
public class P17{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		int c = 16;
		
		System.out.println(P.problem(a,b,c));
	}
}	

class P{
	static int problem(int a, int b, int c){
		int max = (a>b) ? (a>c ? a : c)	: (b>c ? b : c);
		return max;
	}	
}