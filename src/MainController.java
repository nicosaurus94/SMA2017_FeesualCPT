import java.util.ArrayList;

public class MainController {
	MainController(){
	}
	Table tableObj = new Table();
	TestCaseController tcController = new TestCaseController();
	FeedbackController fbController = new FeedbackController();
	TextFileController tfController = new TextFileController();
	ArrayList<TestCase> tcListContainer;	 
//	Feedback[] feedContainer = new Feedback[size];
	private int index1;
	private int index2;
	
	public TestCase getTcList(int index){ 
		return tcListContainer.get(index);
	}

	public void getPrevDesc(){
		
	}
	
	public void getNextDesc(){
		
	}
	
	public void setInput(String input, int y, int x){	//매개변수 필요함.
		tableObj.setTable(input, y, x);
	}
	
	public void analyzeCall(){
		this.fbController.getFeedback(tableObj);
	}
	
	public void displayFeedback(){
		
	}
	
	public void displayTcList(){
		
	}
	
	public void saveCall(){
		tfController.saveRequest(this.tableObj, this.tcListContainer);
	}
	
	public void displayDesc(){
		
	}
	
	public void feedbackCall(){
		
	}
}
