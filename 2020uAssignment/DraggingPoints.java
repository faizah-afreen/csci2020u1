import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DraggingPoints extends Application
{
    Text[] text = {new Text(), new Text(), new Text()};

    double rad = 10;

    Line lineOne = new Line();
    Line lineTwo = new Line();
    Line lineThree = new Line();

    Circle[] cir = {new Circle(40, 40, 10),
            new Circle(140, 40, 10), new Circle(60, 140, 10)};


    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();
        settingLines();
        pane.getChildren().addAll(cir[0], cir[1], cir[2],
                lineOne, lineTwo, lineThree, text[0], text[1], text[2]);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Exercise15_20"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        cir[0].setOnMouseDragged(e ->
        {
            if (cir[0].contains(e.getX(), e.getY()))
            {
                // Recompute and display angles
                cir[0].setCenterX(e.getX());
                cir[0].setCenterY(e.getY());
                settingLines();
            }
        });

        cir[1].setOnMouseDragged(e ->
        {
            if (cir[1].contains(e.getX(), e.getY()))
            {
                // Recompute and display angles
                cir[1].setCenterX(e.getX());
                cir[1].setCenterY(e.getY());
                settingLines();
            }
        });

        cir[2].setOnMouseDragged(e ->
        {
            if (cir[2].contains(e.getX(), e.getY()))
            {
                // Recompute and display angles
                cir[2].setCenterX(e.getX());
                cir[2].setCenterY(e.getY());
                settingLines();
            }
        });
    }

    private void settingLines()
    {
        lineOne.setStartX(cir[0].getCenterX());
        lineOne.setEndX(cir[1].getCenterX());
        lineOne.setStartY(cir[0].getCenterY());
        lineOne.setEndY(cir[1].getCenterY());

        lineTwo.setStartX(cir[0].getCenterX());
        lineTwo.setEndX(cir[2].getCenterX());
        lineTwo.setStartY(cir[0].getCenterY());
        lineTwo.setEndY(cir[2].getCenterY());

        lineThree.setStartX(cir[1].getCenterX());
        lineThree.setEndX(cir[2].getCenterX());
        lineThree.setStartY(cir[1].getCenterY());
        lineThree.setEndY(cir[2].getCenterY());

        // Computing the angles
        double[] angle = new double[3];

        double pointA = new Point2D(cir[2].getCenterX(), cir[2].getCenterY()).
                distance(cir[1].getCenterX(), cir[1].getCenterY());

        double pointB = new Point2D(cir[2].getCenterX(), cir[2].getCenterY()).
                distance(cir[0].getCenterX(), cir[0].getCenterY());

        double pointC = new Point2D(cir[1].getCenterX(), cir[1].getCenterY()).
                distance(cir[0].getCenterX(), cir[0].getCenterY());

        angle[0] = Math.acos((pointA * pointA - pointB * pointB - pointC * pointC) / (-2 * pointB * pointC));
        angle[1] = Math.acos((pointB * pointB - pointA * pointA - pointC * pointC) / (-2 * pointA * pointC));
        angle[2] = Math.acos((pointC * pointC - pointB * pointB - pointA * pointA) / (-2 * pointA * pointB));

        for (int i = 0; i < 3; i++)
        {
            text[i].setX(cir[i].getCenterX());
            text[i].setY(cir[i].getCenterY() - rad);
            text[i].setText(String.format("%.2f", Math.toDegrees(angle[i])));
        }
    }
}
