
public class Advance extends Ticket{
	int advancedDays;
	int daysScale = 10;
	
	//double option1Price = 30;
	double option2Price = 40;
	
	public Advance (int ticketNumber, int advancedDays) {
		super(ticketNumber);
		this.advancedDays = advancedDays;
		if (advancedDays >= daysScale) {
			super.price = 30.00;
		}
		else {
			super.price = 40.00;
		}
	}
	
	@Override
	public String toString(){
		return super.toString();
	}

}
