package com.example.three;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage globalstage;



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startpage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 500);
        globalstage = stage;
        stage.setTitle("Start Page!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void Easybuttonclick() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gamescreeneasy.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 500);

        globalstage.setTitle("Game Screen");
        globalstage.setScene(scene);
    }


    @FXML
    protected void Mediumbuttonclick() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gamescreenmedium.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 500);

        globalstage.setTitle("Game Screen");
        globalstage.setScene(scene);
    }

    @FXML
    protected void Hardbuttonclick() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gamescreenhard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 500);

        globalstage.setTitle("Game Screen");
        globalstage.setScene(scene);
    }
    @FXML
    protected void startbuttonclick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("select_level.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 500);

        globalstage.setTitle("Select Level");
        globalstage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}