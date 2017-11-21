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

public class MonetoncDungeonControl 
{

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
    private TextArea itemTextArea;

    @FXML
    private Button leftBtn;

    @FXML
    private ImageView monsTerSymbolImage5;

    @FXML
    private ImageView GuardsmanBossImage;

    @FXML
    private ImageView monsTerSymbolImage4;

    @FXML
    private Button backToCity;

    @FXML
    private Tab itemTab;

    @FXML
    private ImageView bossSymbolImage6;

    @FXML
    private ImageView TreasureChestImage2;

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
    private Button downBtn;

    @FXML
    private Rectangle room4;

    @FXML
    private Button rightBtn;

    @FXML
    private Rectangle dungeonEntrance;

    @FXML
    private TextArea armorTextArea;

    @FXML
    private Rectangle room2;

    @FXML
    private Label room2MapLabel;

    @FXML
    private ImageView elephantKinMonsterImage;

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
    private Button upBtn;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private Label mapLabel;

    @FXML
    private TextArea weaponTextArea;

    @FXML
    private Circle playerLocation6;

    @FXML
    private Label room4MapLabel;

    @FXML
    private Tab WeaponTab;

    @FXML
    private ImageView thiefMonsterImage;

    @FXML
    private Label room6MapLabel;

    
    MonetoncDungeonModel mdm = new MonetoncDungeonModel();
    MonetoncDungeonTextModel mdtm = new MonetoncDungeonTextModel();
    
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";
    
    public int roomNumber;
    
    @FXML
    void moveUp(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 2)
    	{
    		playerLocation2.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		exit1.setVisible(true);
    		TreasureChestImage2.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation1.setVisible(true);   
        	elephantKinMonsterImage.setVisible(false);

    	}
    }

    @FXML
    void moveDown(ActionEvent event) 
    {

    	int roomNumber = mdm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation2.setVisible(false);
    		playerLocation1.setVisible(true);
    		
    	}
    	
    	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    		exit3.setVisible(true);
    		mdtm.tyingAnimationForMonsters(discoveredMonster, navigationTextArea);
        	elephantKinMonsterImage.setVisible(true);
    		monsTerSymbolImage4.setVisible(true);    	
    	}
    }

    @FXML
    void moveRight(ActionEvent event) 
    {

    	int roomNumber = mdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation3.setVisible(false);
    		playerLocation1.setVisible(true);
    	}
    	
    	if(roomNumber == 5)
    	{
    		playerLocation5.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		exit4.setVisible(true);
    		thiefMonsterImage.setVisible(true);
    		monsTerSymbolImage5.setVisible(true);
    		mdtm.tyingAnimationForMonsters(discoveredMonster, navigationTextArea);

    	}
    	
    	if(roomNumber == 6)
    	{
    		playerLocation6.setVisible(true);
    		playerLocation5.setVisible(false);
    		
    		room6.setVisible(true);
    		room6MapLabel.setVisible(true);
    		exit5.setVisible(true);
    		GuardsmanBossImage.setVisible(true);
    		bossSymbolImage6.setVisible(true);
    		thiefMonsterImage.setVisible(false);
    		mdtm.tyingAnimationForMonsters(discoveredBoss, navigationTextArea);

    	}
    	
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    		exit2.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation5.setVisible(false);
    		playerLocation1.setVisible(true);
    		thiefMonsterImage.setVisible(false);
    	}
    	
    	if(roomNumber == 5)
    	{
    		playerLocation6.setVisible(false);
    		playerLocation5.setVisible(true);
    		GuardsmanBossImage.setVisible(false);
    		thiefMonsterImage.setVisible(true);
    		mdtm.tyingAnimationForMonsters(discoveredMonster, navigationTextArea);


    	}
    	
    }

    @FXML
    void exitDungeon(ActionEvent event) throws IOException 
    {
    	mdm.leaveDungeon(event);
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	mdm.goToMainMenu(event);
    }

    @FXML
    void examineRoom(ActionEvent event) 
    {
    	mdtm.openFile();
    	mdtm.tyingAnimationForRooms(mdtm.readFile(this.roomNumber), navigationTextArea);
    	mdtm.closeFile();

    }

    

}
