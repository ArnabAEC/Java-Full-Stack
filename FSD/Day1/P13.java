//Java Program to reverse a number
public class P13{
	public static void main(String[] args){
		int a = 8554;

		System.out.println("Number: " + a + " \nReverse Number: " + P.problem(a));
	}
}	

class P{
	static int problem(int a){
		int rev = 0;		
		for( ; a!=0; a/=10){
			rev = rev*10 + a%10;
		}
		return rev;
	}	
}