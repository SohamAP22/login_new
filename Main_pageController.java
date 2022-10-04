/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Caloriecut;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Soham
 */
public class Main_pageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Action_main(ActionEvent event) {
    }

    @FXML
    private void Action_profile(ActionEvent event) {
    }

    @FXML
    private void Action_breakfast(ActionEvent event) {
        try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Breakfast.fxml"));
Parent root1 = (Parent) fxmlLoader.load();
Stage stage = new Stage();
stage.setTitle("CalorieCut");
stage.setScene(new Scene(root1));  
stage.show();
                        }
                        catch(Exception z){
                            System.out.println("Could not open window");
                        }

                        
                    }
    

    @FXML
    private void Action_lunch(ActionEvent event) {
    }

    @FXML
    private void Action_dinner(ActionEvent event) {
    }

    @FXML
    private void Action_calorietracking(ActionEvent event) {
    }
    
}
