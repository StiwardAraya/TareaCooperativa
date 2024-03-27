package cr.ac.una.tareacooperativa;

import cr.ac.una.tareacooperativa.model.PdfManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import cr.ac.una.tareacooperativa.util.FlowController;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * <p>
 *     Universidad Nacional de Costa Rica <br>
 *     Programación II 2024 - Tarea I <br>
 *     JavaFX App
 * </p>
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goViewInWindow("LoginView");
    }

    public static void main(String[] args) {
        //launch();
        
         String folioSocio = "1";
        String nombreSocio = "Stiward";
        String apellidoSocio = "Araya";
        
       String basePdfPath = "src/main/resources/cr/ac/una/tareacooperativa/resources/PdfAsociados/BasePdf.pdf";
       String firstPdfPath = "src/main/resources/cr/ac/una/tareacooperativa/resources/PdfAsociados/" + folioSocio + ".pdf";

        // Establecer las coordenadas del texto, a partir de aqui se dibuja el nombre del usuario
        float x = 165;
        float y = 87;
        float difference = 38;

        PdfManager pdfExample = new PdfManager(basePdfPath, firstPdfPath, folioSocio, nombreSocio, apellidoSocio, x, y, difference);
        pdfExample.createPdf();
    }
 
}