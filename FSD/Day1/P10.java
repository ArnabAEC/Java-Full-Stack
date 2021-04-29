//Java Program to check whether character is vowel or consonant
public class P10{
	public static void main(String[] args){
		char x = 'A';
	
		
		System.out.println(P.problem(x));

		x = 'z';
	
		
		System.out.println(P.problem(x));
	}
}	

class P{
	static String problem(char x){
		
	
	switch(x){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Vowel");
		break;
		default:
		System.out.println("Consonant");
	}
	 
	return "";
	}	
}