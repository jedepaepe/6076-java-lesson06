package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoRandom extends Application {
    @Override
    public void start(Stage stage) {
        double width = 40;
        Canvas canvas = new Canvas(5 * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.YELLOW);
        double x = Math.random() * canvas.getWidth();
        double y = Math.random() * canvas.getHeight();
        gc.fillOval(x, y, width, width);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("random circle");
        stage.show();
    }
}
