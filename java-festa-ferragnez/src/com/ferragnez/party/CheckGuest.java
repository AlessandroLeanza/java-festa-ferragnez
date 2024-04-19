//creare e inizializzare l’array contenente i nomi degli invitati chiedere all’utente 
//come si chiama e  verificare che il nome sia presente nella lista; 
//lasciarlo entrare o rispedirlo cortesemente da dove è venuto
//Bonus se avete usato il ciclo for per cercare il nome nella lista nella consegna base,
//implementare lo stesso programma usando il ciclo while, e viceversa 
//Buon lavoro e buon weekend! Lista invitati: 
//	Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio,
//	Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		String[] nomiInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
				"Francesco Totti", "Ilary Blasi", "Bebe Vio","Luis", "Pardis Zarei",
				"Martina Maccherone", "Rachel Zeilic"};
		
		System.out.println("Inserisci un nome:");
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		boolean presente = false;
		for (int i = 0; i < nomiInvitati.length; i++) {
			if(nome.contains(nomiInvitati[i])) {
				presente = true;
			}
		}
		if (presente) {
			System.out.println("Puoi partecipare alla festa");
		} else {
			System.out.println("Il tuo nome non è nella lista degli invitati");
		}
	}
}
