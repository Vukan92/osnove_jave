package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
	
	private int IgracBroj;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac() {
		
	}

	public Igrac(int igracBroj, String pozicija, boolean kapiten) {
		super();
		this.IgracBroj = igracBroj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getIgracBroj() {
		return IgracBroj;
	}

	public void setIgracBroj(int igracBroj) {
		IgracBroj = igracBroj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	@Override
	public void printOsoba() {
		super.printOsoba();
		System.out.println("Broj: " + this.IgracBroj);
		System.out.println("Pozicija: " + this.pozicija);
		System.out.println("Kapiten: " + this.kapiten);
	}
	
	
	
}
