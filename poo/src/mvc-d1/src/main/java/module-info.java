module tecinfo.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens tecinfo.poo to javafx.fxml;
    exports tecinfo.poo;
}
