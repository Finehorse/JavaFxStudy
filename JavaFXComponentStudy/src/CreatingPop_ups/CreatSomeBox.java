/**
 * 
 */
package CreatingPop_ups;
/** 
 * ClassName: CreatAlertBox <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2018年1月20日 下午4:36:18 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreatSomeBox extends Application {

	/**
	 * main:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage window;
		Button button1, button2;
		window = primaryStage;
		window.setTitle("The Create Box Windows");

		button1 = new Button("Click me to create Alert windows");
		button1.setOnAction(e -> AlertBoxes.display("Title of window", "Wow this alert box is awesome"));

		button2 = new Button("Click me to create Confirm windows");
		button2.setOnAction(e -> {
			Boolean sBoolean = ConfirmBox.display("Title of window", "Wow this Confirm box is awesome");
			System.out.println(sBoolean);
		});
		// Just a simple layout variable
		VBox lPane = new VBox();
		lPane.setAlignment(Pos.CENTER);
		lPane.getChildren().addAll(button1, button2);

		Scene scene = new Scene(lPane, 300, 300);
		window.setScene(scene);
		window.show();
	}
}
