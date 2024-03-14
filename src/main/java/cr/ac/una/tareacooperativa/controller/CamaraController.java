package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cr.ac.una.tareacooperativa.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * Universidad Nacional - Programación II 2024
 * Controlador de la pantalla de asociados
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class CamaraController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {}

    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("loginView");
    }
    
}
