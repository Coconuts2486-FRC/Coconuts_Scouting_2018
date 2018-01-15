import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Login_Panel extends JPanel {
	private JTextField first;
	private JTextField last;
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	private JRadioButton rdbtnHoustonChampionship;
	private JRadioButton rdbtnAzNorth;
	private JRadioButton rdbtnVenturaRegional;

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
		lblFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblFirstName.setBounds(6, 353, 100, 16);
		add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
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
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!first.getText().equals("")&&!last.getText().equals("")) {
				if(rdbtnAzNorth.isSelected()||rdbtnVenturaRegional.isSelected()||rdbtnHoustonChampionship.isSelected()) {
					User_Data.FirstName=first.getText();
					Main_Panel.FirstNameField.setText(User_Data.FirstName);
					User_Data.LastName=last.getText();
					Main_Panel.LastNameField.setText(User_Data.LastName);
					Date date = new Date();
					Main_Panel.DateField.setText(date.toString());
					if(rdbtnAzNorth.isSelected()) {
						User_Data.Regional="AZ North";
						Main_Panel.RegionalFeild.setText(User_Data.Regional);
						}
					if(rdbtnVenturaRegional.isSelected()) {
						User_Data.Regional="Ventura";
						Main_Panel.RegionalFeild.setText(User_Data.Regional);
					}
					if(rdbtnHoustonChampionship.isSelected()) {
						User_Data.Regional="Houston Championship";
						Main_Panel.RegionalFeild.setText(User_Data.Regional);
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
		
		JLabel icon = new JLabel();
		icon.setBounds(6, 73, 272, 272);
		File file = new File("./Resources");
		if(!file.exists()) {
		file.mkdir();
		}
		String path="./Resources/Coconuts.png";//./Resources
		
		ImageIcon myimage = new ImageIcon (path);
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		add(icon);
		
		rdbtnAzNorth = new JRadioButton("AZ North Regional");
		rdbtnAzNorth.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		rdbtnAzNorth.setBackground(colors.red);
		rdbtnAzNorth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(true);
				rdbtnVenturaRegional.setSelected(false);
				rdbtnHoustonChampionship.setSelected(false);
			}
		});
		rdbtnAzNorth.setBounds(290, 377, 300, 23);
		add(rdbtnAzNorth);
		
		rdbtnVenturaRegional = new JRadioButton("Ventura Regional");
		rdbtnVenturaRegional.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		rdbtnVenturaRegional.setBackground(colors.red);
		rdbtnVenturaRegional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(false);
				rdbtnVenturaRegional.setSelected(true);
				rdbtnHoustonChampionship.setSelected(false);
			}
		});
		rdbtnVenturaRegional.setBounds(290, 349, 300, 23);
		add(rdbtnVenturaRegional);
		
		rdbtnHoustonChampionship = new JRadioButton("Houston Championship");
		rdbtnHoustonChampionship.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		rdbtnHoustonChampionship.setBackground(colors.red);
		rdbtnHoustonChampionship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAzNorth.setSelected(false);
				rdbtnVenturaRegional.setSelected(false);
				rdbtnHoustonChampionship.setSelected(true);
			}
		});
		rdbtnHoustonChampionship.setBounds(290, 322, 300, 23);
		add(rdbtnHoustonChampionship);

	}
}
