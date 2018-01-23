/**
 * 
 */
package ControllerEventHandlers;

/** 
 * ClassName: FxFXMLController <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: 2018年1月23日 下午4:20:10 <br/> 
 * 
 * @author xuheng 
 * @version  
 * @since JDK 1.6 
 */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FxFXMLController3 {
	@FXML
	// The reference of inputText will be injected by the FXML loader
	private TextField inputText;

	// The reference of outputText will be injected by the FXML loader
	@FXML
	private TextArea outputText;

	// location and resources will be automatically injected by the FXML loader
	@FXML
	private URL location;

	@FXML
	private ResourceBundle resources;

	// Add a public no-args constructor
	public FxFXMLController3() {
	}

	@FXML
	private void initialize() {
	}

	@FXML
	private void printOutput() {
		outputText.setText(inputText.getText());
	}
}