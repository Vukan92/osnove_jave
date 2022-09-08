package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	
	protected String punoIme;
	protected ArrayList<Sektor> sektori = new ArrayList<>();
	
	public abstract double plataRadnika();
	
	public void zaposli(Sektor sektor) {
		this.sektori.add(sektor);
	}
	
	
	
}
