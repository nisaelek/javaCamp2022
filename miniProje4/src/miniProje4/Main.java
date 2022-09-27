package miniProje4;

//Arkadaş sayı mı ?
public class Main {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int sayi1Toplam = 0;
		int sayi2Toplam = 0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				sayi1Toplam = sayi1Toplam + i;

			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				sayi2Toplam = sayi2Toplam + i;

			}
		}
		// System.out.println(sayi1Toplam);
		// System.out.println(sayi2Toplam);
		if (sayi1Toplam == sayi2 || sayi2Toplam == sayi1) {
			System.out.println("Arkadaş sayılardır");
		} else {
			System.out.println("Arkadaş sayı değildir");
		}

	}

}
