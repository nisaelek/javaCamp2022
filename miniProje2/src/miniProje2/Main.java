package miniProje2;

//Bir harf ince Harfli mi kalın harflı m
public class Main {

	public static void main(String[] args) {
		char[] kalinSesliHarfler = { 'a', 'ı', 'o', 'u' };
		char[] inceSesliHarfler = { 'e', 'i', 'ö', 'ü' };
		char harf = 'a';
		Boolean isKalin = false;

		for (char kalinSesler : kalinSesliHarfler) {
			if (Character.toUpperCase(kalinSesler) == Character.toUpperCase(harf)) {
				isKalin = true;
			} else {
				for (char inceSesler : inceSesliHarfler) {
					if (Character.toUpperCase(inceSesler) == Character.toUpperCase(harf)) {
						isKalin = false;
					}

				}
			}

		}

		if (isKalin) {
			System.out.println("Kalın sesli Harfdir.");
		} else {
			System.out.println("İnce sesli Harfdir.");

		}
	}
}
