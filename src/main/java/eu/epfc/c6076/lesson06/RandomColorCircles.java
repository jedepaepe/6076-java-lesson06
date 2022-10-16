package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RandomColorCircles extends Application {
    @Override
    public void start(Stage stage) {
        double radius = 20;
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i = 0; i < 2000; ++i) {
            double x = Math.random() * (canvas.getWidth() - radius);
            double y = Math.random() * (canvas.getHeight() - radius);
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillOval(x, y, radius, radius);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("cercles placés au hazard et de couleurs tirées au hazard");
        stage.show();
    }
}
