/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ClassName: ExtractData <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月20日 下午11:34:54 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class TextFieldDemo extends Application {

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
	public void start(Stage primartStage) throws Exception {
		// TODO Auto-generated method stub
		Stage stage = primartStage;
		stage.setTitle("ExtractData");

		TextField textField = new TextField();
		Button button = new Button("Click me");

		button.setOnAction(e -> Isinteger(textField));

		VBox box = new VBox();

		box.setPadding(new Insets(10, 10, 20, 10));
		box.getChildren().addAll(textField, button);
		Scene scene = new Scene(box, 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Isinteger:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @since JDK 1.6
	 */
	private void Isinteger(TextField textField) {
		// TODO Auto-generated method stub
		try {
			int age = Integer.parseInt(textField.getText());
			System.out.println("User is " + age);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("ERROR: " + textField.getText() + "is not a number");
		}
	}
}
