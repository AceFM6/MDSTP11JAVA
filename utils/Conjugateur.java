package mds.b3.tp.tp11.utils;

import java.util.List;

public class Conjugateur {
	
	public static void conjugueAvecSaisi(List<String> verbes) {
		
		if(verbes.isEmpty()) {
			System.out.println("Pas de verbes à conjugater");
		} else {
			for(String verbe: verbes) {
					String str = verbe;
					str = str.substring(0, str.length() - 2);
					System.out.println("verbe conjugater : " + verbe);
					System.out.println("je " + str + "e");
					System.out.println("tu " + str + "es");
					System.out.println("il/elle " + str + "e");
					System.out.println("nous " + str + "ons");
					System.out.println("vous " + str + "ez");
					System.out.println("ils/elles " + str + "ent\n");
			}
		}
	}
	
	
	
}
