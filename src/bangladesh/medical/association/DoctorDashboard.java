/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangladesh.medical.association;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DoctorDashboard extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load DoctorDashboard.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DoctorDashboard.fxml"));
        DoctorDashboardController controller = new DoctorDashboardController();
        loader.setController(controller);
        Parent root = loader.load();

        // Set up the primary stage
        primaryStage.setTitle("Doctor's Dashboard");
        primaryStage.setScene(new Scene(root, 677, 555));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
