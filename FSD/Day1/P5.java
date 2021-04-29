//Java Program to add two complex numbers (complex number: a + bi)
public class P5{
	public static void main(String[] args){
		int x1 = 8;
		int y1 = 26;
		int x2 = 13;
		int y2 = 11;
		
		System.out.println(P.problem(x1,y1,x2,y2));
	}
}	

class P{
	static String problem(int x1, int y1, int x2, int y2){
		return ""+(x1+x2) + " + " + (y1+y2)+"i";
	}	
}