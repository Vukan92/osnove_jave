package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
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
		FacebookPost post = new FacebookPost();
		
		
		post.liked = 10;
		post.shared = 20;
		
		post.imePost = "Vukan Djokic";
		post.imeProfil = "Rambo Amadeus";
		post.tekst = "Rambo, Care! Kupi nam cigare!";
		
		post.print();
		post.like();		
		post.share();
		System.out.println();
		post.print();
		System.out.println();
		
		FacebookPost post1 = new FacebookPost();
		
		
		post1.liked = 1;
		post1.shared = 3;
		
		post1.imePost = "Vukan Djokic";
		post1.imeProfil = "Luna Djokic";
		post1.tekst = "<3";
		
		post1.print();
		post1.dislike();
		post1.dislike();
		post1.share();
		System.out.println();
		post1.print();
		


	}

}
