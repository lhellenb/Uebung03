package h2;

public class H2_main {
	
	public static void main(String[] args) {
		int jahr =800;
		boolean schalt = true;
		
		if (jahr%4==0) {
			schalt=true;
			if (jahr%100 == 0) {
				schalt=false;
				if (jahr%400 ==0) {
					schalt=true;
				}
			}
		} else {
			schalt=false;
		}
		
		if (schalt == true) {
			System.out.println("Folgendes Jahr ist ein Schaltjahr: "+jahr);
		} else {
			System.out.println("Folgendes Jahr ist kein Schaltjahr: "+jahr);
		}
	}
	 
}
