
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainController mc = new MainController();
		mc.setInput("ref 1", 0, 0);
		mc.setInput("Category 1", 0, 1);
		mc.setInput("Sub-Category 1", 0, 2);
		mc.setInput("Sub-Category Detail 1", 0, 3);
		mc.setInput("If 1", 0, 4);
		mc.setInput("property 1", 0, 5);
		mc.setInput("single 1", 0, 6);
		mc.setInput("error 1", 0, 7);
		mc.setInput("ref 2", 1, 0);
		mc.setInput("Category 2", 1, 1);
		mc.setInput("Sub-Category 2", 1, 2);
		mc.setInput("Sub-Category Detail 2", 1, 3);
		mc.setInput("If 2", 1, 4);
		mc.setInput("property 2", 1, 5);
		mc.setInput("single 2", 1, 6);
		mc.setInput("error 2", 1, 7);
		mc.setInput("SBD", 2, 3);
		mc.setInput(" ", -1, 0);
		mc.setInput(" ", -3, 0);
		mc.saveCall();
		System.out.println("end");
	}
}
