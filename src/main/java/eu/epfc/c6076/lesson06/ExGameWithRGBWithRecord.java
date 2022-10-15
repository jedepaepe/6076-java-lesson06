package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExGameWithRGBWithRecord extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Circle[] circles = {
                new Circle(Color.color(1, 1, 0), 0, 0, 100),
                new Circle(Color.color(0, 1, 1), 100, 100, 100),
                new Circle(Color.color(1, 0, 1), 200, 200, 100)
        };

        for (Circle c : circles) {
            gc.setFill(c.color());
            gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("jouons avec rgb");
        stage.show();

    }
}
