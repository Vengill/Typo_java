package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static Stage prmStage;
    static String login_name;
    static String password;
    static String fio;
    static String tel;
    static String email;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        prmStage = primaryStage;
        prmStage.setTitle("Hello World");
        prmStage.setScene(new Scene(root));
        prmStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
