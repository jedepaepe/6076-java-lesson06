package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExNestedSquares extends Application {
    @Override
    public void start(Stage stage) {
        double nr = 10;
        double delta = 50;
        Canvas canvas = new Canvas(nr * delta, nr * delta);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int i = 0; i < nr; ++i) {
            gc.setFill(Color.color(0, i / nr, 1));
            gc.fillRect(i * delta / 2, i * delta / 2, canvas.getWidth() - i * delta, canvas.getHeight() - i * delta);
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("carrés imbriqués");
        stage.show();
    }
}
