// A class to represent legal secretaries.
public class LegalSecretary extends Secretary {
	public String fileLegalStatement;
	
	@Override
	public double salary() {
    	return 45000.00;
    }
	
	
	public String setFileLegal() {
		fileLegalStatement = "I could file all day!";
    	return fileLegalStatement;
	}
	
	public void fileLegalBriefs() {
        System.out.println(fileLegalStatement);
    }
}
