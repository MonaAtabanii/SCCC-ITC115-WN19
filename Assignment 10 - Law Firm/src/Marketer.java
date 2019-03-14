// A class to represent marketers.
public class Marketer extends Employee {
	public String addvertiseStatement;
	
	@Override
	public double salary() {
    	return 45000.00;
    }
	
	
	public String setAdvertise() {
		addvertiseStatement = "Act now, while supplies last!";
    	return addvertiseStatement;
	}
    	
	public void advertise() {
        System.out.println(addvertiseStatement);
    }
}
