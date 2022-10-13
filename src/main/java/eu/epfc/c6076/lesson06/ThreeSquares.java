package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ThreeSquares extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.fillRect(100, 50, 100, 100);

        gc.setFill(Color.GREEN);
        gc.fillRect(300, 100, 100, 100);

        gc.setFill(Color.BLUE);
        gc.fillRect(50, 300, 100, 100);

        stage.setTitle("three squares");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
}
