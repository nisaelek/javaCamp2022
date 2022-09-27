package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int a = 20, b = 30, c = 40;
		int maxDeger = a;

		if (maxDeger < b) {
			maxDeger = b;

		}
		if (maxDeger < c) {
			maxDeger = c;
		}

		System.out.println(maxDeger);
	}

}
