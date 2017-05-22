import java.util.ArrayList;

public class TestCase {
	private ArrayList<SingleTestCase> singleTcList = new ArrayList<SingleTestCase>();
	public int pos = 0;
	TestCase(){	
	}
	
	public void nextPos(){
		if (pos > this.singleTcList.size() - 1) {
			pos = 0;
		}
		else{
			pos++;
		}
	}
	
	public void prevPos(){
		if (pos < 0) {
			pos = this.singleTcList.size()-1;
		} else {
			pos--;
		}
	}
	
	public ArrayList<SingleTestCase> getSingTcList(){
		return singleTcList;
	}
	
	public void add(String ref, String desc){
		SingleTestCase singleTc = new SingleTestCase(ref, desc);
		this.singleTcList.add(singleTc);
	}
	
	public String getAt(){
		return singleTcList.get(this.pos).getDesc();
	}
}
