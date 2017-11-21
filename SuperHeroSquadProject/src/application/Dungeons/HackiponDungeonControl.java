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

public class HackiponDungeonControl {

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
    private Rectangle exit4;

    @FXML
    private Rectangle exit3;

    @FXML
    private Rectangle exit2;

    @FXML
    private Rectangle exit1;

    @FXML
    private ImageView TreasureChestImage11;

    @FXML
    private TextArea itemTextArea;

    @FXML
    private Button leftBtn;

    @FXML
    private ImageView monsTerSymbolImage5;

    @FXML
    private Rectangle exit10;

    @FXML
    private ImageView monsTerSymbolImage6;

    @FXML
    private Rectangle exit12;

    @FXML
    private Rectangle exit11;

    @FXML
    private Rectangle exit9;

    @FXML
    private Rectangle exit8;

    @FXML
    private ImageView monsTerSymbolImage2;

    @FXML
    private Rectangle exit7;

    @FXML
    private Button backToCity;

    @FXML
    private Tab itemTab;

    @FXML
    private Label room7MapLabel;

    @FXML
    private ImageView TreasureChestImage8;

    @FXML
    private ImageView ogreBossImage;

    private Circle playerLocation15;

    @FXML
    private Circle playerLocation14;

    @FXML
    private Circle playerLocation13;

    @FXML
    private Circle playerLocation11;

    @FXML
    private ImageView bugoMonsterImage;

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
    private ImageView tricksterMonsterImage;

    @FXML
    private AnchorPane itemPane;

    @FXML
    private TabPane userTabPane;

    @FXML
    private Label room14MapLabel;

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
    private Label room11MapLabel;

    @FXML
    private Rectangle room8;

    @FXML
    private Rectangle dungeonEntrance;

    @FXML
    private Label room13MapLabel;

    @FXML
    private TextArea armorTextArea;

    @FXML
    private Rectangle room2;

    @FXML
    private Rectangle exi6;

    @FXML
    private Label room2MapLabel;

    @FXML
    private ImageView bossSymbolImage10;

    @FXML
    private Button menuBtn;

    @FXML
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private Tab ArmTab;

    @FXML
    private Label dungoenEntranceMapLabel;

    @FXML
    private Rectangle room10;

    @FXML
    private Rectangle room11;

    @FXML
    private Rectangle exit14;

    @FXML
    private Button upBtn;

    @FXML
    private Rectangle room13;

    @FXML
    private Rectangle room14;

    @FXML
    private Rectangle room15;

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
    private Label room15MapLabel;

    @FXML
    private Circle playerLocation6;

    @FXML
    private Circle playerLocation9;

    @FXML
    private Circle playerLocation8;

    @FXML
    private ImageView angrySlimeMonsterImage;

    @FXML
    private Label room4MapLabel;

    @FXML
    private Tab WeaponTab;

    @FXML
    private Label room6MapLabel;
    
    HackiponDungeonModel hdm = new HackiponDungeonModel();
    HackiponNavigationTextModel hdmtm = new HackiponNavigationTextModel();
    public int roomNumber;
    
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
    		
    		angrySlimeMonsterImage.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		exit4.setVisible(true);
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);

    	}
    	
    	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation13.setVisible(false);
    		
    		//exi6.setVisible(true);
    		//room13.setVisible(true);
    		//room13MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 13)
    	{
    		playerLocation13.setVisible(true);
    		playerLocation11.setVisible(false);
    		
    		exit7.setVisible(true);
    		room11.setVisible(true);
    		room11MapLabel.setVisible(true);
    		TreasureChestImage11.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation1.setVisible(true);
    		playerLocation14.setVisible(false);
    		
    		exit2.setVisible(true);
    		room14.setVisible(true);
    		room14MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 14)
    	{
    		playerLocation14.setVisible(true);
    		playerLocation10.setVisible(false);
    		
    		exit14.setVisible(true);
    		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		bossSymbolImage10.setVisible(true);
    		ogreBossImage.setVisible(false);
    	}
    	
    	/*
    	if(roomNumber == 3)
    	{
    		playerLocation15.setVisible(false);
    		playerLocation3.setVisible(true);
    		
    		exit8.setVisible(true);
    		room15.setVisible(true);
    		room15MapLabel.setVisible(true);
    	}
    	*/
    	
    	if(roomNumber == 5)
    	{
    		playerLocation5.setVisible(true);
    		playerLocation3.setVisible(false);
    		
    		bugoMonsterImage.setVisible(true);
    		monsTerSymbolImage5.setVisible(true);
    		exit11.setVisible(true);
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);

    	}
    	
    	if(roomNumber == 8)
    	{
    		playerLocation8.setVisible(true);
    		playerLocation6.setVisible(false);
    		
    		TreasureChestImage8.setVisible(true);
    		exit10.setVisible(true);
    		room8.setVisible(true);
    		room8MapLabel.setVisible(true);
    		tricksterMonsterImage.setVisible(false);

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
    		
    		angrySlimeMonsterImage.setVisible(false);
    		monsTerSymbolImage2.setVisible(true);
    		exit4.setVisible(true);
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 13)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation13.setVisible(true);
    		
    		exi6.setVisible(true);
    		room13.setVisible(true);
    		room13MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 11)
    	{
    		playerLocation13.setVisible(false);
    		playerLocation11.setVisible(true);
    		
    		exit7.setVisible(true);
    		room11.setVisible(true);
    		room11MapLabel.setVisible(true);
    		TreasureChestImage11.setVisible(true);
    	}
    	
    	if(roomNumber == 14)
    	{
    		playerLocation1.setVisible(false);
    		playerLocation14.setVisible(true);
    		
    		exit2.setVisible(true);
    		room14.setVisible(true);
    		room14MapLabel.setVisible(true);
    	}
    	
    	
    	if(roomNumber == 10)
    	{
    		playerLocation14.setVisible(false);
    		playerLocation10.setVisible(true);
    		
    		exit14.setVisible(true);
    		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		bossSymbolImage10.setVisible(true);
    		ogreBossImage.setVisible(true);
    		
    		hdmtm.setTextAreaMonster(discoveredBoss, navigationTextArea);
    	}
    	
    /*
    	if(roomNumber == 15)
    	{
    		playerLocation15.setVisible(true);
    		playerLocation3.setVisible(false);
    		
    		exit8.setVisible(true);
    		room15.setVisible(true);
    		room15MapLabel.setVisible(true);
    	}
    	*/
    	
    	if(roomNumber == 3)
    	{
    		playerLocation5.setVisible(false);
    		playerLocation3.setVisible(true);
    		
    		bugoMonsterImage.setVisible(false);
    		monsTerSymbolImage5.setVisible(true);
    		exit11.setVisible(true);
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 6)
    	{
    		playerLocation8.setVisible(false);
    		playerLocation6.setVisible(true);
    		tricksterMonsterImage.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);


    		
    	}
    	
    	
    	
    }

    @FXML
    void moveRight(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		exit3.setVisible(true);
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 2)
    	{
    		playerLocation7.setVisible(false);
    		playerLocation2.setVisible(true);
    		
    		angrySlimeMonsterImage.setVisible(true);
    		exit5.setVisible(true);
    		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);

    		
    	}
    	
    	if(roomNumber == 14)
    	{
    		playerLocation9.setVisible(false);
    		playerLocation14.setVisible(true);
    		
    		exit12.setVisible(true);
    		room9.setVisible(true);
    		room9MapLabel.setVisible(true);
    		TreasureChestImage9.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation1.setVisible(true);
    		playerLocation3.setVisible(false);
    		
    		exit1.setVisible(true);
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 3)
    	{
    		playerLocation6.setVisible(false);
    		playerLocation3.setVisible(true);
    		tricksterMonsterImage.setVisible(false);

    		
    		
    	}
    	
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	int roomNumber = hdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(hdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation1.setVisible(true);
    		
    		exit3.setVisible(true);
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 7)
    	{
    		playerLocation7.setVisible(true);
    		playerLocation2.setVisible(false);
    		
    		angrySlimeMonsterImage.setVisible(false);
    		exit5.setVisible(true);
    		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 9)
    	{
    		playerLocation9.setVisible(true);
    		playerLocation14.setVisible(false);
    		
    		exit12.setVisible(true);
    		room9.setVisible(true);
    		room9MapLabel.setVisible(true);
    		TreasureChestImage9.setVisible(true);
    	}
    	
    	if(roomNumber == 3)
    	{
    		playerLocation1.setVisible(false);
    		playerLocation3.setVisible(true);
    		
    		exit1.setVisible(true);
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    	}
    	
    	if(roomNumber == 6)
    	{
    		playerLocation6.setVisible(true);
    		playerLocation3.setVisible(false);
    		
    		exit9.setVisible(true);
    		room6.setVisible(true);
    		room6MapLabel.setVisible(true);
    		tricksterMonsterImage.setVisible(true);
    		monsTerSymbolImage6.setVisible(true);
    		hdmtm.setTextAreaMonster(discoveredMonster, navigationTextArea);

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
    	hdmtm.setTextArea(hdmtm.readFile(this.roomNumber) , navigationTextArea);
    	hdmtm.closeFile();
    }

    
}
