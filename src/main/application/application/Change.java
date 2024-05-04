package application;

import javafx.scene.image.WritableImage;
import javafx.scene.transform.Scale;

public class Change {
    //调整结构区大小所用类
    public static int number = 0;
    public static void enlarge() {
        if(number < 5){
            number++;
            MyButtonBar.b1.setDisable(true);
            MyButtonBar.b5.setDisable(false);
            if(NodeList.list.isEmpty()) {
                MyButtonBar.b1.setDisable(false);
                MyButtonBar.b2.setDisable(true);
                MyButtonBar.b3.setDisable(true);
                MyButtonBar.b4.setDisable(true);
                MyButtonBar.b5.setDisable(true);
                MyButtonBar.b6.setDisable(true);
            }
            MyDrawPane.g.getTransforms().add(new Scale(1.1,1.1,MyDrawPane.drawPane.getWidth()/2,MyDrawPane.drawPane.getHeight()/2));

            WritableImage wi1 = MyDrawPane.g.snapshot(null, null);
            double width = 1000 + wi1.getWidth()*2;
            double height = 1000+ wi1.getHeight();
            MyDrawPane.drawPane.setPrefWidth(width);
            MyDrawPane.drawPane.setPrefHeight(height);

            MyDrawPane.redraw();
            try {
                MyTreeView.setTreeView();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void reduce() {
        if(number > -5){
            number--;
            MyButtonBar.b1.setDisable(true);
            MyButtonBar.b5.setDisable(false);
            if(NodeList.list.isEmpty()) {
                MyButtonBar.b1.setDisable(false);
                MyButtonBar.b2.setDisable(true);
                MyButtonBar.b3.setDisable(true);
                MyButtonBar.b4.setDisable(true);
                MyButtonBar.b5.setDisable(true);
                MyButtonBar.b6.setDisable(true);
            }
            MyDrawPane.g.getTransforms().add(new Scale(0.9,0.9,MyDrawPane.drawPane.getWidth()/2,MyDrawPane.drawPane.getHeight()/2));


            WritableImage wi1 = MyDrawPane.g.snapshot(null, null);
            double width = 1000 + wi1.getWidth()*2;
            double height = 1000+ wi1.getHeight();
            MyDrawPane.drawPane.setPrefWidth(width);
            MyDrawPane.drawPane.setPrefHeight(height);

            MyDrawPane.redraw();
            try {
                MyTreeView.setTreeView();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void recover() {
        number = 0;
        MyButtonBar.b1.setDisable(true);
        MyButtonBar.b5.setDisable(false);
        if(NodeList.list.isEmpty()) {
            MyButtonBar.b1.setDisable(false);
            MyButtonBar.b2.setDisable(true);
            MyButtonBar.b3.setDisable(true);
            MyButtonBar.b4.setDisable(true);
            MyButtonBar.b5.setDisable(true);
            MyButtonBar.b6.setDisable(true);
        }
        MyDrawPane.g.getTransforms().clear();
        //NodeLocater.locateX(NodeList.getRoot());
        //NodeLocater.locateY(NodeList.getRoot());
        //CheckPane.controlPane();
        MyDrawPane.redraw();
        try {
            MyTreeView.setTreeView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void change() {
        MyDrawPane.drawPane.setOnScroll(event -> {
            if (event.isControlDown()) {
                //double deltaY = event.getDeltaY();
                if(event.getDeltaY()>0) {
                    enlarge();
                }
                if(event.getDeltaY()<0) {
                    reduce();
                }
            }
        });
    }
}
