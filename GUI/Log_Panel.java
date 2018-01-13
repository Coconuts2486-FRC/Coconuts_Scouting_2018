import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;

public class Log_Panel extends JPanel {
	GUI_Colors colors = new GUI_Colors();
	/**
	 * Create the panel.
	 */
	public Log_Panel() {
		setLayout(null);
		setBackground(colors.red);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(6, 435, 178, 29);
		add(btnDelete);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(6, 413, 178, 29);
		add(btnEdit);
		
		JList list = new JList();
		list.setBounds(6, 6, 178, 400);
		add(list);

	}
}
