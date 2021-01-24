package Account_Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.table.AbstractTableModel;

public class TableData extends AbstractTableModel{
	private List<Transaction>list;
	public TableData() {
		updateList();
	}
	public void updateList(){
		list = new ArrayList<>();
		try{			
			Scanner sc = new Scanner(new File("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\data.csv"));
			for(int i = 0; sc.hasNextLine();i++){
				String[] data = sc.nextLine().split(",");
				if(i != 0){
					Transaction t = new Transaction();
					TransactionBuilder tb = new TransactionBuilder(t);
					t = tb
							.name(data[0])
							.type(data[1])
							.amount(Double.parseDouble(data[2]))
							.note(data[3])
							.transaction();
					list.add(t);
				}
			}
				
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public int getRowCount() {
		return 4;
	}

	@Override
	public int getColumnCount() {
		return list.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return list.get(rowIndex).getName();
		case 1:
			return list.get(rowIndex).getType();
		case 2:
			return list.get(rowIndex).getAmount();
		case 3:
			return list.get(rowIndex).getNote();
		}
		return null;
	}
	
}
