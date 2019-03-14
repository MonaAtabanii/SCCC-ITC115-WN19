
public class Janitor extends Employee {
	public String cleanStatement;
	
	@Override
	public int workingHours() {
	    	return super.workingHours()*2;
	 }
	
	
	@Override
	public double salary() {
    	return super.salary()-10000.00;
    }
	
		
	@Override
	public int vacationDays() {
    	return super.vacationDays()/2;
    }
	   
	
	public String setClean() {
		cleanStatement = "Workin' for the man.";
    	return cleanStatement;
	}
	
	public void clean() {
	  	System.out.println(cleanStatement);
	}
}
