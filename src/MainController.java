import java.util.ArrayList;

public class MainController {
	MainController() {
	}

	Table tableObj = new Table();
	TestCaseController tcController = new TestCaseController();
	FeedbackController fbController = new FeedbackController();
	TextFileController tfController = new TextFileController();
	ArrayList<TestCase> tcListContainer;
	ArrayList<Feedback> feedbackContainer = new ArrayList<Feedback>();
	private int index1;
	private int index2;

	public TestCase getTcList(int index) {
		return tcListContainer.get(index);
	}

	public void getPrevDesc(int index) {
		this.tcListContainer.get(index).prevPos();
		this.displayDesc();
	}

	public void getNextDesc(int index) {
		this.tcListContainer.get(index).nextPos();
		this.displayDesc();
	}


	public void displayDesc() {
		this.tcListContainer = this.tcController.getTestCaseList();
		System.out.println(this.tcListContainer.get(index1).getAt());
	}
	
	public void setInput(String input, int y, int x) { // 매개변수 필요함.
		tableObj.setTable(input, y, x);
	}

	public void analyzeCall() {
		this.feedbackContainer.clear();
		this.feedbackContainer.add(this.fbController.getFeedback(tableObj));

		if (this.fbController.isSuccessful(tableObj) == true) {
			this.tcController.makeTc();
			this.tcListContainer = this.tcController.getTestCaseList();
		}

		this.feedbackContainer.add(this.fbController.getFeedback(this.tcListContainer));
	}

	public String displayFeedback() {
		String feedbackMsg = "";
		for (int i = 0; i < this.feedbackContainer.size(); i++) {
			System.out.println(this.feedbackContainer.get(i).getMessage());
			feedbackMsg += this.feedbackContainer.get(i).getMessage();
		}
		return feedbackMsg;
	}

	public void displayTcList() {
		this.tcListContainer = this.tcController.getTestCaseList();
		for (int i = 0; i < this.tcListContainer.size(); i++) {
			for (int j = 0; j < this.tcListContainer.get(i).getSingTcList().size(); j++) {
				System.out.print(this.tcListContainer.get(i).getSingTcList().get(j).getReNum());
				if (j < this.tcListContainer.get(i).getSingTcList().size() - 1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

	public void saveCall() {
		tfController.saveRequest(this.tableObj, this.tcListContainer);
	}

	public void feedbackCall() {
		this.displayFeedback();
	}
}
