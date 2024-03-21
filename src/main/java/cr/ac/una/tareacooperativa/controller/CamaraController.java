package cr.ac.una.tareacooperativa.controller;

/**
 * Universidad Nacional - Programación II 2024
 * Controlador de la pantalla de asociados
 * @author Stiward Araya
 * @author Justin Mendez
 */

import java.io.IOException;

import cr.ac.una.tareacooperativa.util.FlowController;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.utils.SwingFXUtils;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
// import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import javax.imageio.ImageIO;
public class CamaraController extends Controller implements Initializable {
 
    private Webcam webcam;
    private boolean isRunning;
    
    @FXML
    private ImageView previewImageView;
    @FXML
    private ImageView fotoCapturada;
    @FXML
    private MFXButton btnPowerOn_OffCamera;
    @FXML
    private MFXButton btnTomarFoto;

    @Override
    public void initialize() {}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(WebcamResolution.VGA.getWidth(), WebcamResolution.VGA.getHeight()));
        isRunning = false;
        
    }

    private void startCameraPreview() {
        Task<Void> task;
        task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    webcam.open();
                    while (isRunning){
                        BufferedImage image = webcam.getImage();
                        Image javafxImage = SwingFXUtils.toFXImage(image, null);
                        Platform.runLater(() -> previewImageView.setImage(javafxImage));
                        Thread.sleep(17); // Update preview at 60 FPS (adjust as needed)
                    }
                    webcam.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        new Thread(task).start();
    }
 
    @FXML
    public void onHandleTakePic(ActionEvent event) throws IOException {
        try {
            // Capture the image
            BufferedImage image = webcam.getImage();
            // Generate a unique filename (refer to your existing code for this)
            ImageIO.write(image, "JPG", new File("New_photo.jpg"));
            //webcam.close();
            Image javafxImage = SwingFXUtils.toFXImage(image, null);
        
        // Set the JavaFX Image to the ImageView
        fotoCapturada.setImage(javafxImage);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error capturing image!");
        }
    }

    @FXML
    private void powerOn_OffCamera(ActionEvent event) {
         if (!isRunning) {
            startCameraPreview();
        } else {
            webcam.close();
        }
        isRunning = !isRunning;
    }
    
}