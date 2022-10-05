package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int [] sayilar ={1,2,3,4,5,6,7};
		int aranacak = 1;
		boolean isContain=false;
		for(int containNumber:sayilar ) {
			if(aranacak==containNumber) {
				isContain=true;
			}
			
		}
		String mesaj ="";
		if (isContain) {
			mesaj ="Sayı mevcuttur"+aranacak;
			mesajVer(mesaj); 
		}
		else {
			System.out.println("Sayi bulunamadı");
		}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
