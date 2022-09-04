package miniProjekat;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {
//		Kreirati klasu Player koja ima:
//			ime i prezime
//			gettere i settere
//			konstuktore
//			metodu print, koja stampa ime i prezime igraca
//
//			Kreirati klasu XandOGame koja ima:
//			table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//			nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//			playerX - igrac X
//			playerO - igrac O
//			Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//			Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//			gettere i settere za igrace
//			Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//			x | x | 0 |
//			0 | x | 0 |
//			x | 0 | x |
//
//			Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//			Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//			Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//			Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//			Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//			Ako je trenutno stanje u igri i sledeci na redu je igrac x
//			x | x | 0 |
//			0 |   |   |
//			x |   |   |
//			I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//			x | x | 0 |
//			0 |   | x |
//			x |   |   |
//			Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//			Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//			Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//			Metodu gameScore, metoda vraca informaciju za kraj igre.
//			Ukoliko je pobednik igrac x, metoda vraca 1
//			Ukoliko je pobednik igrac o, metoda vraca 2
//			Ukoliko nemam pobednika vracamo 0
//
//
//			Glavni program (main):
//			Ucitati podatke za igrace
//			Kreirajte objekat klase XandOGame 
//			Startujte igru, tada je na potezu igrac X
//			Saveti za dobar zadatak
//			Igra treba da traje dok (while petlja)
//			nije kraj igre - imamo metodu za to
//			Ili dok ne dobijemo pobednika
//			U petlji
//			Trazimo od aktuelnog igraca da unese potez
//			Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//			Prebacujemo red na drugog igraca
//			Stampamo tablu
//			Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//			Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

		Scanner s = new Scanner(System.in);
		Player x = new Player("Vukan Djokic");
		Player o = new Player("Pera Peric");
		XandOGame igra = new XandOGame();
		int igracX = 0;
		int igrac0 = 0;
		int draw = 0;
//		Odlucio sam se da dodam brojace za pracenje rezultata i broj partija koje igraci zele da odigraju
		System.out.println("Unesi broj partija:");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
		igra.startGame();
		System.out.println("NOVA PARTIJA:");
		System.out.println();
		igra.printTablu();
		while(igra.isGameOver() == false && igra.isWinner0() == false && igra.isWinnerX() == false) {
			
			System.out.println("Unesi poziciju(0-8):");
			int pozicija = s.nextInt();
			if(igra.isValidMove(pozicija) == true && igra.isFieldFree(new ArrayList<String>(), pozicija) == true) {
			igra.makeAMove(pozicija);
			igra.playNext();
			igra.printTablu();
			} else {
				System.out.println("You entered invalid position.");
				System.out.println();
			}
	}
		igra.printTablu();
		if(igra.gameScore() == 1) {
			igracX++;
		}
		if(igra.gameScore() == 2) {
			igrac0++;
		}
		if(igra.gameScore() == 0) {
			draw++;
		}
		System.out.println("Kraj Igre");
		System.out.println();
		if(igra.gameScore() == 1) {
			System.out.println("Pobednik je:" + x.punoIme);
		}
		if(igra.gameScore() == 2) {
			System.out.println("Pobednik je:" + o.punoIme);
		}
		if(igra.gameScore() == 0) {
			System.out.println("Nema pobednika");
		}
		igra.printTablu();
		System.out.println();
		System.out.println("Rezultat je :" );
		x.printPlayer();
		System.out.println(": " + igracX);
		o.printPlayer();
		System.out.println(": " + igrac0);
		System.out.println("Nereseno:" + draw);
		System.out.println();
		System.out.println();

		
		}	
		s.close();

			
		
		
	
	
		
		
		
	}

}
