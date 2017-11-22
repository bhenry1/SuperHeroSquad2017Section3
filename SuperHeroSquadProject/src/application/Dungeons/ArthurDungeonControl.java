package application.Dungeons;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ArthurDungeonControl {

    @FXML
    private Label room10MapLabel;

    @FXML
    private Circle playerLocation1;

    @FXML
    private Circle playerLocation3;

    @FXML
    private Circle playerLocation2;

    @FXML
    private AnchorPane armPane;

    @FXML
    private Circle playerLocation5;

    @FXML
    private Circle playerLocation4;

    @FXML
    private Rectangle exit4;

    @FXML
    private Rectangle exit5;

    @FXML
    private Rectangle exit2;

    @FXML
    private Rectangle exit1;

    @FXML
    private TextArea itemTextArea;

    @FXML
    private Button leftBtn2;

    @FXML
    private ImageView monsTerSymbolImage7;

    @FXML
    private Rectangle exit11;

    @FXML
    private Rectangle exit9;

    @FXML
    private ImageView monsTerSymbolImage2;

    @FXML
    private Rectangle exit8;

    @FXML
    private Rectangle exit7;

    @FXML
    private Button downBtn2;

    @FXML
    private Rectangle exit6;
    
    @FXML
    private Rectangle exit3;

    @FXML
    private Tab itemTab;

    @FXML
    private Label room7MapLabel;

    @FXML
    private ImageView mercenaryMonsterImage;

    @FXML
    private Circle playerLocation11;

    @FXML
    private ImageView slimeKingMonsterImage;

    @FXML
    private Circle playerLocation10;

    @FXML
    private Label room9MapLabel;

    @FXML
    private ImageView compassImage;

    @FXML
    private Label roomName;

    @FXML
    private Tab navTab;

    @FXML
    private Label room3MapLabel;

    @FXML
    private AnchorPane navPane;


    @FXML
    private AnchorPane itemPane;

    @FXML
    private TabPane userTabPane;

    @FXML
    private AnchorPane mapPane;

    @FXML
    private Label room5MapLabel;

    @FXML
    private TextArea navigationTextArea;

    @FXML
    private Rectangle room5;

    @FXML
    private ScrollPane mapView;

    @FXML
    private Rectangle room6;

    @FXML
    private Rectangle room3;

    @FXML
    private Rectangle room4;

    @FXML
    private Rectangle room9;

    @FXML
    private Rectangle room7;

    @FXML
    private Label room11MapLabel;

    @FXML
    private Rectangle room8;

    @FXML
    private Rectangle dungeonEntrance;

    @FXML
    private TextArea armorTextArea;

    @FXML
    private Rectangle room2;

    @FXML
    private Button backToCity2;

    @FXML
    private Label room2MapLabel;

    @FXML
    private Button menuBtn;

    @FXML
    private ImageView bossSymbolImage1;

    @FXML
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private Tab ArmTab;

    @FXML
    private Button upBtn2;

    @FXML
    private Label dungoenEntranceMapLabel;

    @FXML
    private Rectangle room10;

    @FXML
    private Button rightBtn2;

    @FXML
    private Rectangle room11;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private Label navigationLabel;

    @FXML
    private Label room8MapLabel;

    @FXML
    private Label movementLabel;

    @FXML
    private Label mapLabel;

    @FXML
    private Circle playerLocation7;

    @FXML
    private TextArea weaponTextArea;

    @FXML
    private Circle playerLocation6;

    @FXML
    private Circle playerLocation9;

    @FXML
    private Circle playerLocation8;

    @FXML
    private ImageView hellScoutMonsterImage;

    @FXML
    private Label room4MapLabel;

    @FXML
    private Tab WeaponTab;

    @FXML
    private Button examineRoomBtn2;

    @FXML
    private Label room6MapLabel;

    ArthurDungeonModel adm = new ArthurDungeonModel();
    ArthurDungeonNavigationTextModel adntm = new ArthurDungeonNavigationTextModel();
    
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";

    
    
    public int roomNumber;
    
    @FXML
    void moveUp2(ActionEvent event) 
    {
    	int roomNumber = adm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(adm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 2)
    	{
    		playerLocation2.setVisible(true);
    		playerLocation1.setVisible(false);
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		exit1.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		hellScoutMonsterImage.setVisible(true);
    		adntm.setDiscoveredMonsterText(discoveredMonster, navigationTextArea);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation5.setVisible(false);
    		playerLocation1.setVisible(true);
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		exit5.setVisible(true);
    	}
    	
     	if(roomNumber == 5)
    	{
    		playerLocation7.setVisible(false);
    		playerLocation5.setVisible(true);
    		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    		exit6.setVisible(true);
    		mercenaryMonsterImage.setVisible(false);
    		
    	}
     	
      	if(roomNumber == 7)
    	{
    		playerLocation11.setVisible(false);
    		playerLocation7.setVisible(true);
    		room11.setVisible(true);
    		room11MapLabel.setVisible(true);
    		exit7.setVisible(true);
    		mercenaryMonsterImage.setVisible(true);
    		adntm.setDiscoveredMonsterText(discoveredMonster, navigationTextArea);

    		
    	}
      	
     	if(roomNumber == 11)
    	{
    		playerLocation10.setVisible(false);
    		playerLocation11.setVisible(true);
    		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		exit11.setVisible(true);
    		slimeKingMonsterImage.setVisible(false);
    		
    		
    	}




    	
    }

    @FXML
    void moveDown2(ActionEvent event) 
    {
    	int roomNumber = adm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(adm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation2.setVisible(false);
    		playerLocation1.setVisible(true);
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		exit1.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		hellScoutMonsterImage.setVisible(false);
    	}
    	
    	if(roomNumber == 5)
    	{
    		playerLocation5.setVisible(true);
    		playerLocation1.setVisible(false);
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		exit5.setVisible(true);
    	}
    	
    	if(roomNumber == 7)
    	{
    		playerLocation7.setVisible(true);
    		playerLocation5.setVisible(false);
    		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    		exit6.setVisible(true);
    		monsTerSymbolImage7.setVisible(true);
    		//Change mon visiblity here?
    		mercenaryMonsterImage.setVisible(true);
    		adntm.setDiscoveredMonsterText(discoveredMonster, navigationTextArea);

    		
    	}
    	
    	if(roomNumber == 11)
    	{
    		playerLocation11.setVisible(true);
    		playerLocation7.setVisible(false);
    		room11.setVisible(true);
    		room11MapLabel.setVisible(true);
    		exit7.setVisible(true);
    		mercenaryMonsterImage.setVisible(false);
    		
    	}
    	
     	if(roomNumber == 10)
    	{
    		playerLocation10.setVisible(true);
    		playerLocation11.setVisible(false);
    		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		exit11.setVisible(true);
    		bossSymbolImage1.setVisible(true);
    		slimeKingMonsterImage.setVisible(true);
    		adntm.setDiscoveredMonsterText(discoveredBoss, navigationTextArea);

    		
    	}






    }

    @FXML
    void moveRight2(ActionEvent event) 
    {
    	int roomNumber = adm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(adm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 6)
    	{
    		playerLocation6.setVisible(true);
    		playerLocation2.setVisible(false);
    		room6.setVisible(true);
    		room6MapLabel.setVisible(true);
    		exit4.setVisible(true);
    		hellScoutMonsterImage.setVisible(false);
    		
    	}
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(true);
    		playerLocation1.setVisible(false);
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    		exit3.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation1.setVisible(true);
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    		exit2.setVisible(true);
    		
    	}
    	
       	if(roomNumber == 9)
    	{
    		playerLocation9.setVisible(true);
    		playerLocation11.setVisible(false);
    		room9.setVisible(true);
    		room9MapLabel.setVisible(true);
    		exit9.setVisible(true);
    		
    	}
       	
       	if(roomNumber == 11)
    	{
    		playerLocation8.setVisible(false);
    		playerLocation11.setVisible(true);
    		room8.setVisible(true);
    		room8MapLabel.setVisible(true);
    		exit8.setVisible(true);
    		
    	}


    }

    @FXML
    void moveLeft2(ActionEvent event) 
    {	
    int roomNumber = adm.getRoomNumber4MovingLeft(this.roomNumber);
	roomName.setText(adm.getRoomName(roomNumber));
	this.roomNumber = roomNumber;
	
	if(roomNumber == 2)
	{
		playerLocation6.setVisible(false);
		playerLocation2.setVisible(true);
		room2.setVisible(true);
		room2MapLabel.setVisible(true);
		hellScoutMonsterImage.setVisible(true);
		adntm.setDiscoveredMonsterText(discoveredMonster, navigationTextArea);

		
	}
	
	if(roomNumber == 0)
	{
		playerLocation3.setVisible(false);
		playerLocation1.setVisible(true);
		room3.setVisible(true);
		room3MapLabel.setVisible(true);
		exit3.setVisible(true);
		
	}
	
	if(roomNumber == 4)
	{
		playerLocation4.setVisible(true);
		playerLocation1.setVisible(false);
		room4.setVisible(true);
		room4MapLabel.setVisible(true);
		exit2.setVisible(true);
		
	}
	
  	if(roomNumber == 11)
	{
		playerLocation9.setVisible(false);
		playerLocation11.setVisible(true);
		room9.setVisible(true);
		room9MapLabel.setVisible(true);
		exit9.setVisible(true);
		
	}
  	
	if(roomNumber == 8)
	{
		playerLocation8.setVisible(true);
		playerLocation11.setVisible(false);
		room8.setVisible(true);
		room8MapLabel.setVisible(true);
		exit8.setVisible(true);
		
	}


    }

    @FXML
    void exitDungeon2(ActionEvent event) throws IOException 
    {
    	adm.leaveDungeon(event);    
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	adm.goToMainMenu(event);
    }

    @FXML
    void examineRoom(ActionEvent event) 
    {
    	adntm.openFile();
    	adntm.tyingAnimation(adntm.readFile(roomNumber), navigationTextArea);
    	adntm.closeFile();
    }

    

}
