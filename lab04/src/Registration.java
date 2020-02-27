import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.util.concurrent.Callable;

public class Registration extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);

        //username label
        Label username = new Label("Username: ");
        GridPane.setConstraints(username, 0,0);

        //username input
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Username");
        GridPane.setConstraints(usernameInput,1,0);

        pane.getChildren().addAll(username, usernameInput);

        //password label
        Label password = new Label("Password: ");
        GridPane.setConstraints(password, 0,1);

        //password input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput,1,1);

        pane.getChildren().addAll(password, passInput);

        //name label
        Label name = new Label("Full Name: ");
        GridPane.setConstraints(name, 0,2);

        //name input
        TextField nameInput = new TextField();
        nameInput.setPromptText("Full Name");
        GridPane.setConstraints(nameInput,1,2);

        pane.getChildren().addAll(name, nameInput);

        //email label
        Label email = new Label("Email: ");
        GridPane.setConstraints(email, 0,3);

        //email input
        TextField emailInput = new TextField();
        emailInput.setPromptText("Email");
        GridPane.setConstraints(emailInput,1,3);

        pane.getChildren().addAll(email, emailInput);

        //phone label
        Label phone = new Label("Phone #: ");
        GridPane.setConstraints(phone, 0,4);

        //phone input
        TextField phoneInput = new TextField();
        phoneInput.setPromptText("Phone #");
        GridPane.setConstraints(phoneInput,1,4);

        pane.getChildren().addAll(phone, phoneInput);

        //birthdate label
        Label date = new Label("Date of Birth: ");
        GridPane.setConstraints(date, 0,5);

        //birthdate input
        TextField dateInput = new TextField();
        dateInput.setPromptText("Date of Birth");
        GridPane.setConstraints(dateInput,1,5);

        pane.getChildren().addAll(date, dateInput);

        Button btAdd = new Button("Register");
        pane.add(btAdd, 1,6);
        GridPane.setHalignment(btAdd, HPos.LEFT);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration");
        primaryStage.show();
    }
}
