/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * ClassName: TreaViewDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月21日 上午11:10:22 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class TableViewDemo extends Application {

	Stage window;
	TableView<TableViewProduct> mytable;
	TextField Nameinput, Priceinput, Quantityinput;

	public static void main(String[] args) {
		launch(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		window = primaryStage;
		window.setTitle("TableView");

		// Name column
		TableColumn<TableViewProduct, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));

		// Price Column
		TableColumn<TableViewProduct, Double> PriceColumn = new TableColumn<>("Price");
		PriceColumn.setMinWidth(100);
		PriceColumn.setCellValueFactory(new PropertyValueFactory<>("Price"));

		// Quantity Column
		TableColumn<TableViewProduct, Double> QuantityColumn = new TableColumn<>("Quantity");
		QuantityColumn.setMinWidth(100);
		QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("Quantity"));

		// Name input
		Nameinput = new TextField();
		// The prompt text to display in the TextInputControl, or null if no prompt text
		// is displayed.
		Nameinput.setPromptText("Name");
		Nameinput.setMinWidth(100);

		// Price input
		Priceinput = new TextField();
		// The prompt text to display in the TextInputControl, or null if no prompt text
		// is displayed.
		Priceinput.setPromptText("Price");
		Priceinput.setMinWidth(100);

		// Quantity input
		Quantityinput = new TextField();
		// The prompt text to display in the TextInputControl, or null if no prompt text
		// is displayed.
		Quantityinput.setPromptText("Quantity");
		Quantityinput.setMinWidth(100);

		Button button = new Button();
		button.setText("Add");
		button.setOnAction(e -> Addbuttonclick());
		Button button2 = new Button();
		button2.setText("Delete");
		button2.setOnAction(e -> deletebuttonclick());

		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10, 10, 10, 10));
		// The amount of horizontal space between each child in the hbox.
		hBox.setSpacing(10);
		hBox.getChildren().addAll(Nameinput, Priceinput, Quantityinput, button, button2);

		mytable = new TableView<>();
		mytable.setItems(getProduct());
		mytable.getColumns().addAll(nameColumn, PriceColumn, QuantityColumn);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(mytable, hBox);
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}

	/**
	 * deletebuttonclick:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private void deletebuttonclick() {
		// TODO Auto-generated method stub
		ObservableList<TableViewProduct> productSeleted, AllProducts;
		AllProducts = mytable.getItems();
		productSeleted = mytable.getSelectionModel().getSelectedItems();
		productSeleted.forEach(AllProducts::remove);
	}

	/**
	 * Addbuttonclick:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private void Addbuttonclick() {
		// TODO Auto-generated method stub
		TableViewProduct product = new TableViewProduct();
		product.setName(Nameinput.getText());
		product.setPrice(Double.parseDouble(Priceinput.getText()));
		product.setQuantity(Integer.parseInt(Quantityinput.getText()));
		mytable.getItems().add(product);
		Nameinput.clear();
		Priceinput.clear();
		Quantityinput.clear();
	}

	public ObservableList<TableViewProduct> getProduct() {
		ObservableList<TableViewProduct> products = FXCollections.observableArrayList();
		products.add(new TableViewProduct("A", 1, 1));
		products.add(new TableViewProduct("B", 2, 2));
		products.add(new TableViewProduct("C", 3, 3));
		products.add(new TableViewProduct("D", 4, 4));
		return products;
	}
}
