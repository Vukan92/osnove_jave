package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Autor autor1 = new Autor("Vojislav", "Šešelj");
		Knjiga knjiga1 = new Knjiga("9788678861277", "Raspamećeni danski alkoholičar Frederik Harhof",
				2015, autor1 );
		knjiga1.printKnjiga();
		System.out.println();
		
		Autor autor2 = new Autor("Vojislav", "Šešelj");
		Knjiga knjiga2 = new Knjiga("9971-5-0210-0", "Izlapela rimska karakondžula Flavija Latanci",
				2015, autor2 );
		knjiga2.printKnjiga();
		System.out.println();
		
		Autor autor3 = new Autor();
		autor3.setIme("Vojislav");
		autor3.setPrezime("Šešelj");
		
		Knjiga knjiga3 = new Knjiga();
		knjiga3.setIsbn("978-86-7886-068-3");
		knjiga3.setNaziv("Južnokorejska gnjida O-Gon Kvon");
		knjiga3.setGodIzdanja(2009);
		knjiga3.setAutor(autor3);
		knjiga3.printKnjiga();
		
		

	}

}
