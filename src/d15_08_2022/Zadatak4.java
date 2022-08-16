package d15_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
//			Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan
//			kao parametre metode.Metoda nista ne vraca.
		
		
//		Nisam siguran da li je potreban skener pa sam uradio ovako
		
		licniPodaci("1207992750019", "Vukan", "Djokic", "1992", true);
		

	}
	public static void licniPodaci(String jmbg, String ime, String prezime, String godRodjenja, boolean aktivan) {

		System.out.println("JMBG:" + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}
}
