
public class Zad {

	private int licz;

	public int getLicz() {
		return licz;
	}

	public void setLicz(int licz) {
		this.licz = licz;
	}

	public int funkcja(int licz, int liczba) {

		if (licz < liczba) {
			System.out.println("Za mala");
		} else if (licz > liczba) {
			System.out.println("Za duza");
		}
		return licz;
	}

}
