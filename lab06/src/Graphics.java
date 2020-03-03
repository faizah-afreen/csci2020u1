import javafx.application.Application;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Graphics extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart chart1 = new BarChart(xAxis, yAxis);



        XYChart.Series series1 = new XYChart.Series();
        series1.getData().add(new XYChart.Data(247381.0, 1121585.3));
        series1.getData().add(new XYChart.Data(264171.4, 1219479.5));
        series1.getData().add(new XYChart.Data(287715.3, 1246354.2));
        series1.getData().add(new XYChart.Data(294736.1, 1295364.8));
        series1.getData().add(new XYChart.Data(308431.4, 1335932.6));
        series1.getData().add(new XYChart.Data(322635.9, 1472362.0));
        series1.getData().add(new XYChart.Data(340253.0, 1583521.9));
        series1.getData().add(new XYChart.Data(363153.7, 1613246.3));



    }
}
