package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NestedSquaresCircles extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (double radius = canvas.getWidth(); radius >= 1; radius = radius / Math.sqrt(2)) {
            double x = (canvas.getWidth() - radius) / 2;
            double y = (canvas.getHeight() - radius) / 2;
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(x, y, radius, radius);
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillOval(x, y, radius, radius);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carrés et cercles imbriqués et de couleur tirée au hazard");
        stage.show();
    }
}
