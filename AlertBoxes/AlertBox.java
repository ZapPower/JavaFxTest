package AlertBoxes;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
    public static void display(String title, String message) {
        Stage alertWindow = new Stage();

        alertWindow.initModality(Modality.APPLICATION_MODAL);
        alertWindow.setTitle(title);
        alertWindow.setMinWidth(250);

        Label l = new Label();
        l.setText(message);

        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> {
            alertWindow.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(l, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        alertWindow.setScene(scene);
        alertWindow.showAndWait();

    }
}
