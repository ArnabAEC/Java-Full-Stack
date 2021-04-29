//Java Program to swap two numbers using bitwise operator
public class P15{
	public static void main(String[] args){
		int a = 855;
		int b = 332;

		System.out.println("Before Swap");
		System.out.println("a: "+a +" b: "+b);
		a = a^b;
		b = a^b;
		a = a^b;

		System.out.println("After Swap");
		System.out.println("a: "+a +" b: "+b);
		return;
	}
}	