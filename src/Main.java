import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private javax.swing.JButton showPrev;
	private javax.swing.JButton showNext;
	private javax.swing.JButton analyzeButton;
	private static javax.swing.JButton saveButton;
	private javax.swing.JButton deleteRowButton;
	private static javax.swing.JButton addRowButton;
	private static javax.swing.JCheckBox ifCheckBox;
	private static javax.swing.JCheckBox singleCheckBox;
	private static javax.swing.JCheckBox errorCheckBox;
	private javax.swing.JLabel tcDescription;
	private javax.swing.JLabel tcDescriptionTitle;
	private javax.swing.JLabel tcListTitle;
	private javax.swing.JList<String> tcJList;
	private javax.swing.JPanel upperHalf;
	private javax.swing.JPanel bottomHalf;
	private javax.swing.JPanel tcSpecificContainer;
	private javax.swing.JPanel tcListContainer;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane tcJListContainer;
	private static javax.swing.JTable table;
	private static MainController mc;

	Main() {
		initComponents();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start GUI
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});

		mc = new MainController();

	}

	private void initComponents() {
		// TODO Auto-generated method stub

		upperHalf = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();
		bottomHalf = new javax.swing.JPanel();
		tcSpecificContainer = new javax.swing.JPanel();
		tcDescription = new javax.swing.JLabel();
		showPrev = new javax.swing.JButton();
		showNext = new javax.swing.JButton();
		tcDescriptionTitle = new javax.swing.JLabel();
		ifCheckBox = new javax.swing.JCheckBox();
		singleCheckBox = new javax.swing.JCheckBox();
		errorCheckBox = new javax.swing.JCheckBox();
		analyzeButton = new javax.swing.JButton();
		saveButton = new javax.swing.JButton();
		tcListContainer = new javax.swing.JPanel();
		tcListTitle = new javax.swing.JLabel();
		tcJListContainer = new javax.swing.JScrollPane();
		tcJList = new javax.swing.JList<>();
		deleteRowButton = new javax.swing.JButton();
		addRowButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setName("mainContainer"); // NOI18N

		upperHalf.setName("upperHalf"); // NOI18N

		table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		table.setGridColor(Color.black);
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null } },
				new String[] { "Ref #", "Category", "Sub-Category", "Sub-Category Detail", "If", "Property", "Single",
				"Error" }));
		table.setName("table"); // NOI18N
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(upperHalf);
		upperHalf.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)));

		bottomHalf.setName("bottomHalf"); // NOI18N

		tcSpecificContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		tcSpecificContainer.setName("tcSpecificContainer"); // NOI18N

		tcDescription.setBackground(new java.awt.Color(255, 255, 255));
		tcDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		tcDescription.setText("Description Here");
		tcDescription.setName("tcDescription"); // NOI18N

		showPrev.setBackground(new java.awt.Color(255, 255, 255));
		showPrev.setText("<");
		showPrev.setName("showPrev"); // NOI18N

		showNext.setBackground(new java.awt.Color(255, 255, 255));
		showNext.setText(">");
		showNext.setName("showNext"); // NOI18N

		tcDescriptionTitle.setBackground(new java.awt.Color(255, 255, 255));
		tcDescriptionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		tcDescriptionTitle.setText("Selected Step Description");
		tcDescriptionTitle.setName("tcDescriptionTitle"); // NOI18N

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(tcSpecificContainer);
		tcSpecificContainer.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(tcDescriptionTitle, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(tcDescription, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(showPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 141,
														Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(showNext, javax.swing.GroupLayout.PREFERRED_SIZE, 143,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addComponent(tcDescriptionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(tcDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 146,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(showPrev).addComponent(showNext))
						.addContainerGap()));

		ifCheckBox.setText("If-Property");
		ifCheckBox.setName("ifCheckBox"); // NOI18N

		singleCheckBox.setText("Single");
		singleCheckBox.setName("singleCheckBox"); // NOI18N

		errorCheckBox.setText("Error");
		errorCheckBox.setName("errorCheckBox"); // NOI18N

		analyzeButton.setText("Analyze");
		analyzeButton.setName("analyzeButton"); // NOI18N

		saveButton.setText("Save");
		saveButton.setName("saveButton"); // NOI18N

		tcListContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		tcListContainer.setName("tcListContainer"); // NOI18N

		tcListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		tcListTitle.setText("All Steps List");
		tcListTitle.setName("tcListTitle"); // NOI18N

		tcJListContainer.setName("tcJListContainer"); // NOI18N

		tcJList.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		tcJList.setName("tcJList"); // NOI18N
		tcJListContainer.setViewportView(tcJList);

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(tcListContainer);
		tcListContainer.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(tcListTitle,
								javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
						.addComponent(tcJListContainer));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addComponent(tcListTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 18,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(tcJListContainer)));

		deleteRowButton.setText("-");
		deleteRowButton.setName("deleteRowButton"); // NOI18N

		addRowButton.setText("+");
		addRowButton.setName("addRowButton"); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(bottomHalf);
		bottomHalf.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(tcListContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(tcSpecificContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(analyzeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(ifCheckBox)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58,
												Short.MAX_VALUE)
										.addComponent(addRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(deleteRowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(singleCheckBox).addComponent(errorCheckBox))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25)
										.addComponent(ifCheckBox))
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(deleteRowButton).addComponent(addRowButton)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(singleCheckBox)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(errorCheckBox).addGap(18, 18, 18)
								.addComponent(analyzeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(tcListContainer, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(tcSpecificContainer, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(upperHalf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(bottomHalf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(upperHalf, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(bottomHalf,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();

		addRowButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("A");
				// TODO Auto-generated method stub
				Object[] rowData = { null, null, null, null, null, null, null, null };
				DefaultTableModel td = (DefaultTableModel) table.getModel();
				td.addRow(rowData);

			}

		});

		deleteRowButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultTableModel td = (DefaultTableModel) table.getModel();
				td.removeRow(table.getSelectedRow());
			}

		});

		// TODO: CheckBox functions needs to be moved into Table.java
		ifCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.setInput(null, -1, 0);
				System.out.println("k");
			}

		});
		singleCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.setInput(null, -2, 0);
				System.out.println("kkk");
			}
		});
		errorCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mc.setInput(null, -3, 0);
				System.out.println("kk");
			}

		});
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("kkkkk");
				mc.saveCall();
			}
		});
		
		analyzeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getJTableData();
				mc.analyzeCall();
			}
			
		});
		
		analyzeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String feedback = mc.displayFeedback();
				ImageIcon icon = new ImageIcon("src/prof.png");
				if(feedback.length()>0){
		        JOptionPane.showMessageDialog(null, mc.displayFeedback(),
		                "준범's Feedback", JOptionPane.INFORMATION_MESSAGE, icon);
				};
			}
		});
		
	}
	/*
	 * @Rtn table values in double array
	 * 
	 * TODO needs to be moved into Table.java
	 */
	public static void getJTableData() {
		int rowCnt = table.getRowCount();
		int columnCnt = table.getColumnCount();
		
		for (int i = 0; i < rowCnt; i++) {
			for (int j = 0; j < columnCnt; j++) {
				if(table.getValueAt(i, j)!=null){
					System.out.println(i+j);
					mc.setInput(table.getValueAt(i, j).toString(),i,j);
				}
			}
		}
	}
}