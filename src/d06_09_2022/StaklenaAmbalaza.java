package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private double kaucija;
	private boolean placaKaucija;
	private double osnovnaCena;
	
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacaKaucija() {
		return placaKaucija;
	}
	public void setPlacaKaucija(boolean placaKaucija) {
		this.placaKaucija = placaKaucija;
	}
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina,
			double brutoTezina, double kaucija, boolean placaKaucija, double osnovnaCena) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
		this.kaucija = kaucija;
		this.placaKaucija = placaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	public StaklenaAmbalaza() {
		super();
	}
	public String kaucija() {
		return(this.placaKaucija) ? "Da" : "Ne";
	}
	@Override
	public double cenaArtikla() {
		if(this.placaKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}else {
			return this.osnovnaCena * 1.2;
		}
	}
	@Override
	public void print() {
		System.out.println("Staklo: " + this.naziv);
		System.out.println(this.barkod);
		System.out.println("Tezina: " + this.tezinaPakovanja() + "g");
		System.out.println("Da li se placa kaucija: " + this.kaucija());
		if(this.placaKaucija) {
		System.out.println("Cena kaucije: " + this.kaucija);
		}
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		System.out.println("Ukupno:" + this.cenaArtikla());
		System.out.println();
		
	}
}
