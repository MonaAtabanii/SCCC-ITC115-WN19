import java.util.Scanner;

public class CheckSortedNew {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner getData = new Scanner (System.in);
			int n;
			double [] array1;
			String repeat = "y";
			while ( repeat.equals("y")) {
				System.out.println("Enter how many numbers you have?");
				n = (int) getData.nextInt();
				if (n==0) {
					System.out.println("Sorry we can't do anything with an empty array");
					System.out.println("Do you want to work again? (y/n)");
					repeat = (String) getData.next();
					System.out.println(repeat);
				}
				else if (n !=0) {
					array1 = new double [n];
					System.out.print("Enter the double values seperate them with space?");
					for (int i=0; i<n; i++) {
						array1[i] = (double) getData.nextDouble();
				    }
					if (isSorted(array1) == true) {
						System.out.println("Yaay it is a sorted array!");
					}	
					else {
						System.out.println("Oops it is not a sorted array!");
					}
				System.out.println("Do you want to work again? (y/n)");
				repeat = (String) getData.next();
				}
		}
	}
		
			
		public static boolean isSorted (double[] array1) {
			int length = array1.length;
			for (int i = 0; i<length-1; i++) {
					if (array1[i] > array1[i+1]) {
						return false;
					}
			}
		return true;
		}
}
		
		
	
