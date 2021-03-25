package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

// Local packages
import main.User;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private TextField userNameEntry;
    @FXML private TextField passwordEntry;

    @FXML protected void handleSignInButtonAction(ActionEvent event) {
        User user = new User(userNameEntry.getText(), passwordEntry.getText());
        if (user.checkUserCredentials()){
            actiontarget.setText("You have successfully authenticated!");
        } else {
            actiontarget.setText("User name or password is incorrect.");
        }
    }
}
