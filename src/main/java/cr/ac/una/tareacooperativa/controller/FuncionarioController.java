package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import cr.ac.una.tareacooperativa.App;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;


/**
 * Universidad Nacional - Programación II 2024
 * <p>
 *     Controlador de la pantalla de funcionarios
 * </p>
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class FuncionarioController implements Initializable {

    @FXML
    private BorderPane root;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { }

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
        //TODO
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
        App.setRoot("loginView");
    }

}