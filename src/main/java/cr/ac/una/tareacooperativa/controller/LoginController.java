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

    /**
     * Control de evento, enlace web
     * @param event
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onClickLabelAcercade(Event event) throws IOException{
        //TODO abrir webView con la web
    }

    /**
     * Control de evento, botón funcionarios
     * @param actionEvent
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onActionBtnFuncionarios(ActionEvent actionEvent) throws IOException {
        App.setRoot("funcionarioView");
    }

    /**
     * Control de evento, botón profesores
     * @param actionEvent
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onActionBtnProfesores(ActionEvent actionEvent) throws IOException {
        App.setRoot("profesorView");
    }

    /**
     * Control de evento, botón Asociados
     * @param actionEvent
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onActionBtnAsociados(ActionEvent actionEvent) throws IOException {
        App.setRoot("asociadoView");
    }
}
