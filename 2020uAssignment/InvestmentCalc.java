import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class InvestmentCalc extends Application
{
    TextField amountOfInvestment = new TextField();
    TextField numYears = new TextField();
    TextField interestRateAnnual = new TextField();
    TextField futureValue = new TextField();
    Button calc = new Button("Calculate");

    @Override
    public void start(Stage primaryStage)
    {
        GridPane pane = new GridPane();
        pane.setVgap(5);
        pane.setHgap(5);
        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(amountOfInvestment, 1, 0);
        pane.add(new Label("Number Of Years:"), 0, 1);
        pane.add(numYears, 1, 1);
        pane.add(new Label("Annual Interest Rate:"), 0, 2);
        pane.add(interestRateAnnual, 1, 2);
        pane.add(new Label("Future value:"), 0, 3);
        pane.add(futureValue, 1, 3);
        pane.add(calc, 1, 4);

        // Set the UI properties
        pane.setAlignment(Pos.CENTER);
        amountOfInvestment.setAlignment(Pos.BOTTOM_RIGHT);
        numYears.setAlignment(Pos.BOTTOM_RIGHT);
        interestRateAnnual.setAlignment(Pos.BOTTOM_RIGHT);
        futureValue.setAlignment(Pos.BOTTOM_RIGHT);
        futureValue.setEditable(false);
        pane.setHalignment(calc, HPos.RIGHT);
        pane.setPadding(new Insets(10, 10, 10, 10));

        // Process the events
        calc.setOnAction(e -> futureValue());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("InvestmentCalc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void futureValue()
    {
        double investAmount = Double.parseDouble(amountOfInvestment.getText());
        int years = Integer.parseInt(numYears.getText());
        double monthlyInterestRate =
                Double.parseDouble(interestRateAnnual.getText()) / 1200;
        futureValue.setText(String.format("$%.2f",
                (investAmount * Math.pow(1 + monthlyInterestRate, years * 12))));
    }
}