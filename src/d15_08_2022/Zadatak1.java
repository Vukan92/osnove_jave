package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca
//		.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		stampajVrednostZa10Vecu(5);
		stampajVrednostZa10Vecu(10);
		stampajVrednostZa10Vecu(17);
	}
	public static void stampajVrednostZa10Vecu(int a) {
		System.out.println(a + 10);
	}
}
