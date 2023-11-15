package modul_3_7.handout;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Hello extends Application {
    private static final String UI_FILE = "window.fxml";

    @Override
    public void start(Stage stage_dummy) throws Exception {
        System.out.println(getClass().getResource(UI_FILE));
        Stage stage = FXMLLoader.load(getClass().getResource(UI_FILE));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}