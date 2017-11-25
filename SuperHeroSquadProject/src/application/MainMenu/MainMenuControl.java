package application.MainMenu;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import Items.Inventory;
import application.NewGameController;
import application.CityElements.ShopControl;
import application.CityElements.ShopModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;

public class MainMenuControl extends Items.Inventory implements Initializable
{
	NewGameController ngc = new NewGameController();
	
    @FXML
    private Label mightyAxeAmount;


    @FXML
    private Label swordAmount;
	
    @FXML
    private Label longSwordAmount;
    
    @FXML
    private Label gunBladeAmount;
	
    @FXML
    private Label swordLabel;

    @FXML
    private VBox itemContainer;

    @FXML
    private Button loadGameButton;

    @FXML
    private ToolBar robeToolBar;

    @FXML
    private Label potionLabel;

    @FXML
    private ImageView powerPotionImage;

   

    @FXML
    private Label longSwordLabel;

    @FXML
    private ImageView mightyAxeImage;

    @FXML
    private ToolBar longSwordToolBar;

    @FXML
    private Label steelArmorDescription;

    @FXML
    private Button useHighPotionBtn;

    @FXML
    private Label robeDescription;

    @FXML
    private Label potionAmount;

    @FXML
    private Label leatherClothesAmount;

    @FXML
    private VBox menuButtonContainer;

    @FXML
    private Label steelArmorLabel;

    @FXML
    private Button equipGunBladeBtn;

    @FXML
    private Label robeAmount;

    @FXML
    private ToolBar mightyAxeToolBar;

    @FXML
    private ImageView robeImage;

    @FXML
    private Label highPotionDescription;

    @FXML
    private AnchorPane itemPane;

    @FXML
    private Label knifeDescription;

    @FXML
    private Label ironPlatingDescription;

    @FXML
    private ToolBar swordToolBar;

    @FXML
    private Button equipMightyAxeBtn;

    @FXML
    private Label defensePotionLabel;

    @FXML
    private ToolBar powerPotionToolBar;

    @FXML
    private Button equipRobeBtn;

    @FXML
    private Button equipKnifeBtn;

    @FXML
    private VBox weaponContainer;

    @FXML
    private ImageView gunBladeImage;

  
    @FXML
    private ToolBar defensePotionToolBar;



    @FXML
    private AnchorPane armorPane;

    @FXML
    private Label powerPotionDescription;

    @FXML
    private ToolBar gunBladeToolBar;

    @FXML
    private Label robeLabel;

    @FXML
    private ImageView steelArmorImage;

    @FXML
    private ToolBar highPotionToolBar;

    @FXML
    private Label leatherClothesDescription;

    @FXML
    private TabPane menuPane;

    @FXML
    private AnchorPane weaponPane;

    @FXML
    private Label powerPotionAmount;

    @FXML
    private Button equipSteelArmorBtn;

    @FXML
    private Label gunBladeDescription;

    @FXML
    private ImageView knifeImage;

    @FXML
    private Button exitGameButton1;

    @FXML
    private ImageView defensePotionImage;

    @FXML
    private Label ironPlatingLabel;

    @FXML
    private Tab saveTab;

    @FXML
    private ToolBar potionToolBar;

    @FXML
    private Button usePowerPotionBtn;

    @FXML
    private ImageView menuBackGroundImage;

    @FXML
    private Tab weaponTab;

    @FXML
    private Label defensePotionAmount;

    @FXML
    private ImageView potionImage;

    @FXML
    private ImageView swordImage;

    @FXML
    private Button saveGameButton;

    @FXML
    private Label highPotionLabel;

    @FXML
    private Label mightyAxeLabel;

    @FXML
    private Button equipIronPlatingBtn;

    @FXML
    private ToolBar ironPlatingToolBar;

    @FXML
    private Tab itemTab;

    @FXML
    private ImageView longSwordImage;

    @FXML
    private Label longSwordDescription;

    @FXML
    private Label knifeLabel;

    @FXML
    private ImageView ironPlatingImage;

    @FXML
    private ToolBar steelArmorToolBar;

    @FXML
    private Button equipLeatherClothesBtn;

    @FXML
    private Label powerPotionLabel;

    @FXML
    private Label swordDescription;

    @FXML
    private Button usePotionBtn;

    @FXML
    private Button useDefensePotionBtn;

    @FXML
    public Label knifeAmount;

    @FXML
    private ImageView menuBackGroundImage2;

    @FXML
    private ImageView menuBackGroundImage3;

    @FXML
    private ImageView menuBackGroundImage4;

    @FXML
    private ImageView leatherClothesImage;

    @FXML
    private Label leatherClothesLabel;

    @FXML
    private Label mightyAxeDescription;

    @FXML
    private Label potionDescription;

    @FXML
    private Label ironPlatingAmount;

    @FXML
    private VBox armorContainer;

    @FXML
    private Button equipLongSwordBtn;

    @FXML
    private Button resumeGameButton;

    @FXML
    private Label highPotionAmount;

    @FXML
    private Label defensePotionDescription;

    

    @FXML
    private Label steelArmorAmount;

    @FXML
    private ImageView highPotionImage;

    @FXML
    private Label gunBladeLabel;

    @FXML
    private AnchorPane savePane;

    @FXML
    private ToolBar knifeToolBar;

    @FXML
    private ToolBar leatherClothesToolBar;

    @FXML
    private Button equipSwordBtn;

    @FXML
    private Tab armorTab;
    
  
  MediaPlayer mp;
    
    
    
    MainMenuModel mmm = new MainMenuModel();

    @FXML
    void saveGame(ActionEvent event) throws IOException 
    {
    	try 
    	{
			BufferedWriter savedNames = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("SavedNames.txt"), "utf-8"));
			savedNames.write(ngc.playerName);
		} 
    		catch (UnsupportedEncodingException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    		catch (FileNotFoundException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void loadGame(ActionEvent event) 
    {

    }

    @FXML
    void exitGame(ActionEvent event) 
    {
    	mmm.exitGame();
    }

    @FXML
    void resumeGame(ActionEvent event) 
    {
    	mmm.resumeGame(event);
    }

    @FXML
    void usePotion(ActionEvent event) 
    {

    }

    @FXML
    void useHighPotion(ActionEvent event) 
    {

    }

    @FXML
    void usePowerPotion(ActionEvent event) 
    {

    }

    @FXML
    void useDefensePotion(ActionEvent event) 
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
    void equipLeatherClothes(ActionEvent event) 
    {

    }

    @FXML
    void equipIronPlating(ActionEvent event) 
    {

    }

    @FXML
    void equipSteelArmor(ActionEvent event) 
    {

    }


	
	
	

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
	
		
		if(map.get("Sword") == null)
		{
			swordCounter = 0;
		}
		else
		{
		swordCounter = map.get("Sword");
		}
		
		
		if(map.get("Knife") == null)
		{
			knifeCounter = 0;
		}
		else
		{
			knifeCounter = map.get("Knife");
		}
		
		if(map.get("LongSword") == null)
		{
			longSwordCounter = 0;
		}
		else
		{
			longSwordCounter = map.get("LongSword");
		}
		
		if(map.get("GunBlade") == null)
		{
			gunBladeCounter = 0;
		}
		else
		{
			gunBladeCounter = map.get("GunBlade");
		}
		
		if(map.get("MightyAxe") == null)
		{
			mightyAxeCounter = 0;

		}
		else
		{
			mightyAxeCounter = map.get("MightyAxe");
		}
		
		if(map.get("Robe") == null ) robeCounter = 0;
		else robeCounter = map.get("Robe");
		
		if(map.get("LeatherClothes") == null ) leatherClothesCounter = 0;
		else leatherClothesCounter = map.get("LeatherClothes");
		
		if(map.get("IronPlating") == null ) ironPlatingCounter = 0;
		else ironPlatingCounter = map.get("IronPlating");
		
		if(map.get("SteelArmor") == null ) steelArmorCounter = 0;
		else steelArmorCounter = map.get("SteelArmor");
		
		
		if(map.get("Potion") == null ) potionCounter = 0;
		else potionCounter = map.get("Potion");
		
		if(map.get("HighPotion") == null ) highPotionCounter = 0;
		else highPotionCounter = map.get("HighPotion");
		
		if(map.get("PowerPotion") == null ) powerPotionCounter = 0;
		else powerPotionCounter = map.get("PowerPotion");
		
		if(map.get("DefensePotion") == null ) defensePotionCounter = 0;
		else defensePotionCounter = map.get("DefensePotion");
		
	
		swordAmount.setText("" + swordCounter + "x");
		knifeAmount.setText("" + knifeCounter + "x");
		longSwordAmount.setText("" + longSwordCounter + "x" );
		gunBladeAmount.setText("" + gunBladeCounter + "x");
		mightyAxeAmount.setText("" + mightyAxeCounter + "x" );
		
		robeAmount.setText("" + robeCounter + "x");
		leatherClothesAmount.setText("" + leatherClothesCounter + "x" );
		ironPlatingAmount.setText("" + ironPlatingCounter + "x" );
		steelArmorAmount.setText("" + steelArmorCounter + "x");
		
		potionAmount.setText("" + potionCounter + "x");
		highPotionAmount.setText("" + highPotionCounter + "x");
		powerPotionAmount.setText("" + powerPotionCounter + "x");
		defensePotionAmount.setText("" + defensePotionCounter + "x" );
		
		//window.setOnCloseRequest(check "Closing program properly tutorial to do this")

		

		
		
	
	}

	
	



	

	

	


	

}
