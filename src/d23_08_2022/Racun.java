package d23_08_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//	broj racuna (npr: 170-289328923-23)
//	ime i prezime osobe
//	trenutno stanje na racunu (npr: 100, 1220)
//	gettere i setter za sve atribute, sem settera za stanje na racunu
//	metodu koja menja stanje na racunu za prosledjenu vrednost 
//	(stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.
	
	private String brojRacuna;
	private String punoIme;
	private double trenutnoStanje;
	
	
	public Racun(String brojRacuna, String punoIme, double trenutnoStanje) {
		this.brojRacuna = brojRacuna;
		this.punoIme = punoIme;
		this.trenutnoStanje = trenutnoStanje;
	}
	public Racun() {
		
	}
	
	public double stanjeRacuna(double vrednost) {
			 return this.trenutnoStanje = this.trenutnoStanje + vrednost;
		}

	public void stampaRacun() {
		System.out.println(this.punoIme + " - " + brojRacuna);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + "rsd.");
	}
	
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	
	
	
	
	
	
}
