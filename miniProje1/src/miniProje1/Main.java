package miniProje1;

//Asal Sayı Kontrol
public class Main {

	public static void main(String[] args) {
		boolean control =false;
		int sayi =25;
		
		if (sayi ==1) {
			control =false;
		}
		if (sayi<1) {
			System.out.println("Geçersiz sayı");
		}
		for (int i = 2; i <25; i++) {
			if (sayi !=2 && sayi % i == 0) {
				control =false;
			}
			else {
				control =true;
			}
		}
			if (control) {
				System.out.println("sayı asaldır");
			}
			else {
				System.out.println("sayı asal değildir");
			}
		
	}

}
