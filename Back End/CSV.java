import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class CSV {
	
	public void WriteToFile(){
		Date date = new Date();
		Password_Maker pm = new Password_Maker();
		String x="Scout Data";
		String time=date.toString();
		File file = new File(System.getProperty("user.dir") + "//"+x);
		file.mkdirs();
		WriteToFile(System.getProperty("user.dir") + "//"+x+"/"+"-"+time+".csv", false);
	}
	
	public void WriteToFile(String directory, Boolean columnHeaders){
		try
		{
			BufferedWriter out = new BufferedWriter(new FileWriter(directory));
			
			if(columnHeaders){
				out.write("\"Team Number\",\"Match Number\",\"High Goal Amount\",\"Low Goal Amount\",\"High Goal Speed\",\"Low Goal Speed\",\"High Goal Accuracy\",\"Low Goal Accuracy\",\"Gear To Robot\",\"Gears Placed\",\"Fuel Collection Accuracy\",\"Carrying Capacity\",\"Collected from Ground\",\"Collected from Hoppers\",\"Hopper Top Left\",\"Hopper Top Right\",\"Hopper Bottow Left\",\"Hopper Bottow Middle\",\"Hopper Bottow Right\",\"Placed Gear Left\",\"Placed Gear Middle\",\"Placed Gear Right\",\"Climbed Rope\",\"Defence Level\",\"Notes\",\"Auto High Goal Amount\",\"Auto Low Goal Amount\",\"Auto High Goal Speed\",\"Auto Low Goal Speed\",\"Auto High Goal Accuracy\",\"Auto Low Goal Accuracy\",\"Auto Gear To Robot\",\"Auto Gears Placed\",\"Auto Fuel Collection Accuracy\",\"Auto Carrying Capacity\",\"Auto Collected from Ground\",\"Auto Collected from Hoppers\",\"Auto Hopper Top Left\",\"Auto Hopper Top Right\",\"Auto Hopper Bottow Left\",\"Auto Hopper Bottow Middle\",\"Auto Hopper Bottow Right\",\"Auto Placed Gear Left\",\"Auto Placed Gear Middle\",\"Auto Placed Gear Right\",\"Auto Crossed Line\",\"Auto Notes\"");
			}
			for(int i = 0; i <= Game_Array.GameList.size() - 1; i++){
				out.write("\n" + String.format("%1s,%2s,%3s,%4s,%5s,%6s,%7s,%8s,%9s,%10s,%11s,%12s,%13s,%14s,%15s,%16s", Game_Array.GameList.get(i).teamNumber,Game_Array.GameList.get(i).roundNumber,Game_Array.GameList.get(i).Teleop_blocksInVault,Game_Array.GameList.get(i).Teleop_blocksInSwitch,Game_Array.GameList.get(i).Teleop_blocksInScale,Game_Array.GameList.get(i).Teleop_climbed,Game_Array.GameList.get(i).Teleop_comments,Game_Array.GameList.get(i).Auto_blocksInSwitch,Game_Array.GameList.get(i).Auto_blocksInScale,Game_Array.GameList.get(i).Auto_crossedLine,Game_Array.GameList.get(i).Auto_comments,Game_Array.GameList.get(i).redFlag,Game_Array.GameList.get(i).yellowFlag,Game_Array.GameList.get(i).mechanum,Game_Array.GameList.get(i).swerve,Game_Array.GameList.get(i).westCoast));
			}
			out.close();
		}
		catch(IOException ex) { System.out.println(ex.getMessage()); }
	}
}
