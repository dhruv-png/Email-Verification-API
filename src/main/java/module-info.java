module com.example.emailverificationapicomp1011g {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.example.emailverificationapicomp1011g to javafx.fxml, com.google.gson;
    exports com.example.emailverificationapicomp1011g;
    exports com.example.emailverificationapicomp1011g.Controllers;
    opens com.example.emailverificationapicomp1011g.Controllers to com.google.gson, javafx.fxml;
    exports com.example.emailverificationapicomp1011g.Utility;
    opens com.example.emailverificationapicomp1011g.Utility to com.google.gson, javafx.fxml;
}