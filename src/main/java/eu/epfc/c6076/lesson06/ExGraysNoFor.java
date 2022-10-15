package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ExGraysNoFor extends Application {
    @Override
    public void start(Stage stage) {
        double width = 100;
        int nr = 5;
        Canvas canvas = new Canvas(nr * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.WHEAT);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.setFill(Color.color(0, 0, 0));
        gc.fillOval(0, 0, width, 3 * width);

        double percent = 1/4.;
        gc.setFill(Color.color(percent, percent, percent));
        gc.fillOval(100, 0, width, 3 * width);

        percent = 2/4.;
        gc.setFill(Color.color(percent, percent, percent));
        gc.fillOval(200, 0, width, 3 * width);

        percent = 3/4.;
        gc.setFill(Color.color(percent, percent, percent));
        gc.fillOval(300, 0, width, 3 * width);

        gc.setFill(Color.color(1, 1, 1));
        gc.fillOval(400, 0, width, 3 * width);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("progression de gris");
        stage.show();
    }
}
