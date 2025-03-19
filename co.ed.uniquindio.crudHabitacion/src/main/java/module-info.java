module co.ed.uniquindio.crudhabitacion.curdhabitacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.ed.uniquindio.crudhabitacion.curdhabitacion to javafx.fxml;
    exports co.ed.uniquindio.crudhabitacion.curdhabitacion;
}