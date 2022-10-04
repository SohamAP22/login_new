package CalorieCut;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Login extends Application {

    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;

    public void start(Stage primaryStage) throws SQLException {
        primaryStage.setTitle("CalorieCut");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Text scenetitle = new Text();
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("Log in");
        HBox hbBtn = new HBox(10);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        Label or = new Label("---OR---");
        grid.add(or, 1,8);
        
        Button ca = new Button("Create account");
        HBox hbca = new HBox(10);
        hbca.getChildren().add(ca);
        grid.add(hbca, 1, 10);

      

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent e) {

                try {
                    myConn = DriverManager.getConnection("jdbc:mysql://localhost:330/CalorieCut", "root", "passwordguess22@");

                    myStmt = myConn.createStatement();
                    myRs = myStmt.executeQuery("select * from CalorieCut.consumer where username='" + userTextField.getText() + "' and password='" + pwBox.getText() + "'");

                    if (myRs.next() == false) {
                        actiontarget.setFill(Color.RED);
                        actiontarget.setText("Username or Password is wrong or user does not exist");
                    } else {
                        
                        
                        try{
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
                    myConn.close();

                } catch (Exception exc) {
                    exc.printStackTrace();
                }

            }
        });
        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }
}
