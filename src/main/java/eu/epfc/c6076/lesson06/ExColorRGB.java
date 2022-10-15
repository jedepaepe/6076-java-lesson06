package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExColorRGB extends Application {

    @Override
    public void start(Stage stage) {
        double width = 50;
        double nr = 10;
        Canvas canvas = new Canvas(nr * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < nr; ++i) {
            double percent = i / (nr - 1);
            gc.setFill(Color.color(1 - percent, percent, 0));
            gc.fillOval(i * width, 0, width, width);
            gc.setFill(Color.color(0, 1 - percent, percent));
            gc.fillOval(i * width, width, width, width);
            gc.setFill(Color.color(percent, 0, 1 - percent));
            gc.fillOval(i * width, 2 * width, width, width);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("color RGB red-green-blue");
        stage.show();
    }
}
