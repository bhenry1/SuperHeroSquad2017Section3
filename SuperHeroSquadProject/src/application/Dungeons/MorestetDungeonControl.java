package application.Dungeons;

import java.io.IOException;

import application.Main;
import application.Combat.CombatControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MorestetDungeonControl 
{

    @FXML
    public ImageView slimeKingMonsterImage;

    @FXML
    public Circle playerLocation1;

    @FXML
    public Circle playerLocation3;

    @FXML
    public Circle playerLocation2;

    @FXML
    public AnchorPane armPane;

    @FXML
    public Circle playerLocation4;

    @FXML
    public Rectangle exit4;

    @FXML
    public Rectangle exit3;

    @FXML
    public Rectangle exit2;

    @FXML
    public TextArea itemTextArea;

    @FXML
    public Button leftBtn2;

    @FXML
    public ImageView monsTerSymbolImage3;

    @FXML
    public Button downBtn2;

    @FXML
    public Tab itemTab;

    @FXML
    public ImageView TreasureChestImage2;

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
    public TextArea navigationTextArea;

    @FXML
    public ScrollPane mapView;

    @FXML
    public Rectangle room3;

    @FXML
    public Rectangle room4;

    @FXML
    public ImageView goblinComMonsterImage;

    @FXML
    public Rectangle dungeonEntrance;

    @FXML
    public TextArea armorTextArea;

    @FXML
    public Rectangle room2;

    @FXML
    public Button backToCity2;

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
    public ImageView bossSymbolImage4;

    @FXML
    public Button upBtn2;

    @FXML
    public Label dungoenEntranceMapLabel;

    @FXML
    public Button rightBtn2;

    @FXML
    public AnchorPane weaponPane;

    @FXML
    public Label navigationLabel;

    @FXML
    public Label movementLabel;

    @FXML
    public Label mapLabel;

    @FXML
    public TextArea weaponTextArea;

    @FXML
    public Label room4MapLabel;

    @FXML
    public ImageView batMonsterImage;

    @FXML
    public Tab WeaponTab;

    @FXML
    public Button examineRoomBtn2;

    MorestetDungeonModel mdm = new MorestetDungeonModel();
    MorestetDungeonTextModel mdtm = new MorestetDungeonTextModel();
    private String discoveredMonster = "You have discovered a Monster. Prepare to fight.";
    private String discoveredBoss = "You have discovered the Dungeon Master. Prepare for a tough fight.";
    public int roomNumber;
    public String monsterName;
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
    		
    		monsterName = mdm.getMonsterName(mdm.getRoomName(roomNumber));
    		//System.out.println(monsterName);
    		makeFadeOut();

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
    		
    		monsterName = mdm.getMonsterName(mdm.getRoomName(roomNumber));
    		//System.out.println(monsterName);
    		makeFadeOut();

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
				loadNextScene(event);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		 });
		}

	private void loadNextScene(ActionEvent event) throws IOException 
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


		
		//Parent root = FXMLLoader.load(Main.class.getResource("Combat/BattleView.fxml"));
    	
    	
    	
 
				
	}

    
}
