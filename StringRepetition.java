import java.util.*;

public class StringRepetition {

	public static void main(String[] args) {
		Scanner getData = new Scanner(System.in);
		System.out.println("Enter the string you want to be repetited: ");
		String str = new String(getData.nextLine());
		System.out.println("How many times you want the repetitions: ");
		int rep = getData.nextInt();
	    //String result = rep1(str, rep);
	    //System.out.println(result);
		System.out.println(rep1(str, rep));
		getData.close();
	}
	
	public static String rep1(String str, int rep) {
		int r = rep;
		String s ;
		if (rep>0) {
		   s = str;
		  // StringBuilder strAppnd = new StringBuilder();
		   for (int i = 1; i<r; i++) {
		   //for (int i = 1; i<=r; i++) {
			  // strAppnd.append(str);
			   s+=str;
		   }
		//return strAppnd.toString();
		   return s;
		}
		else {
			 s = "    ";
			return s;
		}
	}
}

