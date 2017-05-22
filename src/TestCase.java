import java.util.ArrayList;

public class TestCase {
	private ArrayList<SingleTestCase> singleTcList = new ArrayList<SingleTestCase>();
	public int pos;
	TestCase(){	
	}
	
	public void nextPos(){
		if(pos < this.singleTcList.size()-1){
			pos++;
		}
	}
	
	public void prevPos(){
		if(pos>0){
			pos--;
		}
	}
	
	public ArrayList<SingleTestCase> getSingTcList(){
		return singleTcList;
	}
	
	public void add(String ref, String desc, String sub){
		SingleTestCase singleTc = new SingleTestCase(ref, desc, sub);
		this.singleTcList.add(singleTc);
	}
	
	public SingleTestCase getAt(int idx){
		this.pos = 0;
		return singleTcList.get(idx);
	}
}
