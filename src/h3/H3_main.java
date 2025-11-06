package h3;

public class H3_main {
	
	public static void main(String[] args) {
		int max=5, fix=2, wartend=2;
		boolean istVoll=true;
		
		if (fix<max) {
			istVoll=false;
		} else {
			istVoll = true;
		}
		
		if (fix<max) {
			if (wartend>max-fix) {
				wartend=wartend-(max-fix);
				fix=fix+(max-fix);
				istVoll=true;
			} else {
				fix=fix+wartend;
				istVoll=false;
				wartend=0;
			}
		}
		else {
			istVoll=true;
		}
		System.out.println("Die maximale Kapazität des Kurses ist: "+max);
		System.out.println("So viele Menschen haben einen Fixplatz erhalten: "+fix);
		System.out.println("Der Kurs ist voll: "+istVoll);
		System.out.println("So viele Menschen sind noch auf der Warteliste: "+wartend);
	}

}
