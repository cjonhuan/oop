package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    public static BorderPane pane;
    public static Stage stage;
    public static int MinWidth = 800;
    public static int MaxWidth = 800;
    public static int MaxHeight = 800;
    @Override
    public void start(Stage stage) throws Exception {
        pane = new BorderPane();
        pane.setMinWidth(MinWidth);
        pane.setMaxWidth(MaxWidth);
        pane.setMaxHeight(MaxHeight);
        //窗口设置

        MyMenuBar menuBar = new MyMenuBar();
        pane.setTop(menuBar.menu);
        //菜单

        //MyButtonBar buttonBar = new MyButtonBar();
        //pane.getChildren().add(buttonBar.ap);
        //工具栏


        Scene scene = new Scene(pane,1000,600);

        stage.setScene(scene);
        stage.show();
    }
}
