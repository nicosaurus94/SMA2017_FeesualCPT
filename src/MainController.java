
public class MainController {
	MainController(){
	}
	Table tableObj = new Table();
	TestCaseController tcController = new TestCaseController();
	FeedbackController fbController = new FeedbackController();
//	TestCase[] tcListContainer = new TestCase[size];	 
//	Feedback[] feedContainer = new Feedback[size];
	private int index1;
	private int index2;
	
	public TestCase getTcList(int index){ 
		TestCase Tc = new TestCase();
		return Tc;
	}

	public void getPrevDesc(){
		
	}
	
	public void getNextDesc(){
		
	}
	
	public void setInput(String input, int where){	//매개변수 필요함.
		tableObj.setTable(input,where);
	}
	
	public void analyzeCall(){
		
	}
	
	public void displayFeedback(){
		
	}
	
	public void displayTcList(){
		
	}
	
	public void saveCall(){
		
	}
	
	public void displayDesc(){
		
	}
}
