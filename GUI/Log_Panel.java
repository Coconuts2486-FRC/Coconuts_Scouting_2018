import javax.swing.JPanel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Log_Panel extends JPanel {
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	public static JList list;
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public Log_Panel() {
		setLayout(null);
		setBackground(colors.red);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.ynDelete);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
			}
		});
		btnDelete.setBounds(6, 435, 178, 20);
		add(btnDelete);
		
		
		
		list = new JList(Game_Array.GameMap.keySet().toArray());
		
		
		list.setBounds(6, 6, 178, 400);
		add(list);

		JButton btnEdit = new JButton("Edit");
		btnEdit.setBackground(Color.WHITE);
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Entry_Page_Setup ESP = new Entry_Page_Setup();
			ESP.LoadData(list.getSelectedIndex());
			}
		});
		btnEdit.setBounds(6, 413, 178, 20);
		add(btnEdit);
	}
}
