
public class StudentAdvanced extends Advance{
	
	public StudentAdvanced(int ticketNumber, int advancedDays) {
		super(ticketNumber, advancedDays);
		super.price = this.getPrice()/2;
	}
	
	@Override
	public String toString(){
		//System.out.println("ToString Before The student advance price is " + this.price + "the super price is " +super.price);
		return super.toString();//+ "\n ToString After The student advance price is " + this.price + "the super price is " +super.price;
	}
}
