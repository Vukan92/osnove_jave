package d26_08_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
	
	
	
	
	private int godIskustva;
	private String tipTrenera;
	
	
	
	public Trener(int godIskustva, String tipTrenera) {
		super();
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
	}



	@Override
	public void printOsoba() {
		super.printOsoba();
		System.out.println("Godine iskustva: " + this.godIskustva);
		System.out.println(this.tipTrenera + " trener.");
	}
}
