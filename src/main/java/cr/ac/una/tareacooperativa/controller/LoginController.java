package cr.ac.una.tareacooperativa.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Universidad Nacional - Programación II 2024
 * Controlador de la pantalla de inicio de sesión
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public class LoginController implements Initializable {

    @javafx.fxml.FXML
    private Label lblNombreCoope;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @javafx.fxml.FXML
    public void abrirWeb(Event event) {
        //TODO abrir webView con la web
    }

    @javafx.fxml.FXML
    public void abrirVentanaFuncionarios(ActionEvent actionEvent) {
        //TODO abrir ventana de funcionarios
    }

    @javafx.fxml.FXML
    public void abrirVentanaProfesores(ActionEvent actionEvent) {
        //TODO abrir ventana de profesores
    }

    @javafx.fxml.FXML
    public void abrirVentanaAsociados(ActionEvent actionEvent) {
        //TODO abrir ventana de asociados
    }
}
