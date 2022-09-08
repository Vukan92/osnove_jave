package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//			postaviti sektore u kojima rade i ispisati platu za svakog
		
		Menadzer menadzer = new Menadzer();
		menadzer.zaposli(new Sektor("Poljoprivreda",100000));
		menadzer.zaposli(new Sektor("Turizam", 70000));
		
		Magacioner magacioner = new Magacioner();
		magacioner.zaposli(new Sektor("Gradjevinstvo", 150000));
		magacioner.zaposli(new Sektor("Saobracaj", 110000));
		
		System.out.println("Plata Magacionera: " + magacioner.plataRadnika());
		System.out.println();
		System.out.println("Plata Menadzera: " + menadzer.plataRadnika());
		
		
		
		

	}

}
