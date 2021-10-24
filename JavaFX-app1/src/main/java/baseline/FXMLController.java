package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class FXMLController {
    //this class is used to control the GUI itself.
    @FXML
    private MenuItem addFile;
    @FXML
    private Label date;
    @FXML
    private MenuItem deleteFile;
    @FXML
    private Label description;
    @FXML
    private TextField enterInfo;
    @FXML
    private TextField enterInfo2;
    @FXML
    private TextField enterInfo3;
    @FXML
    private Label information;
    @FXML
    private Label lists;
    @FXML
    private MenuItem menuitem1;
    @FXML
    private MenuItem menuitem2;
    @FXML
    private MenuItem menuitem3;
    @FXML
    private Menu menuitem4;
    @FXML
    private MenuButton options;
    @FXML
    private DatePicker pickDate;
    @FXML
    private DatePicker pickDate2;
    @FXML
    private DatePicker pickDate3;
    @FXML
   public void buttonClicked(ActionEvent event) {
        //if a button from the Menu of buttons is picked, call a method based on what is chosen.
        //if the user wants to add a list, call another method called infoEntered that will
        // display another screen.
        //if the user wants to delete a list, call another method called infoDeleted that will
        //display another screen.
    }
    @FXML
    public void chooseOption(ActionEvent event) {
        //this method allows the user to choose an option from the MenuButton.
    }
    @FXML
   public void dateClicked(ActionEvent event) {
        //if the user clicks a date, pop up another GUI that confirms the date he or she clicked.
    }
    @FXML
    public void infoEntered(ActionEvent event) {
        //this method will pop up another GUI that allows the user to add information.
    }

    @FXML
   public void menuOptionClicked(ActionEvent event){
        //based on what the user picks, this will pop up another GUI that will give the user
        //what info they are looking for.
    }
    @FXML
   public void infoDeleted(ActionEvent event){
        //this method will open another GUI that allows the user to delete a list.
    }
}
