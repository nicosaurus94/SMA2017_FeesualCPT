import java.util.ArrayList;

public class TestCaseController {
	private ArrayList<TestCase> tcList = new ArrayList<TestCase>();
	TestCaseController(){		
	}
	
	public void analyzeTestCase(Table tableObj){
		TestCase newTc = new TestCase();
		newTc.add(tableObj.getTable()[0][0], tableObj.getTable()[0][3]);
		newTc.add(tableObj.getTable()[1][0], tableObj.getTable()[1][3]);
		this.tcList.add(newTc);
		
		newTc = new TestCase();
		newTc.add(tableObj.getTable()[1][0], tableObj.getTable()[1][3]);
		this.tcList.add(newTc);
	}
	
	public void makeTc(){
		
	}
	
	public ArrayList<TestCase> getTestCaseList(){
		return tcList;
	}
}
