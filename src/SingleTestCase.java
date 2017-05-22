
public class SingleTestCase {
	private String reNum;
	private String desc;
	private String subCategory;
	
	SingleTestCase(){
		
	}
	SingleTestCase(String ref, String desc, String sub){
		this.reNum = ref;
		this.desc = desc;
		this.subCategory = sub;
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
	
	public String getSubCategory(){
		return this.subCategory;
	}
	
	public void setSubCategory(String sub){
		this.subCategory = sub;
	}
}
