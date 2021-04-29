//Java Program to display odd numbers from 1 to n or 1 to 100
public class P8{
	public static void main(String[] args){
		int x = 8;
	
		
		System.out.println(P.problem(x));
	}
}	

class P{
	static String problem(int x){
		
	for(int i=1; i<=x; i++){
		if(i%2 != 0)
			System.out.print(i + " ");
	} 
	return "";
	}	
}