package miniProje5;
//Sayi Bulma
public class Main {

	public static void main(String[] args) {
		int [] sayilar ={1,2,3,4,5,6,7};
		int aranacak = 1;
		boolean isContain=false;
		for(int containNumber:sayilar ) {
			if(aranacak==containNumber) {
				isContain=true;
			}
			
		}
		if (isContain) {
			System.out.println("Sayi bulundu");
		}
		else {
			System.out.println("Sayi bulunamadı");
		}

	}

}
