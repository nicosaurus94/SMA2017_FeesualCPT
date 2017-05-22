public class SingleTestCase {
   private String reNum;
   private String desc;
   private String subCategory;
   private String iF;
   private String property;
   private int single = 0;
   private int error = 0;
   
   SingleTestCase(){
   }
   
   SingleTestCase(String ref, String desc){
      this.reNum = ref;
      this.desc = desc;      
   }
   
   public void setIF(String IF){
	   this.iF = IF;
   }
   
   public void setProperty(String prop){
	   this.property = prop;
   }
   
   public void setSingle(){
	   this.
   }
   
   public void setError(){
	   
   }
   
   public String getReNum(){
      return this.reNum;
   }
   
   public void setReNum(String reNum){
      this.reNum = reNum;
   }
   
   public String getIF(){
      return this.iF;
   }
   
   public String getproperty(){
      return this.property;
   }
   
   public int getSingle(){
      return this.single;
   }
   
   public int getError(){
      return this.error;
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