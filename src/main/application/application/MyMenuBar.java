package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;

public class MyMenuBar {
    //状态基没写
    public MenuBar menu = new MenuBar();
    MenuItem openItem = new MenuItem("打开");
    MenuItem saveItem = new MenuItem("保存");
    MenuItem undo = new MenuItem("撤销");
    MenuItem redo = new MenuItem("重做");
    Menu outputItem = new Menu("导出");
    MenuItem outputItem1 = new MenuItem("png图片");
    MenuItem outputItem2 = new MenuItem("jpg图片");

    public static RadioMenuItem item = new RadioMenuItem("自动布局");
    public static RadioMenuItem iteml = new RadioMenuItem("左布局");
    public static RadioMenuItem itemr = new RadioMenuItem("右布局");
    //实现左中右布局

    MyMenuBar(){
        outputItem.getItems().addAll(outputItem1,outputItem2);

        Menu fileMenu = new Menu("菜单");
        //fileMenu.getItems().addAll(openItem,saveItem,undo,redo,outputItem);

        Menu layoutMenu = new Menu("布局");
        ToggleGroup Group = new ToggleGroup();

        item.setToggleGroup(Group);
        item.setSelected(true);
        iteml.setToggleGroup(Group);
        itemr.setToggleGroup(Group);
        layoutMenu.getItems().addAll(item, iteml,itemr);
        fileMenu.getItems().addAll(openItem,saveItem,undo,redo,outputItem,layoutMenu);

        menu.getMenus().addAll(fileMenu);
        LayoutSetter.Item1();
        LayoutSetter.Item2();
        LayoutSetter.Item3();

        eventHandler();
    }

    private void eventHandler() {
        openItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        saveItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        undo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        redo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        outputItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        outputItem2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });

        openItem.setAccelerator(KeyCombination.valueOf( "ctrl+o" ));
        saveItem.setAccelerator(KeyCombination.valueOf( "ctrl+s" ));
        undo.setAccelerator(KeyCombination.valueOf( "ctrl+z" ));
        redo.setAccelerator(KeyCombination.valueOf( "ctrl+y" ));
        item.setAccelerator(KeyCombination.valueOf( "ctrl+a" ));
        iteml.setAccelerator(KeyCombination.valueOf( "ctrl+l" ));
        itemr.setAccelerator(KeyCombination.valueOf( "ctrl+r" ));
    }

}
