// A class to represent employees in general.
public class Employee {
	 public String vacationForm() {
	    	return "Yellow";
	    }
	
    public void applyForVacation() {
        System.out.println("Use the " + vacationForm() + " vacation form.");
    }

    
    public int workingHours() {
    	return 40;
    }
    
    public void showHours() {
        System.out.println("I work " + workingHours () + " hours per week.");
    }

    
    public double salary() {
    	return 40000.00;
    }
    
    public void showSalary() {
        System.out.println("My salary is $" + salary());
    }

    
    public int vacationDays(){
    	return 10;
    }
    
    public void showVacation() {
        System.out.println("I receive " + vacationDays() + " Days vacation.");
    }
}
