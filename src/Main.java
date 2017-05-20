import javax.swing.JFrame;

<<<<<<< HEAD
public class Main extends JFrame {
	private javax.swing.JButton showPrev;
	private javax.swing.JButton showNext;
	private javax.swing.JButton analyzeButton;
	private javax.swing.JButton saveButton;
	private javax.swing.JCheckBox ifCheckBox;
	private javax.swing.JCheckBox singleCheckBox;
	private javax.swing.JCheckBox errorCheckBox;
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
	private javax.swing.JTable table;

	Main() {
		initComponents();
	}
=======
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67

public class Main extends JFrame {


	private javax.swing.JButton showPrev;
	private javax.swing.JButton showNext;
	private javax.swing.JButton analyzeButton;
	private javax.swing.JButton saveButton;
	private javax.swing.JCheckBox ifCheckBox;
	private javax.swing.JCheckBox singleCheckBox;
	private javax.swing.JCheckBox errorCheckBox;
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
	private javax.swing.JTable table;
	
	Main(){
		initComponents();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

		// Start GUI
=======
		
		//Start GUI
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
<<<<<<< HEAD

=======
		
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67
		MainController mc = new MainController();
		mc.setInput("ref 1", 0, 0);
		mc.setInput("Category 1", 0, 1);
		mc.setInput("Sub-Category 1", 0, 2);
		mc.setInput("Sub-Category Detail 1", 0, 3);
		mc.setInput("If 1", 0, 4);
		mc.setInput("property 1", 0, 5);
		mc.setInput("single 1", 0, 6);
		mc.setInput("error 1", 0, 7);
		mc.setInput("ref 2", 1, 0);
		mc.setInput("Category 2", 1, 1);
		mc.setInput("Sub-Category 2", 1, 2);
		mc.setInput("Sub-Category Detail 2", 1, 3);
		mc.setInput("If 2", 1, 4);
		mc.setInput("property 2", 1, 5);
		mc.setInput("single 2", 1, 6);
		mc.setInput("error 2", 1, 7);
		mc.setInput("SBD", 2, 3);
		mc.setInput(" ", -1, 0);
		mc.setInput(" ", -3, 0);
		mc.saveCall();
		System.out.println("end");
	}
<<<<<<< HEAD

=======
	
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67
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

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setName("mainContainer"); // NOI18N

		upperHalf.setName("upperHalf"); // NOI18N

<<<<<<< HEAD
		table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		table.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
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
=======
		table.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		table.setName("table"); // NOI18N
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				upperHalf);
		upperHalf.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 219,
								Short.MAX_VALUE)));

		bottomHalf.setName("bottomHalf"); // NOI18N

		tcSpecificContainer.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67
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

<<<<<<< HEAD
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
=======
		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				tcSpecificContainer);
		tcSpecificContainer.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(tcDescriptionTitle,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																tcDescription,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				showPrev,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				141,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				showNext,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				143,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												tcDescriptionTitle,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												18,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												tcDescription,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												146,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(showPrev)
														.addComponent(showNext))
										.addContainerGap()));
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67

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

<<<<<<< HEAD
		tcListContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
=======
		tcListContainer.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67
		tcListContainer.setName("tcListContainer"); // NOI18N

		tcListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		tcListTitle.setText("All Steps List");
		tcListTitle.setName("tcListTitle"); // NOI18N

		tcJListContainer.setName("tcJListContainer"); // NOI18N

		tcJList.setModel(new javax.swing.AbstractListModel<String>() {
<<<<<<< HEAD
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
=======
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		tcJList.setName("tcJList"); // NOI18N
		tcJListContainer.setViewportView(tcJList);

<<<<<<< HEAD
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
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(ifCheckBox).addComponent(singleCheckBox)
												.addComponent(errorCheckBox))
										.addGap(0, 78, Short.MAX_VALUE))
								.addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(25, 25, 25).addComponent(ifCheckBox)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(singleCheckBox)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(errorCheckBox)
						.addGap(18, 18, 18)
						.addComponent(analyzeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(tcListContainer, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tcSpecificContainer, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
=======
		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				tcListContainer);
		tcListContainer.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						jPanel4Layout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(tcListTitle,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										285, Short.MAX_VALUE))
				.addComponent(tcJListContainer));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addComponent(
												tcListTitle,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												18,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(tcJListContainer)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				bottomHalf);
		bottomHalf.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												tcListContainer,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												tcSpecificContainer,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																analyzeButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								ifCheckBox)
																						.addComponent(
																								singleCheckBox)
																						.addComponent(
																								errorCheckBox))
																		.addGap(0,
																				78,
																				Short.MAX_VALUE))
														.addComponent(
																saveButton,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(ifCheckBox)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(singleCheckBox)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(errorCheckBox)
										.addGap(18, 18, 18)
										.addComponent(
												analyzeButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												saveButton,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																tcListContainer,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																tcSpecificContainer,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(upperHalf, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(bottomHalf, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(upperHalf,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(bottomHalf,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
>>>>>>> 4ef81ce46eeef3b0878e8293235bc54afef0ae67

		pack();

	}
}
