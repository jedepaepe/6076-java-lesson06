package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExGrays extends Application {
    @Override
    public void start(Stage stage) {
        double width = 100;
        int nr = 5;
        Canvas canvas = new Canvas(nr * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.WHEAT);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (int i = 0; i < nr; ++i) {
            double percent = i * 1. / (nr - 1);
            gc.setFill(Color.color(percent, percent, percent));
            gc.fillOval(i * width, 0, width, 3 * width);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("progression de gris");
        stage.show();
    }
}
