package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na
//			koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//			za svaki od njih pozvati metode

		SmartAirConditioning s = new SmartAirConditioning();

		s.marka = "Samsung";
		s.temp = 27;
		s.mod = "greje";

		SmartAirConditioning s1 = new SmartAirConditioning();

		s1.marka = "Galanz";
		s1.temp = 18;
		s1.mod = "hladi";

		s.stampa();
		if (s.poredjenjeTemp(20) == true) {
			System.out.println("Spoljasnja temperatura je veca nego ona koja je postavljena na klima uredjaju!");
		} else {
			System.out.println("Spoljasnja temperatura nije veca nego ona koja je postavljena na klima uredjaju!");
		}

		s1.stampa();
		if (s1.poredjenjeTemp(25) == true) {
			System.out.println("Spoljasnja temperatura je veca nego ona koja je postavljena na klima uredjaju!");
		} else {
			System.out.println("Spoljasnja temperatura nije veca nego ona koja je postavljena na klima uredjaju!");
		}
	}
}
