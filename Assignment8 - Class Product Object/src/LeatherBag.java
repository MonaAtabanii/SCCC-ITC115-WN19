import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class LeatherBag {
	private int lbIndex;
	static int lbCount=0; 
	private String lbID, lbColor, lbSize, lbHandSize, lbStyle, lbDescription;
	private String lbPrice;
	static String [] [] lbInstances = new String [20][8];
	
	//initialize the table of instances 
	public static void initializeTable () {
		lbInstances [0][0] = "Index";
		lbInstances [0][1] = "lbID";
		lbInstances [0][2] = "lbPrice";
		lbInstances [0][3] = "lbDescription"; 
	}
	
	//Construct new object from LeatherBag Class
	//public LeatherBag(String lbID, String lbPrice, String lbColor, String lbSize, String lbHandSize, String lbStyle) {
	//public LeatherBag() {
	//	setLeatherBag(lbID, lbPrice, lbColor, lbSize, lbHandSize, lbStyle);
		//setCount();
	//}
	
//1. set the values of an object
	//1.1 set the values for the object's instance 
	public void setLeatherBag(String lbID, String lbPrice, String lbColor, String lbSize, String lbHandSize, String lbStyle) {
		this.lbIndex = lbCount+1;
		lbInstances [lbIndex][0] = String.valueOf(this.lbIndex);
		this.lbID = lbID;
		lbInstances [lbIndex][1] = this.lbID;
		this.lbColor = lbColor;
		this.lbSize = lbSize;
		this.lbHandSize = lbHandSize;
		this.lbStyle = lbStyle;
		this.lbDescription = setDescription(this.lbColor, this.lbSize, this.lbHandSize, this.lbStyle);
		lbInstances [lbIndex][3] = this.lbDescription;
		this.lbPrice = (setPriceFormatted(Double.valueOf(lbPrice)));
		//this.lbPrice = lbPrice;
		lbInstances [lbIndex][2] = this.lbPrice;
		setCount();
	}
	
	//1.2 create the full description of the instance
	public String setDescription(String lbColor, String lbSize, String lbHandSize, String lbStyle) {
		lbDescription = ("This is a " +  lbColor + ", " + lbSize + " bag, with " + lbHandSize + " hand. " + "It is elegant and suitable for " + lbStyle + " style.");
		return lbDescription;
	}
	
	//1.3 format the instance price 
	public String setPriceFormatted(double lbPrice) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(lbPrice);
		return formattedPrice;
		//NumberFormat formattedPrice = NumberFormat.getCurrencyInstance();
		//String formatted = formattedPrice.format(lbPrice);
		//return formatted;
	}
	
	//1.4 count how many instance we created so far
	public void setCount() {
		++lbCount;
	}
	
//2. get the information of an object
	//2.1 get the data of specific instance and print it to the console based on index
	public void getOneLeatherBag(int lbIndex) {
		String fetch = String.valueOf(lbIndex);
		int check = 0;
		for (int i=0; i<=getCount(); i++) {
			//System.out.println("test going into for i");
			//System.out.print(lbInstances[i][0]);
			if (lbInstances[i][0].equals(fetch)) {
				check = 1;
			//	System.out.println("test going into if equal fetch" + check);
				for (int j = 0; j<4; j++) {
				//	System.out.println("test going into for j");
					System.out.print("\t" + lbInstances[0][j] + "\t");
				}
				System.out.println();
				System.out.println("\t ------------------------------------------------------------------------------------------------");
				for (int k = 0; k<4; k++) {
				//	System.out.println("test going into for k");
					System.out.print("\t" + lbInstances[lbIndex][k] + "\t");
				}
				//System.out.println("test going after if and all fors inside it");
			}
		//	System.out.println("test going at the end of for i and what it contain if and for j and for k");
		}
		//System.out.println("test going after of for i and what it contain if and for j and for k");
		if (check != 1) {
			System.out.println("Sorry there is no instance with this index");
		}
	}
	
	//2.2 get the data of all instances
	public void getLeatherBags() {
		for (int i= 0; i<=getCount(); i++) {
			for (int j=0; j<4; j++) {
				System.out.print(toString(lbInstances[i][j], i, j));
			}
			System.out.println();
			System.out.println("\t ------------------------------------------------------------------------------------------------");
		}
	}
			
	//2.3 To String method
	public String toString(String S, int i, int j) {
				return "\t" + lbInstances[i][j] + "\t";
	}
	
	
	//2.4 get how many products we created so far
		public int getCount() {
			return lbCount;
		}
}
