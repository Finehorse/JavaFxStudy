/**
 * The entire windows is called the stage it may include the title and close\mix\max button, it just like the JFrame in normal java;
 * The main JPanel is also called scene; 
 */
package Component;
/** 
 * ClassName: FristJavaApplication <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2018年1月20日 上午9:36:35 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxVBoxDemo extends Application {

	Stage window;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		window = primaryStage;
		window.setTitle("The Title");

		HBox hBox = new HBox();
		Button button1 = new Button("File");
		Button button2 = new Button("Edit");
		Button button3 = new Button("View");
		hBox.getChildren().addAll(button1, button2, button3);

		VBox vBox = new VBox();
		Button button4 = new Button("D");
		Button button5 = new Button("E");
		Button button6 = new Button("F");
		vBox.getChildren().addAll(button4, button5, button6);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(hBox);
		borderPane.setLeft(vBox);

		Scene scene = new Scene(borderPane, 300, 300);
		window.setScene(scene);
		window.show();

	}
}
