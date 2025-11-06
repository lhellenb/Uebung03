package p3;

public class P3_main {
	
	public static void main(String[] args) {
		int a=-4;

		if (a<0) {
			a=-a;
		}
		System.out.println(a);
		
		a=a*a; 
		System.out.println(a);
		
		if (a%2 == 0) {
			System.out.println("Die Zahl ist eine gerade Zahl");
		} else if (a%2==1) {
			System.out.println("Die Zahl ist eine ungerade Zahl");
		}

	}

}
