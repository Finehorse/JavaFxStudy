/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
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
public class TreaViewDemo extends Application {

	Stage window;
	TreeView<String> treeView;

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
		window = primaryStage;
		window.setTitle("TreaViewDemo");

		TreeItem<String> RootItem, BItem, CItem;
		// Init RootItem;
		RootItem = new TreeItem<>();
		RootItem.setExpanded(true);

		// Set RootItem Values;
		BItem = makeBranch("AA", RootItem);
		// Set BItem Values;
		makeBranch("BB", BItem);
		makeBranch("CC", BItem);
		makeBranch("DD", BItem);

		// Set RootItem Values;
		CItem = makeBranch("AA", RootItem);
		// Set CItem Values;
		makeBranch("BB", CItem);
		makeBranch("CC", CItem);
		makeBranch("DD", CItem);

		treeView = new TreeView<>(RootItem);
		treeView.setShowRoot(false);

		treeView.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> System.out.println(oldValue + "->" + newValue));

		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(treeView);
		Scene scene = new Scene(stackPane, 300, 300);
		window.setScene(scene);
		window.show();
	}

	/**
	 * makeBranch:(这里用一句话描述这个方法的作用)
	 *
	 * @author xuheng
	 * @return
	 * @since JDK 1.6
	 */
	private TreeItem<String> makeBranch(String string, TreeItem<String> Item) {
		// TODO Auto-generated method stub
		TreeItem<String> ItemTemp = new TreeItem<>(string);
		ItemTemp.setExpanded(true);
		Item.getChildren().add(ItemTemp);
		return ItemTemp;
	}
}
