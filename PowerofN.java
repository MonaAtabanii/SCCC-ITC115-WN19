import java.util.*;
public class PowerofN {

	public static void main(String[] args) {
		//This program is to print the power of n number
		//int base, exponent;
		Scanner console = new Scanner(System.in);
		for (int i = 0; i<=1; i++) {
			System.out.print("Enter the base" + (i+1) + ":  " );
			//+ (base=console.nextInt()));
			int base = console.nextInt();
			//System.out.println();
			System.out.print("Enter the exponent" + (i+1) + ":  " );
			//+ (exponent=console.nextInt()));
			int exponent = console.nextInt();
			printPowerOfN(base, exponent);
			System.out.println("***************");
		}

	}
	
	public static void printPowerOfN(int b, int exp) {
		int cumb = 1;
		System.out.print(cumb + "   ");
		for(int i=1; i<=exp; i++) {
			cumb *= b;
			System.out.print(cumb + "   ");
		}
		System.out.println();
	}

}
