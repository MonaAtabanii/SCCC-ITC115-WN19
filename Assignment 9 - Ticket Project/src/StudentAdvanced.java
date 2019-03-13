
public class StudentAdvanced extends Advance{
	
	public StudentAdvanced(int ticketNumber, int advancedDays) {
		super(ticketNumber, advancedDays);
		super.price = super.getPrice()/2;
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
}
