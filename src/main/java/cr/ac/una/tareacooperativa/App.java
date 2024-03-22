package cr.ac.una.tareacooperativa;


import com.aspose.pdf.Document;
import com.aspose.pdf.Page;
import com.aspose.pdf.TextFragment;

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
       // launch();
       createPdf();
 
    }
     public static void createPdf() {
    try {
          Document pdfDocument = new Document();
    // Agregar una página al documento
    Page page = pdfDocument.getPages().add();

    // Guardar el documento PDF
      
        FileOutputStream outputStream = new FileOutputStream("output.pdf");
        page.getParagraphs().add(new TextFragment("Hello World!"));
        
        pdfDocument.save(outputStream);
        outputStream.close();
        System.out.println("PDF creado correctamente.");
    } catch (IOException ex) {
        System.out.println("Error al crear el PDF: " + ex.getMessage());
    }
}
     
     
}