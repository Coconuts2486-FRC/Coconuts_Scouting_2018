import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Yes_No_Delete_Panel extends JPanel {
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	/**
	 * Create the panel.
	 */
	public Yes_No_Delete_Panel() {
		setBackground(colors.red);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game_Array.model.removeElementAt(Log_Panel.list.getSelectedIndex());
				System.out.println(Log_Panel.list.getSelectedIndex());
				Game_Array.GameList.remove(Log_Panel.list.getSelectedIndex()+1);
				
				
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.main);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
			}
		});
		add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.main);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
			}
		});
		add(btnNo);
	}

}
