
public class LibraryClient {

	public static void main(String[] args) {

		Library[] list = new Library[6];
		list[0] = new Book("736gd", "Zoo map", "Someone did");
		list[1] = new CD("002", "Country Music 2017", "Many");
		list[2] = new DVD("0873", "Lion King");
		list[3] = new Magazine("09w4", "NewYork Times");
		list[4] = new Book("y76", "Life as we know", "Another Person");
		list[5] = new CD("006", "A new day has come", "Celien");

		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].toString());
			System.out.println();
	}
		
	list[5].setReserve(true);
	System.out.println(list[5].toString());
	
	System.out.println();
	list[2].setBorrowStatus(true);
	System.out.println(list[2].toString());

}
	
}
