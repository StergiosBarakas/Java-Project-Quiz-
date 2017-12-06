package quizjava;

	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JComboBox;

	import javax.swing.JTextField;

	import javax.swing.JLabel;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;


	public class GUI extends JFrame {
		private static final long serialVersionUID = 1L;
		
		// The following variables need to be declared as Class variables (private), because they need to be accessed from within the event handler methods
		private Num1 sol1;
		private Num2 sol2;
		private Num3 sol3;
		private Num4 sol4;
		private Num5 sol5;
		private Num6 sol6;
		private Num7 sol7;
		private Num8 sol8;
		private Num9 sol9;
		private Num10 sol10;

		
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
		public GUI() {
			
			setBounds(0,0,804,1045); // Sets the size of the JFrames
			setLocationRelativeTo(null); // Positions the JFrame at the center of the computer screen
			getContentPane().setLayout(null);
			
			
						// Question 1
						JLabel label1 = new JLabel("1.What is the most venomous land snake in the world?");
						label1.setBounds(48, 29, 441, 20);
						getContentPane().add(label1);
				
						// Setting up the drop-down box 
						JComboBox<String> comboBox1 = new JComboBox<String>();
						comboBox1.setBounds(525, 26, 190, 26);
						getContentPane().add(comboBox1);
						comboBox1.addItem("Inland Taipan");
						comboBox1.addItem("Black Mamba");
						comboBox1.addItem("King Cobra");
						
						// Text field showing "Your answer was correct!", if the correct answer has been chosen, or shows the actual correct answer if the user submitted a wrong answer
						textField_1 = new JTextField();
						textField_1.setEditable(false);
						textField_1.setColumns(10);
						textField_1.setBounds(48, 60, 441, 23);
						getContentPane().add(textField_1);
						
						// The submit button which checks the answer, after which it disables answering, and then it gives the message "correct" or "false"
						JButton btnSayHello = new JButton("submit");
						btnSayHello.addActionListener(new ActionListener() {
			
							
					public void actionPerformed(ActionEvent arg0) {
						sol1 = new Num1(comboBox1.getSelectedItem().toString());
						JOptionPane.showMessageDialog(rootPane, sol1.greet());			
						if(sol1.greet()=="Correct") {textField_1.setText("A single bite from the Inland Taipan can kill 100 humans.");}
						else if(sol1.greet()!="Correct"){textField_1.setText("Correct answer: The Inland Taipan");}
						comboBox1.setEnabled(false);
					}
				});
						btnSayHello.setBounds(525, 63, 115, 26);
						getContentPane().add(btnSayHello);
			
				
						
						// Question 2
						JLabel label2 = new JLabel("2. When did the second world war end?");
						label2.setBounds(48, 114, 441, 20);
						getContentPane().add(label2);
						
						
						JComboBox<String> comboBox2 = new JComboBox<String>();
						comboBox2.setBounds(525, 111, 190, 26);
						getContentPane().add(comboBox2);
						comboBox2.addItem("1947");
						comboBox2.addItem("1944");
						comboBox2.addItem("1945");
						
						textField_2 = new JTextField();
						textField_2.setEditable(false);
						textField_2.setColumns(10);
						textField_2.setBounds(48, 145, 441, 23);
						getContentPane().add(textField_2);
						
						JButton btnSayHello2 = new JButton("submit");
						btnSayHello2.addActionListener(new ActionListener() {
			
							
					public void actionPerformed(ActionEvent arg0) {
						sol2 = new Num2(comboBox2.getSelectedItem().toString());
						JOptionPane.showMessageDialog(rootPane, sol2.greet());			
						if(sol2.greet()=="Correct") {textField_2.setText("The war officially ended on September 2, 1945.");}
						else if(sol2.greet()!="Correct"){textField_2.setText("Correct answer: In 1945");}
						comboBox2.setEnabled(false);
					}
				});
						btnSayHello2.setBounds(525, 148, 115, 26);
						getContentPane().add(btnSayHello2);
						
					
						
						
						
						// Question 3
						JLabel label3 = new JLabel("3. What knightly order was known for fighting in the northern crusades?");
						label3.setBounds(48, 199, 441, 20);
						getContentPane().add(label3);
						
						
						JComboBox<String> comboBox3 = new JComboBox<String>();
						comboBox3.setBounds(525, 196, 190, 26);
						getContentPane().add(comboBox3);
						comboBox3.addItem("Knights Templar");
						comboBox3.addItem("Teutonic Order");
						comboBox3.addItem("Knights Hospitaller");
						
						textField_3 = new JTextField();
						textField_3.setEditable(false);
						textField_3.setColumns(10);
						textField_3.setBounds(48, 230, 441, 26);
						getContentPane().add(textField_3);
						
						
						JButton btnSayHello3 = new JButton("submit");
						btnSayHello3.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol3 = new Num3(comboBox3.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol3.greet());			
							if(sol3.greet()=="Correct") {textField_3.setText("The Teutonic order spread Christianity to northern Europe and the Baltic.");}
							else if(sol3.greet()!="Correct"){textField_3.setText("Correct answer: The Teutonic Order");}
							comboBox3.setEnabled(false);
						}
						});
						
						btnSayHello3.setBounds(525, 233, 115, 26);
						getContentPane().add(btnSayHello3);
						
						
						
						// Question 4
						JLabel label4 = new JLabel("4. What animal has the strongest bite force in the animal kingdom?");
						label4.setBounds(48, 287, 441, 20);
						getContentPane().add(label4);
						
						
						JComboBox<String> comboBox4 = new JComboBox<String>();
						comboBox4.setBounds(525, 284, 190, 26);
						getContentPane().add(comboBox4);
						comboBox4.addItem("Grizzly Bear");
						comboBox4.addItem("Nile Crocodile");
						comboBox4.addItem("Jaguar");
						
						textField_4 = new JTextField();
						textField_4.setEditable(false);
						textField_4.setColumns(10);
						textField_4.setBounds(48, 328, 441, 23);
						getContentPane().add(textField_4);
						
						
						JButton btnSayHello4 = new JButton("submit");
						btnSayHello4.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol4 = new Num4(comboBox4.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol4.greet());			
							if(sol4.greet()=="Correct") {textField_4.setText("The Nile Crocodile can bite down with a force of 5000 psi.");}
							else if(sol4.greet()!="Correct"){textField_4.setText("Correct answer: The Nile Crocodile");}
							comboBox4.setEnabled(false);
						}
						});
						
						btnSayHello4.setBounds(525, 326, 115, 26);
						getContentPane().add(btnSayHello4);
						
						
						
						// Question 5
						JLabel label5 = new JLabel("5. What is the official name of the country of Luxenburg?");
						label5.setBounds(47, 381, 442, 20);
						getContentPane().add(label5);
						
						
						JComboBox<String> comboBox5 = new JComboBox<String>();
						comboBox5.setBounds(525, 378, 190, 26);
						getContentPane().add(comboBox5);
						comboBox5.addItem("Republic of Luxenburg");
						comboBox5.addItem("Grand Duchy of Luxenburg");
						comboBox5.addItem("Kingdom of Luxenburg");
						
						textField_5 = new JTextField();
						textField_5.setEditable(false);
						textField_5.setColumns(10);
						textField_5.setBounds(48, 427, 441, 23);
						getContentPane().add(textField_5);
						
						
						JButton btnSayHello5 = new JButton("submit");
						btnSayHello5.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol5 = new Num5(comboBox5.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol5.greet());			
							if(sol5.greet()=="Correct") {textField_5.setText("Luxenburg is the last remaining Grand Duchy in the world.");}
							else if(sol5.greet()!="Correct"){textField_5.setText("Correct answer: The Grand Duchy of Luxenburg");}
							comboBox5.setEnabled(false);
						}
						});
						
						btnSayHello5.setBounds(525, 425, 115, 26);
						getContentPane().add(btnSayHello5);
						
						
						
						
						// Question 6
						JLabel label6 = new JLabel("6. In what country does the river Severn flow?");
						label6.setBounds(48, 470, 441, 20);
						getContentPane().add(label6);
						
						
						JComboBox<String> comboBox6 = new JComboBox<String>();
						comboBox6.setBounds(525, 467, 190, 26);
						getContentPane().add(comboBox6);
						comboBox6.addItem("United Kingdom");
						comboBox6.addItem("France");
						comboBox6.addItem("Italy");
						
						textField_6 = new JTextField();
						textField_6.setEditable(false);
						textField_6.setColumns(10);
						textField_6.setBounds(48, 514, 441, 23);
						getContentPane().add(textField_6);
						
						
						JButton btnSayHello6 = new JButton("submit");
						btnSayHello6.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol6 = new Num6(comboBox6.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol6.greet());			
							if(sol6.greet()=="Correct") {textField_6.setText("Severn is the longest river in the United Kingdom.");}
							else if(sol6.greet()!="Correct"){textField_6.setText("Correct answer: The United Kingdom");}
							comboBox6.setEnabled(false);
						}
						});
						
						btnSayHello6.setBounds(525, 512, 115, 26);
						getContentPane().add(btnSayHello6);


						
						
						// Question 7
						JLabel label7 = new JLabel("7. What exactly is the blood-brain barrier in humans?");
						label7.setBounds(48, 569, 441, 20);
						getContentPane().add(label7);
						
						
						JComboBox<String> comboBox7 = new JComboBox<String>();
						comboBox7.setBounds(525, 566, 190, 26);
						getContentPane().add(comboBox7);
						comboBox7.addItem("A disease");
						comboBox7.addItem("Another term for an aneurysm");
						comboBox7.addItem("An defence mechanism");
						
						textField_7 = new JTextField();
						textField_7.setEditable(false);
						textField_7.setColumns(10);
						textField_7.setBounds(48, 615, 441, 23);
						getContentPane().add(textField_7);
						
						
						JButton btnSayHello7 = new JButton("submit");
						btnSayHello7.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol7 = new Num7(comboBox7.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol7.greet());			
							if(sol7.greet()=="Correct") {textField_7.setText("The blood–brain barrier acts to protect the brain from pathogens.");}
							else if(sol7.greet()!="Correct"){textField_7.setText("Correct answer: A defence mechanism");}
							comboBox7.setEnabled(false);
						}
						});
						
						btnSayHello7.setBounds(525, 613, 115, 26);
						getContentPane().add(btnSayHello7);
						
						
						
						// Question 8
						JLabel label8 = new JLabel("8. In the famous battle of Vienna in 1683, who was laying siege to the city?");
						label8.setBounds(48, 674, 441, 20);
						getContentPane().add(label8);
						
						
						JComboBox<String> comboBox8 = new JComboBox<String>();
						comboBox8.setBounds(525, 671, 190, 26);
						getContentPane().add(comboBox8);
						comboBox8.addItem("Byzantine Empire");
						comboBox8.addItem("Holy Roman Empire");
						comboBox8.addItem("Ottoman Empire");
						
						textField_8 = new JTextField();
						textField_8.setEditable(false);
						textField_8.setColumns(10);
						textField_8.setBounds(48, 723, 441, 23);
						getContentPane().add(textField_8);
						
						
						JButton btnSayHello8 = new JButton("submit");
						btnSayHello8.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol8 = new Num8(comboBox8.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol8.greet());			
							if(sol8.greet()=="Correct") {textField_8.setText("The Ottomans tried to take Vienna with a force of over 200000 men.");}
							else if(sol8.greet()!="Correct"){textField_8.setText("Correct answer: The Ottoman Empire");}
							comboBox8.setEnabled(false);
						}
						});
						
						btnSayHello8.setBounds(525, 721, 115, 26);
						getContentPane().add(btnSayHello8);
						
						
						
						
						// Question 9
						JLabel label9 = new JLabel("9. Who wrote the famous novel: 2001: A Space Odyssey?");
						label9.setBounds(48, 789, 441, 20);
						getContentPane().add(label9);
						
						
						JComboBox<String> comboBox9 = new JComboBox<String>();
						comboBox9.setBounds(525, 786, 190, 26);
						getContentPane().add(comboBox9);
						comboBox9.addItem("Isaac Asimov");
						comboBox9.addItem("Arthur C. Clarke");
						comboBox9.addItem("Carl Sagan");
						
						textField_9 = new JTextField();
						textField_9.setEditable(false);
						textField_9.setColumns(10);
						textField_9.setBounds(48, 835, 441, 23);
						getContentPane().add(textField_9);
						
						
						JButton btnSayHello9 = new JButton("submit");
						btnSayHello9.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol9 = new Num9(comboBox9.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol9.greet());			
							if(sol9.greet()=="Correct") {textField_9.setText("Arthur C. Clarke is one of the most influencial science fiction writers in history.");}
							else if(sol9.greet()!="Correct"){textField_9.setText("Correct answer: Arthur C. Clarke");}
							comboBox9.setEnabled(false);
						}
						});
						
						btnSayHello9.setBounds(525, 833, 115, 26);
						getContentPane().add(btnSayHello9);
						
						
						
						
						// Question 10
						JLabel label10 = new JLabel("10. How many years has the International Space Station been in orbit?");
						label10.setBounds(47, 895, 442, 20);
						getContentPane().add(label10);
						
						
						JComboBox<String> comboBox10 = new JComboBox<String>();
						comboBox10.setBounds(525, 892, 190, 26);
						getContentPane().add(comboBox10);
						comboBox10.addItem("19 years");
						comboBox10.addItem("23 years");
						comboBox10.addItem("15 years");
						
						textField_10 = new JTextField();
						textField_10.setEditable(false);
						textField_10.setColumns(10);
						textField_10.setBounds(48, 946, 441, 23);
						getContentPane().add(textField_10);
						
						
						JButton btnSayHello10 = new JButton("submit");
						btnSayHello10.addActionListener(new ActionListener() {
						
		
						public void actionPerformed(ActionEvent arg0) {
							sol10 = new Num10(comboBox10.getSelectedItem().toString());
							JOptionPane.showMessageDialog(rootPane, sol10.greet());			
							if(sol10.greet()=="Correct") {textField_10.setText("The International Space Station has been manned for 17 of its 19 years in orbit.");}
							else if(sol10.greet()!="Correct"){textField_10.setText("Correct answer: 19 years");}
							comboBox10.setEnabled(false);
						}
						});
						
						btnSayHello10.setBounds(525, 944, 115, 26);
						getContentPane().add(btnSayHello10);
						
						
		}

		public static void main(String[] args) {
			JFrame frame = new GUI();
			frame.setVisible(true);
		}
	}