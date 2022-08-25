package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)
		
		Student student = new Student("1012", "Vukan Djokic", "Master");
		
		
		Ispit i1 = new Ispit("Srpski Jezik", 6, "Mladen Mladenovic");
		Ispit i2 = new Ispit("Engleski Jezik", 7, "Ognjen Ognjenovic");
		Ispit i3 = new Ispit("Ruski Jezik", 8, "Marko Markovic");
		Ispit i4 = new Ispit("Cheski Jezik", 5, "Milan Milanovic");
		Ispit i5 = new Ispit("Poljski Jezik", 8, "Dejan Dejanovic");
		Ispit i6 = new Ispit("Francuski Jezik", 5, "Petar Petrovic");
		
		student.dodajIspit(i1);
		student.dodajIspit(i2);
		student.dodajIspit(i3);
		student.dodajIspit(i4);
		student.dodajIspit(i5);
		student.dodajIspit(i6);
		
		student.stampajStudent();
		
		
	}

}
