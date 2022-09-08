package d05_09_2022;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	@Override
	public double plataRadnika() {
		double suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			suma += this.sektori.get(i).getPlata();
		}
		return suma;
	}
	
}
