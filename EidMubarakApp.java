import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EidMubarakApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Happy Eid Mubarak");

        Label heading1 = new Label("Happy Eid Mubarak!");
        Label heading2 = new Label("عيد مبارك");
        Label heading3 = new Label("To You And Your Family");
        Label heading4 = new Label("2022");

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(heading1, heading2, heading3, heading4);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
    

