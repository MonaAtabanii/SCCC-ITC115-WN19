// A class to represent lawyers.
public class Lawyer extends Employee {
	public String sueStatement;    
    
    @Override
	public String vacationForm() {
    	return "pink";
    }
	
	@Override
	public void applyForVacation() {
        super.applyForVacation();
    }
	
	
	@Override
	public int vacationDays(){
    	return 21;
    }
	
    @Override
    public void showVacation() {
    	super.showVacation();
    }
    
    
    public String setSue() {
    	sueStatement = "I'll see you in court!";
    	return sueStatement;	
    }
    
    public void sue() {
		System.out.println(sueStatement);
	}
}
