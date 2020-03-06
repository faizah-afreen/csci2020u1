import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Histogram extends Application
{
    Pane pane = new Pane();
    TextField text = new TextField();
    VBox box = new VBox();

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Label nameOfFile = new Label("Filename:", text);
        nameOfFile.setContentDisplay(ContentDisplay.RIGHT);
        text.setPrefColumnCount(20);

        Button view = new Button("View");

        HBox hBox = new HBox(nameOfFile, view);

        view.setOnAction(e ->
        {
            Histogram graph = new Histogram();
            pane.getChildren().add(graph);
            box.setTranslateY(10);
            primaryStage.sizeToScene();
        });

        box.getChildren().addAll(pane, hBox);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}