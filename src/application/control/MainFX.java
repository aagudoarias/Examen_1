package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/*
 * @author Alejandro Agudo
 * @version 3.0
 * 
 *
 */
public class MainFX extends Application {
	
    public void start(Stage primaryStage) throws IOException {
    	
          FXMLLoader loader =new FXMLLoader(getClass().getResource("Profile.fxml"));
            AnchorPane pane=loader.load();
            
            Scene scene=new Scene(pane);
			scene.getStylesheets().addAll(getClass().getResource("styles.css").toExternalForm());
            Font.loadFont(getClass().getResourceAsStream("../application.view.assets/PoiretOne-Regular.ttf"), 20);
            primaryStage.setTitle("EXAMEN DESARROLLO INTERFACES");
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
