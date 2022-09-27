package reCapDemo2;


public class Main {

	public static void main(String[] args) {
	 double[] myList = { 1.2,1.3,4.3,5.7};
	 double total = 0;
	 double max =myList[1];
	 
	/* for (int i = 0; i < myList.length; i++) {
		System.out.println(myList[i]);
	}
*/
	 for(double number :myList) {
		 total =total+number;
		if (max<number) {
			max =number;
		}		 	
	 }
	 System.out.println("Toplam"+total);
	 System.out.println("En Büyük"+max);
	}

}
