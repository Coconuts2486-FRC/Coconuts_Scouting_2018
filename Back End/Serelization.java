import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serelization {
	public static void Serelize() {
	Password_Maker PM = new Password_Maker();
	String fileName="Scout Data";
	File file = new File(System.getProperty("user.dir") + "//"+fileName);
	String random = PM.makepassword(5);
	String directory=System.getProperty("user.dir") + "//"+fileName+"/"+random+".txt";
	
	if(!file.exists()) {
		file.mkdirs();
	}
	    
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream(directory);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(Game_Array.GameList);
	         out.close();
	         fileOut.close();
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	   }

}
