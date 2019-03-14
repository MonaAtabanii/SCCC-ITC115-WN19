import java.util.*;

public class AllEmployeeClient {
	static Scanner getData = new Scanner (System.in);
	static int total;
	static String getPosition;
	static String employeeRecords [][];
	static String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many records you want to enter?: ");
		total = getData.nextInt();
		employeeRecords = new String [total+1][9];
		employeeRecords [0][0] = "ID";
		employeeRecords [0][1] = "Name";
		employeeRecords [0][2] = "Position";
		employeeRecords [0][3] = "W. Hours";
		employeeRecords [0][4] = "Salary";
		employeeRecords [0][5] = "V. Days";
		employeeRecords [0][6] = "Form Color";
		employeeRecords [0][7] = "Details1";
		employeeRecords [0][8] = "Details2";
		//employeeRecord [0][9] = "Details3";
		int choice = 0;
		for (int i = 1; i<=total; i++) {
			while (choice != 1) {
				System.out.println("Which job position?: "
						+ "\n (G for General Employee, L for Lawyer, H for Harvard Lawyer, M for Marketr, "
						+ "J for Janitor, S for Secretary, and LS for Legal Secretary) \t");
				getPosition = getData.next();
				if (getPosition.equalsIgnoreCase("G") || getPosition.equalsIgnoreCase("L") || getPosition.equalsIgnoreCase("H")
						|| getPosition.equalsIgnoreCase("M") || getPosition.equalsIgnoreCase("J") 
						|| getPosition.equalsIgnoreCase("S") || getPosition.equalsIgnoreCase("LS")){
					setEmployee(i, getPosition);
					choice = 1;	
				}
				else {
					System.out.println("Sorry you entered wrong letter please choose again: \t");
				}
			}
			choice = 0;
		}
		printAllRecords();

	}

	
	static void setEmployee(int i, String getPosition) {
		employeeRecords[i][0] = String.valueOf("EMP#"+i+Math.round(Math.random()));
		System.out.println("What is the employee name? \t");
		name = getData.next();
		employeeRecords[i][1] = name;
		if (getPosition.equalsIgnoreCase("G")) {
			employeeRecords[i][2] = "General";
			Employee newRecord = new Employee();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();	
		}
		else if (getPosition.equalsIgnoreCase("L")) {
			employeeRecords[i][2] = "Lawyer";
			Lawyer newRecord = new Lawyer();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setSue();
		}
		else if (getPosition.equalsIgnoreCase("H")) {
			employeeRecords[i][2] = "Harvard L.";
			HarvardLawyer newRecord = new HarvardLawyer();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setSue();
		}
		else if (getPosition.equalsIgnoreCase("M")) {
			employeeRecords[i][2] = "Marketer";
			Marketer newRecord = new Marketer();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setAdvertise();
		}
		else if (getPosition.equalsIgnoreCase("J")) {
			employeeRecords[i][2] = "Janitor";
			Janitor newRecord = new Janitor();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setClean();
		}
		else if (getPosition.equalsIgnoreCase("S")) {
			employeeRecords[i][2] = "Secretary";
			Secretary newRecord = new Secretary();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setDictation();
		}
		else if (getPosition.equalsIgnoreCase("LS")) {
			employeeRecords[i][2] = "Legal Sec.";
			LegalSecretary newRecord = new LegalSecretary();
			employeeRecords[i][3] = String.valueOf(newRecord.workingHours());
			employeeRecords[i][4] = String.valueOf(newRecord.salary());
			employeeRecords[i][5] = String.valueOf(newRecord.vacationDays());
			employeeRecords[i][6] = newRecord.vacationForm();
			employeeRecords[i][7] = newRecord.setDictation();
			employeeRecords[i][8] = newRecord.setFileLegal();
			
		}
		
	}
	
	public static void printAllRecords() {
		for(int i = 0; i<=total; i++) {
			for(int j = 0; j<9; j++) {
				System.out.printf("%-32s",employeeRecords[i][j]);	
			}
			System.out.println("\n -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	}
}
