package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    public static BorderPane pane;
    public static Stage primarystage;
    public static double MinWidth = 800;
    public static double MaxWidth = 800;
    public static double MaxHeight = 800;
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

        MyButtonBar buttonBar = new MyButtonBar();
        pane.getChildren().add(buttonBar.ap);
        //工具栏

        MyDrawPane drawPane = new MyDrawPane();
        drawPane.setMinWidth(800);
        drawPane.setMinHeight(570);
        //绘图区

        MyTreeView listView = new MyTreeView();
        listView.ap.setMinWidth(150);
        listView.ap.setMaxWidth(200);
        //结构树

        SplitPane spane = new SplitPane();
        spane.setDividerPositions(0.2);
        spane.getItems().addAll(drawPane,MyTreeView.ap);
        pane.setCenter(spane);
        primarystage = stage;
        //SetTitle.changeTitle(primarystage);

        Scene scene = new Scene(pane,1000,600);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown()) {
                if(event.getCode() == KeyCode.EQUALS||event.getCode() == KeyCode.PLUS) {
                    Change.enlarge();
                }
                if(event.getCode() == KeyCode.MINUS) {
                    Change.reduce();
                }
                if(event.getCode() == KeyCode.DIGIT0) {
                    Change.recover();
                }
            }
        });
        //监听调整指令
        stage.setScene(scene);
        stage.show();
    }
}
