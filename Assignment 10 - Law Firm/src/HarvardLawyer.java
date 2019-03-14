
public class HarvardLawyer extends Lawyer {	
	
	@Override
	public double salary() {
    	return super.salary()*1.2;
    }
	
	@Override
	public int vacationDays(){
		return super.vacationDays()+3;
	}
	
	@Override
	public void showVacation() {
        super.showVacation();
    }
	
	
    @Override
    public String vacationForm() {
    	return "pinkpinkpinkpink";	
    }
    
    @Override
	public void applyForVacation() {
        super.applyForVacation();
    }

}
