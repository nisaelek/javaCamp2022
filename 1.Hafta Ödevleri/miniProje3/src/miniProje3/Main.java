package miniProje3;

public class Main {

	public static void main(String[] args) {
		// Mukemmel sayi bulma
		// 6--> 1,2,3
		// 28 --> 1,2,3,4,7,14

		int sayi = 28;
		int sayiToplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				sayiToplam = sayiToplam + i;
			}
		}
		if (sayi == sayiToplam) {
			System.out.println("Mukemmel sayi");
		} else {
			System.out.println("Mukemmel sayi değil");

		}
	}
}
