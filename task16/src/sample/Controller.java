package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;

import static sample.Main.*;


public class Controller {


    @FXML
    Label hi;

    @FXML
    TextField login, pass;

    @FXML
    public void login() throws IOException
    {
        if (login_name.equals(login.getText()) && password.equals(pass.getText()))
        {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
            Main.prmStage.hide();
            Main.prmStage = primaryStage;
        }
    }

    @FXML
    TextField log, pass_reg, pass_access, phone, mail, Sername, Name, Fathered;

    @FXML
    public void reg() throws IOException
    {
        boolean move = true;
        login_name = log.getText();

        try {
            if (!pass_access.getText().equals(pass_reg.getText()))
            {
                throw new Exception();
            }
            password = pass_reg.getText();
        }
        catch (Exception e)
        {
            pass_reg.setStyle("-fx-background-color: red;");
            pass_access.setStyle("-fx-background-color: red;");
            move = false;
        }
        fio = Sername.getText() + " " + Name.getText() + " " + Fathered.getText();

        try
        {
            Integer.parseInt(phone.getText());
            tel = phone.getText();
        }
        catch (Exception e)
        {
            phone.setStyle("-fx-background-color: red;");
            move = false;
        }

        try
        {
            boolean exist = false;
            for (int i = 0; i < mail.getText().length(); i++) {
                if (mail.getText().charAt(i) == '@') {
                    exist = true;
                    break;
                }
            }
            if (!exist)
            {
                throw new Exception();
            }
            email = mail.getText();
        }
        catch (Exception e)
        {
            mail.setStyle("-fx-background-color: red;");
            move = false;
        }
        if (move)
        {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage primaryStage = new Stage();
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
            Main.prmStage.hide();
            Main.prmStage = primaryStage;
        }
    }

    @FXML
    public void regOpen() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("reg.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        Main.prmStage.hide();
        Main.prmStage = primaryStage;
    }

    @FXML
    public void logOpen() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        Main.prmStage.hide();
        Main.prmStage = primaryStage;
    }

    @FXML
    public void errorRemove()
    {
        pass_reg.setStyle("");
        pass_access.setStyle("");
        phone.setStyle("");
        mail.setStyle("");
    }

    @FXML
    public void sayHi()
    {
        hi.setText("Приветик " + fio + " Телефон: " + tel + " Email: " + email);
    }
}
