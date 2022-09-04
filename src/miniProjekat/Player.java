package miniProjekat;

public class Player {

//	Kreirati klasu Player koja ima:
//		ime i prezime
//		gettere i settere
//		konstuktore
//		metodu print, koja stampa ime i prezime igraca

	
	protected String punoIme;

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}
	
	public Player() {
	}
	
	public void printPlayer() {
		System.out.print(this.punoIme);
	}
}
