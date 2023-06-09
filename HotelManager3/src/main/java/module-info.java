module projects.hotelmanager3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens projects.hotelmanager3 to javafx.fxml;
    exports projects.hotelmanager3;
}
