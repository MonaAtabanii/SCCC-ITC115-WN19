import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class LeatherBagClient {
	
	static int count=0;
	static String lbID, lbColor, lbSize, lbHandSize, lbStyle, check = "y";
	static String lbPrice;
	static LeatherBag bagInstance = new LeatherBag();
	
	public static void main(String[] args) {
		Scanner getData = new Scanner(System.in);
		String toDo;
		LeatherBag.initializeTable ();
		while (check.equals("y") || check.equals("Y")){	
			System.out.println("Type 'SET' to insert new bag data or 'GET' to retrive exesit bag data? (SET or GET): ");
			toDo = getData.next();
			if (toDo.equals("SET") || toDo.equals("Set") || toDo.equals("set")){
				setNewBagInstance(getData);
			}
			else if (toDo.equals("GET") || toDo.equals("Get") || toDo.equals("get")){
				if (count == 0) {
					System.out.println("Sorry there is no any record yet");
				}
				else {
					System.out.println("Type '1' if you want to retrive instance by index, or Type 'ALL' for all instances");
					toDo = getData.next();
					if (toDo.equals("1")) {
						getOneBagData (getData);
					}
					else if (toDo.equals("ALL") || toDo.equals("All") || toDo.equals("all")) {
						getBagsData ( );
					}
				}
			}
			else System.out.println("Sorry you entered something wrong");
			System.out.println("Do you want to work through again? (y or n):");
			check = getData.next();
			if (check.equals("n") || check.equals("N")) {
				System.out.println("Thank you for trying the program");
			}
		}	
	}

	//set the details of instance
	public static void setNewBagInstance(Scanner getData) {
		System.out.println("How many bag do you want to insert?:  ");
		int n = getData.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter the product ID: ");
			lbID = getData.next();
			System.out.println("Enter the bag color: ");
			lbColor = getData.next();
			System.out.println("Enter the bag size (small, meduim or big): ");
			lbSize = getData.next();
			System.out.println("Enter the bag hand size (short, meduim or long): ");
			lbHandSize = getData.next();
			System.out.println("Enter the bag style (casual, evening, work, school or travel): ");
			lbStyle = getData.next();
			System.out.println("Enter the bag price: ");
			lbPrice = getData.next();
			bagInstance.setLeatherBag(lbID, lbPrice, lbColor, lbSize, lbHandSize, lbStyle);
			count = bagInstance.getCount();
			System.out.println("+=================================+");
			System.out.println("|+++++++++++++++++++++++++++++++++|");
			//System.out.println("|+++++++++++++++++++++++++++++++++|");
			System.out.println("+=================================+");	
		}
	}

	//get and print the details of all instances
	public static void getBagsData ( ) {
		System.out.println("The total amount of bags we have so far is: " + count);
		System.out.println("+=================================+");
		bagInstance.getLeatherBags();
		}
		
	//get and print the details of on instance by index
	public static void getOneBagData (Scanner getData) {
		System.out.println("Enter the index of the bag you want to retrive: ");
		int index = getData.nextInt();
		System.out.println("+=================================+");
		bagInstance.getOneLeatherBag(index);		
	}


}
