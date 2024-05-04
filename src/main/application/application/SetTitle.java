package application;

import javafx.stage.Stage;

public class SetTitle {
    //查找设置title
    static String title = null;
    public static void changeTitle(Stage stage) {
        if(NodeList.list.isEmpty() == true){
            stage.setTitle("Mind");
        }
        else if ((NodeList.list.isEmpty() != true)&&title == null){
            stage.setTitle("Mind-未命名");
        }
        else{
            stage.setTitle("Mind"+getTitle());
        }
    }

    private static String getTitle() {
        return title;
    }
    public static void setTitle(String name) {
        title = name;
    }
}
