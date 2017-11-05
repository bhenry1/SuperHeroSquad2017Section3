package application.Dungeons;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.SynchronousQueue;

import application.Main;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ClourtavDungeonControl implements Initializable
{

	ClourtavDungeonModel mdm = new ClourtavDungeonModel();
	ClourtavDungeonNavigationTextModel read = new ClourtavDungeonNavigationTextModel();

	
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
    private ImageView jiggyMonsterImage;
    
    @FXML
    private ImageView zawMonsterImage;
    
    @FXML
    private ImageView streetRatMonsterImage;
    
    @FXML
    private ImageView clourtavBossImage;
    



    public int roomNumber;
    public String disoveredMonster = "You have found a moster! Prepare to fight.";
    public String discoverdBoss = "You have discovered the Dungeon Master. Defeat him complete the Dungeon.";
    public String promptText = "Try clicking the Examine Room button to find out about where you are!";
    public String holdRoomName;
    public String monsterName;
    
    public boolean monster;
   

    @FXML
    void moveUp(ActionEvent event) 
    {
		navigationTextArea.setText("");
		navigationTextArea.setPromptText(promptText);

    	
    	int roomNumber = mdm.getRoomNumber4MovingUp(this.roomNumber);
    	holdRoomName = mdm.getRoomName(roomNumber);
    
    	
    	
    	roomName.setText(holdRoomName);
    	this.roomNumber = roomNumber;
    	
    	
    	if(roomNumber == 2)
    	{
    		room2.setVisible(true);
    		room2MapLabel.setVisible(true);
    		monsTerSymbolImage.setVisible(true);
    		exit1.setVisible(true);
    		playerLocation.setVisible(false);
    		playerLocation1.setVisible(true);

    		
    		jiggyMonsterImage.setVisible(true);
    		
    		makeFadeOut();
    		
    		monsterName = "jiggy";
    		read.setTextArea(disoveredMonster, navigationTextArea);    		
    	}
    	
    	
    	
    	
    	
    	if(roomNumber == 5)
    	{
    		room5.setVisible(true);
    		room5MapLabel.setVisible(true);
    		monsTerSymbolImage2.setVisible(true);
    		exit5.setVisible(true);
    		playerLocation3.setVisible(true);
    		playerLocation2.setVisible(false);
    		
    		read.setTextArea(disoveredMonster, navigationTextArea);   
    		makeFadeOut();

    		zawMonsterImage.setVisible(true);

    		

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
    		
    		streetRatMonsterImage.setVisible(false);

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
    	navigationTextArea.setText("");
		navigationTextArea.setPromptText(promptText);

    	int roomNumber = mdm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    	
    	if(roomNumber == 0)
    	{
    		playerLocation.setVisible(true);
    		playerLocation1.setVisible(false);
    		
    		jiggyMonsterImage.setVisible(false);

    	}	
    	
    	
    	
    	if(roomNumber == 3)
    	{
    		playerLocation3.setVisible(false);
    		playerLocation2.setVisible(true);
    		
    		zawMonsterImage.setVisible(false);

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
    		
    		read.setTextArea(disoveredMonster, navigationTextArea);    
    		makeFadeOut();
    		streetRatMonsterImage.setVisible(true);
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
    	navigationTextArea.setText("");
		navigationTextArea.setPromptText(promptText);

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
        		
        		read.setTextAreaBoss(discoverdBoss, navigationTextArea);
        		
        		makeFadeOut();

        		clourtavBossImage.setVisible(true);
    	}
    	
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	navigationTextArea.setText("");
		navigationTextArea.setPromptText(promptText);

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
        		
        		clourtavBossImage.setVisible(false);
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
    
    	read.openFile();
    	read.tyingAnimation(read.readFile(roomNumber), navigationTextArea);
    	read.closeFile();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
	}
	
	 private void makeFadeOut() 
	 {
			System.out.println(this.roomNumber + "here");


		 FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(2000));
		 fadeTrans.setNode(parentPane);
		 fadeTrans.setFromValue(1);
		 fadeTrans.setToValue(0);
		 fadeTrans.play();
		 
		 fadeTrans.setOnFinished((ActionEvent event) ->
		 {
			try {
				System.out.println(this.roomNumber + "here");
				loadNextScene(event, this.roomNumber);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 });
		}



	private void loadNextScene(ActionEvent event, int RoomNumber) throws IOException 
	{
		Parent root = FXMLLoader.load(Main.class.getResource("Combat/BattleView.fxml"));
    	Scene scene2 = new Scene(root);
		Stage innWindow = (Stage) parentPane.getScene().getWindow();
    	innWindow.setScene(scene2);
    	System.out.println(this.roomNumber + "Nani?");
    	
    	
    	
    
		
	}
	
	public int getRoomNumber(int roomNumber)
	{
		return roomNumber;
	}

   

  
}
