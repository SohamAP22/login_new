package Caloriecut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import javafx.scene.Parent;
import javafx.scene.control.Alert;

public class create_accController {

    @FXML
    public TextField usweight;
    @FXML
    public TextField emailacc;
    @FXML
    public TextField uname;
    @FXML
    public TextField usernamea;
    @FXML
    public TextField usage;
    @FXML
    public TextField usheight;
    @FXML
    public PasswordField password;
    @FXML
    public TextField gender;
    @FXML
    public Button signup;

    Connection myConn = null;
    Statement myStmt = null;
   
    ResultSet myRs = null;
    PreparedStatement preparedStatement = null;
    
        
         
    
    
            
    public void signupButton(ActionEvent actionEvent) throws SQLException{
        
    
    
     GridPane grid = new GridPane();
    
    final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 8);
        
        
       
           
           
       
        
           
               String userna=null;
               userna = usernamea.getText();
               {while(usernamea.getText().isEmpty()){
           Alert alert =new Alert(Alert.AlertType.ERROR);
           alert.setContentText("Please enter your username");
           alert.showAndWait();
           break;
       }
               
               try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                   // myRs = myStmt.executeQuery("INSERT INTO caloriecut.user"+"('Username')"+" VALUES('"+ usernamea.getText()+"')");
                   String  sql="INSERT INTO caloriecut.`user`"+"('Username')"+" VALUES('"+ usernamea.getText()+"')";
preparedStatement = myConn.prepareStatement(sql);
                   
             myConn.close();
             }
             catch(Exception z){
                            System.out.println(z);
                        }
             
       
       
        
        
           
           String ema = emailacc.getText();
           
{while(emailacc.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your Email Address!!");
            alert.showAndWait();break;
        }
           try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    
                    //myRs = myStmt.executeQuery("update `caloriecut.user` set Email_ID='"+ emailacc.getText()+"' where Username ='"+usernamea.getText()+"'");
String query = "update caloriecut.`user` set Email_ID='"+ emailacc.getText()+"' where Username ='"+usernamea.getText()+"'";
			preparedStatement.executeQuery(query);
                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }}
      
        
        
        
        
        
            
       String una = uname.getText();
      
while(uname.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your name!!");
            alert.showAndWait();break;
        }
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user` set Name='"+ uname.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
        
        
        
        
        
            
         String pass = password.getText();
        while(password.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your password!!");
            alert.showAndWait();break;
        }
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user` set Password='"+ password.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
        
        
        
       
            
        String age = usage.getText();
       
while(usage.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your age!!");
            alert.showAndWait();break;
        }
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user`` set Age='"+ usage.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
        
        
        
       
        
        
          
          String gend = gender.getText();
            if(gender.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your gender!!");
            alert.showAndWait();}
        
        
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user` set Gender='"+ gender.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
        
        
        
        
        
        
            
        String height = usheight.getText();
        while(usheight.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your height!!");
            alert.showAndWait();break;
        }
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user` set Height='"+ usheight.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
        
    
        
        
            
           String  weigh = usweight.getText();
        while(usweight.getText().isEmpty()){
            Alert alert =new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter your weight!!");
            alert.showAndWait();break;
        }
        
        
            try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("update `caloriecut.user` set Weight='"+ usweight.getText()+"' where Username ='"+usernamea.getText()+"'");

                    
             myConn.close();
             }
             catch(Exception z){
                            System.out.println("Error");
                        }
        
        
       if(((usweight.getText().isEmpty())==false) && ((usheight.getText().isEmpty()==false)) && ((gender.getText().isEmpty())==false) && ((usage.getText().isEmpty()==false)) && ((password.getText().isEmpty()==false)) && ((uname.getText().isEmpty()==false)) && ((emailacc.getText().isEmpty()==false)) && ((usernamea.getText().isEmpty()==false)) )
       {try{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main_page.fxml"));
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

        
  }}}
    

