package d06_09_2022;

public class Main {

	public static void main(String[] args) {
//		Kreirati abstraktnu klasu Ambalaza koja ima:
//			barkod (primer: 328232-2823)
//			naziv artikla
//			neto tezinu
//			bruto tezinu
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere
//			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//			abstraktnu metodu koja vraca cenu artikla
//			abstraktnu metodu stampaj
//
//			Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//			atribut koji kaze da li se moze reciklirati
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu tako da ispunjava uslova:
//			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//			ako nije u cenu ulazi samo osnovna cena
//			metoda stampaj stampa sve podatke iz klase tetrapak.
//
//			Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//			kaucija za flasu
//			atribut koji kaze da li se za flasu placa kaucija
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu
//			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//			ako se ne placa, (osnovna cena) * 1.2
//			metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//			Kreirati klasu SuperKartica koja ima:
//			broj kartice
//			ime i prezime vlasnika
//			popust (200, 500, … )
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere 
//			metodu stampaj koja stampa karticu u formatu:
//			(broj kartice), (ime i prezime)
//
//			Kreirati klasu Korpa koja ima:
//			niz ambalaza
//			metodu dodaj ambalazu
//			metodu izbaci ambalazu, 
//			u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//			privatnu metodu koja vraca cenu svih ambalaza sa popustom,
//			metoda kao parametar prima popust. 
//			metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//			kao parametar funkcije se prima Super karticu iz koje se cita popust.
//			
//			U glavnom programu kreirati jednu Korpu i
//			u nju dodati nekoliko Ambalaza razlicitih tipova i
//			istestirati sve metode i ispisati ukupnu cenu sa popustom.


		
		Korpa korpa = new Korpa();
		SuperKartica kartica = new SuperKartica("124-5125-636", "Vukan Djokic", 20);
		
		korpa.dodajAmbalazu(new StaklenaAmbalaza("2332324", "Zajecarsko Pivo", 100, 150, 20, true, 50));
		korpa.dodajAmbalazu(new StaklenaAmbalaza("6969324", "Nisko Pivo", 100, 150, 20, false, 30));
		korpa.dodajAmbalazu(new Tetrapak("120580501", "Mleko", 2000, 2500, false, 90));
		korpa.dodajAmbalazu(new Tetrapak("154888501", "Jogurt", 1800, 2000, true, 200));
		korpa.dodajAmbalazu(new Tetrapak("864320501", "Sok", 2000, 2300, true, 120));
		
		korpa.izbaciAmbalazu("154888501");
		kartica.printKarticu();
		System.out.println("U korpi:");
		System.out.println();
		korpa.printKorpu();
		System.out.println();
		System.out.println("Ukupna cena sa Popustom: " + korpa.cenaUkupnaKorpa(kartica));
		
		
		
		
		
		
		
	}

}
