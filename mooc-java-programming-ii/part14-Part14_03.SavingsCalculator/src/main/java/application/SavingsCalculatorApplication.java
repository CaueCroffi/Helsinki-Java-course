package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class SavingsCalculatorApplication extends Application {

    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        BorderPane topSlider = new BorderPane();
        BorderPane bottomSlider = new BorderPane();
        VBox sliderContainer = new VBox();

        Label monthlySavings = new Label("Monthly savings");
        Label yearlyInterest = new Label("Yearly interest rate");

        Slider savings = new Slider(25, 250, 25);
        savings.setShowTickMarks(true);
        savings.setMajorTickUnit(25);

        Slider interest = new Slider(0, 10, 0);
        interest.setShowTickMarks(true);
        interest.setMajorTickUnit(1);

        Label currentSavingsValue = new Label("" + savings.getValue());
        Label currentInterestValue = new Label("" + interest.getValue());

        topSlider.setLeft(monthlySavings);
        topSlider.setCenter(savings);
        topSlider.setRight(currentSavingsValue);

        bottomSlider.setLeft(yearlyInterest);
        bottomSlider.setCenter(interest);
        bottomSlider.setRight(currentInterestValue);

        sliderContainer.getChildren().addAll(topSlider, bottomSlider);

        NumberAxis XAxis = new NumberAxis(0, 30, 1);
        NumberAxis YAxis = new NumberAxis(0, 125000, 25000);

        LineChart<Number, Number> chart = new LineChart<>(XAxis, YAxis);

        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series interestData = new XYChart.Series();

        updateData(savings.getValue(), interest.getValue(), savingsData, interestData);

        savings.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                currentSavingsValue.setText(String.format("%.2f", newValue));
                updateData(savings.getValue(), interest.getValue(), savingsData, interestData);

            }
        });
        interest.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                currentInterestValue.setText(String.format("%.2f", newValue));
                updateData(savings.getValue(), interest.getValue(), savingsData, interestData);
            }
        });

        chart.getData().add(savingsData);
        chart.getData().add(interestData);

        layout.setTop(sliderContainer);
        layout.setCenter(chart);

        Scene scene = new Scene(layout, 640, 480);
        window.setScene(scene);
        window.show();

    }

    public void updateData(double savings, double interest, XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();
        savings *= 12;
        double currentSavings = 0;

        for (int year = 0; year <= 30; year++) {
            savingsSeries.getData().add(new XYChart.Data(year, currentSavings));
            currentSavings += savings;
        }
        currentSavings = 0;
        for (int year = 0; year <= 30; year++) {
            savingsWithInterestSeries.getData().add(new XYChart.Data(year, currentSavings));
            currentSavings += savings;
            currentSavings += (currentSavings / 100) * interest;
        }
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
