
public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program is to calculate the first 12th Fibonacci numbers.");
		System.out.println("");
	    int i=1, j=1;
	    System.out.println("The first 12 Fibonacci nubmers are:");
	    System.out.print(i+ "    "+ j);
	    for(int k=2; k<=11; k++) 
	      {
	    	int temp=i; 
	    	i=j; 
	    	j=temp+i;
	    	System.out.print("    "+ j);
	      }
		
	}

}
