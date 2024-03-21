package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cr.ac.una.tareacooperativa.util.FlowController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * Universidad Nacional - Programación II 2024
 * <p>
 *     Controlador de la pantalla de inicio de sesión
 * </p>
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public class LoginController extends Controller implements Initializable {


    @javafx.fxml.FXML
    private Label lblNombreCoope;
    @javafx.fxml.FXML
    private ImageView imvLogoCoope;
    @javafx.fxml.FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {}

    @Override
    public void initialize() {}

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
        FlowController.getInstance().goMain();
    }

    /**
     * Control de evento, botón profesores
     * @param actionEvent
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onActionBtnProfesores(ActionEvent actionEvent) throws IOException {
        //TODO
    }

    /**
     * Control de evento, botón Asociados
     * @param actionEvent
     * @throws IOException
     */
    @javafx.fxml.FXML
    public void onActionBtnAsociados(ActionEvent actionEvent) throws IOException {
        //TODO
    }
}
