package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private AnchorPane pane;

    @Override
    public void start(Stage stage) throws Exception {
        pane = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        stage.setScene(new Scene(pane, 1280, 720));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}