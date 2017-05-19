
public class Feedback {
	private String errorMessages;
	Feedback(String str){
		this.errorMessages = str;
	}
	
	public String getMessage(){
		return errorMessages;
	}
}
