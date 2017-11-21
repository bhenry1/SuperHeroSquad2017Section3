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

public class HifenourDungeonControl {

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
    private Button examineRoomBtn;

    @FXML
    private Rectangle exit5;

    @FXML
    private ImageView succubusMonsterImage;

    @FXML
    private Rectangle exit4;

    @FXML
    private Rectangle exit3;

    @FXML
    private Rectangle exit2;

    @FXML
    private TextArea itemTextArea;

    @FXML
    private Button leftBtn;

    @FXML
    private Rectangle exit10;
    
    @FXML
    private Rectangle exit11;
   
    @FXML
    private ImageView tricksterMonsterImage;

    @FXML
    private Rectangle exit9;

    @FXML
    private ImageView monsTerSymbolImage2;

    @FXML
    private Rectangle exit8;

    @FXML
    private ImageView monsTerSymbolImage4;

    @FXML
    private Rectangle exit6;

    @FXML
    private Button backToCity;

    @FXML
    private Tab itemTab;

    @FXML
    private Label room7MapLabel;

    @FXML
    private ImageView TreasureChestImage6;

    @FXML
    private ImageView bossSymbolImage7;

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
    private ImageView TreasureChestImage9;

    @FXML
    private Rectangle room5;

    @FXML
    private ScrollPane mapView;

    @FXML
    private Rectangle room6;

    @FXML
    private Rectangle room3;

    @FXML
    private Button downBtn;

    @FXML
    private Rectangle room4;

    @FXML
    private Rectangle room9;

    @FXML
    private Button rightBtn;

    @FXML
    private Rectangle room7;

    @FXML
    private Rectangle room8;

    @FXML
    private Rectangle dungeonEntrance;

    @FXML
    private TextArea armorTextArea;

    @FXML
    private Rectangle room2;

    @FXML
    private Label room2MapLabel;

    @FXML
    private Button menuBtn;

    @FXML
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private Tab ArmTab;

    @FXML
    private ImageView darkKnightBossImage;

    @FXML
    private Label dungoenEntranceMapLabel;

    @FXML
    private Rectangle room10;

    @FXML
    private Button upBtn;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private Label room8MapLabel;

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
    private Label room4MapLabel;

    @FXML
    private Tab WeaponTab;

    @FXML
    private ImageView devourerMonsterImage;

    @FXML
    private Label room6MapLabel;
    
    public int roomNumber;
    
    HifenourDungeonModel hdm = new HifenourDungeonModel();
    HifenourDungeonTextModel hdmtm = new HifenourDungeonTextModel();
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";

    @FXML
    void moveUp(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 2)
    	{
    		playerLocation2.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		exit2.setVisible(true);
    		devourerMonsterImage.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);
    		
    	}
    	
    	if(roomNumber == 5)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation5.setVisible(true);
    		succubusMonsterImage.setVisible(false);

    		
    	}
    	
    	if(roomNumber == 4)
    	{
    		playerLocation6.setVisible(false);
    		playerLocation4.setVisible(true);
    		succubusMonsterImage.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);


    	}
    	
    	if(roomNumber == 3)
    	{
    		playerLocation9.setVisible(false);
    		playerLocation3.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation10.setVisible(false);
    		playerLocation1.setVisible(true);
    	}
    	
    	if(roomNumber == 8)
    	{
    		playerLocation7.setVisible(false);
    		playerLocation8.setVisible(true);
    		darkKnightBossImage.setVisible(false);
    	}

    }

    @FXML
    void moveDown(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation2.setVisible(false);
    		playerLocation1.setVisible(true);
    		devourerMonsterImage.setVisible(false);

    		
    	}
    	
    	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation5.setVisible(false);
    		
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    		exit11.setVisible(true);
    		monsTerSymbolImage4.setVisible(true);
    		succubusMonsterImage.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);

    		
    		
    	}
    	
    	if(roomNumber == 6)
    	{
    		playerLocation6.setVisible(true);
    		playerLocation4.setVisible(false);
    		
    		room6.setVisible(true);
    		room6MapLabel.setVisible(true);
    		exit9.setVisible(true);
    		TreasureChestImage6.setVisible(true);
    		succubusMonsterImage.setVisible(false);

    	}
    	
    	if(roomNumber == 9)
    	{
    		playerLocation9.setVisible(true);
    		playerLocation3.setVisible(false);
    		
    		room9.setVisible(true);
    		room9MapLabel.setVisible(true);
    		exit3.setVisible(true);
    		TreasureChestImage9.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 10)
    	{
    		playerLocation10.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		exit5.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 7)
    	{
    		playerLocation7.setVisible(true);
    		playerLocation8.setVisible(false);
    		
    		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    		exit8.setVisible(true);
    		darkKnightBossImage.setVisible(true);
    		bossSymbolImage7.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredBoss, navigationTextArea);

    		
    	}
    }

    @FXML
    void moveRight(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 2)
    	{
    		playerLocation5.setVisible(false);
    		playerLocation2.setVisible(true);
    		devourerMonsterImage.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);


    		
    	}
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    		exit4.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 10)
    	{
    		playerLocation8.setVisible(false);
    		playerLocation10.setVisible(true);
    	}
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 5)
    	{
    		playerLocation5.setVisible(true);
    		playerLocation2.setVisible(false);
    		
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		exit10.setVisible(true);
    		devourerMonsterImage.setVisible(false);

    		
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation3.setVisible(false);
    		playerLocation1.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 8)
    	{
    		playerLocation8.setVisible(true);
    		playerLocation10.setVisible(false);
    		
    		room8.setVisible(true);
    		room8MapLabel.setVisible(true);
    		exit6.setVisible(true);
    		
    	}
    }

    @FXML
    void exitDungeon(ActionEvent event) throws IOException 
    {
    	hdm.leaveDungeon(event);
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	hdm.goToMainMenu(event);
    }

    @FXML
    void examineRoom(ActionEvent event) 
    {
    	hdmtm.openFile();
    	hdmtm.setTextArea(hdmtm.readFile(this.roomNumber), navigationTextArea);
    	hdmtm.closeFile();
    }

    

}
