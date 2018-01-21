/**
 * 
 */
package CloseProgram;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * ClassName: AlertBoxes <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月20日 下午4:42:10 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class ConfirmBox {

	static boolean answer;

	static boolean display(String title, String message) {
		Stage windows = new Stage();

		// Specifies the modality for this stage. This must be done prior to making the
		// stage visible. The modality is one of: Modality.NONE, Modality.WINDOW_MODAL,
		// or Modality.APPLICATION_MODAL.
		windows.initModality(Modality.APPLICATION_MODAL);
		// Setting some values about Stage
		windows.setTitle(title);
		windows.setMinHeight(300);
		windows.setMinWidth(300);

		Label label = new Label();
		label.setText(message);

		// Create two Button :: YES or No;
		Button button1 = new Button();
		button1.setText("Yes");
		button1.setOnAction(e -> {
			answer = true;
			windows.close();
		});
		Button button2 = new Button();
		button2.setText("No");
		button2.setOnAction(e -> {
			answer = false;
			windows.close();
		});

		VBox lBox = new VBox(10);
		lBox.getChildren().addAll(label, button1, button2);
		lBox.setAlignment(Pos.CENTER);
		Scene cScene = new Scene(lBox);

		windows.setScene(cScene);
		// Shows this stage and waits for it to be hidden (closed) before returning to
		// the caller. This method temporarily blocks processing of the current event,
		// and starts a nested event loop to handle other events. This method must be
		// called on the FX Application thread.
		windows.showAndWait();

		return answer;
	}
}
