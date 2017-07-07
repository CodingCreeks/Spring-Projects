import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyController {
	
		@FXML
		private Label Mymessage;
		public void GenerateRandom(ActionEvent Event)
		{
			Random rand=new Random();
			int myrand=rand.nextInt(50)+1;
			Mymessage.setText(Integer.toString(myrand));
			
			//System.out.println(Integer.toString(myrand));
		}
}
