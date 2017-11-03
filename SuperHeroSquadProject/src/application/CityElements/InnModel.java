package application.CityElements;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class InnModel 
{
  public void example()
  {
	  System.out.println("pussy nigga");
  }
  
  
  public void leaveInn(ActionEvent event)
  {
	  	Stage window = (Stage) (((Node) event.getSource()).getScene().getWindow());  
  		window.close();
  		
  }
}
