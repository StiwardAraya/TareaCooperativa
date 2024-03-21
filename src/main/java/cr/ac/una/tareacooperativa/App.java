package cr.ac.una.tareacooperativa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import cr.ac.una.tareacooperativa.util.FlowController;

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
        launch();
    }

}