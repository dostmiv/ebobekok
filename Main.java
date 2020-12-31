//print prime numbers from one to a thousand
public class Main{
	
public static boolean isprime (int a) {
		
		for (int b = 2 ; b < a/2 ; b++) {
			if (a % b == 0)
				return false;
			
		}
		return true;
}


public static void main (String [] Args) {
	
	for (int i=2 ; i <= 1000 ; i++) {
		if (isprime(i))
			System.out.println(i);
	}
}
}