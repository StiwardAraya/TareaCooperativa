package cr.ac.una.tareacooperativa.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * Universidad Nacional - Programación II 2024
 * Controlador de la pantalla de impresion de carnet
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class ImpresionCarnetController implements Initializable{

    @javafx.fxml.FXML
    private TextField txtNombreAsociado;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {}

    @javafx.fxml.FXML
    public void imprimirCarnet(ActionEvent actionEvent) {
        //TODO accion para imprimir el carnet
    }

    @javafx.fxml.FXML
    public void volver(ActionEvent actionEvent) {
        //TODO accion para regresar
    }

    public String getNombreAsociado(){
        return this.txtNombreAsociado.getText();
    }
}