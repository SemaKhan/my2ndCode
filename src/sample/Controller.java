package sample;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Controller {
    private int milesTraveled =100;
    @FXML
    private Label milesLabel;
    @FXML
    private Slider milesSlider;
    @FXML
    private TextField gasTextField;
    @FXML
    private Label ResultLabel;
    @FXML
    private TextField gasPrice;
    @FXML
    private Label totalCost;


   public void calculateMPG(ActionEvent actionEvent) {
        double gasUsed = Double.parseDouble(gasTextField.getText());
        double mpg = milesTraveled/gasUsed;
       double gprice = Double.parseDouble(gasPrice.getText());
       double PGG = gasUsed*gprice;
        ResultLabel.setText(String.format("MPG: %.2f",mpg));
       totalCost.setText(String.format("PPG: %.2f",PGG));
    }
    public void initialize()
    {
        milesSlider.valueProperty().addListener(new SliderListener());
    }

    private class SliderListener implements ChangeListener<Number>
    {
       @Override
               public void changed(ObservableValue<?extends Number> ov,
                                   Number oldValue,Number newValue)
       {
           milesTraveled=newValue.intValue();
           milesLabel.setText("Miles: "+ milesTraveled);
       }
    }


}





