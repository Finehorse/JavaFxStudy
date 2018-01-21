/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ClassName: ComboBox <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月21日 上午10:18:50 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class ComBoBoxDemo extends Application {

	public static void main(String[] args) {
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

		Stage wStage;
		wStage = primaryStage;
		wStage.setTitle("ComBoBox");

		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.getItems().addAll("A", "B", "C");
		comboBox.setPromptText("What is you favorite char?");
		comboBox.setEditable(true);
		comboBox.setOnAction(e -> System.out.println(comboBox.getValue()));
		Button button = new Button();
		button.setText("Click me!");
		button.setOnAction(e -> print(comboBox));

		VBox vBox = new VBox();
		vBox.setPadding(new Insets(10, 10, 10, 10));
		vBox.getChildren().addAll(comboBox, button);

		Scene scene = new Scene(vBox, 200, 200);
		wStage.setScene(scene);
		wStage.show();
	}

	/**
	 * print:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private void print(ComboBox<String> comboBox) {
		// TODO Auto-generated method stub
		System.out.println(comboBox.getValue());
	}
}
