package h1;

public class H1_main {
	
	public static void main(String[] args) {
		double guthaben=-100.0, monEingang=200.0;
		int rating=-2;
		boolean warnhinweis= true, negativ=false;
		
		//erster Punkt: negativ verändern
		if (guthaben<0) {
			negativ=true;
		} else {
			negativ=false;
		}
		System.out.println("negativ ist "+negativ);
		
		//zweiter Punkt: auf das rating wird der Wert 3 addiert
		if (guthaben>0) {
			rating=rating+3;
		}
		
		//dritter Punkt: auf das rating wird der Wert 2 addiert
		if (guthaben==0) {
			rating= rating+2;
		}
		
		//vierter und fünfter Punkt
		if (guthaben<0) {
			guthaben=-guthaben;
			if (monEingang>=guthaben) {
				rating = rating+1;
			} else {
				rating = rating -1;
			}
		}
		System.out.println("rating ist "+rating);
		
		//Warnhinweis benutzen
		if (guthaben<0) {
			guthaben=-guthaben;
			if (monEingang<guthaben) {
				if (rating<0) {
					warnhinweis=true;
				}
			}
		} else {
			warnhinweis = false;
		}
	System.out.println("Warnhinweis ist "+warnhinweis);
	
	}

}
