package cr.ac.una.tareacooperativa.util;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class Camara {
    
    private Webcam webcam;

    public Camara() throws Exception {
        // Attempt to open the default camera
        webcam = Webcam.getDefault();
        if (webcam == null) {
            throw new IllegalStateException("No webcam found!");
        }

        // Optionally set the resolution (default is 640x480)
        webcam.setViewSize(new Dimension(WebcamResolution.VGA.getWidth(), WebcamResolution.VGA.getHeight()));
        webcam.open(); // Open the webcam
    }

    public BufferedImage captureImage() throws Exception {
        if (webcam == null) {
            throw new IllegalStateException("Camera not opened!");
        }
        return webcam.getImage(); // Capture an image
    }

    public void closeCamara() {
        if (webcam != null) {
            webcam.close(); // Close the webcam
            webcam = null;
        }
    }
    
}