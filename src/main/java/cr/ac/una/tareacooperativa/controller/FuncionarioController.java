package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cr.ac.una.tareacooperativa.App;
import io.github.palexdev.materialfx.controls.MFXListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

//
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;


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
    @FXML
    private ListView<String> listViewCuentas;
    @FXML
    private ListView<String> listViewCuentasCliente;

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

        //Cargar lista de objetos cuenta
        String[] items = {"Cuenta1", "Cuenta2", "Cuenta3", "Cuenta4", "Cuenta5"};
        listViewCuentas.getItems().addAll(items);
       
        listViewCuentas.setOnDragDetected(this::OnDragDetectedCuentas);
        listViewCuentas.setOnDragOver(this::OnDragOverCuentas);
        listViewCuentas.setOnDragDropped(this::OnDragDroppedCuentas);
        
        listViewCuentasCliente.setOnDragDetected(this::OnDragDetectedCuentasCliente);
        listViewCuentasCliente.setOnDragOver(this::OnDragOverCuentasCliente);
        listViewCuentasCliente.setOnDragDropped(this::OnDragDroppedCuentasCliente);
    }

    /**
     * Control de evento, botón Asociados
     * @param actionEvent
     */
    @FXML
    public void onActionAsociadosButton(ActionEvent actionEvent) {
        rootAsociadosView.setVisible(true);
        rootAsociadosView.setDisable(false);
        rootAsociadosView.setScaleZ(10);
    }

    /**
     * Control de evento, botón Carnet
     * @param actionEvent
     */
    @FXML
    public void onActionCarnetButton(ActionEvent actionEvent) {
        rootCarnetView.setVisible(true);
        rootCarnetView.setDisable(false);
        rootCarnetView.setScaleZ(10);
    }

    /**
     * Control de evento, botón Cuentas
     * @param actionEvent
     */
    @FXML
    public void onActionCuentasButton(ActionEvent actionEvent) {
        rootCuentasView.setVisible(true);
        rootCuentasView.setDisable(false);
        rootCuentasView.setScaleZ(10);
    }

    /**
     * Control de evento, botón transacciones
     * @param actionEvent
     */
    @FXML
    public void onActionTransaccionesButton(ActionEvent actionEvent) {
        rootTransaccionesView.setVisible(true);
        rootTransaccionesView.setDisable(false);
        rootTransaccionesView.setScaleZ(10);
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

    @FXML
    private void OnDragDetectedCuentas(MouseEvent event) {
          OnDragDetectedListas(event,listViewCuentas);
    }


    @FXML
    private void OnDragDroppedCuentas(DragEvent event) {
      OnDragDroppedListas(event,listViewCuentas); 
    }

     @FXML
    private void OnDragOverCuentas(DragEvent event) {
       onDragOverListas(event, listViewCuentas);
    }
     
    @FXML
    private void OnDragDetectedCuentasCliente(MouseEvent event) {
        OnDragDetectedListas(event,listViewCuentasCliente);
    }

    @FXML
    private void OnDragDroppedCuentasCliente(DragEvent event) {
      OnDragDroppedListas(event, listViewCuentasCliente);
    }

    @FXML
    private void OnDragOverCuentasCliente(DragEvent event) {
        onDragOverListas(event, listViewCuentasCliente);
    }

    @FXML
    private void onActionCerrarButton(ActionEvent event) throws IOException{
        //TODO
    }
    
    
    private void OnDragDetectedListas(MouseEvent event, ListView<String> lista) {
    String itemToDrag = lista.getSelectionModel().getSelectedItem();
        Dragboard dragboard = lista.startDragAndDrop(TransferMode.COPY);
        ClipboardContent content = new ClipboardContent();
        content.putString(itemToDrag);
        dragboard.setContent(content);
        
        event.consume();
    
    }
    
     private void OnDragDroppedListas(DragEvent event, ListView<String> lista) {
     String item = event.getDragboard().getString();
        lista.getItems().add(item);

        ListView<?> source = (ListView<?>) event.getGestureSource();
        source.getItems().remove(item);

        event.setDropCompleted(true);
        event.consume();   
     
     }
   
    private void onDragOverListas(DragEvent event, ListView<String> lista){
 
    if (event.getGestureSource() != lista &&
                event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY);
        }

        event.consume();
    }  
    
}