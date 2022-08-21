package d19_08_2022;

public class FacebookPost1 {
//	Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post
//	(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, 
//	korisnika na kom je profilu objavnljen i tekst objave
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
	
	private String imePost;
	private String imeProfil;
	private String tekst;
	private int liked;
	private int shared;
	
	public FacebookPost1() {	
	}
	
	public FacebookPost1(String imePost, String imeProfil, String tekst) {
		this.imePost = imePost;
		this.imeProfil = imeProfil;
		this.tekst = tekst;
	}
	public void like() {
		this.liked = this.liked + 1;
	}
	public void dislike() {
		while(this.liked != 0) {
		this.liked = this.liked - 1;
		}
	}
	public void share() {
		this.shared = this.shared + 1;
	}
	public void print() {
		System.out.println(this.imePost + " >>>> " + this.imeProfil);
		System.out.println(this.tekst);
		System.out.println("Likes: " + this.liked + " | Shares :" + this.shared);
	}
	
	
}
