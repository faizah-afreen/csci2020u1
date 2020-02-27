
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataSource extends Application
{
    TableView <StudentRecord> table;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //SID Column
        TableColumn <StudentRecord, String> id = new TableColumn <> ("SID");
        id.setMinWidth(100);
        id.setCellValueFactory(new PropertyValueFactory <> ("studentID"));

        //Assignments Column
        TableColumn <StudentRecord, Float> assign = new TableColumn <> ("Assignments");
        assign.setMinWidth(100);
        assign.setCellValueFactory(new PropertyValueFactory <> ("assignments"));

        //Midterm Column
        TableColumn <StudentRecord, Float> mid = new TableColumn <> ("Midterm");
        mid.setMinWidth(100);
        mid.setCellValueFactory(new PropertyValueFactory <> ("midterm"));

        //Final Exam Column
        TableColumn <StudentRecord, Float> exam = new TableColumn <> ("Final Exam");
        exam.setMinWidth(100);
        exam.setCellValueFactory(new PropertyValueFactory <> ("finals"));

        //Final Mark Column
        TableColumn <StudentRecord, Double> finMark = new TableColumn <> ("Final Mark");
        finMark.setMinWidth(100);
        finMark.setCellValueFactory(new PropertyValueFactory <> ("marks"));

        //Letter Grade Column
        TableColumn <StudentRecord, Character> grade = new TableColumn <> ("Letter Grade");
        grade.setMinWidth(100);
        grade.setCellValueFactory(new PropertyValueFactory <> ("grades"));

        table = new TableView<>();
        table.setItems(getAllMarks());
        table.getColumns().addAll(id, assign, mid, exam, finMark, grade);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox,600,280);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StudentRecord");
        primaryStage.show();
    }

    public static ObservableList <StudentRecord> getAllMarks()
    {
        ObservableList <StudentRecord> marks = FXCollections.observableArrayList();

        //                              student ID, assignments, midterm, final exam
        marks.add(new StudentRecord("100100100", 75.0f, 68.0f, 54.25f));
        marks.add(new StudentRecord("100100101", 70.0f, 69.25f, 51.5f));
        marks.add(new StudentRecord("100100102", 100.0f, 97.0f, 92.5f));
        marks.add(new StudentRecord("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new StudentRecord("100100104", 72.25f, 74.75f, 58.25f));
        marks.add(new StudentRecord("100100105", 85.0f, 56.0f, 62.5f));
        marks.add(new StudentRecord("100100106", 70.0f, 66.5f, 61.75f));
        marks.add(new StudentRecord("100100107", 55.0f, 47.0f, 50.5f));
        marks.add(new StudentRecord("100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new StudentRecord("100100109", 82.5f, 77.0f, 74.25f));

        return marks;
    }
}
