//Java Program to Find Sum of n Natural Numbers
public class P4{
	public static void main(String[] args){
		int n = 10;
		
		
		System.out.println(P.problem(n));
	}
}	

class P{
	static int problem(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
		}
		return sum;
	}	
}