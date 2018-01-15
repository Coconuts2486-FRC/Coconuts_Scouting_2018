
public class Game_Data implements java.io.Serializable {
int teamNumber;
int roundNumber;
//Auto---------------------------------------------------------------------------------
//int Auto_blocksInVault;
int Auto_blocksInSwitch;
int Auto_blocksInScale;

boolean Auto_crossedLine;
String Auto_comments;
//Teleop---------------------------------------------------------------------------------
int Teleop_blocksInVault;
int Teleop_blocksInSwitch;
int Teleop_blocksInScale;

boolean Teleop_climbed;
String Teleop_comments;
//General---------------------------------------------------------------------------------
boolean redFlag;
boolean yellowFlag;

boolean mechanum;
boolean swerve;
boolean westCoast;
}
