import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.CardLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Main_Frame extends JFrame {

	private JPanel contentPane;
	All_Panels panels = new All_Panels();
	public static JPanel main_panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame frame = new Main_Frame();
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
	public Main_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		main_panel = new JPanel();
		main_panel.setBorder(null);
		main_panel.setBounds(5, 5, 595, 470);
		contentPane.add(main_panel);
		main_panel.setLayout(new CardLayout(0, 0));
		
		JPanel log_panel = new JPanel();
		log_panel.setBorder(null);
		log_panel.setBounds(605, 5, 190, 470);
		contentPane.add(log_panel);
		log_panel.setLayout(new CardLayout(0, 0));
		JPanel login = new Login_Panel();
		main_panel.add(panels.login);
		log_panel.add(panels.log);
		
	}
}
