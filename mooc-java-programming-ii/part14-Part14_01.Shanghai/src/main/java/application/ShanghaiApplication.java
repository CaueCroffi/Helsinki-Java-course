package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public void start(Stage window) {

        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis(40, 90, 1);

        xAxis.setLabel("Year");
        yAxis.setLabel("Rank");
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("University of Helsinki, Shangai ranking");

        XYChart.Series uniData = new XYChart.Series();
        uniData.setName("UNI");

        uniData.getData().add(new XYChart.Data(2007, 73));
        uniData.getData().add(new XYChart.Data(2008, 68));
        uniData.getData().add(new XYChart.Data(2009, 72));
        uniData.getData().add(new XYChart.Data(2010, 72));
        uniData.getData().add(new XYChart.Data(2011, 74));
        uniData.getData().add(new XYChart.Data(2012, 73));
        uniData.getData().add(new XYChart.Data(2013, 76));
        uniData.getData().add(new XYChart.Data(2014, 73));
        uniData.getData().add(new XYChart.Data(2015, 67));
        uniData.getData().add(new XYChart.Data(2016, 56));
        uniData.getData().add(new XYChart.Data(2017, 56));

        chart.getData().add(uniData);
        Scene view = new Scene(chart, 640, 480);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
