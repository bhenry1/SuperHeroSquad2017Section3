package application.Combat;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Dungeons.ClourtavDungeonControl;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class CombatControl implements Initializable
{
	CombatModel cbm = new CombatModel();

    @FXML private Pane parentPane;

    @FXML private TabPane userTabPane;
    @FXML private Tab itemTab;
    @FXML private Tab BattleTab;
    @FXML private Tab WeaponTab;
    @FXML private Tab ArmTab;

    @FXML private ImageView jiggyMonsterImage;
    @FXML private ImageView streetRatMonsterImage;
    @FXML private ImageView clourtavBossImage;
    @FXML private ImageView zawMonsterImage;
    @FXML private ImageView dungeonImage;

    @FXML private TextArea battleTextArea;
    @FXML private TextArea WeaponTabView;
    @FXML private TextArea itemTabView;
    @FXML private TextArea ArmorTabView;
    
    @FXML private Label monsterLabel;

    @FXML private AnchorPane weaponPane;
    @FXML private AnchorPane armPane;
    @FXML private AnchorPane navPane;
    @FXML private AnchorPane itemPane;

    @FXML private Button atkBtn;
    @FXML private Button fleeBtn;
    @FXML private Button menuBtn;
    @FXML private Button examineMonsterBtn;
    
    @FXML private RadioButton robeRadioButton;
    @FXML private RadioButton leatherClothingRadioButton;
    @FXML private RadioButton ironPlatingRadioButton;
    @FXML private RadioButton steelArmorRadioButton;
 
    @FXML private RadioButton knifeRadioButton;
    @FXML private RadioButton swordRadioButton;
    @FXML private RadioButton gunBladeRadioButton11;
    @FXML private RadioButton longSwordRadioButton1;
    @FXML private RadioButton mightyAxeRadioButton;
    
  
    public String monsterName;
    Player player = new Player(1, 10, 1, 0, 0);
 
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		parentPane.setOpacity(0);
		fadeInTransition();		
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
	
	public void setMonsterArea(String monsterName)
	{
		this.monsterName = monsterName;
		
		monsterLabel.setText(this.monsterName);
		
		if(this.monsterName.equals("Jiggy"))
		jiggyMonsterImage.setVisible(true);
		
		if(this.monsterName.equals("Zaw"))
		zawMonsterImage.setVisible(true);
		
		if(this.monsterName.equals("Dungeon Master Zul"))
		clourtavBossImage.setVisible(true);
		
		if(this.monsterName.equals("Street Rat"))
		streetRatMonsterImage.setVisible(true);
	}

    @FXML
    void flee(ActionEvent event) throws IOException 
    {
    	cbm.fleeBattle(event);
    	
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	cbm.goToMainMenu(event);
    }

    @FXML
    void attackMonster(ActionEvent event) 
    {
    	//int damageDealt = cbm.attackMonster(player.playerstrength );
    	
    	//System.out.println("You did " + damageDealt + " to the monster");
    	
    	
    }

    @FXML
    void defendFromMonster(ActionEvent event) 
    {

    }
    
    @FXML
    void equipKnife(ActionEvent event) 
    {

    }
    
    @FXML
    void equipSword(ActionEvent event) 
    {

    }
    
    @FXML
    void equipLongSword(ActionEvent event) 
    {

    }
    
    @FXML
    void equipGunBlade(ActionEvent event) 
    {

    }
    
    @FXML
    void equipMightyAxe(ActionEvent event) 
    {

    }
    
    @FXML
    void equipRobe(ActionEvent event) 
    {

    }
    
    @FXML
    void equipLeatherClothing(ActionEvent event) 
    {

    }
    
    @FXML
    void equipIronPlating(ActionEvent event) 
    {

    }
    
    @FXML
    void equipsteelArmor(ActionEvent event) 
    {

    }
    

    @FXML
    void examineMonster(ActionEvent event) 
    {
    	System.out.println("Return Monster Description and Heatlh");
    }



	

	

	



}
