package p2;

public class P2_main {
	
	public static void main(String[] args) {
		int a=1, b=2, c=3, d=4;
		
		d=0;
		
		//Eigenschaft E1
		if (a==b) {
			d=d+1;
		}
		//Eigenschaft E2
		if (a==b) {
			d=d+1;
		}
		else if (a==c) {
			d=d+1;
		}
		//Eigenschaft E3
		if (b+a>=c) {
			d=d+1;
		}
		//Eigenschaft E4
		if (a+b+c>=100) {
			d=d+1;
		}
	}

}
