import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Entry_Page extends JPanel {
	All_Panels panels = new All_Panels();
	GUI_Colors colors = new GUI_Colors();
	public static JTextField Auto_switch;
	public static JTextField Auto_Scale;
	public static JTextField Auto_comments;
	public static JTextField Teleop_switch;
	public static JTextField Teleop_Scale;
	public static JTextField Teleop_vault;
	public static JTextField Teleop_comments;
	public static JRadioButton rdbtnCrossedLine;
	public static JRadioButton rdbtnClimbed;
	public static JRadioButton rdbtnYellowFlag;
	public static JRadioButton rdbtnRedFlag;
	public static JRadioButton rdbtnMechanum;
	public static JRadioButton rdbtnWestCoast;
	public static JRadioButton rdbtnSwerve;
	public static JTextField teamNumber;
	public static JTextField roundNumber;
	public static JTextField Teleop_Opposite_Scale;
	
	public Entry_Page() {
		setBackground(colors.yellow);
		setLayout(null);
		
		JPanel Auto = new JPanel();
		Auto.setBackground(Color.BLUE);
		Auto.setBounds(0, 0, 295, 370);
		Auto.setBackground(colors.red);
		add(Auto);
		Auto.setLayout(null);
		
		JLabel lblAuto = new JLabel("Auto");
		lblAuto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuto.setBounds(0, 5, 295, 16);
		Auto.add(lblAuto);
		
		JLabel lblBlocksInSwitch = new JLabel("Blocks in Switch:");
		lblBlocksInSwitch.setBounds(20, 125, 106, 16);
		Auto.add(lblBlocksInSwitch);
		
		JButton Auto_switchAdd = new JButton("+");
		Auto_switchAdd.setBackground(Color.WHITE);
		Auto_switchAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		Auto_switchAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_switch.getText())+1;
				Auto_switch.setText(Integer.toString(x));
			}
		});
		Auto_switchAdd.setBounds(20, 153, 40, 40);
		Auto.add(Auto_switchAdd);
		
		JButton Auto_switchSubtract = new JButton("-");
		Auto_switchSubtract.setBackground(Color.WHITE);
		Auto_switchSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_switch.getText());
				int y = Integer.parseInt(Auto_switch.getText())-1;
				if(!(x==0)) {
					Auto_switch.setText(Integer.toString(y));
				}
			}
		});
		Auto_switchSubtract.setBounds(96, 153, 40, 40);
		Auto.add(Auto_switchSubtract);
		
		Auto_switch = new JTextField();
		Auto_switch.setEditable(false);
		Auto_switch.setBounds(138, 154, 130, 26);
		Auto.add(Auto_switch);
		Auto_switch.setColumns(10);
		
		JLabel lblBlocksInScale = new JLabel("Blocks in Scale:");
		lblBlocksInScale.setBounds(20, 195, 106, 16);
		Auto.add(lblBlocksInScale);
		
		JButton Auto_ScaleAdd = new JButton("+");
		Auto_ScaleAdd.setBackground(Color.WHITE);
		Auto_ScaleAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		Auto_ScaleAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_Scale.getText())+1;
				Auto_Scale.setText(Integer.toString(x));
			}
		});
		Auto_ScaleAdd.setBounds(20, 223, 40, 40);
		Auto.add(Auto_ScaleAdd);
		
		JButton Auto_ScaleSubtract = new JButton("-");
		Auto_ScaleSubtract.setBackground(Color.WHITE);
		Auto_ScaleSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_Scale.getText());
				int y = Integer.parseInt(Auto_Scale.getText())-1;
				if(!(x==0)) {
					Auto_Scale.setText(Integer.toString(y));
				}
			}
		});
		Auto_ScaleSubtract.setBounds(96, 223, 40, 40);
		Auto.add(Auto_ScaleSubtract);
		
		Auto_Scale = new JTextField();
		Auto_Scale.setEditable(false);
		Auto_Scale.setBounds(138, 224, 130, 26);
		Auto.add(Auto_Scale);
		Auto_Scale.setColumns(10);
		
		rdbtnCrossedLine = new JRadioButton("Crossed Line");
		rdbtnCrossedLine.setBackground(colors.red);
		rdbtnCrossedLine.setBounds(96, 316, 193, 23);
		Auto.add(rdbtnCrossedLine);
		
		Auto_comments = new JTextField();
		Auto_comments.setBounds(5, 338, 285, 26);
		Auto.add(Auto_comments);
		Auto_comments.setColumns(10);
		
		JLabel lblComments = new JLabel("Comments:");
		lblComments.setBounds(20, 320, 120, 16);
		Auto.add(lblComments);
		
		JLabel lblRound = new JLabel("Round #:");
		lblRound.setBounds(10, 70, 100, 30);
		Auto.add(lblRound);
		lblRound.setForeground(Color.YELLOW);
		lblRound.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		JLabel lblTeam = new JLabel("Team #:");
		lblTeam.setBounds(10, 28, 100, 30);
		Auto.add(lblTeam);
		lblTeam.setForeground(Color.YELLOW);
		lblTeam.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		teamNumber = new JTextField();
		teamNumber.setBounds(138, 28, 130, 26);
		Auto.add(teamNumber);
		teamNumber.setColumns(10);
		
		roundNumber = new JTextField();
		roundNumber.setBounds(138, 75, 130, 26);
		Auto.add(roundNumber);
		roundNumber.setColumns(10);
		
		JPanel Teleop = new JPanel();
		Teleop.setBorder(null);
		Teleop.setBounds(300, 0, 295, 370);
		Teleop.setBackground(colors.red);
		add(Teleop);
		Teleop.setLayout(null);
		
		JLabel lblTeleop = new JLabel("Teleop");
		lblTeleop.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeleop.setBounds(0, 5, 295, 16);
		Teleop.add(lblTeleop);
		
		JLabel lblBlocksInSwitch_1 = new JLabel("Blocks in Switch:");
		lblBlocksInSwitch_1.setBounds(20, 28, 106, 16);
		Teleop.add(lblBlocksInSwitch_1);
		
		JButton Teleop_switchAdd = new JButton("+");
		Teleop_switchAdd.setBackground(Color.WHITE);
		Teleop_switchAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		Teleop_switchAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_switch.getText())+1;
				Teleop_switch.setText(Integer.toString(x));
			}
		});
		Teleop_switchAdd.setBounds(20, 56, 40, 40);
		Teleop.add(Teleop_switchAdd);
		
		JButton Teleop_switchSubtract = new JButton("-");
		Teleop_switchSubtract.setBackground(Color.WHITE);
		Teleop_switchSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_switch.getText());
				int y = Integer.parseInt(Teleop_switch.getText())-1;
				if(!(x==0)) {
					Teleop_switch.setText(Integer.toString(y));
				}
			}
		});
		Teleop_switchSubtract.setBounds(96, 56, 40, 40);
		Teleop.add(Teleop_switchSubtract);
		
		Teleop_switch = new JTextField();
		Teleop_switch.setEditable(false);
		Teleop_switch.setBounds(138, 57, 130, 26);
		Teleop.add(Teleop_switch);
		Teleop_switch.setColumns(10);
		
		JLabel lblBlocksInScale_1 = new JLabel("Blocks in Scale:");
		lblBlocksInScale_1.setBounds(20, 98, 106, 16);
		Teleop.add(lblBlocksInScale_1);
		
		JButton Teleop_ScaleAdd = new JButton("+");
		Teleop_ScaleAdd.setBackground(Color.WHITE);
		Teleop_ScaleAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		Teleop_ScaleAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_Scale.getText())+1;
				Teleop_Scale.setText(Integer.toString(x));
			}
		});
		Teleop_ScaleAdd.setBounds(20, 126, 40, 40);
		Teleop.add(Teleop_ScaleAdd);
		
		JButton Teleop_ScaleSubtract = new JButton("-");
		Teleop_ScaleSubtract.setBackground(Color.WHITE);
		Teleop_ScaleSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_Scale.getText());
				int y = Integer.parseInt(Teleop_Scale.getText())-1;
				if(!(x==0)) {
					Teleop_Scale.setText(Integer.toString(y));
				}
			}
		});
		Teleop_ScaleSubtract.setBounds(96, 126, 40, 40);
		Teleop.add(Teleop_ScaleSubtract);
		
		Teleop_Scale = new JTextField();
		Teleop_Scale.setEditable(false);
		Teleop_Scale.setBounds(138, 127, 130, 26);
		Teleop.add(Teleop_Scale);
		Teleop_Scale.setColumns(10);
		
		JLabel lblBlocksInVault = new JLabel("Blocks in Vault:");
		lblBlocksInVault.setBounds(20, 168, 106, 16);
		Teleop.add(lblBlocksInVault);
		
		JButton Teleop_vaultAdd = new JButton("+");
		Teleop_vaultAdd.setBackground(Color.WHITE);
		Teleop_vaultAdd.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		Teleop_vaultAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_vault.getText())+1;
				Teleop_vault.setText(Integer.toString(x));
			}
		});
		Teleop_vaultAdd.setBounds(20, 196, 40, 40);
		Teleop.add(Teleop_vaultAdd);
		
		JButton Teleop_vaultSubtract = new JButton("-");
		Teleop_vaultSubtract.setBackground(Color.WHITE);
		Teleop_vaultSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_vault.getText());
				int y = Integer.parseInt(Teleop_vault.getText())-1;
				if(!(x==0)) {
					Teleop_vault.setText(Integer.toString(y));
				}
			}
		});
		Teleop_vaultSubtract.setBounds(96, 196, 40, 40);
		Teleop.add(Teleop_vaultSubtract);
		
		Teleop_vault = new JTextField();
		Teleop_vault.setBounds(138, 197, 130, 26);
		Teleop.add(Teleop_vault);
		Teleop_vault.setColumns(10);
		
		Teleop_comments = new JTextField();
		Teleop_comments.setBounds(5, 338, 285, 26);
		Teleop.add(Teleop_comments);
		Teleop_comments.setColumns(10);
		
		JLabel lblComments_1 = new JLabel("Comments:");
		lblComments_1.setBounds(20, 320, 120, 16);
		Teleop.add(lblComments_1);
		
		JLabel lblBlocksInOpposite = new JLabel("Blocks In Opposite Scale:");
		lblBlocksInOpposite.setBounds(20, 248, 158, 16);
		Teleop.add(lblBlocksInOpposite);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_Opposite_Scale.getText())+1;
				Teleop_Opposite_Scale.setText(Integer.toString(x));
			}
		});
		button.setBounds(20, 276, 40, 40);
		Teleop.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_Opposite_Scale.getText());
				int y = Integer.parseInt(Teleop_Opposite_Scale.getText())-1;
				if(!(x==0)) {
					Teleop_Opposite_Scale.setText(Integer.toString(y));
				}
			}
		});
		button_1.setBounds(96, 276, 40, 40);
		Teleop.add(button_1);
		
		Teleop_Opposite_Scale = new JTextField();
		Teleop_Opposite_Scale.setBounds(138, 282, 130, 26);
		Teleop.add(Teleop_Opposite_Scale);
		Teleop_Opposite_Scale.setColumns(10);
		
		rdbtnClimbed = new JRadioButton("Climbed");
		rdbtnClimbed.setBounds(96, 316, 193, 23);
		Teleop.add(rdbtnClimbed);
		rdbtnClimbed.setBackground(colors.red);
		
		JPanel General = new JPanel();
		General.setBorder(null);
		General.setBounds(0, 375, 595, 95);
		General.setBackground(colors.red);
		add(General);
		General.setLayout(null);
		
		JLabel lblOther = new JLabel("Flags:");
		lblOther.setBounds(5, 5, 61, 16);
		General.add(lblOther);
		
		rdbtnRedFlag = new JRadioButton("Red Flag");
		rdbtnRedFlag.setBounds(6, 66, 103, 23);
		rdbtnRedFlag.setBackground(colors.red);
		General.add(rdbtnRedFlag);
		
		rdbtnYellowFlag = new JRadioButton("Yellow Flag");
		rdbtnYellowFlag.setBounds(6, 31, 103, 23);
		rdbtnYellowFlag.setBackground(colors.red);
		General.add(rdbtnYellowFlag);
		
		JLabel lblDrivetrain = new JLabel("Drivetrain:");
		lblDrivetrain.setBounds(295, 5, 75, 16);
		General.add(lblDrivetrain);
		
		rdbtnMechanum = new JRadioButton("Mechanum");
		rdbtnMechanum.setBackground(colors.red);
		rdbtnMechanum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(true);
				rdbtnWestCoast.setSelected(false);
				rdbtnSwerve.setSelected(false);
				
			}
		});
		rdbtnMechanum.setBounds(382, 5, 141, 23);
		General.add(rdbtnMechanum);
		
		rdbtnWestCoast = new JRadioButton("West Coast");
		rdbtnWestCoast.setBackground(colors.red);
		rdbtnWestCoast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(false);
				rdbtnWestCoast.setSelected(true);
				rdbtnSwerve.setSelected(false);
			}
		});
		rdbtnWestCoast.setBounds(382, 35, 141, 23);
		General.add(rdbtnWestCoast);
		
		rdbtnSwerve = new JRadioButton("Swerve");
		rdbtnSwerve.setBackground(colors.red);
		rdbtnSwerve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(false);
				rdbtnWestCoast.setSelected(false);
				rdbtnSwerve.setSelected(true);
			}
		});
		rdbtnSwerve.setBounds(382, 66, 141, 23);
		General.add(rdbtnSwerve);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(133, 30, 117, 29);
		General.add(btnCancel);
		btnCancel.setBackground(Color.WHITE);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(133, 65, 117, 29);
		General.add(btnSave);
		btnSave.setBackground(Color.WHITE);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry_Page_Setup EPS = new Entry_Page_Setup();
				EPS.EnterData();
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.ynEntry);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
			}
		});

	}
}
