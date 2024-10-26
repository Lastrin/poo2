package org.projetinho;

import com.almasb.fxgl.input.Input;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMain extends Application {
    @Override
    public void start(@NotNull Stage stage) throws IOException {
        String pathMain="C:\\Users\\Unifan\\Desktop\\ELIEL\\projetinho\\src\\main\\java\\org\\projetinho\\view\\MainView.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent parent = fxmlLoader.load(new FileInputStream(pathMain));
        Scene scene = new Scene(parent, 800, 550);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }


}