package GUI;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class lesson3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		String [] headings = new String[] {"ID","Name","Country"};
		Object [][] data = new Object[][] {
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"},
			{"1","Daniel","Korea",},
			{"2","Sunny","France"},
			{"3","John","Japan"}
		};
		JTable table = new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		table.setFillsViewportHeight(true);
		
		p.add(new JScrollPane(table));
		f.add(p);
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setSize(800,640);
		f.setLocationRelativeTo(null);
	}

}
