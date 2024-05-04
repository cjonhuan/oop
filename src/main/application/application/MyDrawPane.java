package application;

import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;

import java.util.Deque;

public class MyDrawPane extends ScrollPane{
    //重画没写
    public static Pane drawPane = new Pane();
    public static ScrollPane sp = new ScrollPane();
    public static Group g = new Group();

    MyDrawPane(){
        super();
        drawPane.setMinWidth(1000);
        drawPane.setMinHeight(1000);
        sp = this;
        draw();
        this.setVvalue(0.5);
        this.setHvalue(0.5);
        drawPane.getChildren().add(g);
    }

    private static void draw() {
        MyDrawPane.g.getChildren().clear();
        //清空操作

        //Deque.insert(NodeList.list);
        //填入新节点
        for (int i = 0; i < NodeList.list.size(); i++) {
            TreeNode node = NodeList.list.get(i);
            node.setText(node.getTxt());
            node.setStyle(
                    "-fx-background-color:#d6ecf0;"+
                    "-fx-background-radius:10;"+
                    "-fx-padding:10;"
            );

        }
    }

    public static void redraw() {
    }
}
