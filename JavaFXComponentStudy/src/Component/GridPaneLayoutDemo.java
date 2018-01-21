/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * ClassName: GridPane <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月20日 下午10:59:20 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class GridPaneLayoutDemo extends Application {

	Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primayStage) throws Exception {
		// TODO Auto-generated method stub

		stage = primayStage;
		stage.setTitle("GridPane windows");

		GridPane gridPane = new GridPane();
		// The top, right, bottom, and left padding around the region's content.
		// This space will be included in the calculation of the region's
		// minimum and preferred sizes. By default padding is Insets.EMPTY.
		// Setting the value to null should be avoided.
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		// The width of the horizontal gaps between columns.
		gridPane.setHgap(8);
		gridPane.setVgap(10);

		// Name label
		Label namelabel = new Label("Username");
		// Sets the column,row indeces for the child when contained in a
		// gridpane.

		GridPane.setConstraints(namelabel, 0, 0);

		// Name input
		TextField nameinput = new TextField("Xuheng");
		GridPane.setConstraints(nameinput, 1, 0);

		// Password label
		Label passwordlabel = new Label("Password");
		GridPane.setConstraints(passwordlabel, 0, 1);

		// Name input
		TextField passwordinput = new TextField();
		passwordinput.setPromptText("password");
		GridPane.setConstraints(passwordinput, 1, 1);

		Button button = new Button("Button");
		GridPane.setConstraints(button, 1, 2);

		gridPane.getChildren().addAll(namelabel, nameinput, passwordlabel, passwordinput, button);

		stage.setScene(new Scene(gridPane));
		stage.show();
	}
}
