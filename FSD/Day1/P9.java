//Java Program to check Leap Year
/*    To determine whether a year is a leap year, follow these steps:
        1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4. The year is a leap year (it has 366 days).
        5. The year is not a leap year (it has 365 days).*/
public class P9{
	public static void main(String[] args){
		int yr = 1986;

		System.out.println("Year: " + yr + " is " + P.problem(yr));
		yr = 2004;

		System.out.println("Year: " + yr + " is " + P.problem(yr));		
	}
}	

class P{
	static String problem(int yr){
		
		if(yr%4 == 0){
			if(yr%100 == 0){
				if(yr%400 == 0)
					return "a leap year, and has 366 days.";
				else
					return "not a leap year, and has 365 days.";
			}
			else
				return "a leap year, and has 366 days.";
		}
		else
			return "not a leap year, and has 365 days.";
	}	
}