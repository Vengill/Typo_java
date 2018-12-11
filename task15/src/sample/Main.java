package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Main extends Application {

    @FXML
    Label label1;
    @FXML
    Label label2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    @FXML
    public void changeBack()
    {
        label1.setStyle("-fx-background-color: red;" + label1.getStyle());
        label2.setStyle("-fx-background-color: red;" + label2.getStyle());
    }

    @FXML
    public void chandeText()
    {
        label1.setStyle("-fx-text-fill: red;" + label1.getStyle());
        label2.setStyle("-fx-text-fill: red;" + label2.getStyle());
    }

    @FXML
    public void changeBegin()
    {
        label1.setStyle("");
        label2.setStyle("");
    }
}
