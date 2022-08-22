package d22_08_2022;

public class Autor {
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
//

	private String ime;
	private String prezime;
	
	public Autor() {
		
	}
	
	public Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public void printAutor() {
		System.out.println("( " + this.ime + " )" + "( " + this.prezime + " )");
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
}
