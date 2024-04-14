/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangladeshmedicalassociation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class BMA extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("pharmaconf.fxml"));
    Parent root = loader.load();
    
    // Access the controller after the FXML file is loaded
    /*PharmaconfController pharmaconfController = loader.getController();
    Conference conference = pharmaconfController.gatherConferenceInfo();

    // Create the view controller for displaying the conference information
    ConfviewController viewConf = new ConfviewController();
    viewConf.displayConferenceInfo(conference);
    */
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    
    }
    
}
