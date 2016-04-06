import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IspisKarakteristikaFilea {

	public static void main(String[] args) {
		String cijeliTekst;
		//Kreiramo File i Scanner objekat za citanje
		File file = new File("tekst.txt");
		try {
			Scanner input = new Scanner(file);
			
			//Ucitavanje podataka u string
			StringBuilder build=new StringBuilder();
			StringBuffer buff=new StringBuffer(build);
			
			while(input.hasNext()){
				buff.append(input.nextLine());
			}
			
			//Dodijelimo zbog preglednosti cijeli tekst u string
			cijeliTekst=buff.toString();
			
			System.out.println(cijeliTekst);
			
		} catch (FileNotFoundException e) {
			System.out.println("File ne postoji!");
		}
		
		
		
		

	}

	// Metoda za broj rijeci u file-u
	public static int brojRijeci() {
		return 1;
	}// Kraj metode

	// Metoda za broj unikatnih rijeci u file-u
	public static int brojUnikatnihRijeci() {
		return 1;
	}// Kraj metode

	// Metoda za broj recenica u file-u
	public static int brojRecenica() {
		return 1;
	}// Kraj metode

	// Metoda za broj slova u file-u
	public static int brojSlova() {
		return 1;
	}// Kraj metode

	// Metoda za broj karaktera u file-u
	public static int brojKaraktera() {
		return 1;
	}// Kraj metode

	// Metoda koliko se koje slovo ponavlja u file-u
	public static int brojPonavljanjaSlova() {
		return 1;
	}// Kraj metode

}
