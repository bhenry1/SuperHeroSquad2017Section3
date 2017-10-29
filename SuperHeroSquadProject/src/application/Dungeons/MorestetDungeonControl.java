package application.Dungeons;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MorestetDungeonControl 
{
	MorestetDungeonModel mdm = new MorestetDungeonModel();

    @FXML
    private Button backToCity;

    @FXML
    private Button examineRoomBtn;

    @FXML
    private Button downBtn;

    @FXML
    private Label roomName;

    @FXML
    private Button upBtn;

    @FXML
    private Button rightBtn;

    @FXML
    private Button leftBtn;

    @FXML
    private Button menuBtn;

    @FXML
    private ImageView dungeonImage;

    @FXML
    private Pane parentPane;

    @FXML
    private TextArea navigationTextArea;

    @FXML
    private ImageView compassImage;
    
    public int roomNumber;  

   

    @FXML
    void moveUp(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingUp(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    }

    @FXML
    void moveDown(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingDown(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    }

    @FXML
    void moveRight(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingRight(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    }

    @FXML
    void moveLeft(ActionEvent event) 
    {
    	int roomNumber = mdm.getRoomNumber4MovingLeft(this.roomNumber);
    	roomName.setText(mdm.getRoomName(roomNumber));
    	this.roomNumber = roomNumber;
    }

    @FXML
    void exitDungeon(ActionEvent event) throws IOException 
    {
    	mdm.leaveDungeon(event);
    }

    @FXML
    void openMenu(ActionEvent event) 
    {

    }

    @FXML
    void examineRoom(ActionEvent event) 
    {

    }

}
