package baseline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private Button button2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
    }
    @FXML
    private ComboBox<?> myButton;

    @FXML
    void buttonClicked(ActionEvent event) {
        label.setText("Hi!");
    }
    @FXML
    void buttonclick2(ActionEvent event) {
        label.setText("This creates a different message!");
    }

}