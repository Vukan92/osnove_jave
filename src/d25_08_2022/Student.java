package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	
	private String brojIndex; 
	private String punoIme;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	
	public void stampajStudent() {
		System.out.println(this.brojIndex + " - " + this.punoIme + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			System.out.println(this.ispiti.get(i).getNaziv() + " - " + this.ispiti.get(i).getPunoImeProf() +
					" - " + this.ispiti.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.prosekOcena());
		
		
	}
	
	public double prosekOcena() {
		double sumaPolozenih = 0;
		int brojPolozenih = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if(ispiti.get(i).getOcena() > 5) {
				sumaPolozenih = sumaPolozenih + ispiti.get(i).getOcena();
				brojPolozenih++;
			}
		}
		  double prosecnaPlozenih = sumaPolozenih / brojPolozenih;
		  return prosecnaPlozenih;
	}
	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public Student() {
		
	}
	
	public Student(String brojIndex, String punoIme, String tipStudija) {
		this.brojIndex = brojIndex;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndex() {
		return brojIndex;
	}

	public void setBrojIndex(String brojIndex) {
		this.brojIndex = brojIndex;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
	
	
}
