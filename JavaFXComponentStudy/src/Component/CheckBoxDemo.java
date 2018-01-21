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
 * ClassName: CheckBox <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月20日 下午11:52:39 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class CheckBoxDemo extends Application {

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
		stage.setTitle("CheckBox");

		// Checkbox;
		javafx.scene.control.CheckBox box1 = new javafx.scene.control.CheckBox("Item1");
		box1.setOnAction(e -> {
			if (box1.isSelected()) {
				System.out.println("Box1 is selected");
			}
		});
		javafx.scene.control.CheckBox box2 = new javafx.scene.control.CheckBox("Item2");
		box2.setSelected(true);
		// Button
		Button button = new Button("Order Now");
		button.setOnAction(e -> handleOptions(box1, box2));

		// Creates a VBox layout with the specified spacing between children.
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(20, 20, 20, 20));
		vbox.getChildren().addAll(box1, box2, button);
		Scene scene = new Scene(vbox, 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * handleOptions:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @since JDK 1.6
	 */
	private void handleOptions(javafx.scene.control.CheckBox box1, javafx.scene.control.CheckBox box2) {
		// TODO Auto-generated method stub
		String string = "User order ";
		if (box1.isSelected()) {
			System.out.println(string + box1.getText());
		}
		if (box2.isSelected()) {
			System.out.println(string + box2.getText());
		}
	}
}
