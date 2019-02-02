import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getData = new Scanner(System.in);
		printGPA(getData);

	}
	
	public static void printGPA(Scanner getData) {
		double sum = 0;
		String name;
		int total;
		System.out.print("Enter a student record: ");
		name = getData.next();
		total = getData.nextInt();
		for (int i = 1; i<=total; i++) {
			//double score = getData.nextDouble();
			sum += getData.nextDouble();
		}
		double average = (sum/total); 
		System.out.printf("%s's grade is %.2f ", name, average);
	}

}
