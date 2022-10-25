package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LightsInTheNights extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int nrLines = 250;
        double lineWidth = canvas.getWidth() / nrLines;

        gc.setFill(Color.rgb(0, 0, 50));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (int i = 0; i < nrLines; ++i) {
            gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            gc.fillRect(i * lineWidth, 0, lineWidth, Math.random() * canvas.getWidth());
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("lights in the night");
        stage.show();
    }
}
