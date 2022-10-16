package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FourNestedRectanglesRandomColors extends Application {
    @Override
    public void start(Stage stage) {
        double width = 20;
        int nr = 20;
        int parts = 2;
        Canvas canvas = new Canvas(width * nr * parts, width * nr * parts);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (double baseX = 0; baseX < canvas.getWidth(); baseX = baseX + canvas.getWidth() / parts) {
            for (double baseY = 0; baseY < canvas.getHeight(); baseY = baseY + canvas.getHeight() / parts) {
                for (int i = 0; i < nr; ++i) {
                    gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    double x = baseX + i * width / 2;
                    double y = baseY + i * width / 2;
                    double size = canvas.getWidth() / parts - i * width;
                    gc.fillRect(x, y, size, size);
                }
            }
        }

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("rectangles imbriqués avec des couleurs tirées au hazard");
        stage.show();
    }
}
