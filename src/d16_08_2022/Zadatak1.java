package d16_08_2022;


public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu 
//		u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod p = new Proizvod();
		p.naziv = "Ugalj";
		p.cena = 1456;
		p.tezina = 12000;
		
		p.stampaj();
		System.out.println("Tezina " + p.naziv + "-a u t je " + p.konvertuj("t"));
		System.out.println("Tezina " + p.naziv + "-a u kg je " + p.konvertuj("kg"));
		
		Proizvod p1 = new Proizvod();
		p1.naziv = "Svila";
		p1.cena = 2000;
		p1.tezina = 2000;
		
		p1.stampaj();
		System.out.println("Tezina " + p1.naziv + " u t je " +p1.konvertuj("t"));
		System.out.println("Tezina " + p1.naziv + " u kg je " +p1.konvertuj("kg"));
	
		
		
	}

}
