/**
 * The entire windows is called the stage it may include the title and close\mix\max button, it just like the JFrame in normal java;
 * The main JPanel is also called scene; 
 */
package ButtonHandler;
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
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXButtonHandler_Implements extends Application implements EventHandler<javafx.event.ActionEvent> {

	Button button;

	/**
	 *
	 * @author xuheng
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		/// This is setting the Stage Title (like the JFrame Title).
		primaryStage.setTitle("Title of the windows");
		// Yes, just a button.
		button = new Button();
		button.setText("implements");
		button.setOnAction(this);

		// This is a layout,like the JPanel's layout.But the "add" operation is occur in
		// Layout variable.
		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		// Yes just define a JPanel.
		Scene scene = new Scene(layout, 300, 300);

		// Just like SomeJframe.add(SomeJPanel).
		primaryStage.setScene(scene);

		// Just like SomeJFrame.show();
		primaryStage.show();
	}

	@Override
	public void handle(javafx.event.ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() == button) {
			System.out.println("This Handle is a implements way");
		}
	}

}
