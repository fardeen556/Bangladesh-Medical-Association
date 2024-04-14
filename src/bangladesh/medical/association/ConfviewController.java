/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangladeshmedicalassociation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author David
 */
public class ConfviewController implements Initializable {

    @FXML
    private Label confIdLabel;
    @FXML
    private Label confTitleLabel;
    @FXML
    private Label attCountLabel;
    @FXML
    private Label confHostLabel;
    @FXML
    private Label addDetailsLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void displayConferenceInfo(Conference conference) {
        confIdLabel.setText(conference.getId());
        confTitleLabel.setText(conference.getTitle());
        attCountLabel.setText(String.valueOf(conference.getAttendeeCount()));
        confHostLabel.setText(conference.getHost());
        addDetailsLabel.setText(conference.getDetails());
       
    }
}
