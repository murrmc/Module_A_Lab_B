module com.mycompany.module_a_lab_b {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module_a_lab_b to javafx.fxml;
    exports com.mycompany.module_a_lab_b;
}
