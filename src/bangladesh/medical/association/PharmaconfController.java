/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangladeshmedicalassociation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David
 */
public class PharmaconfController implements Initializable {

    @FXML
    private TextField confId;
    @FXML
    private TextField confTitle;
    @FXML
    private TextField attCount;
    @FXML
    private TextField confHost;
    @FXML
    private TextArea addDetails;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    // TODO
    }    

    private void saveConf(ActionEvent event) throws IOException{
      
    }

    @FXML
    private void showConf(ActionEvent event) throws IOException {
     Parent root = FXMLLoader.load(getClass().getResource("confview.fxml"));
      
     Scene scene = new Scene(root);
     Stage stage = new Stage();   
     stage.setScene(scene);
     stage.show();
    }

    @FXML
    private void showAttnd(ActionEvent event) {
       
    }

    public Conference gatherConferenceInfo() {
        Conference conference = new Conference();
        conference.setId(confId.getText());
        conference.setTitle(confTitle.getText());
        conference.setAttendeeCount(Integer.parseInt(attCount.getText()));
        conference.setHost(confHost.getText());
        conference.setDetails(addDetails.getText());
        return conference;
    }
}
