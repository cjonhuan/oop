package application;

import javafx.scene.*;
import javafx.scene.control.*;

public class MyMenuBar {
    public Node menu = new MenuBar();
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
        fileMenu.getItems().addAll(openItem,saveItem,undo,redo);

        Menu layoutMenu = new Menu("布局");
        ToggleGroup Group = new ToggleGroup();

        item.setToggleGroup(Group);
        item.setSelected(true);
        iteml.setToggleGroup(Group);
        itemr.setToggleGroup(Group);
        layoutMenu.getItems().addAll(item, iteml,itemr);
        //menu.getMenus().addAll(fileMenu, layoutMenu);
        LayoutSetter.Item1();
        LayoutSetter.Item2();
        LayoutSetter.Item3();

        eventHandler();
    }

    private void eventHandler() {
    }

}
