import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Yes_No_Entry_Panel extends JPanel {
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	/**
	 * Create the panel.
	 */
	public Yes_No_Entry_Panel() {
		setBackground(colors.red);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry_Page_Setup EPS = new Entry_Page_Setup();
				EPS.Clear();
			}
		});
		add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.entry);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
			}
		});
		add(btnNo);
	}

}
