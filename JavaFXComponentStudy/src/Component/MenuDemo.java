/**
 * 
 */
package Component;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * ClassName: MenuDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年1月21日 下午3:12:15 <br/>
 * 
 * @author xuheng
 * @version
 * @since JDK 1.6
 */
public class MenuDemo extends Application {

	Stage window;

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
		window.setTitle("The Title");
		// File main menu;
		Menu filemenu = new Menu("File");
		// Add one Submenu
		Menu SubMenu = new Menu("New");
		filemenu.getItems().add(SubMenu);
		// Add Subsubmenu
		SubMenu.getItems().add(new MenuItem("Java Project"));
		// Add Save Submenu
		MenuItem SavemenuItem = new MenuItem("Save");
		SavemenuItem.setDisable(true);
		filemenu.getItems().add(SavemenuItem);
		filemenu.getItems().add(new SeparatorMenuItem());
		// Add Close SubItem
		MenuItem ClosemenuItem = new MenuItem("Close");
		ClosemenuItem.setOnAction(e -> System.out.println("YOU DON'T SAVE IT"));
		filemenu.getItems().add(ClosemenuItem);

		// Help main menu
		Menu helpmenu = new Menu("Help");
		CheckMenuItem sCheckMenuItem = new CheckMenuItem("Show Line Numbers");
		sCheckMenuItem.setOnAction(e -> {
			if (sCheckMenuItem.isSelected()) {
				System.out.println("Ok");
			} else {
				System.out.println("No");
			}
		});
		CheckMenuItem AutoSave = new CheckMenuItem("AutoSave");
		AutoSave.setSelected(true);
		helpmenu.getItems().addAll(sCheckMenuItem, AutoSave);

		// Just a menuBar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(filemenu, helpmenu);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(menuBar);
		Scene scene = new Scene(borderPane, 300, 300);
		window.setScene(scene);
		window.show();
	}
}
