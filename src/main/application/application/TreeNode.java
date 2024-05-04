package application;

import javafx.scene.control.OverrunStyle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import java.util.ArrayList;
import java.util.List;

public class TreeNode extends TreeData{
    //基本写完
    private int pid;
    private int nid;
    private int pos = 1;
    private double left = 0;
    private double top = 0;
    private boolean click = false;
    private List<TreeNode> nodeChildren = new ArrayList<>();

    public TreeNode(){
        super();
        this.setStyle(
                "-fx-background-color:#d6ecf0;"+
                "-fx-background-radius:10;"+
                "-fx-padding:10;"
        );
        this.setMaxSize(200, 80);
        this.setWrapText(true);
        this.setTextAlignment(TextAlignment.CENTER);
        this.setTextOverrun(OverrunStyle.ELLIPSIS);
        this.setTextFill(Color.WHITE);
        this.setFont(new Font("Arial",20));
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public boolean isClick() {
        return click;
    }

    public void setClick(boolean click) {
        this.click = click;
    }

    public List<TreeNode> getNodeChildren() {
        return nodeChildren;
    }

    public void setNodeChildren(List<TreeNode> nodeChildren) {
        this.nodeChildren = nodeChildren;
    }
}
