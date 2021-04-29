//Java Program to find Largest of three numbers
public class P14{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		int c = 16;
		
		System.out.println(P.problem(a,b,c));
	}
}	

class P{
	static int problem(int a, int b, int c){
		if(a>b)
			if(a>c)
				return a;
			else
				return c;
		else
			if(b>c)
				return b;
			else
				return c;		
	}	
}