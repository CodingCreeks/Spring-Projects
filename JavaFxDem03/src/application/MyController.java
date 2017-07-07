package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyController {
	
	@FXML
	private Label myMessage;
	public void GenerateRadom(ActionEvent Event){
		Random rand=new Random();
		int myRand=rand.nextInt(50+1);
		myMessage.setText(Integer.toString(myRand));
		//System.out.println(Integer.toString(myRand));
	}

}
