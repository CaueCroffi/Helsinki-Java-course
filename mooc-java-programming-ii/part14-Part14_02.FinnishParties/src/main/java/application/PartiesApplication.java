package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import java.nio.file.Paths;
import java.util.Scanner;

public class PartiesApplication extends Application {

    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 1);

        xAxis.setLabel("Year");
        yAxis.setLabel("Party");
        LineChart<Number, Number> partyChart = new LineChart<>(xAxis, yAxis);
        partyChart.setTitle("Relative support of the parties");

        String[] parties = new String[7];
        try ( Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {

            scanner.nextLine();
            int i = 0;
            while (scanner.hasNextLine()) {
                parties[i] = scanner.nextLine();
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        XYChart.Series[] partiesDataOverTheYears = new XYChart.Series[7];
        
        for (int i = 0; i < partiesDataOverTheYears.length; i++) {
            String[] partyData = parties[i].split("\t");

            partiesDataOverTheYears[i] = new XYChart.Series();
            partiesDataOverTheYears[i].setName(partyData[0]);

            int year = 1968;
            for (int supportAtTime = 1; supportAtTime < partyData.length; supportAtTime++) {
                if (partyData[supportAtTime].equals("-")) {
                    year += 4;
                    continue;
                }
                partiesDataOverTheYears[i].getData().add(new XYChart.Data(year, Double.valueOf(partyData[supportAtTime])));
                year += 4;
            }
        }

        for (int party = 0; party < partiesDataOverTheYears.length; party++) {
            partyChart.getData().add(partiesDataOverTheYears[party]);
        }

        Scene view = new Scene(partyChart, 640, 480);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
