package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ThreeRectanglesAdvanced extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };
        int[] xs = { 100, 300, 50 };
        int[] ys = { 50, 100, 300 };

        for (int i = 0; i < colors.length; ++i) {
            gc.setFill(colors[i]);
            gc.fillRect(xs[i], ys[i], 100, 100);
        }

        stage.setTitle("three rectangles - advanced version");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
}
