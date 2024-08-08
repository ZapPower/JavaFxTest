package ClosingProperly;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button b1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Closing Program Properly Tutorial");

        b1 = new Button("Close Program");
        b1.setOnAction(e -> closeProgram());
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        StackPane l1 = new StackPane();
        l1.getChildren().add(b1);
        Scene s = new Scene(l1, 300, 250);
        window.setScene(s);
        window.show();
    }

    private void closeProgram() {
        boolean ans = ConfirmBox.display("Closing Prompt", "Are you sure you want to close?");

        if (ans) {
            window.close();
        }
    }
}