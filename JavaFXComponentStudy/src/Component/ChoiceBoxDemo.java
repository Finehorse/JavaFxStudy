/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ClassName: ChoiceBox <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月21日 上午12:12:09 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class ChoiceBoxDemo extends Application {

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
		stage.setTitle("ChoiceBox");

		// ChoiceBox;
		javafx.scene.control.ChoiceBox<String> choiceBox = new javafx.scene.control.ChoiceBox<>();
		// Gets the value of the property items.
		choiceBox.getItems().add("A");
		choiceBox.getItems().add("B");
		choiceBox.getItems().add("C");
		choiceBox.setValue("A");

		choiceBox.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> System.out.println(oldValue + "->" + newValue));

		// Button
		Button button = new Button("Order Now");
		button.setOnAction(e -> Getchoose(choiceBox));
		// Creates a VBox layout with the specified spacing between children.
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(20, 20, 20, 20));
		vbox.getChildren().addAll(choiceBox, button);
		Scene scene = new Scene(vbox, 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * Getchoose:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private void Getchoose(javafx.scene.control.ChoiceBox<String> choiceBox) {
		// TODO Auto-generated method stub
		String string = choiceBox.getValue();
		System.out.println(string);
	}
}
