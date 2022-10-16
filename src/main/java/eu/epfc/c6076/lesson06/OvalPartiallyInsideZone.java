package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OvalPartiallyInsideZone extends Application {
    @Override
    public void start(Stage stage) {
        double width = 40;
        Canvas canvas = new Canvas(5 * width + width, 3 * width + width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.GREEN);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(Color.LIGHTGREEN);
        gc.fillRect(width, width, canvas.getWidth(), canvas.getHeight());

        gc.setStroke(Color.BLACK);
        gc.strokeRect(width, width, canvas.getWidth() - width, canvas.getHeight() - width);
        double fontSize = 16;
        gc.setFont(new Font("courier new", fontSize));
        gc.setFill(Color.BLACK);
        gc.fillText("fenêtre", canvas.getWidth() / 2, canvas.getHeight() / 2 + fontSize);
        gc.strokeRect(50, 0, 1, width);
        gc.fillText("-" + (int) width + "px", 55, fontSize + 10);
        gc.strokeRect(0, 50, width, 1);
        gc.fillText("-" + (int) width + "px", 5, fontSize + 60);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("random circle");
        stage.show();
    }
}
