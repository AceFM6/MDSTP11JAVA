package mds.b3.tp.tp11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mds.b3.tp.tp11.utils.Conjugateur;

public class Tp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> verbesDur = new ArrayList<String>();
		verbesDur.add("manger");
		verbesDur.add("parler");
		verbesDur.add("partager");
		Conjugateur.conjugueAvecSaisi(verbesDur);
		
		boolean saisi = false;
		Scanner sc = new Scanner(System.in);
		String str = "";
		List<String> verbes = new ArrayList<String>();
		
		while(!saisi) {
			System.out.println("entrez un verbe du premier groupe non irrégulier");
			str = sc.nextLine();
			if(str.length() <  2) {
				System.out.println("verbe trop court");
			} else {
				verbes.add(str);
				Conjugateur.conjugueAvecSaisi(verbes);
				saisi = true;
			}
			
			
			
		}
		sc.close();
		
	}

}
