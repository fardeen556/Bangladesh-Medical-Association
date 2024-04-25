/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package bangladesh.medical.association;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class to launch the Bangladesh Medical Association application.
 */
public class Login extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load the login scene
        Parent root = FXMLLoader.load(getClass().getResource("Login_user.fxml"));

        // Set up the primary stage
        primaryStage.setTitle("Bangladesh Medical Association");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * Main method to launch the application.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        launch(args);
    }
}

