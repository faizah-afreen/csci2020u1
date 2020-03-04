import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class PieChart extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        int[] purchasesByAgeGroup = { 648, 1021, 2453, 3173, 1868, 2247 };

        String[] ageGroups = { "18-25", "26-35", "36-45", "46-55", "56-65", "65+" };

        Text t1 = new Text(110, 80,  ageGroups[0] + " -- " + purchasesByAgeGroup[0]);
        Text t2 = new Text(80, 15,   ageGroups[1] + " -- " + purchasesByAgeGroup[1]);
        Text t3 = new Text(5, 100,   ageGroups[2] + " -- " + purchasesByAgeGroup[2]);
        Text t4 = new Text(100, 180, ageGroups[3] + " -- " + purchasesByAgeGroup[3]);
        Text t5 = new Text(120, 100, ageGroups[4] + " -- " + purchasesByAgeGroup[4]);
        Text t6 = new Text(60, 90, ageGroups[5] + " -- " + purchasesByAgeGroup[5]);

        Arc arc1 = new Arc(100, 100, 80, 80, 0, 360 * (purchasesByAgeGroup[0] / 100));
        arc1.setFill(Color.AQUA);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(100, 100, 80, 80, arc1.getStartAngle() +
                arc1.getLength(), 360 * (purchasesByAgeGroup[1] / 100));
        arc2.setFill(Color.GOLD);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc(100, 100, 80, 80, arc2.getStartAngle() +
                arc2.getLength(), 360 * (purchasesByAgeGroup[2] / 100));
        arc3.setFill(Color.DARKORANGE);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc(100, 100, 80, 80, arc3.getStartAngle() +
                arc3.getLength(), 360 * (purchasesByAgeGroup[3] / 100));
        arc4.setFill(Color.DARKSALMON);
        arc4.setType(ArcType.ROUND);

        Arc arc5 = new Arc(100, 100, 80, 80, arc4.getStartAngle() +
                arc4.getLength(), 360 * (purchasesByAgeGroup[4] / 100));
        arc5.setFill(Color.LAWNGREEN);
        arc5.setType(ArcType.ROUND);

        Arc arc6 = new Arc(100, 100, 80, 80, arc5.getStartAngle() +
                arc5.getLength(), 360 * (purchasesByAgeGroup[5] / 100));
        arc6.setFill(Color.PLUM);
        arc6.setType(ArcType.ROUND);

        pane.getChildren().addAll(arc1, arc2, arc3, arc4, arc5, arc6, t1, t2, t3, t4, t5, t6);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("PieChart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}