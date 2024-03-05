module com.example.rentacar {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    opens com.example.rentacar to javafx.fxml;
    exports com.example.rentacar;
    exports com.example.rentacar.Aluguer;
    opens com.example.rentacar.Aluguer to javafx.fxml;
    exports com.example.rentacar.Menu;
    opens com.example.rentacar.Menu to javafx.fxml;
    exports com.example.rentacar.Cliente;
    opens com.example.rentacar.Cliente to javafx.fxml;
    exports com.example.rentacar.Staff;
    opens com.example.rentacar.Staff to javafx.fxml;
    exports com.example.rentacar.Veiculo;
    opens com.example.rentacar.Veiculo to javafx.fxml;
    exports com.example.rentacar.dash;
    opens com.example.rentacar.dash to javafx.fxml;
    exports com.example.rentacar.Database;
    opens com.example.rentacar.Database to javafx.fxml;
    exports com.example.rentacar.Singleton;
    opens com.example.rentacar.Singleton to javafx.fxml;
}