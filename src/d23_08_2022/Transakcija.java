package d23_08_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
	
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1% 
//S obzirom da se provizija racuna na osnovu visine transakcije,
//znaci da metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju 
//racunajte fiksnu proviziju u vrednosti od 45.
	
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//a na drugi racun dodaje samo (trazena suma).
	
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
//
//Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
	
	private String id;
	private Racun racunSlanje;
	private Racun racunPrimanje;
	
	public void stampajTransakciju() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.racunSlanje.getPunoIme() + " - " + this.racunSlanje.getBrojRacuna());
		System.out.println("Racun na: " + this.racunPrimanje.getPunoIme() + " - " + this.racunPrimanje.getBrojRacuna());
	}
	
	
	public void izvrsiTransakciju(double sumaTransfer) {
		
		this.racunPrimanje.stanjeRacuna(sumaTransfer);
		this.racunSlanje.stanjeRacuna(-(sumaTransfer + this.provizija(sumaTransfer)));
		
	}
	
//	public double izvrsiTransakciju(double sumaTransfer) {
//		if(this.racunSlanje.getTrenutnoStanje() > sumaTransfer) {
//		 = this.racunSlanje.getTrenutnoStanje() - (sumaTransfer + this.provizija(sumaTransfer));
//		  = this.racunPrimanje.getTrenutnoStanje() + sumaTransfer;
//		}
//		
//	}

	
	private double provizija(double sumaTransfer) {
		if( sumaTransfer < 4500) {
			return 45;
		}else {
			return (sumaTransfer / 100) * 1;
		}
	}
	
	public Transakcija() {
		
	}
	
	public Transakcija(String id, Racun racunSlanje, Racun racunPrimanje) {
		this.id = id;
		this.racunSlanje = racunSlanje;
		this.racunPrimanje = racunPrimanje;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Racun getRacunSlanje() {
		return racunSlanje;
	}
	public void setRacunSlanje(Racun racunSlanje) {
		this.racunSlanje = racunSlanje;
	}
	public Racun getRacunPrimanje() {
		return racunPrimanje;
	}
	public void setRacunPrimanje(Racun racunPrimanje) {
		this.racunPrimanje = racunPrimanje;
	}
	
	
}
