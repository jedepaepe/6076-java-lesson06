package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OvalExplained extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.BLACK);
        gc.strokeRect(100, 100, 400, 400);
        gc.setFill(Color.YELLOW);
        gc.fillOval(100, 100, 400, 400);
        gc.setFill(Color.BLACK);
        gc.setFont(new Font("courier new", 24));
        gc.fillText("(x,y)", 26, 96);
        gc.fillOval(95, 95, 10, 10);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("(x,y) des ellipses");
        stage.show();
    }
}
