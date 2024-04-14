/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package bangladesh.medical.association;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PatientDashboardController {

    @FXML
    private Button logoutButton;

    @FXML
    private void handleLogout(ActionEvent event) throws IOException {
        // Load the login screen
        Parent root = FXMLLoader.load(getClass().getResource("Login_user.fxml"));
        
        // Show the login screen in a new stage
        Scene scene = new Scene(root);
        Stage stage = (Stage) logoutButton.getScene().getWindow(); // Get the current stage
        stage.setScene(scene);
        stage.setTitle("Login"); // Set the title of the stage
    }
}
