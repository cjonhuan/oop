package application;

import javafx.scene.control.Label;

public class TreeData extends Label {
    //基本写完
    private String txt;
    private String imagePath;

    public TreeData(String txt){
        super(txt);
        this.txt = txt;
    }
    public TreeData(){

    }
    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
