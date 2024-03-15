package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cr.ac.una.tareacooperativa.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

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
    private AnchorPane root;
    @FXML
    private AnchorPane rootTransaccionesView;
    @FXML
    private AnchorPane rootCarnetView;
    @FXML
    private AnchorPane rootAsociadosView;
    @FXML
    private AnchorPane rootCuentasView;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootTransaccionesView.setVisible(false);
        rootTransaccionesView.setDisable(true);
        rootAsociadosView.setVisible(false);
        rootAsociadosView.setDisable(true);
        rootCuentasView.setVisible(false);
        rootCuentasView.setDisable(true);
        rootCarnetView.setVisible(false);
        rootCarnetView.setDisable(true);
    }

    @FXML
    public void onActionAsociadosButton(ActionEvent actionEvent) {
        rootAsociadosView.setVisible(true);
        rootAsociadosView.setDisable(false);
        rootAsociadosView.setScaleZ(10);
    }

    @FXML
    public void onActionCarnetButton(ActionEvent actionEvent) {
        rootCarnetView.setVisible(true);
        rootCarnetView.setDisable(false);
        rootCarnetView.setScaleZ(10);
    }

    @FXML
    public void onActionCuentasButton(ActionEvent actionEvent) {
        rootCuentasView.setVisible(true);
        rootCuentasView.setDisable(false);
        rootCuentasView.setScaleZ(10);
    }

    @FXML
    public void onActionTransaccionesButton(ActionEvent actionEvent) {
        rootTransaccionesView.setVisible(true);
        rootTransaccionesView.setDisable(false);
        rootTransaccionesView.setScaleZ(10);
    }

    @FXML
    private void onActionSalirButton(ActionEvent event) throws IOException {
        App.setRoot("loginView");
    }


}
