package application.Combat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Dungeons.ClourtavDungeonControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class CombatControl extends ClourtavDungeonControl implements Initializable
{
	CombatModel cbm = new CombatModel();

    @FXML
    private Tab itemTab;

    @FXML
    private Tab BattleTab;

    @FXML
    private ImageView jiggyMonsterImage;

    @FXML
    private Label monsterLabel;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private ImageView streetRatMonsterImage;

    @FXML
    private AnchorPane armPane;

    @FXML
    private Button fleeBtn;

    @FXML
    private AnchorPane navPane;

    @FXML
    private ImageView zawMonsterImage;

    @FXML
    private ImageView clourtavBossImage;

    @FXML
    private TextArea battleTextArea;

    @FXML
    private AnchorPane itemPane;

    @FXML
    private TabPane userTabPane;

    @FXML
    private Button menuBtn;

    @FXML
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private Tab WeaponTab;

    @FXML
    private Tab ArmTab;

    @FXML
    private Button atkBtn;
    
    public String monster;

    

    @FXML
    void flee(ActionEvent event) throws IOException 
    {
    	cbm.fleeBattle(event);
    	
    }

    @FXML
    void openMenu(ActionEvent event) 
    {

    }

    @FXML
    void attackMonster(ActionEvent event) 
    {

    }

    @FXML
    void defendFromMonster(ActionEvent event) 
    {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		parentPane.setOpacity(0);
		fadeInTransition();
		
		
		System.out.println(roomNumber + "This is running first");		
		
		
		
		
			
	}

	private void fadeInTransition() 
	{
		FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(1000));
		 fadeTrans.setNode(parentPane);
		 fadeTrans.setFromValue(0);
		 fadeTrans.setToValue(1);
		 fadeTrans.play();
		
	}

}
