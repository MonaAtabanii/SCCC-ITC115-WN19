// A class to represent secretaries.
public class Secretary extends Employee {
	public String dictationStatement;
	
	public String setDictation() {
		dictationStatement = "I know how to take dictation.";
    	return dictationStatement;
	}
	
    public void takeDictation() {
        System.out.println(dictationStatement);
    }
}
