package application.CityElements;

import Items.Inventory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class TavernControl 
{

    @FXML
    private Tab potionTab;

    @FXML
    private Button buyDefPotionBtn;

    @FXML
    private Label potion;

    @FXML
    private Tab hintTap;

    @FXML
    private AnchorPane hintAnchorPane;

    @FXML
    private TextArea hintTextArea;

    @FXML
    private ImageView tavernImage;

    @FXML
    private TabPane tavernTabPane;

    @FXML
    private AnchorPane potionAnchorPane;

    @FXML
    private Label highpotion;

    @FXML
    private TextArea potionTextArea;

    @FXML
    private Pane tavernPane;

    @FXML
    private Label powerPotion;

    @FXML
    private Button buyPotionBtn;

    @FXML
    private Label tavernLabel;

    @FXML
    private Button buyHighPotionBtn;

    @FXML
    private Button buyPowerPotionBtn;

    @FXML
    private Label defPotion;

    Inventory ivn = new Inventory();

    @FXML
    void buyPotion(ActionEvent event) 
    {
    	ivn.addPotion();
    }

    @FXML
    void buyHighPotion(ActionEvent event) 
    {
    	ivn.addHighPotion();
    }

    @FXML
    void buyPowerPotion(ActionEvent event) 
    {
    	ivn.addPowerPotion();
    }

    @FXML
    void buyDefPotion(ActionEvent event)
    {
    	ivn.addDefensePotion();
    }

}
