package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.AnchorPane;

public class MyButtonBar {
    public AnchorPane ap = new AnchorPane();

    public static ButtonBar Bar = new ButtonBar();
    public static Button b1 = new Button("新建");
    public static Button b2 = new Button("增加子节点");
    public static Button b3 = new Button("增加同级节点");
    public static Button b4 = new Button("删除");
    public static Button b5 = new Button("清空");
    public static Button b6 = new Button("插入图片");
    public static Button b7 = new Button("查看图片");

    MyButtonBar(){
        super();
        Bar.getButtons().addAll(b1,b2,b3,b4,b5,b6,b7);
        ap.getChildren().add(Bar);
        ap.setLayoutX(100);
        eventHandler();
        //MouseClick.Click();
        //MouseClick.DoubleClick();
        Change.change();
    }

    private void eventHandler() {
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        //初始化隐藏

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
    }
}
