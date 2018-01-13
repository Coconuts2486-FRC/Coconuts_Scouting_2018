import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class Login_Panel extends JPanel {
	private JTextField first;
	private JTextField last;
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	private JRadioButton rdbtnHustonChampionship;
	private JRadioButton rdbtnAzNorth;
	private JRadioButton rdbtnLosAngelesRegional;
	User_Data userdata = new User_Data();

	/**
	 * Create the panel.
	 */
	public Login_Panel() {
		setLayout(null);
		setBackground(colors.red);
		
		
		JLabel lblWelcomeToTeam = new JLabel("Welcome to Team 2486's 2018 Scouting Application ");
		lblWelcomeToTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToTeam.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblWelcomeToTeam.setBounds(6, 6, 583, 55);
		add(lblWelcomeToTeam);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(6, 353, 100, 16);
		add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(6, 381, 100, 16);
		add(lblLastName);
		
		first = new JTextField();
		first.setBounds(118, 348, 160, 26);
		add(first);
		first.setColumns(10);
		
		last = new JTextField();
		last.setBounds(118, 376, 160, 26);
		add(last);
		last.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!first.getText().equals("")&&!last.getText().equals("")) {
				if(rdbtnAzNorth.isSelected()||rdbtnLosAngelesRegional.isSelected()||rdbtnHustonChampionship.isSelected()) {
					userdata.FirstName=first.getText();
					userdata.LastName=last.getText();
					System.out.println("-----"+last.getText());
					if(rdbtnAzNorth.isSelected()) {
						userdata.Regional="AZ North";
						}
					if(rdbtnLosAngelesRegional.isSelected()) {
						userdata.Regional="Los Angeles";
					}
					if(rdbtnHustonChampionship.isSelected()) {
						userdata.Regional="Huston Championship";
					}
					
					Main_Frame.main_panel.removeAll();
					Main_Frame.main_panel.repaint();
					Main_Frame.main_panel.revalidate();
					
					
					Main_Frame.main_panel.add(panels.main);
					Main_Frame.main_panel.repaint();
					Main_Frame.main_panel.revalidate();	
				}
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(6, 409, 583, 55);
		add(btnNewButton);
		
		JLabel icon = new JLabel("");
		icon.setBounds(6, 73, 272, 272);
		String path="./Resources/Coconuts.png";//./Resources
		
		ImageIcon myimage = new ImageIcon (path);
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		add(icon);
		
		rdbtnAzNorth = new JRadioButton("AZ North Regional");
		rdbtnAzNorth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(true);
				rdbtnLosAngelesRegional.setSelected(false);
				rdbtnHustonChampionship.setSelected(false);
			}
		});
		rdbtnAzNorth.setBounds(290, 377, 200, 23);
		add(rdbtnAzNorth);
		
		rdbtnLosAngelesRegional = new JRadioButton("Los Angeles Regional");
		rdbtnLosAngelesRegional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(false);
				rdbtnLosAngelesRegional.setSelected(true);
				rdbtnHustonChampionship.setSelected(false);
			}
		});
		rdbtnLosAngelesRegional.setBounds(290, 349, 200, 23);
		add(rdbtnLosAngelesRegional);
		
		rdbtnHustonChampionship = new JRadioButton("Huston Championship");
		rdbtnHustonChampionship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(false);
				rdbtnLosAngelesRegional.setSelected(false);
				rdbtnHustonChampionship.setSelected(true);
			}
		});
		rdbtnHustonChampionship.setBounds(290, 322, 200, 23);
		add(rdbtnHustonChampionship);

	}
}
