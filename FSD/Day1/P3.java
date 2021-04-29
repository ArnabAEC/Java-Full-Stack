//Java Program to check if a number is Positive or Negative
public class P3{
	public static void main(String[] args){
		int a = 8;
		//int b = 26;
		
		System.out.println(P.problem(a));
	}
}	

class P{
	static String problem(int a){
		if(a>0)
			return "Positive";
		else if(a<0)
			return "Negetive";
		else 
			return "Zero";
	}	
}