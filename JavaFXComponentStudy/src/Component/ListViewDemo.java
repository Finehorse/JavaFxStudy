/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ClassName: CheckBox <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(��ѡ). <br/>
 * date: 2018��1��20�� ����11:52:39 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class ListViewDemo extends Application {

	/**
	 * main:(������һ�仰�����������������)
	 *
	 * @author xuheng
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@SuppressWarnings("null")
	@Override
	public void start(Stage primartStage) throws Exception {
		// TODO Auto-generated method stub
		Stage stage = primartStage;
		stage.setTitle("CheckBox");

		ListView<String> listView = new ListView<>();
		listView.getItems().addAll("A", "B", "C", "D");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		Button button = new Button("Order Now");
		button.setOnAction(e -> buttonlisten(listView));

		// Creates a VBox layout with the specified spacing between children.
		VBox vbox = new VBox(10);
		vbox.setPadding(new Insets(20, 20, 20, 20));
		vbox.getChildren().addAll(listView, button);
		Scene scene = new Scene(vbox, 300, 200);
		stage.setScene(scene);
		stage.show();

	}

	/**
	 * buttonlisten:(������һ�仰�����������������)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private void buttonlisten(ListView<String> listView) {
		// TODO Auto-generated method stub
		String massage = "";
		ObservableList<String> Char;

		Char = listView.getSelectionModel().getSelectedItems();
		for (String m : Char) {
			massage = massage + m + "\n";
		}
		System.out.println(massage);
	}
}
