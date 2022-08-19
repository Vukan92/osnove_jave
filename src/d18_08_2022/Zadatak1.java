package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//		Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina
//		da se proizvod šalje preko kurirske sluzbe. 
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		
		Proizvod roba = new Proizvod();
		
		roba.naziv = "Kackavalj";
		roba.cena = 1000;
		roba.tezina = 550;
		
		roba.stampaj();
		roba.povecajCenu(100);
		System.out.println("Nova cena proizvoda je: " + roba.cena);
		System.out.println("Cena sa popustom je: " + roba.vratiCenuSaPopustom(30));
		System.out.println("Postarina je: " + roba.racunajPostarinu() + "din");
		System.out.println();
		Proizvod roba1 = new Proizvod();
		
		roba1.naziv = "Gitarska pedala";
		roba1.cena = 30000;
		roba1.tezina = 2000;
		
		roba1.stampaj();
		roba1.povecajCenu(200);
		System.out.println("Nova cena proizvoda je: " + roba1.cena);
		System.out.println("Cena sa popustom je: " + roba1.vratiCenuSaPopustom(50));
		System.out.println("Postarina je: " + roba1.racunajPostarinu() + "din");
		
		
	}

}
