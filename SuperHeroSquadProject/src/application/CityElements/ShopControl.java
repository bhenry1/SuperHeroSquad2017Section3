package application.CityElements;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;

import Items.Inventory;
import application.Main;
import application.MainMenu.MainMenuControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ShopControl  extends Inventory

{

    @FXML
    private Label swordLabel;

    @FXML
    private Label ironPlanting;

    @FXML
    private TextArea weaponsTextArea;

    @FXML
    private TextArea armorTextArea;

    @FXML
    private Button buyRobeButton;

    @FXML
    private Button buySteelArmorButton;

    @FXML
    private Label longSwordLabel;

    @FXML
    private Button buyLeatherClothesButton;

    @FXML
    private AnchorPane armorAnchorPane;

    @FXML
    private Label mightyAxeLabel;

    @FXML
    private Tab shopTabWeapons;

    @FXML
    private Pane shopPane;

    @FXML
    private TabPane shopTabPane;

    @FXML
    private Label shopLabel;

    @FXML
    private Button buySwordButton;

    @FXML
    private Tab amrorTab;

    @FXML
    private Button buyGunBladeButton;

    @FXML
    private Button buyKnifeButton;

    @FXML
    private ImageView shopImageView;

    @FXML
    private Label knifeLabel;

    @FXML
    private Label gunBladeLabel;

    @FXML
    private Label leatherClothes;

    @FXML
    private Label robe;

    @FXML
    private Label steelArmor;

    @FXML
    private AnchorPane weaponsAnchorPane;

    @FXML
    private Button buyLongSwordButton;

    @FXML
    private Button buyIronPlatingButton;

    @FXML
    private Button buyMightyAxeButton;
    
    
   

    @FXML
    void buyKnife(ActionEvent event) throws IOException 
    {	
    	addKnife();
    	//update gold
    }

    @FXML
    void buySword(ActionEvent event) throws IOException 
    {
    	addSword();
    }

    @FXML
    void buyLongSword(ActionEvent event) 
    {
    	addLongSword();
    }

    @FXML
    void buyGunBlade(ActionEvent event) 
    {
    	addGunBlade();
    }

    @FXML
    void buyMightyAxe(ActionEvent event) 
    {
    	addMightyAxe();
    }

    @FXML
    void buyRobe(ActionEvent event) 
    {
    	addRobe();
    }

    @FXML
    void buyLeatherClothes(ActionEvent event) 
    {
    	addLeatherClothes();
    }

    @FXML
    void buyIronPlating(ActionEvent event) 
    {
    	addIronPlating();

    }

    @FXML
    void buySteelArmor(ActionEvent event) 
    {
    	addSteelArmor();
    }

	

		








  

}
