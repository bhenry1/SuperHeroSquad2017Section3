package application.WorldMap;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Path;

public class WorldMapControl 
{
	WorldMapModel wm = new WorldMapModel();

    @FXML
    private Button Monetonc;

    @FXML
    private Button Hackipon;

    @FXML
    private Button gatesOfHell;

    @FXML
    private ImageView WorldMap;

    @FXML
    private Button Clourtav;

    @FXML
    private Button Hifenour;

    @FXML
    private Button Morestet;

    @FXML
    private Button Aruthor;
    
    @FXML
    private Button menuBtn;
    
   
    @FXML
    void enterMorestet(ActionEvent event) throws IOException, URISyntaxException
    {
    	wm.goToMorestet(event);
    }
  

    @FXML
    void enterMonetonc(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToMonetonc(event);
    }

    @FXML
    void enterCloutav(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToClourtav(event);
    }

    @FXML
    void enterHackipon(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToHackipon(event);

    }

    @FXML
    void enterArthor(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToArthur(event);

    }

    @FXML
    void enterHifenour(ActionEvent event) throws IOException, URISyntaxException 
    {
    	wm.goToHifenour(event);
    }

    @FXML
    void enterGatesOfHell(ActionEvent event) throws IOException 
    {
    	wm.goToGatesOfHell(event);
    		
    }
    

    @FXML
    void openMenu(ActionEvent event) throws IOException 
    {

    	wm.goToMainMenu(event);
    }

}
