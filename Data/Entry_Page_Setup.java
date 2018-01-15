import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Entry_Page_Setup {
	All_Panels panels = new All_Panels();
	//Clear A Page ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	public void Clear() {
		Entry_Page.Auto_comments.setText("");
		Entry_Page.Auto_Scale.setText("0");
		Entry_Page.Auto_switch.setText("0");
		Entry_Page.Teleop_Scale.setText("0");
		Entry_Page.Teleop_comments.setText("");
		Entry_Page.Teleop_switch.setText("0");
		Entry_Page.Teleop_vault.setText("0");
		Entry_Page.rdbtnClimbed.setSelected(false);
		Entry_Page.rdbtnCrossedLine.setSelected(false);
		Entry_Page.rdbtnMechanum.setSelected(false);
		Entry_Page.rdbtnRedFlag.setSelected(false);
		Entry_Page.rdbtnSwerve.setSelected(false);
		Entry_Page.rdbtnWestCoast.setSelected(false);
		Entry_Page.rdbtnYellowFlag.setSelected(false);
		Entry_Page.teamNumber.setText("0");
		Entry_Page.roundNumber.setText("0");
	}
	@SuppressWarnings("unchecked")
	//Saving Data  ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	public void EnterData() {
	Game_Data data = new Game_Data();
	//Auto--------------------------------------------------------------------
	data.Auto_blocksInScale=Integer.parseInt(Entry_Page.Auto_Scale.getText());
	data.Auto_blocksInSwitch=Integer.parseInt(Entry_Page.Auto_switch.getText());
	data.Auto_crossedLine=Entry_Page.rdbtnCrossedLine.isSelected();
	data.Auto_comments=Entry_Page.Auto_comments.getText();
	//Teleop------------------------------------------------------------------
	data.Teleop_blocksInScale=Integer.parseInt(Entry_Page.Teleop_Scale.getText());
	data.Teleop_blocksInSwitch=Integer.parseInt(Entry_Page.Teleop_switch.getText());
	data.Teleop_blocksInVault=Integer.parseInt(Entry_Page.Teleop_vault.getText());
	data.Teleop_climbed=Entry_Page.rdbtnClimbed.isSelected();
	data.Teleop_comments=Entry_Page.Teleop_comments.getText();
	//General-----------------------------------------------------------------
	data.redFlag=Entry_Page.rdbtnRedFlag.isSelected();
	data.yellowFlag=Entry_Page.rdbtnYellowFlag.isSelected();
	
	data.roundNumber=Integer.parseInt(Entry_Page.roundNumber.getText());
	data.teamNumber=Integer.parseInt(Entry_Page.teamNumber.getText());
	
	data.mechanum=Entry_Page.rdbtnMechanum.isSelected();
	data.swerve=Entry_Page.rdbtnSwerve.isSelected();
	data.westCoast=Entry_Page.rdbtnWestCoast.isSelected();
	
	if(!Integer.toString(data.teamNumber).equals("0")&&!Integer.toString(data.roundNumber).equals("0")) {
		if(data.mechanum||data.swerve||data.westCoast) {
			if(Game_Array.allowEntry==true||!Game_Array.model.contains("Team:"+Integer.toString(data.teamNumber)+" Round:"+Integer.toString(data.roundNumber))) {
			//load data
			Game_Array.GameList.add(data);
			//Game_Array.GameMap.put("Team:"+Integer.toString(data.teamNumber)+" Round:"+Integer.toString(data.roundNumber), Game_Array.GameList.size()-1);
			
			Main_Frame.main_panel.removeAll();
			Main_Frame.main_panel.repaint();
			Main_Frame.main_panel.revalidate();
			
			
			Main_Frame.main_panel.add(panels.main);
			Main_Frame.main_panel.repaint();
			Main_Frame.main_panel.revalidate();
			
			Game_Array.model.addElement("Team:"+Integer.toString(data.teamNumber)+" Round:"+Integer.toString(data.roundNumber));
			Log_Panel.list.setModel(Game_Array.model);
			Game_Array.allowEntry=false;
			
			}else {
				JOptionPane.showMessageDialog(null, "This entry already exists");
				//JOptionPane.showMessageDialog(null, "You did not enter in the Team Number, Round Number, or what Drivetrain they have", "Warning", 4);
			}
		}else {
			JOptionPane.showMessageDialog(null, "You did not enter in the Team Number, Round Number, or what Drivetrain they have");
			//JOptionPane.showMessageDialog(null, "You did not enter in the Team Number, Round Number, or what Drivetrain they have", "Warning", 4);
		}
	}else {
		JOptionPane.showMessageDialog(null, "You did not enter in the Team Number, Round Number, or what Drivetrain they have");
		//JOptionPane.showMessageDialog(null, "You did not enter in the Team Number, Round Number, or what Drivetrain they have", "Warning", 4);
	}
	
	
	}
	//Editing Data / loading it  ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	
	public void LoadData(int ArrayLocation) {
		
		Entry_Page.Auto_comments.setText(Game_Array.GameList.get(ArrayLocation).Auto_comments);
		Entry_Page.Auto_Scale.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).Auto_blocksInScale));
		Entry_Page.Auto_switch.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).Auto_blocksInSwitch));
		Entry_Page.Teleop_Scale.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).Teleop_blocksInScale));
		Entry_Page.Teleop_comments.setText(Game_Array.GameList.get(ArrayLocation).Teleop_comments);
		Entry_Page.Teleop_switch.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).Teleop_blocksInSwitch));
		Entry_Page.Teleop_vault.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).Teleop_blocksInVault));
		Entry_Page.rdbtnClimbed.setSelected(Game_Array.GameList.get(ArrayLocation).Teleop_climbed);
		Entry_Page.rdbtnCrossedLine.setSelected(Game_Array.GameList.get(ArrayLocation).Auto_crossedLine);
		Entry_Page.rdbtnMechanum.setSelected(Game_Array.GameList.get(ArrayLocation).mechanum);
		Entry_Page.rdbtnRedFlag.setSelected(Game_Array.GameList.get(ArrayLocation).redFlag);
		Entry_Page.rdbtnSwerve.setSelected(Game_Array.GameList.get(ArrayLocation).swerve);
		Entry_Page.rdbtnWestCoast.setSelected(Game_Array.GameList.get(ArrayLocation).westCoast);
		Entry_Page.rdbtnYellowFlag.setSelected(Game_Array.GameList.get(ArrayLocation).yellowFlag);
		Entry_Page.teamNumber.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).teamNumber));
		Entry_Page.roundNumber.setText(Integer.toString(Game_Array.GameList.get(ArrayLocation).roundNumber));
		
		Main_Frame.main_panel.removeAll();
		Main_Frame.main_panel.repaint();
		Main_Frame.main_panel.revalidate();
		
		
		Main_Frame.main_panel.add(panels.entry);
		Main_Frame.main_panel.repaint();
		Main_Frame.main_panel.revalidate();
		Game_Array.GameList.remove(ArrayLocation);
		Game_Array.model.removeElementAt(ArrayLocation);
		Game_Array.allowEntry=true;
	}

}
