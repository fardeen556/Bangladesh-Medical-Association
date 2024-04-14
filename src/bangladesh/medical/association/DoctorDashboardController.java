/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package bangladesh.medical.association;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DoctorDashboardController {

    @FXML
    private Button logoutButton;

    @FXML
    private void handleLogout(ActionEvent event) throws IOException {
        // Load the login screen
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close(); // Close the doctor dashboard window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login_user.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login"); // Set the title of the stage
        stage.show();
    }
}
