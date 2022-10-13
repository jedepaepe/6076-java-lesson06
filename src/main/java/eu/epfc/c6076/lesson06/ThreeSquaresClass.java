package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ThreeSquaresClass extends Application {
    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Square[] squares = {
                new Square(Color.RED, 100, 50),
                new Square(Color.GREEN, 300, 100),
                new Square(Color.BLUE, 50, 300)
        };
        for (Square square : squares) {
            gc.setFill(square.color());
            gc.fillRect(square.x(), square.y(), 100, 100);
        }

        stage.setTitle("three squares with record");
        stage.setScene(new Scene(new VBox(canvas)));
        stage.show();
    }
}
