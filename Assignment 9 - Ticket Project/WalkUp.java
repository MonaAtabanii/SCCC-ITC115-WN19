public class WalkUp extends Ticket{
		
		public WalkUp (int ticketNumber){
		    super(ticketNumber);
		}
		
		@Override
		public double getPrice(){
			super.price = 50.00;
			return super.price;
		}
		
		@Override
		public String toString(){
		    //String output = String.format("Number: %d, Price: $%.2f", WalkUp, this.getPrice());
			return super.toString();
		}

}
