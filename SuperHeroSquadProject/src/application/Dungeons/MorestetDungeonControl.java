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

public class MorestetDungeonControl 
{

    @FXML
    private ImageView slimeKingMonsterImage;

    @FXML
    private Circle playerLocation1;

    @FXML
    private Circle playerLocation3;

    @FXML
    private Circle playerLocation2;

    @FXML
    private AnchorPane armPane;

    @FXML
    private Circle playerLocation4;

    @FXML
    private Rectangle exit4;

    @FXML
    private Rectangle exit3;

    @FXML
    private Rectangle exit2;

    @FXML
    private TextArea itemTextArea;

    @FXML
    private Button leftBtn2;

    @FXML
    private ImageView monsTerSymbolImage3;

    @FXML
    private Button downBtn2;

    @FXML
    private Tab itemTab;

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
    private TextArea navigationTextArea;

    @FXML
    private ScrollPane mapView;

    @FXML
    private Rectangle room3;

    @FXML
    private Rectangle room4;

    @FXML
    private ImageView goblinComMonsterImage;

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
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private Tab ArmTab;

    @FXML
    private ImageView bossSymbolImage4;

    @FXML
    private Button upBtn2;

    @FXML
    private Label dungoenEntranceMapLabel;

    @FXML
    private Button rightBtn2;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private Label navigationLabel;

    @FXML
    private Label movementLabel;

    @FXML
    private Label mapLabel;

    @FXML
    private TextArea weaponTextArea;

    @FXML
    private Label room4MapLabel;

    @FXML
    private ImageView batMonsterImage;

    @FXML
    private Tab WeaponTab;

    @FXML
    private Button examineRoomBtn2;

    MorestetDungeonModel mdm = new MorestetDungeonModel();
    MorestetDungeonTextModel mdtm = new MorestetDungeonTextModel();
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";
    public int roomNumber;
    @FXML
    void moveUp2(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation4.setVisible(false);
    		playerLocation1.setVisible(true);
    		goblinComMonsterImage.setVisible(false);
    	
    	}
    	
    }

    @FXML
    void moveDown2(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room4.setVisible(true);
    		room4MapLabel.setVisible(true);
    		exit3.setVisible(true);
    		goblinComMonsterImage.setVisible(true);
    		bossSymbolImage4.setVisible(true);
    		mdtm.tyingAnimationForMonsters(discoveredBoss, navigationTextArea);

    	}
    }

    @FXML
    void moveRight2(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
    		exit4.setVisible(true);
    		batMonsterImage.setVisible(true);
    		mdtm.tyingAnimationForMonsters(discoveredMonster, navigationTextArea);
    		monsTerSymbolImage3.setVisible(true);

    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation2.setVisible(false);
    		playerLocation1.setVisible(true);
    	}
    }

    @FXML
    void moveLeft2(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation3.setVisible(false);
    		playerLocation1.setVisible(true);
    		batMonsterImage.setVisible(false);

    	}
    	
    	if(roomNumber == 2)
    	{
    		playerLocation2.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		exit2.setVisible(true);
    		TreasureChestImage2.setVisible(true);

    	}
    }

    @FXML
    void exitDungeon2(ActionEvent event) throws IOException 
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
