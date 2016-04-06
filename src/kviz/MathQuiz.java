package kviz;

public class MathQuiz {
	public static double sabiranje(double broj1, double broj2) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliko je " + broj1 + " + " + broj2);
		double suma = broj1 + broj2;
		System.out.println("Unesite odgovor: ");
		double odgovor = input.nextDouble();
		if (odgovor == suma) {
			System.out.println("Tacan odgovor: ");
		} else {
			System.out.println("Pogrijesili ste, tacan odgovor je: " + suma);
		}

		return suma;

	}

	public static double oduzimanje(double broj1, double broj2) {
		return 0;

	}

	public static double mnozenje(double broj1, double broj2) {
		return 0;

	}

	public static double dijeljenje(double broj1, double broj2) {
		if(broj2>0){
			return broj1 / broj2;
		}else{
			return 0;
		}
	}

	public static double kvadriranje(double broj1, double broj2) {
		return 0;

	}

	public static double korjenovanje(double broj1, double broj2) {
		return 0;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double broj1 = (int) (Math.random() * 10);
		double broj2 = (int) (Math.random() * 10);

		System.out.println(
				"Odaberite opciju: \n1 Sabiranje \n2 Oduzimanje \n3 Mnozenje \n4 Dijeljenje \n5 Korjenovanje \n6 Kvadriranje");
		int izbor = input.nextInt();

		switch (izbor) {
		case 1: {
			sabiranje(broj1, broj2);
			break;
		}
		case 2: {
			oduzimanje(broj1, broj2);
			break;
		}
		case 3: {
			mnozenje(broj1, broj2);
			break;
		}
		case 4: {
			dijeljenje(broj1, broj2);
			break;
		}
		case 5: {
			kvadriranje(broj1, broj2);
			break;
		}
		case 6: {
			korjenovanje(broj1, broj2);
			break;
		}

		default:
			break;
		}

	}

}
