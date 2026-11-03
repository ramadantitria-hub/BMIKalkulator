package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Mengarah ke file form_bmi.fxml di dalam folder fxml
        URL fxmlLocation = getClass().getResource("/fxml/form_bmi.fxml");

        if (fxmlLocation == null) {
            fxmlLocation = getClass().getClassLoader().getResource("fxml/form_bmi.fxml");
        }

        if (fxmlLocation == null) {
            throw new IllegalStateException("File form_bmi.fxml tidak ditemukan di folder resources/fxml!");
        }

        Parent root = FXMLLoader.load(fxmlLocation);

        stage.setTitle("Kalkulator BMI");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}