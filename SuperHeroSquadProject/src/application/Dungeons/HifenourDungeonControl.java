package application.Dungeons;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.Combat.CombatControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HifenourDungeonControl implements Initializable 
{

    @FXML
    public Label room10MapLabel;

    @FXML
    public Circle playerLocation1;

    @FXML
    public Circle playerLocation3;

    @FXML
    public Circle playerLocation2;

    @FXML
    public AnchorPane armPane;

    @FXML
    public Circle playerLocation5;

    @FXML
    public Circle playerLocation4;

    @FXML
    public Button examineRoomBtn;

    @FXML
    public Rectangle exit5;

    @FXML
    public ImageView succubusMonsterImage;

    @FXML
    public Rectangle exit4;

    @FXML
    public Rectangle exit3;

    @FXML
    public Rectangle exit2;

    @FXML
    public TextArea itemTextArea;

    @FXML
    public Button leftBtn;

    @FXML
    public Rectangle exit10;
    
    @FXML
    public Rectangle exit11;
   
    @FXML
    public ImageView tricksterMonsterImage;

    @FXML
    public Rectangle exit9;

    @FXML
    public ImageView monsTerSymbolImage2;

    @FXML
    public Rectangle exit8;

    @FXML
    public ImageView monsTerSymbolImage4;

    @FXML
    public Rectangle exit6;

    @FXML
    public Button backToCity;

    @FXML
    public Tab itemTab;

    @FXML
    public Label room7MapLabel;

    @FXML
    public ImageView TreasureChestImage6;

    @FXML
    public ImageView bossSymbolImage7;

    @FXML
    public Circle playerLocation10;

    @FXML
    public Label room9MapLabel;

    @FXML
    public ImageView compassImage;

    @FXML
    public Label roomName;

    @FXML
    public Tab navTab;

    @FXML
    public Label room3MapLabel;

    @FXML
    public AnchorPane navPane;

    @FXML
    public AnchorPane itemPane;

    @FXML
    public TabPane userTabPane;

    @FXML
    public AnchorPane mapPane;

    @FXML
    public Label room5MapLabel;

    @FXML
    public TextArea navigationTextArea;

    @FXML
    public ImageView TreasureChestImage9;

    @FXML
    public Rectangle room5;

    @FXML
    public ScrollPane mapView;

    @FXML
    public Rectangle room6;

    @FXML
    public Rectangle room3;

    @FXML
    public Button downBtn;

    @FXML
    public Rectangle room4;

    @FXML
    public Rectangle room9;

    @FXML
    public Button rightBtn;

    @FXML
    public Rectangle room7;

    @FXML
    public Rectangle room8;

    @FXML
    public Rectangle dungeonEntrance;

    @FXML
    public TextArea armorTextArea;

    @FXML
    public Rectangle room2;

    @FXML
    public Label room2MapLabel;

    @FXML
    public Button menuBtn;

    @FXML
    public ImageView dungeonImage;

    @FXML
    public Pane parentPane;

    @FXML
    public Tab ArmTab;

    @FXML
    public ImageView darkKnightBossImage;

    @FXML
    public Label dungoenEntranceMapLabel;

    @FXML
    public Rectangle room10;

    @FXML
    public Button upBtn;

    @FXML
    public AnchorPane weaponPane;

    @FXML
    public Label room8MapLabel;

    @FXML
    public Label mapLabel;

    @FXML
    public Circle playerLocation7;

    @FXML
    public TextArea weaponTextArea;

    @FXML
    public Circle playerLocation6;

    @FXML
    public Circle playerLocation9;

    @FXML
    public Circle playerLocation8;

    @FXML
    public Label room4MapLabel;

    @FXML
    public Tab WeaponTab;

    @FXML
    public ImageView devourerMonsterImage;

    @FXML
    public Label room6MapLabel;
    
    public int roomNumber;
    
    HifenourDungeonModel hdm = new HifenourDungeonModel();
    HifenourDungeonTextModel hdmtm = new HifenourDungeonTextModel();
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";
    
    MediaPlayer mp;
    public String monsterName;

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
    		
    		monsterName = hdm.getMonsterName(hdm.getRoomName(roomNumber));
    		makeFadeOut();

    		
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
    		
    		monsterName = hdm.getMonsterName(hdm.getRoomName(roomNumber));
    		makeFadeOut();



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
    		
    		monsterName = hdm.getMonsterName(hdm.getRoomName(roomNumber));
    		makeFadeOut();


    		
    		
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
    		
    		monsterName = hdm.getMonsterName(hdm.getRoomName(roomNumber));
    		makeFadeOut();


    		
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
    		
    		monsterName = hdm.getMonsterName(hdm.getRoomName(roomNumber));
    		makeFadeOut();


    		
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
    	mp.stop();
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
    

    private void makeFadeOut() 
    {
    	FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(2000));
		 fadeTrans.setNode(parentPane);
		 fadeTrans.setFromValue(1);
		 fadeTrans.setToValue(0);
		 fadeTrans.play();
		 
		 fadeTrans.setOnFinished((ActionEvent event) ->
		 {
			try 
			{
				mp.stop();
				loadNextScene(event);
			} 
			catch (IOException | URISyntaxException e) 
			{
				e.printStackTrace();
			}
			
		 });		
	}


	private void loadNextScene(ActionEvent event) throws IOException, URISyntaxException 
	{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Combat/BattleView.fxml"));
		Parent root = (Parent) loader.load();

		CombatControl cc = loader.getController();
		cc.monsterName = this.monsterName;
		cc.setMonsterArea(monsterName);
		
    	Scene scene2 = new Scene(root);
		Stage newWindow = (Stage) parentPane.getScene().getWindow();
		newWindow.setScene(scene2);
		newWindow.show();		
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		try
		{
			Media media = new Media(getClass().getResource("/music/Dungeon.mp3").toURI().toString());
			mp = new MediaPlayer(media);
			mp.play();
			mp.setVolume(0.5);
			
			//Test this and add to rest of classes with music
			mp.setOnEndOfMedia(new Runnable() 
			{
			       public void run() 
			       {
			         mp.seek(Duration.ZERO);
			       }
			   });
			  mp.play();
		}
		catch (URISyntaxException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// TODO Auto-ge				
	}

    

}
