/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package bangladesh.medical.association;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField userIdField;

    @FXML
    private ComboBox<String> userTypeComboBox;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorMessageLabel;

    // Define usernames and passwords for each user type
    private final String[][] userCredentials = {
        {"1001", "Doctor", "doctor123"}, // Doctor
        {"2002", "Patient", "Patient123"}, // Patient
        {"3003", "Medical Student", "Medical Student123"}, // Medical Student
        {"4004", "Security and Maintenance", "Security and Maintenance123"}, // Security and Maintenance
        {"5005", "Hospitals", "Hospitals123"}, // Hospitals
        {"6006", "Admin", "Admin123"}, // Admin
        {"7007", "Pharmaceutical Companies", "Pharm123"}, // Pharmaceutical Companies
        {"8008", "NGO", "NGO123"}, // NGO
    };

    @FXML
    private void initialize() {
        // Populate the combo box with user types
        userTypeComboBox.setItems(FXCollections.observableArrayList(
                "Doctor", "Patient", "Medical Student", "Security and Maintenance",
                "Hospitals", "Admin", "Pharmaceutical Companies", "NGO"
        ));
    }

    @FXML
    private void login(ActionEvent event) {
        String userId = userIdField.getText();
        String userType = userTypeComboBox.getValue();
        String password = passwordField.getText();

        // Authenticate the user
        boolean isAuthenticated = false;
        for (String[] credentials : userCredentials) {
            if (userId.equals(credentials[0]) && userType.equals(credentials[1]) && password.equals(credentials[2])) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            switch (userType) {
                case "Doctor":
                    loadDoctorDashboard();
                    break;
                case "Patient":
                    break;
                case "Medical Student":
                    break;
                case "Security and Maintenance":
                    break;
                case "Hospitals":
                    break;
                case "Admin":
                    break;
                case "Pharmaceutical Companies":
		    loadPharmaceuticalCompanyDashboard();
                    break;
                case "NGO":
                    break;
            }

            // Clear error message
            errorMessageLabel.setText("");
        } else {
            // Display error message
            errorMessageLabel.setText("Invalid credentials. Please try again.");
        }
    }

    private void loadDoctorDashboard() {
        try {
            // Load the Doctor's Dashboard FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Doctor's Dashboard");
            stage.show();
        } catch (IOException e) {
            // Handle any IOException that may occur during loading
            e.printStackTrace();
        }
    }
   private void loadPharmaceuticalCompanyDashboard() {
    try { FXMLLoader loader = new FXMLLoader(getClass().getResource("pharmaconf.fxml"));
    Parent root = loader.load();
    
    // Access the controller after the FXML file is loaded
    /*PharmaconfController pharmaconfController = loader.getController();
    Conference conference = pharmaconfController.gatherConferenceInfo();

    // Create the view controller for displaying the conference information
    ConfviewController viewConf = new ConfviewController();
    viewConf.displayConferenceInfo(conference);
    */
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setScene(scene);
    stage.show();
	    }   
     catch (IOException e) {
            e.printStackTrace();
        }

   }
}
