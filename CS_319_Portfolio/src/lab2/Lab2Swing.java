package cs.iastate.edu.cs319;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Lab2Swing extends JFrame {

	private JPanel topPanel;
	private		JTabbedPane tabbedPane;
	private		JPanel		panel1;
	private		JPanel		panel2;
	private		JPanel		panel3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab2Swing frame = new Lab2Swing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab2Swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(topPanel);
		topPanel.setLayout(null);
	
	// Create the tab pages
			createPage1();
			createPage2();
			createPage3();

			// Create a tabbed pane
			tabbedPane = new JTabbedPane();
			tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
			tabbedPane.addTab( "List", panel1 );
			tabbedPane.addTab( "Tree", panel2 );
			tabbedPane.addTab( "Table", panel3 );

			tabbedPane.setBounds(6, 6, 438, 266);
			topPanel.add( tabbedPane, BorderLayout.CENTER );
		}

		public void createPage1()
		{
			panel1 = new JPanel();
			panel1.setLayout( null );


		}

		public void createPage2()
		{
			panel2 = new JPanel();
			panel2.setLayout( null );

		}

		public void createPage3()
		{
			panel3 = new JPanel();
			panel3.setLayout( null );
			String[] columnNames = {"First Name",
                    "Last Name",
                    "Age",
                    "Sex",
                    "Vegetarian"};

			Object dataValues[][] = {
				    {"Kathy", "Smith", 25, "F", false},
				    {"John", "Doe", 43, "M", false},
				    {"Sue", "Black", 61, "F", true},
				    {"Jane", "White", 17, "F", true},
				    {"Joe", "Brown", 32, "M", false},
				    {"Abby", "Dawn", 41, "F", false},
				    {"Mila", "Manson", 26, "F", true},
				    {"Jack", "Schmitt", 32, "M", true}
				};
			JTable table = new JTable(dataValues, columnNames);
			
		}
}
