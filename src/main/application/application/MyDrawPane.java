package application;

import javafx.scene.Group;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

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
            node.setMaxSize(200, 80);
            node.setWrapText(true);
            node.setTextAlignment(TextAlignment.CENTER);
            node.setTextOverrun(OverrunStyle.ELLIPSIS);
            node.setTextFill(Color.BLACK);
            node.setFont(new Font("Arial",20));

            if(node.isClick()) {
                node.setStyle(
                        "-fx-background-color:#faff72;"	+
                        "-fx-background-radius:10;"+
                        "fx-padding:10;"
                );
            }
            //选中操作
            MyDrawPane.g.getChildren().add(node);
            MyDrawPane.g.applyCss();  //确保更新样式
            MyDrawPane.g.layout();	//确保更新节点位置和大小

            node.setLayoutX(node.getLeft());
            node.setLayoutY(node.getTop());

            if(node != NodeList.getRoot()) {
                line(node);
            }
            if(node.getImagePath()!=null) {
                ImageView imageView = new ImageView(node.getImagePath());// 设置图片宽度和高度
                Label label = node;
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                label.setGraphic(imageView);
                label.setContentDisplay(ContentDisplay.BOTTOM);
                label.setTextAlignment(TextAlignment.CENTER);
            }
        }
    }

    private static void line(TreeNode node) {
    }

    public static void redraw() {
        MyDrawPane.g.getChildren().clear();
        //清空操作

        for (int i = 0; i < NodeList.list.size(); i++) {
            TreeNode node = NodeList.list.get(i);
            node.setText(node.getTxt());
            node.setStyle(
                    "-fx-background-color:#d6ecf0;"+
                            "-fx-background-radius:10;"+
                            "-fx-padding:10;"
            );
            node.setMaxSize(200, 80);
            node.setWrapText(true);
            node.setTextAlignment(TextAlignment.CENTER);
            node.setTextOverrun(OverrunStyle.ELLIPSIS);
            node.setTextFill(Color.BLACK);
            node.setFont(new Font("Arial",20));

            if(node.isClick()) {
                node.setStyle(
                        "-fx-background-color:#faff72;"	+
                                "-fx-background-radius:10;"+
                                "fx-padding:10;"
                );
            }
            //选中操作
            MyDrawPane.g.getChildren().add(node);
            MyDrawPane.g.applyCss();  //确保更新样式
            MyDrawPane.g.layout();	//确保更新节点位置和大小

            node.setLayoutX(node.getLeft());
            node.setLayoutY(node.getTop());

            if(node != NodeList.getRoot()) {
                line(node);
            }
            if(node.getImagePath()!=null) {
                ImageView imageView = new ImageView(node.getImagePath());// 设置图片宽度和高度
                Label label = node;
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                label.setGraphic(imageView);
                label.setContentDisplay(ContentDisplay.BOTTOM);
                label.setTextAlignment(TextAlignment.CENTER);
            }
        }
    }
}
