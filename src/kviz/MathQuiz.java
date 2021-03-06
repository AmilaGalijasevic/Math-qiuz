package kviz;

import java.util.InputMismatchException;

public class MathQuiz {
	public static double sabiranje(double broj1, double broj2) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliko je " + broj1 + " + " + broj2);
		double suma = broj1 + broj2;
		System.out.println("Unesite odgovor: ");
		double odgovor = input.nextDouble();
		if (odgovor == suma) {
			System.out.println("Tacan odgovor! \n");
		} else {
			System.out.println("Pogrijesili ste, tacan odgovor je: " + suma + " \n");
		}
		return suma;

	}

	public static double oduzimanje(double broj1, double broj2) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliko je " + broj1 + " - " + broj2);
		double razlika = broj1 - broj2;
		System.out.println("Unesite odgovor: ");
		double odgovor = input.nextDouble();
		if (odgovor == razlika) {
			System.out.println("Tacan odgovor! \n");
		} else {
			System.out.println("Pogrijesili ste, tacan odgovor je: " + razlika + " \n");
		}
		
		return razlika;

	}

	public static double mnozenje(double broj1, double broj2) {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Koliko je " + broj1 + " * " + broj2);
			double rezultat = broj1 * broj2;
			System.out.println("Unesite odgovor: ");
			double odgovor = input.nextDouble();
			if (odgovor == rezultat) {
				System.out.println("Tacan odgovor! \n");
			} else {
				System.out.println("Pogrijesili ste, tacan odgovor je: " + rezultat + " \n");
			}
			return rezultat;

		}

	public static double dijeljenje(double broj1, double broj2) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliko je " + broj1 + " / " + broj2);
		double rezultat = broj1 / broj2;
		System.out.println("Unesite odgovor: ");
		double odgovor = input.nextDouble();
		if (odgovor == rezultat) {
			System.out.println("Tacan odgovor! \n");
		} else {
			System.out.println("Pogrijesili ste, tacan odgovor je: " + rezultat + " \n");
		}
		
		return rezultat;
		
		

	}

	public static double kvadriranje(double broj1) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliki je kvadrat broja "+broj1);
		double kvadrat=broj1*broj1;
		
		double pokusaj=input.nextDouble();
		
		if (pokusaj==kvadrat) {
			System.out.println("Tacan odgovor! \n");
		}else {
			System.out.println("Pogrijesili ste, tacan odgovor je: "+kvadrat);
		}
		
		
		return kvadrat;

	}

	public static double korjenovanje(double broj1) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Koliki je korjen broja "+broj1);
		double pokusaj=input.nextDouble();
		double korjen=Math.sqrt(broj1);
		
		if (pokusaj==korjen) {
			System.out.println("Tacan odgovor!");
		}else {
			System.out.println("Pogrijesili ste! Tacan odgovor je: "+korjen);
		}
		
		return korjen;

	}

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			double broj1 = (int) (Math.random() * 10);
			double broj2 = (int) (Math.random() * 10);

			System.out.println(
					"Odaberite opciju: \n1 Sabiranje \n2 Oduzimanje \n3 Mnozenje \n4 Dijeljenje \n5 Korjenovanje \n6 Kvadriranje \n7 Izlaz");
			int izbor = input.nextInt();

			switch (izbor) {
			case 1: {
				sabiranje(broj1, broj2);
				main(args);
				break;
			}
			case 2: {
				oduzimanje(broj1, broj2);
				main(args);
				break;
			}
			case 3: {
				mnozenje(broj1, broj2);
				main(args);
				break;
			}
			case 4: {
				dijeljenje(broj1, broj2);
				main(args);
				break;
			}
			case 5: {
				korjenovanje(broj1);
				main(args);
				break;
			}
			case 6: {
				kvadriranje(broj1);
				main(args);
				break;
			}
			case 7: {
				System.out.println("Dovidjenja");
				System.exit(1);
			}
			default:
				break;
			}
			//input.close();
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos, pokusajte ponovo:");
			main(args);
		}
	}

}
