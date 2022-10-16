package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RandomCircles extends Application {
    @Override
    public void start(Stage stage) {
        double radius = 20;
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.LIGHTYELLOW);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.PURPLE);
        for (int i = 0; i < 500; ++i) {
            double x = Math.random() * (canvas.getWidth() - radius);
            double y = Math.random() * (canvas.getHeight() - radius);
            gc.fillOval(x, y, radius, radius);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("cercles placés au hazard");
        stage.show();
    }
}
