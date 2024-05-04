package application;

import java.util.ArrayList;
import java.util.List;
public class NodeList {
    //节点
    public static List<TreeNode> list = new ArrayList<>();

    public static TreeNode getRoot(){
        TreeNode root = new TreeNode();
        for (int i = 0; i < NodeList.list.size(); i++) {
            if(NodeList.list.get(i).getPid() == 0)
                root = NodeList.list.get(i);
        }
        return root;
    }

}
