package application;

import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;

public class MyDrawPane extends ScrollPane{
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
    }
}
