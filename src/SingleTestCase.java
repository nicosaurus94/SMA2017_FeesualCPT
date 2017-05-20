
public class SingleTestCase {
	private int reNum;
	private String desc;
	SingleTestCase(){
		
	}
	SingleTestCase(int ref, String desc){
		this.reNum = ref;
		this.desc = desc;
	}
	
	public int getReNum(){
		return this.reNum;
	}
	
	public void setReNum(int reNum){
		this.reNum = reNum;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
}
