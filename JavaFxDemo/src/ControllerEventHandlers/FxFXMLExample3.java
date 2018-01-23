/**
 * 
 */
package ControllerEventHandlers;

/** 
 * ClassName: FxFXMLExample3 <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(��ѡ). <br/> 
 * date: 2018��1��23�� ����4:20:32 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxFXMLExample3 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		// Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader();
		// Path to the FXML File
		String fxmlDocPath = "src\\ControllerEventHandlers\\FxFXMLExample3.fxml";
		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

		// Create the Pane and all Details
		VBox root = (VBox) loader.load(fxmlStream);

		// Create the Scene
		Scene scene = new Scene(root);
		// Set the Scene to the Stage
		stage.setScene(scene);
		// Set the Title to the Stage
		stage.setTitle("A FXML Example with a Controller");
		// Display the Stage
		stage.show();

	}
}