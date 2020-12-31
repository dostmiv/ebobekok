public class Main {
	public static int ekok (int a, int b) { //en kucuk ortak kat  12  7  = A
		int ekok ;
		if (a >= b)
			ekok = a;
		else 
			ekok = b;
		while(true) {
		if(ekok % a == 0 && ekok % b == 0){
			return ekok;
		}
		else 
			ekok++;
		}
	}
	
	public static int ebob (int a , int b) { // en buyuk ortak bolen 15 10 = 5
		int ebob = 0;
		if (a >= b) {
			for (int i = 1; i<=b ; i++) {
				if (a%i == 0 && b%i == 0)
					ebob = i;
			}
		}
		else if (b >= a) {
			for (int i = 1; i<=a ; i++) {
				if (a%i == 0 && b%i == 0)
					ebob = i;
			}
		}
		if (ebob == 1)
			System.out.print("there is no available ebob for those values. = ");
		return ebob;
	}
	
	public static void main (String [] Args) {
		System.out.println(ebob(10,4));
		System.out.println(ekok(65,3));
	}
}