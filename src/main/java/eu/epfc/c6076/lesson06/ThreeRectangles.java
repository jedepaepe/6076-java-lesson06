package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ThreeRectangles extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.fillRect(100, 50, 100, 100);

        gc.setFill(Color.GREEN);
        gc.fillRect(300, 100, 100, 100);

        gc.setFill(Color.BLUE);
        gc.fillRect(50, 300, 100, 100);

        stage.setTitle("three rectangles");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
}
