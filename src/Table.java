import javax.swing.JTable;

public class Table {
	private String[][] table;
	private int row;
	private boolean[] Constraints = new boolean[3];
	Table(){
		this.row = 1;
		this.table = new String[row][8];
		this.Constraints[0] = false;
		this.Constraints[1] = false;
		this.Constraints[2] = false;
	}
	
	public void setTable(String input, int y, int x){
		if(y<0){
			this.setCheckBox(-y);
		}
		else{
			this.addRow(y);
			System.out.println(input);
			table[y][x] = input;
		}
	}
	
	public void addRow(int y){
		if(row == y+1){
			this.row++;
			String[][] newTable = new String[row][8];
			for(int i=0; i<row-1; i++){
				for(int j=0; j<8; j++){
					newTable[i][j] = this.table[i][j];
				}
			}
			this.table = newTable;
		}
	}
	
	public void setCheckBox(int index){	//checkbox는 -1 -2 -3으로 들어옴.
		if(this.Constraints[index-1]==true){
			this.Constraints[index-1] = false;
		}
		else if(this.Constraints[index-1]==false){
			this.Constraints[index-1] = true;
		}
	}
	
	public int getRow(){
		return this.row;
	}
	
	public String[][] getTable(){
		return this.table;
	}
	
	public boolean[] getConstraints(){
		return this.Constraints;
	}
}
