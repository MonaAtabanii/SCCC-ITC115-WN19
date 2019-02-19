//import java.util.Scanner;
import java.io.*;
import java.util.*;


public class GirlsBoys {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			Scanner readInput = new Scanner(new File("boysgirls.txt"));
			boyGirls(readInput);
			readInput.close();
	}

	
	public static void boyGirls (Scanner readInput) throws FileNotFoundException {
		int numBoys=0, numGirls=0, sumBoys=0, sumGirls = 0, linesCount = 0;
		while(readInput.hasNextLine()) {
			String readString = readInput.next();
			if (linesCount%2 == 0) {
				numBoys +=1;
				sumBoys += readInput.nextInt();
			}
			else {
				numGirls +=1;
				sumGirls += readInput.nextInt();			
			}
			linesCount++;
		}
		System.out.printf("%d boys, %d girls", numBoys, numGirls);
		System.out.println("\nDifference between boys' and girls' sums: " + Math.abs(sumBoys - sumGirls));
	}
}
