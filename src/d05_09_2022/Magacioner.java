package d05_09_2022;

public class Magacioner extends Radnik {
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	private double prosecnaPlata() {
		int brSektora = 0;
		double suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			suma += this.sektori.get(i).getPlata();
			brSektora++;
		}
		return suma / brSektora * 0.5;

	}

	@Override
	public double plataRadnika() {
		int brSektora = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			brSektora++;
		}
		return this.prosecnaPlata() * brSektora;
		
	}
	
}
