import java.util.ArrayList;

public class TestCaseController {
   private ArrayList<TestCase> tcList = new ArrayList<TestCase>();
   
   private ArrayList<SingleTestCase> allDetail = new ArrayList<SingleTestCase>();
   private ArrayList<TestCase> allSub = new ArrayList<TestCase>();
   private ArrayList<TestCase> propertySub = new ArrayList<TestCase>();
   private ArrayList<TestCase> nonPropertySub = new ArrayList<TestCase>();
   
   private ArrayList<TestCase> propertyTc = new ArrayList<TestCase>();
   private ArrayList<TestCase> nonPropertyTc = new ArrayList<TestCase>();
   
   
   
   TestCaseController(){
      
   }
   
   public void analyzeTestCase(Table tableObj){
      
   }
   
   public void recursive1(TestCase data, int number, int count){
      ArrayList<SingleTestCase> subCategory = nonPropertySub.get(number).getSingTcList();   
      for(int i = 0 ; i < subCategory.size() ; i++){
         TestCase temp = data;
         temp.add(subCategory.get(i).getReNum(), subCategory.get(i).getDesc());
         if(count > 0){
            recursive1(temp, number+1, count-1);
         }else{
            nonPropertyTc.add(temp);
         }
      }
      return;
   }
   
   public void recursive2(ArrayList<String> property, TestCase data, int number, int count){
      ArrayList<SingleTestCase> subCategory = propertySub.get(number).getSingTcList();   
      for(int i = 0 ; i < subCategory.size() ; i++){
         ArrayList<String> tempProperty = property;
         TestCase temp = data;
         if(subCategory.get(i).getproperty() != null){
            tempProperty.add(subCategory.get(i).getproperty());
         }
         
         if(subCategory.get(i).getIF() != null){
            if(!tempProperty.contains(subCategory.get(i).getIF())){
               return;
            }
         }
         
         temp.add(subCategory.get(i).getReNum(), subCategory.get(i).getDesc());
         if(count > 0){
            recursive2(tempProperty, temp, number+1, count-1);
         }else{
            propertyTc.add(temp);
         }
      }
      return;
   }
   
   public void makeTc(){
      for(int i = 0 ; i < allDetail.size() ; i++){
         SingleTestCase detail = allDetail.get(i);
         if(detail.getError() == 1 || detail.getSingle() == 1){
            if(detail.getIF() != null){
               for(int j = 0  ; j < allDetail.size() ; j++){
                  SingleTestCase findDetail = allDetail.get(j);
                  if(findDetail.getproperty().equals(detail.getIF())){
                     if(findDetail.getIF() != null){
                        //문제점은 A-B 이런식의 간단한 if property만 현재 연결시켜줄수있음.
                     }
                     TestCase tc = new TestCase();
                     tc.add(findDetail.getReNum(), findDetail.getDesc());
                     tc.add(detail.getReNum(), detail.getDesc());
                     tcList.add(tc);
                  }
               }
            }
         }
      }//single이랑 error제외 해줬음. 
      
      for(int i = 0 ; i < allSub.size() ; i++){
         int j = 0;
         ArrayList<SingleTestCase> subCategory = allSub.get(i).getSingTcList();
         for(j = 0 ; j < subCategory.size() ; j++){
            SingleTestCase stc = subCategory.get(j);
            if(stc.getIF() != null || stc.getproperty() != null){
               propertySub.add(allSub.get(i));
               break;
            }
         }
         if(j == subCategory.size()){
            nonPropertySub.add(allSub.get(i));
         }
      }//일단 생각대로 propertySub의 순서가 잘 안나올수도 있다.
      
      TestCase data = new TestCase();
      ArrayList<String> property = new ArrayList<String>();
      
      this.recursive1(data, 0, nonPropertySub.size());
      this.recursive2(property, data, 0, propertySub.size());
      
      for(int i = 0 ; i < propertyTc.size() ; i++){
         TestCase tc = new TestCase();
         ArrayList<SingleTestCase> temp1 = propertyTc.get(i).getSingTcList();
         for(int j = 0 ; j < nonPropertyTc.size() ; j++){
            ArrayList<SingleTestCase> temp2 = nonPropertyTc.get(i).getSingTcList();
            for(int k = 0 ; k < temp1.size() ; k++){
               tc.add(temp1.get(i).getReNum(), temp1.get(i).getDesc());
            }
            for(int l = 0 ; l < temp2.size() ; l++){
               tc.add(temp2.get(j).getReNum(),  temp2.get(j).getDesc());
            }
            tcList.add(tc);
         }         
      }
   }
   
   public ArrayList<TestCase> getTestCaseList(){
      return tcList;
   }
}