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
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
    @FXML private ImageView batMonsterImage;
    @FXML private ImageView goblinComMonsterImage;
    @FXML private ImageView elephantKinMonsterImage;
    @FXML private ImageView thiefMonsterImage;
    @FXML private ImageView GuardsmanBossImage;


    @FXML private TextArea battleTextArea;
    @FXML private TextArea WeaponTabView;
    @FXML private TextArea itemTabView;
    @FXML private TextArea ArmorTabView;
    
    @FXML private Label monsterLabel;
    @FXML private Label damageLabel;
    @FXML private Label healthLabel;
    
    @FXML private Label potionLabel;
    @FXML private Label highPotionLabel;
    @FXML private Label powerPotionLabel;
    @FXML private Label defensePotionLabel;

    @FXML private AnchorPane weaponPane;
    @FXML private AnchorPane armPane;
    @FXML private AnchorPane navPane;
    @FXML private AnchorPane itemPane;

    @FXML private Button attkBtn;
    @FXML private Button fleeBtn;
    @FXML private Button menuBtn;
    @FXML private Button examineMonsterBtn;

    @FXML private VBox itemVBox;
    
    
    
    @FXML private ToolBar potionToolBar;
    @FXML private ToolBar highPotionToolBar;
    @FXML private ToolBar powerPotionToolBar;
    @FXML private ToolBar defensePotionToolBar;
    
    
    @FXML private Button potionBtn;
    @FXML private Button highPotionBtn;
    @FXML private Button powerPotionBtn;
    @FXML private Button  defensePotionBtn;

    
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
    public int newHealth;
    
    public int monsterHealth;
    
    int potionCounter;
	int highPotionCounter;
	int powerPotionCounter;
	int defensePotionCounter;





    
    

 
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		parentPane.setOpacity(0);
		healthLabel.setText("Health: " + playerHealth);
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
		
		if(this.monsterName.equals("Bat"))
		{
			batMonsterImage.setVisible(true);
			Image img = new Image("file:Images/ClourtavDungeon.jpg");
			dungeonImage.setImage(img);
		}
		
		if(this.monsterName.equals("DM: Goblin Capt."))
		{
			goblinComMonsterImage.setVisible(true);
			Image img = new Image("file:Images/ClourtavDungeon.jpg");
			dungeonImage.setImage(img);
		}
		
		if(this.monsterName.equals("Elephant Kin"))
		{
			elephantKinMonsterImage.setVisible(true);
			Image img = new Image("file:Images/MonetoncDungeon.jpg");
			dungeonImage.setImage(img);

		}
		
		if(this.monsterName.equals("Thief"))
		{
			thiefMonsterImage.setVisible(true);
			Image img = new Image("file:Images/MonetoncDungeon.jpg");
			dungeonImage.setImage(img);

		}
		
		if(this.monsterName.equals("DM: Guardsman"))
		{
			GuardsmanBossImage.setVisible(true);
			Image img = new Image("file:Images/MonetoncDungeon.jpg");
			dungeonImage.setImage(img);

		}
		
    	 monsterHealth = cbm.getMonsterHealth(this.monsterName);
    	 

	}
	
	
	

    @FXML
    void flee(ActionEvent event) throws IOException 
    {
    	if(monsterName.equals("Bat") || monsterName.equals("DM: Goblin Capt."))
    	cbm.fleeMorstetBattle(event);
    	
    	if(monsterName.equals("Elephant Kin") || monsterName.equals("Thief") || monsterName.equals("DM: Guardsman"))
    	cbm.fleeMonetoncBattle(event);
    	
    	else	
    	cbm.fleeBattle(event);
    	
    }

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {
    	cbm.goToMainMenu(event);
    }

    @FXML
    void attackMonster(ActionEvent event) throws IOException 
    {
    	if(knifeEquipped)
    	{
        	damageDealt = playerstrength + knifePower;
        	damageDealt = 1 + (int)(Math.random() * ((damageDealt - 1) + 1));        	
        	damageLabel.setText("" + damageDealt);
        	damageLabel.setVisible(true);
        	
        	monsterHealth = monsterHealth - damageDealt;
        	        	
        	if(monsterHealth <= 0)
        	{
        		//run a method to show victory screen
        		winBattle(event, monsterName);
        	}
        	
        	makeFadeOut();
        	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	attkBtn.setVisible(false);
        	
        	damageRecived = monsterCounterAtk(monsterName);
        	newHealth = getNewHealth(damageRecived); 
        	healthLabel.setText("Health: " + newHealth);
        	//playerHealth = playerHealth - damageRecived;
        	//cbmtm.typingAnimationForBattles(displayDamageRecived + damageRecived + " damage", battleTextArea);
    	}
    	
    	if(swordEquipped)
    	{
    		damageDealt = playerstrength + swordPower;
    		damageDealt = 4 + (int)(Math.random() * ((damageDealt - 4) + 1));
    		damageLabel.setText("" + damageDealt);
    		damageLabel.setVisible(true);
    		
        	monsterHealth = monsterHealth - damageDealt;
        	
        	if(monsterHealth <= 0)
        	{
        		//run a method to show victory screen
        		winBattle(event, monsterName);
        	}

    		
    		makeFadeOut();
    		cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	attkBtn.setVisible(false);
        	
        	damageRecived = monsterCounterAtk(monsterName);
        	newHealth = getNewHealth(damageRecived); 
        	healthLabel.setText("Health: " + newHealth);
        	
        	//playerHealth = playerHealth - damageRecived;


    	}
    	if(longSwordEquipped)
    	{
    		damageDealt = playerstrength + longSwordPower;
    		damageDealt = 6 + (int)(Math.random() * ((damageDealt - 6) + 1));
    		damageLabel.setText("" + damageDealt);
    		damageLabel.setVisible(true);
    		
    		monsterHealth = monsterHealth - damageDealt;
        	
        	if(monsterHealth <= 0)
        	{
        		//run a method to show victory screen
        		winBattle(event, monsterName);
        	}

    		
    		
    		makeFadeOut();
    		cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	attkBtn.setVisible(false);
        	
        	damageRecived = monsterCounterAtk(monsterName);
        	newHealth = getNewHealth(damageRecived); 
        	healthLabel.setText("Health: " + newHealth);
        	
        	//playerHealth = playerHealth - damageRecived;

    	}
    	if(gunBladeEquipped)
    	{
    		damageDealt = playerstrength + gunBladePower;
    		damageDealt = 10 + (int)(Math.random() * ((damageDealt - 10) + 1));
    		damageLabel.setText("" + damageDealt);
        	damageLabel.setVisible(true);
        	
    		monsterHealth = monsterHealth - damageDealt;

        	
        	if(monsterHealth <= 0)
        	{
        		//run a method to show victory screen
        		winBattle(event, monsterName);
        	}

        	
        	
        	makeFadeOut();
        	
        	
        	
        	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
        	attkBtn.setVisible(false);
        	
        	damageRecived = monsterCounterAtk(monsterName);
        	newHealth = getNewHealth(damageRecived); 
        	healthLabel.setText("Health: " + newHealth);
        	
        	//playerHealth = playerHealth - damageRecived;

    	}
    	if(mightyAxeEquipped)
    	{
        damageDealt = playerstrength + mightyAxePower;
		damageDealt = 14 + (int)(Math.random() * ((damageDealt - 14) + 1));
    	damageLabel.setText("" + damageDealt);
    	damageLabel.setVisible(true);
    	
		monsterHealth = monsterHealth - damageDealt;

    	
    	if(monsterHealth <= 0)
    	{
    		//run a method to show victory screen
    		winBattle(event, monsterName);
    	}

    	
    	makeFadeOut();
    	
    	cbmtm.typingAnimationForBattles(displayDamageDealt + damageDealt + " damage." , battleTextArea);
    	attkBtn.setVisible(false);
    	
    	damageRecived = monsterCounterAtk(monsterName);
    	newHealth = getNewHealth(damageRecived); 
    	healthLabel.setText("Health: " + newHealth);
    	
    	//playerHealth = playerHealth - damageRecived;


    	}
    	else if((knifeEquipped== false) && (swordEquipped== false) && (longSwordEquipped== false) &&  (gunBladeEquipped== false) && (mightyAxeEquipped== false)  )
    	{
    	cbmtm.openFile();
    	cbmtm.typingAnimationForBattles(cbmtm.readFile(), battleTextArea);
    	cbmtm.closeFile();
    	}
    }

    private void winBattle(ActionEvent event, String monsterName) throws IOException 
    {
    	cbm.showVictoryScreen(event, monsterName);
    	
	}

	
    
    
    
    
    @FXML
    void equipKnife(ActionEvent event) throws IOException 
    {
    	if( (map.get("Knife") == null) || (map.get("Knife") == 0) )
    	{
        	cbm.outOfItems(event);
        	knifeEquipped = false;
    	}
    	else
    	{
    	System.out.println("How am i getting here");
    	knifeEquipped = true;
    	swordEquipped = false;
    	longSwordEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    	}
    }
    
    @FXML
    void equipSword(ActionEvent event) throws IOException 
    {
    	if( (map.get("Sword") == null) || (map.get("Sword") == 0) )
    	{
        	cbm.outOfItems(event);
        	swordEquipped = false;
    	}
    	
    	else 
    	{
    	swordEquipped = true;
    	knifeEquipped = false;
    	longSwordEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    	}
    }
    
    @FXML
    void equipLongSword(ActionEvent event) throws IOException 
    {
    	if( (map.get("LongSword") == null) || (map.get("LongSword") == 0) )
    	{
        	cbm.outOfItems(event);
        	longSwordEquipped = false;
    	}
    	else
    	{
    	longSwordEquipped = true;
    	swordEquipped = false;
    	knifeEquipped = false;
    	gunBladeEquipped = false;
    	mightyAxeEquipped = false;
    	}
    }
    
    @FXML
    void equipGunBlade(ActionEvent event) throws IOException 
    {
    	if( (map.get("GunBlade") == null) || (map.get("GunBlade") == 0) )
    	{
        	cbm.outOfItems(event);
        	gunBladeEquipped = false;
    	}
    	
    	else
    	{
    	gunBladeEquipped = true;
    	swordEquipped = false;
    	knifeEquipped = false;
    	longSwordEquipped = false;
    	mightyAxeEquipped = false;
    	}
    }
    
    @FXML
    void equipMightyAxe(ActionEvent event) throws IOException 
    {
    	if( (map.get("MightyAxe") == null) || (map.get("MightyAxe") == 0) )
    	{
        	cbm.outOfItems(event);
        	mightyAxeEquipped = false;
    	}
    	
    	else
    	{
    	mightyAxeEquipped = true;
    	gunBladeEquipped = false;
    	swordEquipped = false;
    	knifeEquipped = false;
    	longSwordEquipped = false;
    	}
    }
    
    @FXML
    void equipRobe(ActionEvent event) throws IOException 
    {
    	
    
    	if( (map.get("Robe") == null) || (map.get("Robe") == 0) )
    	{
        cbm.outOfItems(event);
    	}
    	
    	else
    	playerDefense = 2;
    }
    
    @FXML
    void equipLeatherClothing(ActionEvent event) throws IOException 
    {
    	
    	if( (map.get("LeatherClothes") == null) || (map.get("LeatherClothes") == 0)  )
    	{
        cbm.outOfItems(event);
    	}
    	
    	else
    	playerDefense = 3;

    }
    
    @FXML
    void equipIronPlating(ActionEvent event) throws IOException 
    {
    	
    	
    	if( (map.get("IronPlating") == null) || (map.get("IronPlating") == 0) )
    	{
        cbm.outOfItems(event);
    	}
    	
    	else
    	playerDefense = 4;

    }
    
    @FXML
    void equipsteelArmor(ActionEvent event) throws IOException 
    {
    	
    
    	if( (map.get("SteelArmor") == null) || (map.get("SteelArmor") == 0)  )
    	{
        cbm.outOfItems(event);
    	}
    	
    	
    	playerDefense = 6;

    }
    
    @FXML
    void usePotion(ActionEvent event) throws IOException 
    {
    	potionCounter++;
    	if( (map.get("Potion") == null) || (map.get("Potion") == 0) || (map.get("Potion") == potionCounter) )
    	{
    		cbm.outOfItems(event);
    	}
    	
       	
    	
    	else if((playerHealth >= 20) || (newHealth >= 20) )
    	{
    		System.out.println("You cannot use a potion as your health is already full");
    		
    	}
    	
    	else
    	{
    	newHealth = newHealth + (newHealth/4);
    	playerHealth = newHealth;
    		if(newHealth >= 20)
    		{
    			healthLabel.setText("Health: "  + 20);
    		}
    		
    		else
    		healthLabel.setText("Health: "  + newHealth);
    	}
    	 	 	
    }
    

    @FXML
    void useHighPotion(ActionEvent event) throws IOException 
    {
    		highPotionCounter++;
    		if( (map.get("HighPotion") == null) || (map.get("HighPotion") == 0) || (map.get("HighPotion") == highPotionCounter) )
    		{
    			cbm.outOfItems(event);
    		}
    		
    		

        	else if((playerHealth >= 20) || (newHealth >= 20) )
        	{
        		System.out.println("You cannot use a potion as your health is already full");
        		
        	}
        	
        	else
        	{
        	newHealth = newHealth + (newHealth/2);
        	playerHealth = newHealth;
        		if(newHealth >= 20)
        		{
        			healthLabel.setText("Health: "  + 20);
        		}
        		
        		else
        		healthLabel.setText("Health: "  + newHealth);
        	}
        	 	 	
    		
    	
    	
    }
    

    @FXML
    void usePowerPotion(ActionEvent event) throws IOException 
    {
		powerPotionCounter++;
    	if( (map.get("PowerPotion") == null) || (map.get("PowerPotion") == 0) || (map.get("PowerPotion") == powerPotionCounter) )
    	{
        cbm.outOfItems(event);
    	}
    	
    	

    	else if((playerHealth >= 20) || (newHealth >= 20) )
    	{
    		System.out.println("You cannot use a potion as your health is already full");
    		
    	}
    	
    	else
    	{
    	newHealth = newHealth + (newHealth/4);
    	playerHealth = newHealth;
    		if(newHealth >= 20)
    		{
    			healthLabel.setText("Health: "  + 20);
    		}
    		
    		else
    		healthLabel.setText("Health: "  + newHealth);
    	}
    	 	 	
    }
    

    @FXML
    void useDefensePotion(ActionEvent event) throws IOException 
    {
		defensePotionCounter++;
    	if( (map.get("DefensePotion") == null) || (map.get("DefensePotion") == 0) || (map.get("DefensePotion") == defensePotionCounter) )
    	{
            cbm.outOfItems(event);
    	}
    	
    	

    	else if((playerHealth >= 20) || (newHealth >= 20) )
    	{
    		System.out.println("You cannot use a potion as your health is already full");
    		
    	}
    	
    	else
    	{
    	newHealth = newHealth + (newHealth/4);
    	playerHealth = newHealth;
    		if(newHealth >= 20)
    		{
    			healthLabel.setText("Health: "  + 20);
    		}
    		
    		else
    		healthLabel.setText("Health: "  + newHealth);
    	}
    	
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
			
			cbmtm.typingAnimationForCounterAttakcs(displayDamageRecived + damageRecived + " damage" , battleTextArea);
			
			
			attkBtn.setVisible(true);
			
		 });
		 
	 }
    
  
	

	

	



}
