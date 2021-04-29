//Java Program to make a calculator using switch case
public class P18{
	public static void main(String[] args){
		int a = 8;
		int b = 3;
		char op = '*';
		
		System.out.println(P.problem(a,b,op));
	}
}	

class P{
	static int problem(int a, int b, char op){
		int out = 0;
		switch(op){
			case '+': out = a+b; break;
			case '-': out = a-b; break;
			case '*': out = a*b; break;
			case '/': out = a/b; break;
			case '%': out = a%b; break;
		}
		return out;
	}	
}