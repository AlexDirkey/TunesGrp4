module com.example.tunesgrp4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tunesgrp4 to javafx.fxml;
    exports com.example.tunesgrp4;
}