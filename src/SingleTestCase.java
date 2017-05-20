
public class SingleTestCase {
	private String reNum;
	private String desc;
	SingleTestCase(){
		
	}
	SingleTestCase(String ref, String desc){
		this.reNum = ref;
		this.desc = desc;
	}
	
	public String getReNum(){
		return this.reNum;
	}
	
	public void setReNum(String reNum){
		this.reNum = reNum;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
}
