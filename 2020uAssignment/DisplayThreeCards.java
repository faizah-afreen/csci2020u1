import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

public class DisplayThreeCards extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        // Create a HBox pane
        HBox hPane = new HBox(5);
        hPane.setPadding(new Insets(5, 5, 5, 5));

        // Create a list of card numbers
        ArrayList <Integer> allCards = getCards();

        // Add nodes to pane
        for (int i = 0; i < 3; i++)
        {
            hPane.getChildren().add(new ImageView(new Image("Image/Cards/" + allCards.get(i) + ".png")));
        }

        Scene scene = new Scene(hPane);
        primaryStage.setTitle("DisplayThreeCards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Returns a list from numbers 1-52, in random order
    private ArrayList<Integer> getCards()
    {
        ArrayList <Integer> allCards = new ArrayList <> ();

        for (int i = 0; i < 52; i++)
        {
            allCards.add(i + 1);
        }

        java.util.Collections.shuffle(allCards);

        return allCards;
    }
}