import java.io.*;

public class TextFileController {
	private File file;
	TextFileController(){
	}
	
	public void saveRequest(Table table, TestCase tcList){
		String fileName = "test.txt";
		
		try{
			file = new File(fileName);
			FileWriter fw = new FileWriter(file,true);
			
			for(int i = 0; i< table.getRow(); i++){
				for(int j=0; j<8; j++){
					if(table.getTable()[i][j]!=null){
						fw.write(table.getTable()[i][j]);
						fw.flush();
						fw.write('\t');
						fw.flush();
					}
					else{
						fw.write('\t');
						fw.flush();
						fw.write('\t');
						fw.flush();
					}
				}
				fw.write('\n');
				fw.flush();
			}
			for(int i=0; i<3; i++){
				if(table.getConstraints()[i]){
					if(i==0){
						fw.write("Check If-Property");
						fw.flush();
						fw.write('\n');
						fw.flush();
					}
					else if(i==1){
						fw.write("Check Single");
						fw.write('\n');
						fw.flush();
						fw.flush();
					}
					else if(i==2){
						fw.write("Check Error");
						fw.flush();
						fw.write('\n');
						fw.flush();
					}
				}
			}
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
