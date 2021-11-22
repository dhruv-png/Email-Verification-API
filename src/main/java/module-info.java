module com.example.emailverificationapicomp1011g {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.emailverificationapicomp1011g to javafx.fxml;
    exports com.example.emailverificationapicomp1011g;
}