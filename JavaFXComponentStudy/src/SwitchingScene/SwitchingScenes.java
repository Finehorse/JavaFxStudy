/**
 * 
 */
package SwitchingScene;
/** 
 * ClassName: SwitchingScenes <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2018年1月20日 上午11:02:22 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchingScenes extends Application {

	Stage window;
	Scene scene1, scene2;
	Label label1, label2;
	Button button1, button2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;

		// Scene 1
		label1 = new Label("Welcome to the Frist scene");
		button1 = new Button("GO to scene2");
		button1.setOnAction(e -> window.setScene(scene2));
		// Layout: children are laid out in vertical column
		VBox vbox1 = new VBox(20);
		vbox1.getChildren().addAll(label1, button1);
		scene1 = new Scene(vbox1, 300, 300);

		// Scene 2
		label2 = new Label("Welcome to the Second scene");
		button2 = new Button("GO to scene1");
		button2.setOnAction(e -> window.setScene(scene1));

		// Layout: children are laid out in horizontal Row
		HBox hBox1 = new HBox(20);
		hBox1.getChildren().addAll(label2, button2);
		scene2 = new Scene(hBox1, 300, 300);

		window.setTitle("Hello the switch");
		window.setScene(scene1);
		window.show();
	}
}
