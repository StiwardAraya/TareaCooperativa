package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cr.ac.una.tareacooperativa.App;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Universidad Nacional - Programación II 2024
 * <p>
 *     Controlador de la pantalla de inicio de sesión
 * </p>
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
    public void initialize(URL url, ResourceBundle rb) {}

    @javafx.fxml.FXML
    public void abrirWeb(Event event) throws IOException{
        //TODO abrir webView con la web
    }

    @javafx.fxml.FXML
    public void abrirVentanaFuncionarios(ActionEvent actionEvent) throws IOException {
        //TODO abrir ventana de funcionarios
    }

    @javafx.fxml.FXML
    public void abrirVentanaProfesores(ActionEvent actionEvent) throws IOException {
        App.setRoot("profesorView");
    }

    @javafx.fxml.FXML
    public void abrirVentanaAsociados(ActionEvent actionEvent) throws IOException {
        //TODO abrir ventana de asociados
    }
}
