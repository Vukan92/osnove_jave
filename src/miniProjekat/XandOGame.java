package miniProjekat;

import java.util.ArrayList;

public class XandOGame extends Player {

//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor 
//	radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace
//	Metodu print koja stampa tablu sliku kao na slici. 
//	Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |
//
//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ 
//	i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i
//	poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
//	x | x | 0 |
//	0 |   |   |
//	x |   |   |
//	I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//	x | x | 0 |
//	0 |   | x |
//	x |   |   |
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. 
//	Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O.
//	Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isigracidMove koja vraca informaciju da li je 
//	pozicija na koju igrac zeli da odigra potez igracidna. Pozicija je igracidna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0
	

	
	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;
	
	
	


	public XandOGame() {
		for (int i = 0; i <= 8; i++) {
			this.table.add(" ");
		}
	}
	
	public XandOGame(Player playerX, Player playerO) {
		this.playerX = playerX;
		this.playerO = playerO;
		for (int i = 0; i <= 8; i++) {
			this.table.add(" ");
		}
	}
	

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
	
	public void printTablu() {
		for (int i = 0; i <= 8; i++) {
			System.out.print(this.table.get(i) + " | ");
			if (i == 2 || i == 5 || i == 8) {
				System.out.println();
			}
				
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public void startGame() {
		for (int i = 0; i < 9; i++) {
			this.table.set(i, " ");
			this.nextPlayer = "x";
		}
	}
		
	public boolean isGameOver() {
		int brojac = 0;
		for (int i = 0; i <= 8; i++) {
			if(this.table.get(i).equals("x") || this.table.get(i).equals("0")) {
				brojac++;
			}
		}
		return brojac == 9;
	}
	
	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		return this.table.get(pozicija).equals(" ");

		
	}
	
	public void playNext() {
		this.nextPlayer = this.nextPlayer.equals("x") ? "0" : "x";

	}
	
	public void makeAMove(int pozicija) {
		this.table.set(pozicija, this.nextPlayer);

		}
	public boolean isWinner(String igrac) {
		if(this.table.get(0).equals(igrac) && this.table.get(1).equals(igrac) && this.table.get(2).equals(igrac)) {
			return true;
		}else if(this.table.get(3).equals(igrac) && this.table.get(4).equals(igrac) && this.table.get(5).equals(igrac)) {
			return true;
		}else if(this.table.get(6).equals(igrac) && this.table.get(7).equals(igrac) && this.table.get(8).equals(igrac)) {
			return true;
		}else if(this.table.get(0).equals(igrac) && this.table.get(3).equals(igrac) && this.table.get(6).equals(igrac)) {
			return true;
		}else if(this.table.get(1).equals(igrac) && this.table.get(4).equals(igrac) && this.table.get(7).equals(igrac)) {
			return true;
		}else if(this.table.get(2).equals(igrac) && this.table.get(5).equals(igrac) && this.table.get(8).equals(igrac)) {
			return true;
		}else if(this.table.get(0).equals(igrac) && this.table.get(4).equals(igrac) && this.table.get(8).equals(igrac)) {
			return true;
		}else if(this.table.get(2).equals(igrac) && this.table.get(4).equals(igrac) && this.table.get(6).equals(igrac)) {
			return true;
		}
		return false;
	}
	public boolean isWinnerX() { 
		return this.isWinner("x");
	}
	public boolean isWinner0() { 
		return this.isWinner("0");
	}


	public boolean isValidMove(int pozicija) {
		return pozicija >= 0 && pozicija <= 8;
		
	}
	
	public int gameScore() {
		if(this.isWinnerX()) {
			return 1;
		}
		if(this.isWinner0()) {
			return 2;
		}
		return 0;
	}

	
}
