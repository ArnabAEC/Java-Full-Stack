//Java Program to Check Even or Odd Number
public class P6{
	public static void main(String[] args){
		int x = 8;
	
		
		System.out.println(P.problem(x));
	}
}	

class P{
	static String problem(int x){
		
		if(x%2 == 0)
			return "Even";
		else
			return "Odd";

	}	
}