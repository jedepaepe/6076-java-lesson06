module eu.epfc.c6076.lesson06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens eu.epfc.c6076.lesson06 to javafx.fxml;
    exports eu.epfc.c6076.lesson06;
}