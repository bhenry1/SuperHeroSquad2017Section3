package application.Combat;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import application.Dungeons.ClourtavDungeonControl;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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

public class CombatControl extends Character implements Initializable
{
	CombatModel cbm = new CombatModel();
	CombatTextModel cbmtm = new CombatTextModel();

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
    @FXML private Label damageLabel;

    @FXML private AnchorPane weaponPane;
    @FXML private AnchorPane armPane;
    @FXML private AnchorPane navPane;
    @FXML private AnchorPane itemPane;

    @FXML private Button atkBtn;
    @FXML private Button fleeBtn;
    @FXML private Button menuBtn;
    @FXML private Button examineMonsterBtn;
    @FXML private Button defendBtn;

    
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
    public int damageDealt;
    public int damageRecived;
    Random rand = new Random(); 
    public String displayDamageDealt = "You attacked the monster and dealt ";
    public String displayDamageRecived = "The monster counterattacked and dealt ";

 
    

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
    	if(knifeEquipped)
    	{
        	damageDealt = playerstrength + knifePower;
        	damageDealt = 1 + (int)(Math.random() * ((damageDealt - 1) + 1));        	
        	damageLabel.setText("" + damageDealt);
        	damageLabel.setVisible(true);
        	makeFadeOut();
        	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	atkBtn.setVisible(false);
        	defendBtn.setVisible(false);
        	
        	 monsterCounterAtk(monsterName);
        	//cbmtm.typingAnimationForBattles(displayDamageRecived + damageRecived + " damage", battleTextArea);
    	}
    	
    	if(swordEquipped)
    	{
    		damageDealt = playerstrength + swordPower;
    		damageDealt = 4 + (int)(Math.random() * ((damageDealt - 4) + 1));
    		damageLabel.setText("" + damageDealt);
    		damageLabel.setVisible(true);
    		
    		
    		makeFadeOut();
    		cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	atkBtn.setVisible(false);
        	defendBtn.setVisible(false);
       	 	monsterCounterAtk(monsterName);

    	}
    	if(longSwordEquipped)
    	{
    		damageDealt = playerstrength + longSwordPower;
    		damageDealt = 6 + (int)(Math.random() * ((damageDealt - 6) + 1));
    		damageLabel.setText("" + damageDealt);
    		damageLabel.setVisible(true);
    		
    		
    		makeFadeOut();
    		cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	atkBtn.setVisible(false);
        	defendBtn.setVisible(false);
       	 	monsterCounterAtk(monsterName);
    	}
    	if(gunBladeEquipped)
    	{
    		damageDealt = playerstrength + gunBladePower;
    		damageDealt = 10 + (int)(Math.random() * ((damageDealt - 10) + 1));
    		damageLabel.setText("" + damageDealt);
        	damageLabel.setVisible(true);
        	makeFadeOut();
        	
        	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	atkBtn.setVisible(false);
        	defendBtn.setVisible(false);
       	 	monsterCounterAtk(monsterName);
    	}
    	if(mightyAxeEquipped)
    	{
        damageDealt = playerstrength + mightyAxePower;
		damageDealt = 14 + (int)(Math.random() * ((damageDealt - 14) + 1));
    	damageLabel.setText("" + damageDealt);
    	damageLabel.setVisible(true);
    	makeFadeOut();
    	
    	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
    	atkBtn.setVisible(false);
    	defendBtn.setVisible(false);
   	 	monsterCounterAtk(monsterName);

    	}
    	else if((knifeEquipped== false) && (swordEquipped== false) && (longSwordEquipped== false) &&  (gunBladeEquipped== false) && (mightyAxeEquipped== false)  )
    	{
    	cbmtm.openFile();
    	cbmtm.typingAnimationForBattles(cbmtm.readFile(), battleTextArea);
    	cbmtm.closeFile();
    	}
    }

    @FXML
    void defendFromMonster(ActionEvent event) 
    {

    }
    
    @FXML
    void equipKnife(ActionEvent event) 
    {
    	knifeEquipped = true;
    	swordEquipped = false;
    	longSwordEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    }
    
    @FXML
    void equipSword(ActionEvent event) 
    {
    	swordEquipped = true;
    	knifeEquipped = false;
    	longSwordEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    }
    
    @FXML
    void equipLongSword(ActionEvent event) 
    {
    	longSwordEquipped = true;
    	swordEquipped = false;
    	knifeEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    }
    
    @FXML
    void equipGunBlade(ActionEvent event) 
    {
    	gunBladeEquipped = true;
    	swordEquipped = false;
    	knifeEquipped = false;
    	longSwordEquipped = false;
    	mightyAxeEquipped = false;
    }
    
    @FXML
    void equipMightyAxe(ActionEvent event) 
    {
    	mightyAxeEquipped = true;
    	gunBladeEquipped = false;
    	swordEquipped = false;
    	knifeEquipped = false;
    	longSwordEquipped = false;
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


    private void makeFadeOut() 
	 {


		 FadeTransition fadeTrans = new FadeTransition();
		 fadeTrans.setDuration(Duration.millis(3000));
		 fadeTrans.setNode(damageLabel);
		 fadeTrans.setFromValue(1);
		 fadeTrans.setToValue(0);
		 fadeTrans.play();
		 
		 fadeTrans.setOnFinished((ActionEvent event) ->
		 {
			 int damageRecived = monsterCounterAtk(monsterName);
			cbmtm.typingAnimationForCounterAttakcs(displayDamageRecived + damageRecived + " damage" , battleTextArea);
			
			
			atkBtn.setVisible(true);
			defendBtn.setVisible(true);
			
		 });
		 
	 }
    
  
	

	

	



}
