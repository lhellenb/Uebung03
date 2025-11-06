package p1;

public class P1_main {
	public static void main(String[] args) {
		int wuerfel=3;
		
		if (wuerfel == 1) {
			System.out.println("Sie haben gewonnen!");
		}
		else if (wuerfel == 4) {
			System.out.println("Sie haben gewonnen!");
		}
		else if (wuerfel == 2) {
			System.out.println("Sie haben verloren!");
		}
		else if (wuerfel == 5) {
			System.out.println("Es ist unentschieden!");
		}
		else {
			System.out.println("Die Lage ist unklar");
		}
	}
}
