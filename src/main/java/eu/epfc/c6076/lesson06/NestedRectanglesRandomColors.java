package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NestedRectanglesRandomColors extends Application {
    @Override
    public void start(Stage stage) {
        double width = 25;
        int nr = 20;
        Canvas canvas = new Canvas(width * nr, width * nr);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < nr; ++i) {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            double x = i * width / 2;
            double size = canvas.getWidth() - i * width;
            gc.fillRect(x, x, size, size);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("rectangles imbriqués avec des couleurs tirées au hazard");
        stage.show();
    }
}
