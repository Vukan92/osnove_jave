package d23_08_2022;

public class ZeleniKarton {
//	Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita


	private String imeStundent;
	private String nazivPred;
	private int brojIndeksa;
	private String imeProf;
	private int ocena;
	
	
	public void stampajZK() {
		System.out.println(this.nazivPred + " - " + this.ocena);
		System.out.println("Student: " + this.imeStundent + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeProf);
	}
	
	public ZeleniKarton(String imeStundent, String nazivPred, int brojIndeksa, String imeProf, int ocena) {
		this.imeStundent = imeStundent;
		this.nazivPred = nazivPred;
		this.brojIndeksa = brojIndeksa;
		this.imeProf = imeProf;
		this.ocena = ocena;
	}

	public String getNazivPred() {
		return nazivPred;
	}

	public void setNazivPred(String nazivPred) {
		this.nazivPred = nazivPred;
	}

	public boolean polozio() {
		if(this.ocena > 5) {
			return true;
		}else {
			return false;
		}		
	}
	
	public ZeleniKarton() {
	}
	
	public String getImeStundent() {
		return imeStundent;
	}
	public void setImeStundent(String imeStundent) {
		this.imeStundent = imeStundent;
	}
	public int getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public String getImeProf() {
		return imeProf;
	}
	public void setImeProf(String imeProf) {
		this.imeProf = imeProf;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	
	

}
