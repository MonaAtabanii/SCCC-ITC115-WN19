import java.util.Scanner;

public class TicketClient {
	static int totalTickets;
	
	public static void main(String[] args) {
		
		int daysAdvanced;
		String answer;
		//int ticketNum = 0;		
		Scanner getData = new Scanner(System.in);
		System.out.println("How many ticket you want to enter?  ");
		totalTickets = getData.nextInt();
		Ticket [] newTickets = new Ticket[totalTickets];
		for (int i = 0; i<totalTickets; i++) {
			System.out.println("How many days left to the event (Please type 0 if it's a same day purchase)?  ");
			daysAdvanced = getData.nextInt();	
			if (daysAdvanced == 0) {
				newTickets[i] = new WalkUp(i+1);
			}
			else if(daysAdvanced > 0) {
				System.out.println("Are you student (y or n)? ");
				answer = getData.next();
				if (answer.equals("y")) {
					newTickets[i] = new StudentAdvanced(i+1, daysAdvanced);
				}
				else if (answer.equals("n")) {
					newTickets[i] = new Advance(i+1, daysAdvanced);
		
				}	
			}
		}
		ticketsInfo(newTickets);
	}
	
	public static void ticketsInfo(Ticket [] newTickets) {
		for(int i=0; i<totalTickets; i++) {
			System.out.println(newTickets[i].toString());
		}
	}
}
