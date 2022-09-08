package d06_09_2022;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean reciklaza;
	private double cenaOsnovna;
	
	public boolean isReciklaza() {
		return reciklaza;
	}
	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}
	public double getCenaOsnovna() {
		return cenaOsnovna;
	}
	public void setCenaOsnovna(double cenaOsnovna) {
		this.cenaOsnovna = cenaOsnovna;
	}
	public Tetrapak() {
		super();
	}
	public Tetrapak(String barkod, String naziv, double netoTezina, 
			double brutoTezina, boolean reciklaza, double cenaOsnovna) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
		this.reciklaza = reciklaza;
		this.cenaOsnovna = cenaOsnovna;
	}
	public String reciklirano() {
		return (this.reciklaza) ? "Recyclable" : "Non-recyclable";
	}
	@Override
	public double cenaArtikla() {
		if(this.reciklaza) {
			return this.tezinaPakovanja() * 1.5 + this.cenaOsnovna;
		} else {
			return this.cenaOsnovna;
		}
	}
	@Override
	public void print() {
		System.out.println("Tetrapak: " + this.naziv);
		System.out.println(this.barkod);
		System.out.println("Tezina: " + this.tezinaPakovanja() + "g");
		System.out.println("Osnovna cena:" + this.cenaOsnovna);
		System.out.println(this.reciklirano());
		System.out.println("Ukupno:" + this.cenaArtikla());
		System.out.println();
	}
}
