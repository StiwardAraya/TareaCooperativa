package cr.ac.una.tareacooperativa.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.*;

/**
 * Universidad Nacional - Programación II 2024
 * <p>
 *     Controlador de la pantalla de buzón
 * <p/>
 * @author Stiward Araya
 * @author Justin Mendez
 */
public class CuentasController implements Initializable {

    @FXML
    private ListView<String> listViewCuentas;
    @FXML
    private ListView<String> listViewCuentasCliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
        if (event.getGestureSource() != lista && event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY);
        }
        event.consume();
    }

    @FXML
    private void onActionCerrarButton(ActionEvent event) throws IOException{
        //TODO
    }

}
