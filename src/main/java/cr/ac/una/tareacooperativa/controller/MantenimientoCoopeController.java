package cr.ac.una.tareacooperativa.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

/**
 * Universidad Nacional - Programación II 2024
 * Controlador de la pantalla de mantenimiento
 * de la cooperativa
 * @author Stiward Araya 
 * @author Justin Mendez
 */
public class MantenimientoCoopeController implements Initializable {

    @FXML
    private ImageView imgViewLogo;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { }    

    @FXML
    private void imgViewLogoOnDragOver(DragEvent event) {
         Dragboard dragboard = event.getDragboard();
     if(dragboard.hasImage()||dragboard.hasFiles()){
     event.acceptTransferModes(TransferMode.COPY);
     }
         System.out.println("DragOver");
    }
    
    @FXML
    private void imgViewLogoOnDragDropped(DragEvent event) {
         Dragboard dragboard = event.getDragboard();
     if(dragboard.hasImage()||dragboard.hasFiles()){
               try
               {
                   imgViewLogo.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
               } catch (FileNotFoundException ex)
               {
                   ex.printStackTrace();
               }
     }
        System.out.println("Dropped");
    }
    
    
}
