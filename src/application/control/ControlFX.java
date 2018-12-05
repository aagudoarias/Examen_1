package application.control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControlFX {
	@FXML
	private Stage sendStage;
	
	 public void GetStarted () {
		
		 try {
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(ControlFX.class.getResource("GetMe.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("Stage2");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);         
	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	



	@FXML
	private void handleExit() {
		System.exit(1);
	}
}
