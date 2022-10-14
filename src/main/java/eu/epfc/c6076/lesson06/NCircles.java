package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NCircles extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Circle[] circles = {
                new Circle(Color.LIGHTCORAL, -120, 100, 600),
                new Circle(Color.ALICEBLUE, 180, 20, 450),
                new Circle(Color.ORANGE, 10, 10, 100),
                new Circle(Color.AQUAMARINE, 200, 300, 150),
                new Circle(Color.YELLOW, 30, 150, 120),
                new Circle(Color.AQUA, 300, 200, 110)
        };

        for(Circle c : circles) {
            gc.setFill(c.color());
            gc.fillOval(c.x(), c.y(), c.radius(), c.radius());
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("n circles - records");
        stage.show();
    }
}
