package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExGameWithRGB extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.color(1, 1, 0));
        gc.fillOval(0, 0, 100, 100);

        gc.setFill(Color.color(0, 1, 1));
        gc.fillOval(100, 100, 100, 100);

        gc.setFill(Color.color(1, 0, 1));
        gc.fillOval(200, 200, 100, 100);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("jouons avec rgb");
        stage.show();
    }
}
