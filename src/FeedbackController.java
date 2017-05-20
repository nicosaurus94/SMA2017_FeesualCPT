import java.util.ArrayList;

public class FeedbackController {
	private Feedback[] feedbackList = new Feedback[10]; 
	FeedbackController(){
		feedbackList[0] = new Feedback("1st Feedback");
		feedbackList[1] = new Feedback("2nd Feedback");
		feedbackList[2] = new Feedback("3rd Feedback");
		feedbackList[3] = new Feedback("4th Feedback");
		feedbackList[4] = new Feedback("5th Feedback");
		feedbackList[5] = new Feedback("6th Feedback");
		feedbackList[6] = new Feedback("7th Feedback");
		feedbackList[7] = new Feedback("8th Feedback");
		feedbackList[8] = new Feedback("9th Feedback");
		feedbackList[9] = new Feedback("10th Feedback");
	}
	
	public Feedback getFeedback(Table table){
		return feedbackList[3];
	}
	
	public Feedback getFeedback(ArrayList<TestCase> TcList){
		return feedbackList[8];
	}
	
	public void findFeedback(){
		
	}
	
	public boolean isSuccessful(Table table){
		boolean successful;
		if(this.getFeedback(table) == feedbackList[0]){
			successful = false;
		}
		else
			successful = true;
		return successful;
	}
}
