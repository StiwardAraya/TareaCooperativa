package cr.ac.una.tareacooperativa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        scene = new Scene(loadFXML("CamaraView"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * <p>
     *     Recibe un archivo fxml y lo carga en el scene del stage principal
     * </p>
     * @param fxml
     * @throws IOException
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * <p>
     *     Busca un archivo fxml y lo carga en un objeto
     * </p>
     * @param fxml
     * @return
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}