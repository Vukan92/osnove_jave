package d06_09_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
	
	private String brojKartice;
	private String punoIme;
	private double popust;
	
	
	public SuperKartica() {
		super();
	}
	public SuperKartica(String brojKartice, String punoIme, double popust) {
		super();
		this.brojKartice = brojKartice;
		this.punoIme = punoIme;
		this.popust = popust;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getPopust() {
		return popust;
	}
	public void setPopust(double popust) {
		this.popust = popust;
	}
	public void printKarticu() {
		System.out.println(this.brojKartice + ", " + this.punoIme);
	}
}
