package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NForms extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        FormParameters[] parameters = {
                new FormParameters(false, Color.DARKGOLDENROD, 100, 120, 400),
                new FormParameters(true, Color.DARKCYAN, -50, -50, 500),
                new FormParameters(true, Color.DARKMAGENTA, 200, 200, 250),
                new FormParameters(false, Color.DARKBLUE, 80, 100, 150)
        };

        for (FormParameters p : parameters) {
            gc.setFill(p.color());
            if (p.isCircle()) {
                gc.fillOval(p.x(), p.y(), p.size(), p.size());
            } else {
                gc.fillRect(p.x(), p.y(), p.size(), p.size());
            }
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("n forms - records");
        stage.show();
    }
}
