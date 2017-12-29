import java.util.Random;
import java.util.Scanner;

public class Zadanie13 {
	public static void main(String[] args) {
		Zad zadanie = new Zad();
		System.out.println("Zgadnij liczbe 1-100");
		Scanner in = new Scanner(System.in);
		Random gen = new Random();
		int zgadywana;
		int liczba = gen.nextInt(100) + 1;

		System.out.println(liczba);

		System.out.println("Podaj liczbe");

		zgadywana = in.nextInt();

		while (zgadywana != liczba) {
			zadanie.funkcja(zgadywana, liczba);
			if (zgadywana == liczba) {
				break;
			}

			zgadywana = in.nextInt();
		}
		System.out.println("zgadles");
		in.close();
	}
}
