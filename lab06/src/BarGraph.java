import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarGraph extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart chart1 = new BarChart(xAxis, yAxis);

        //Series 1
        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data(0, 247381.0));
        series1.getData().add(new XYChart.Data(1, 1121585.3));

        //Series 2
        XYChart.Series series2 = new XYChart.Series();
        series2.getData().add(new XYChart.Data(0, 264171.4));
        series2.getData().add(new XYChart.Data(1, 1219479.5));

        //Series 3
        XYChart.Series series3 = new XYChart.Series();
        series3.getData().add(new XYChart.Data(0, 287715.3));
        series3.getData().add(new XYChart.Data(1, 1246354.2));

        //Series 4
        XYChart.Series series4 = new XYChart.Series();
        series4.getData().add(new XYChart.Data(0, 294736.1));
        series4.getData().add(new XYChart.Data(1, 1295364.8));

        //Series 5
        XYChart.Series series5 = new XYChart.Series();
        series5.getData().add(new XYChart.Data(0, 308431.4));
        series5.getData().add(new XYChart.Data(1, 1335932.6));

        //Series 6
        XYChart.Series series6 = new XYChart.Series();
        series6.getData().add(new XYChart.Data(0, 322635.9));
        series6.getData().add(new XYChart.Data(1, 1472362.0));

        //Series 7
        XYChart.Series series7 = new XYChart.Series();
        series7.getData().add(new XYChart.Data(0, 340253.0));
        series7.getData().add(new XYChart.Data(1, 1583521.9));

        //Series 8
        XYChart.Series series8 = new XYChart.Series();
        series8.getData().add(new XYChart.Data(0, 363153.7));
        series8.getData().add(new XYChart.Data(1, 1613246.3));

        chart1.getData().addAll(series1, series2, series3, series4, series5, series6, series7, series8);

        VBox vBox = new VBox(chart1);

        Scene scene = new Scene(vBox,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
