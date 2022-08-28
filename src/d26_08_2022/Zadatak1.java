package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

		
		
		Igrac i1 = new Igrac(2, "Odbrambeni", true);
		i1.setPunoIme("Vukan Djokic");
		i1.setJmbg("12356664");
		i1.setGodRodj(1992);
		
		Igrac i2 = new Igrac(10, "Napadac", false);
		i2.setPunoIme("Pera Peric");
		i2.setJmbg("1208582925");
		i2.setGodRodj(1988);
		
		Trener t1 = new Trener(7, "Kondicioni");
		t1.setPunoIme("Goran Goranovic");
		t1.setJmbg("123623467");
		t1.setGodRodj(1975);
		
		Trener t2 = new Trener(6, "Pomocni");
		t2.setPunoIme("Stevan Vuckovic");
		t2.setJmbg("9654583838");
		t2.setGodRodj(1965);
		
		i1.printOsoba();
		System.out.println();
		i2.printOsoba();
		System.out.println();
		t1.printOsoba();
		System.out.println();
		t2.printOsoba();
		
		
		
		
		

	}

}
