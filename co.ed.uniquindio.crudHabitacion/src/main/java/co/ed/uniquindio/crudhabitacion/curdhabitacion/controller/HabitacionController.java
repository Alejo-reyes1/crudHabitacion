package co.ed.uniquindio.crudhabitacion.curdhabitacion.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HabitacionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarHabitacion;

    @FXML
    private TextField txtNumeroHabitacion;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtTipoHabitacion;

    @FXML
    void onAgregarHabitacion(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnAgregarHabitacion != null : "fx:id=\"btnAgregarHabitacion\" was not injected: check your FXML file 'habitacion.fxml'.";
        assert txtNumeroHabitacion != null : "fx:id=\"txtNumeroHabitacion\" was not injected: check your FXML file 'habitacion.fxml'.";
        assert txtPrecio != null : "fx:id=\"txtPrecio\" was not injected: check your FXML file 'habitacion.fxml'.";
        assert txtTipoHabitacion != null : "fx:id=\"txtTipoHabitacion\" was not injected: check your FXML file 'habitacion.fxml'.";

    }

}
