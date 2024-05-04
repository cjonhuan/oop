module LinkMind {
    requires javafx.controls;
    //requires javafx.swing;
    requires javafx.graphics;
    requires javafx.fxml;
    opens application to javafx.graphics, javafx.fxml;
}
