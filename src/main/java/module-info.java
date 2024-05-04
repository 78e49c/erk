module com.example.kizilirmak {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.almasb.fxgl.all;

    opens com.example.erk to javafx.fxml;
    exports com.example.erk;
}