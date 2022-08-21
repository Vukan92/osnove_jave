package d19_08_2022;

import d18_08_2022.FacebookPost;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio, 
//			korisnika na kom je profilu objavnljen i tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1

		
		FacebookPost1 post = new FacebookPost1("Vukan Djokic", "IT Bootcamp", "Pozdrav ljudi!");
		
		post.print();
		post.like();		
		post.share();
		post.like();
		post.like();
		System.out.println();
		post.print();
		System.out.println();
		
		FacebookPost1 post1 = new FacebookPost1("Vukan Djokic", "Milan Jovanovic", "Kada ce biti rezultati test?");
		
		post1.print();
		post1.like();
		post1.dislike();
		post1.dislike();
		post1.share();
		post1.share();
		post1.share();
		System.out.println();
		post1.print();

	}

}
