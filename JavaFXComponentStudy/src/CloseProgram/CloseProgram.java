/**
 * 
 */
package CloseProgram;
/** 
 * ClassName: CreatAlertBox <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(��ѡ). <br/> 
 * date: 2018��1��20�� ����4:36:18 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class CloseProgram extends Application {
	Stage window;

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

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		window = primaryStage;
		window.setTitle("The Create Box Windows");
		window.setOnCloseRequest(e -> {
			// e.consume(); It means just continue
			// Consumes this event so that it will not be processed in the default manner by
			// the source which originated it.
			e.consume();
			CloseProgramOpera();
		});
		window.show();
	}

	/**
	 * CloseProgramOp:(������һ�仰�����������������)
	 *
	 * @author xuheng
	 * @since JDK 1.6
	 */
	private void CloseProgramOpera() {
		// TODO Auto-generated method stub
		System.out.println("Close the Operation & The File is saved");
		if (ConfirmBox.display("Just a Dialog", "Close the Program?")) {
			window.close();
		}
	}
}
