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
//	Metodu isValidMove koja vraca informaciju da li je 
//	pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
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
		for (int i = 0; i <= 2; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println();
		for (int i = 3; i <= 5; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println();
		for (int i = 6; i <= 8; i++) {
			System.out.print(this.table.get(i) + " | ");
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
		return (brojac == 9) ? true : false;
	}
	
	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		return (this.table.get(pozicija).equals(" ")) ? true : false;
		
	}
	
	public void playNext() {
		if(this.nextPlayer.equals("x")) {
			this.nextPlayer = "0";
		} else if (this.nextPlayer.equals("0")) {
			this.nextPlayer = "x";
		}
	}
	
	public void makeAMove(int pozicija) {
		if(this.nextPlayer.equals("x")) {
		this.table.set(pozicija, "x");
		}
		if(this.nextPlayer.equals("0")) {
			this.table.set(pozicija, "0");
			}
		}
	
	public boolean isWinnerX() {
		if(this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")) {
			return true;
		}else if(this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")) {
			return true;
		}else if(this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}else if(this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")) {
			return true;
		}else if(this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")) {
			return true;
		}else if(this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}else if(this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")) {
			return true;
		}else if(this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		}else return false;
	}
	
	public boolean isWinner0() {
		if(this.table.get(0).equals("0") && this.table.get(1).equals("0") && this.table.get(2).equals("0")) {
			return true;
		}else if(this.table.get(3).equals("0") && this.table.get(4).equals("0") && this.table.get(5).equals("0")) {
			return true;
		}else if(this.table.get(6).equals("0") && this.table.get(7).equals("0") && this.table.get(8).equals("0")) {
			return true;
		}else if(this.table.get(0).equals("0") && this.table.get(3).equals("0") && this.table.get(6).equals("0")) {
			return true;
		}else if(this.table.get(1).equals("0") && this.table.get(4).equals("0") && this.table.get(7).equals("0")) {
			return true;
		}else if(this.table.get(2).equals("0") && this.table.get(5).equals("0") && this.table.get(8).equals("0")) {
			return true;
		}else if(this.table.get(0).equals("0") && this.table.get(4).equals("0") && this.table.get(8).equals("0")) {
			return true;
		}else if(this.table.get(2).equals("0") && this.table.get(4).equals("0") && this.table.get(6).equals("0")) {
			return true;
		}else return false;
	}
	

	public boolean isValidMove(int pozicija) {
		return (pozicija >= 0 && pozicija <= 8) ? true : false;
		
	}
	
	public int gameScore() {
		if(this.isWinnerX() == true) {
			return 1;
		}
		if(this.isWinner0() == true) {
			return 2;
		}
		return 0;
	}

	
	

	


	
	
	
	
	
	
	
}
