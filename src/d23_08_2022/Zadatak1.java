package d23_08_2022;

import java.util.ArrayList;

import p22_08_2022.Korisnik;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		ArrayList<ZeleniKarton> spisak = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton k1 = new ZeleniKarton("Vukan Djokic", "Srpski jezik", 1012, "Jorgovanka Aleksic", 9);
		ZeleniKarton k2 = new ZeleniKarton("Vukan Djokic", "Engleski jezik", 1012, "Mitar Miric", 10);
		ZeleniKarton k3 = new ZeleniKarton("Vukan Djokic", "Spanski jezik", 1012, "Jovan Jovanovic", 8);
		ZeleniKarton k4 = new ZeleniKarton("Vukan Djokic", "Arapski jezik", 1012, "Marko Markovic", 6);
		ZeleniKarton k5 = new ZeleniKarton("Vukan Djokic", "Kineski jezik", 1012, "Nikola Nikolic", 5);
		ZeleniKarton k6 = new ZeleniKarton("Vukan Djokic", "Japanski jezik", 1012, "Aleksa Aleksic", 7);
		ZeleniKarton k7 = new ZeleniKarton("Vukan Djokic", "Bugarski jezik", 1012, "Petar Petrovic", 5);
		ZeleniKarton k8 = new ZeleniKarton("Vukan Djokic", "Turski jezik", 1012, "Jusuf Kajgani", 6);
		ZeleniKarton k9 = new ZeleniKarton("Vukan Djokic", "Rumunski jezik", 1012, "Milan Milanovic", 5);
		ZeleniKarton k10 = new ZeleniKarton("Vukan Djokic", "Italijanski jezik", 1012, "Ignjat Lucic", 7);
		
		
		
		
		
		spisak.add(k1);
		spisak.add(k2);
		spisak.add(k3);
		spisak.add(k4);
		spisak.add(k5);
		spisak.add(k6);
		spisak.add(k7);
		spisak.add(k8);
		spisak.add(k9);
		spisak.add(k10);
		
		for (int i = 0; i < spisak.size(); i++) {
			spisak.get(i).stampajZK();
			System.out.println();
		}
		double sumSvihOcena = 0;
		for (int i = 0; i < spisak.size(); i++) {
			sumSvihOcena = sumSvihOcena + spisak.get(i).getOcena();
		}
		double prosecnaOcena = sumSvihOcena / spisak.size();
		System.out.println("Prosecna ocena je:" + prosecnaOcena);
		
		
		double sumaPolozenih = 0;
		int brojPolozenih = 0;
		for (int i = 0; i < spisak.size(); i++) {
			if(spisak.get(i).getOcena() > 5) {
				sumaPolozenih = sumaPolozenih + spisak.get(i).getOcena();
				brojPolozenih++;
			}
			
		}
		double prosecnaPlozenih = sumaPolozenih / brojPolozenih;
		System.out.println("Prosecna ocena polozenih ispita je: " + prosecnaPlozenih);
		
		
	}
		
}
