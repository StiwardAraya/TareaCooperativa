package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import cr.ac.una.tareacooperativa.util.FlowController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;


/**
 * Universidad Nacional - Programación II 2024
 * <p>
 *     Controlador de la pantalla de funcionarios
 * </p>
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class FuncionarioController extends Controller implements Initializable {

    @FXML
    private BorderPane root;


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { }

    @Override
    public void initialize() {}

    /**
     * Control de evento, botón Asociados
     * @param actionEvent
     */
    @FXML
    public void onActionAsociadosButton(ActionEvent actionEvent) {
        //TODO
    }

    /**
     * Control de evento, botón Carnet
     * @param actionEvent
     */
    @FXML
    public void onActionCarnetButton(ActionEvent actionEvent) {
        //TODO
    }

    /**
     * Control de evento, botón Cuentas
     * @param actionEvent
     */
    @FXML
    public void onActionCuentasButton(ActionEvent actionEvent) {
        FlowController.getInstance().goView("CuentasView");
    }

    /**
     * Control de evento, botón transacciones
     * @param actionEvent
     */
    @FXML
    public void onActionTransaccionesButton(ActionEvent actionEvent) {
        //TODO
    }

    /**
     * Control de evento, botón Salir
     * @param event
     * @throws IOException
     */
    @FXML
    private void onActionSalirButton(ActionEvent event) throws IOException {
        //TODO
    }

}