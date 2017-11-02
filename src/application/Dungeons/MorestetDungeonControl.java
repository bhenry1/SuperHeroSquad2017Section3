package application.Dungeons;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class MorestetDungeonControl 
{

	MorestetDungeonModel mdm = new MorestetDungeonModel();
	
    @FXML
    private Label room10MapLabel;

    @FXML
    private Circle playerLocation1;

    @FXML
    private Circle playerLocation3;

    @FXML
    private Circle playerLocation2;

    @FXML
    private Circle playerLocation62;

    @FXML
    private Circle playerLocation5;

    @FXML
    private Circle playerLocation61;

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
    private ImageView monsTerSymbolImage;

    @FXML
    private Button leftBtn;

    @FXML
    private Rectangle exit9;

    @FXML
    private Rectangle exit8;

    @FXML
    private ImageView monsTerSymbolImage2;

    @FXML
    private Rectangle exit7;

    @FXML
    private ImageView monsTerSymbolImage3;

    @FXML
    private Rectangle exit6;

    @FXML
    private Button backToCity;

    @FXML
    private Label room7MapLabel;

    @FXML
    private ImageView TreasureChestImage2;

    @FXML
    private Label room9MapLabel;

    @FXML
    private ImageView compassImage;

    @FXML
    private Label roomName;

    @FXML
    private Label room3MapLabel;

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
	public Rectangle room4;

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
    private Circle playerLocation41;

    @FXML
    public Rectangle room2;

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
    private Label dungoenEntranceMapLabel;

    @FXML
    private Circle playerLocation;

    @FXML
    private Rectangle room10;

    @FXML
    private Button upBtn;

    @FXML
    private Label room8MapLabel;

    @FXML
    private Label mapLabel;

    @FXML
    private Circle playerLocation6;

    @FXML
    private Label room4MapLabel;

    @FXML
    private ImageView TreasureChestImage;

    @FXML
    private Label room6MapLabel;
    
    @FXML
    private ImageView ratMonsterImage;
    
    @FXML
    private ImageView batMonsterImage;
    
    @FXML
    private ImageView goblinMonsterImage;
    
    @FXML
    private ImageView bossImage;


    public int roomNumber;
   

    @FXML
    void moveUp(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 2)
    	{
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		monsTerSymbolImage.setVisible(true);
    		exit1.setVisible(true);
    		playerLocation.setVisible(false);
    		playerLocation1.setVisible(true);
    		
    		ratMonsterImage.setVisible(true);
    		
    	}
    	
    	
    	if(roomNumber == 5)
    	{
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		exit5.setVisible(true);
    		playerLocation3.setVisible(true);
    		playerLocation2.setVisible(false);
    		
    		batMonsterImage.setVisible(true);
    		

    	}
    	
     	if(roomNumber == 0)
    	{
    		playerLocation6.setVisible(false);
    		playerLocation.setVisible(true);
    	}	
     	
     	if(roomNumber == 10)
    	{
    		playerLocation6.setVisible(true);
    		playerLocation61.setVisible(false);
    		
    		goblinMonsterImage.setVisible(false);

    	}
       	
     	if(roomNumber == 8)
    	{
    		room8.setVisible(true);
    		room8MapLabel.setVisible(true);
    	    TreasureChestImage2.setVisible(true);
    	    exit7.setVisible(true);
    		playerLocation4.setVisible(false);
    		playerLocation5.setVisible(true);
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
    		playerLocation.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		ratMonsterImage.setVisible(false);

    	}	
    	
    	
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(false);
    		playerLocation2.setVisible(true);
    		
    		batMonsterImage.setVisible(false);

    	}
    	
       	if(roomNumber == 10)
    	{
       		room10.setVisible(true);
    		room10MapLabel.setVisible(true);
    		exit3.setVisible(true);
    		playerLocation.setVisible(false);
    		playerLocation6.setVisible(true);
    	}
       	
       	if(roomNumber == 7)
       	{
       		room7.setVisible(true);
    		room7MapLabel.setVisible(true);
    		exit9.setVisible(true);
    		monsTerSymbolImage3.setVisible(true);
    		playerLocation6.setVisible(false);
    		playerLocation61.setVisible(true);
    		
    		goblinMonsterImage.setVisible(true);
       	}
       	
       	
     	
     	if(roomNumber == 4)
    	{
    		playerLocation4.setVisible(true);
    		playerLocation5.setVisible(false);
    	}
    	
    	
   
    	
    }

    @FXML
    void moveRight(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 4)
    	{
    			room4.setVisible(true);
        		room4MapLabel.setVisible(true);
        		exit4.setVisible(true);
        		playerLocation.setVisible(false);
        		playerLocation4.setVisible(true);
    	}
    	
    	if(roomNumber == 0)
    	{
    		playerLocation.setVisible(true);
    		playerLocation2.setVisible(false);
    	}
    	
    	
    	
    	if(roomNumber == 9)
    	{
    			room9.setVisible(true);
        		room9MapLabel.setVisible(true);
        		exit6.setVisible(true);
        	    TreasureChestImage.setVisible(true);
        		playerLocation6.setVisible(false);
        		playerLocation62.setVisible(true);
    	}
    	
    	if(roomNumber == 6)
    	{
    			room6.setVisible(true);
        		room6MapLabel.setVisible(true);
        		exit8.setVisible(true);
        	    bossSymbolImage1.setVisible(true);
        		playerLocation4.setVisible(false);
        		playerLocation41.setVisible(true);
        		
        		bossImage.setVisible(true);
    	}
    	
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation.setVisible(true);
    		playerLocation4.setVisible(false);
    	}
    	
    	if(roomNumber == 3)
        {
    		room3.setVisible(true);
    		room3MapLabel.setVisible(true);
        	exit2.setVisible(true);
        	playerLocation.setVisible(false);
        	playerLocation2.setVisible(true);
        }
    	
    	if(roomNumber == 10)
    	{
    		
        		playerLocation6.setVisible(true);
        		playerLocation62.setVisible(false);
    	}
    	
    	if(roomNumber == 4)
    	{
        		playerLocation4.setVisible(true);
        		playerLocation41.setVisible(false);
        		
        		bossImage.setVisible(false);
    	}
    	
    	
    	
    	
    }

    @FXML
    void exitDungeon(ActionEvent event) throws IOException 
    {
    	mdm.leaveDungeon(event);
    }

    @FXML
    void openMenu(ActionEvent event) 
    {

    }

    @FXML
    void examineRoom(ActionEvent event) 
    {

    }

  
}
