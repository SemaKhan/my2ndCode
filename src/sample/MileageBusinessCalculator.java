package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MileageBusinessCalculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MileageCalculator.fxml"));
        primaryStage.setTitle("Mileage Business Calculator");
        primaryStage.setScene(new Scene(root, 700, 375));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
