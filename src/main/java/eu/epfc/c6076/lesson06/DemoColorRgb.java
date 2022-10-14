package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DemoColorRgb extends Application {
    @Override
    public void start(Stage stage) {
        int size = 50;
        Canvas canvas = new Canvas(10 * size, 2 * size);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // du bleu de différentes manières // première ligne
        gc.setFill(Color.BLUE);
        gc.fillOval(0, 0, size, size);

        //                     R  G  B
        gc.setFill(Color.color(0, 0, 1));      // B=1 => bleu au maximum
        gc.fillOval(size, 0, size, size);

        //                   R  G, B
        gc.setFill(Color.rgb(0, 0, 255));     // B=255 => bleu au maximum
        gc.fillOval(2 * size, 0, size, size);

        //                     R  G  B   alpha (opacité)
        gc.setFill(Color.color(0, 0, 1, 1));  // B=1 => bleu au maximum
        gc.fillOval(3 * size, 0, size, size);

        //                   R  G  B   alpha (opacité)
        gc.setFill(Color.rgb(0, 0, 255, 1));    // B=255 => bleu au maximum
        gc.fillOval(4 * size, 0, size, size);

        gc.setFill(Color.rgb(0, 0, 255, 0.8));
        gc.fillOval(5 * size, 0, size, size);

        gc.setFill(Color.rgb(0, 0, 255, 0.6));
        gc.fillOval(6 * size, 0, size, size);

        gc.setFill(Color.rgb(0, 0, 255, 0.4));
        gc.fillOval(7 * size, 0, size, size);

        gc.setFill(Color.rgb(0, 0, 255, 0.2));
        gc.fillOval(8 * size, 0, size, size);

        gc.setFill(Color.rgb(0, 0, 255, 0));
        gc.fillOval(9 * size, 0, size, size);

        // du rouge au bleu // seconde ligne
        //                   R    G  B
        gc.setFill(Color.rgb(255, 0, 0));   // R=255 => rouge maximum
        gc.fillOval(0, size, size, size);

        //                   R    G  B
        gc.setFill(Color.rgb(225, 0, 25));  // R=225 => rouge fort + B=25 bleu faible
        gc.fillOval(size, size, size, size);

        gc.setFill(Color.rgb(200, 0, 50));
        gc.fillOval(size, size, size, size);

        gc.setFill(Color.rgb(175, 0, 75));
        gc.fillOval(2 * size, size, size, size);

        gc.setFill(Color.rgb(150, 0, 100));
        gc.fillOval(3 * size, size, size, size);

        gc.setFill(Color.rgb(125, 0, 125));
        gc.fillOval(4 * size, size, size, size);

        gc.setFill(Color.rgb(100, 0, 150));
        gc.fillOval(5 * size, size, size, size);

        gc.setFill(Color.rgb(75, 0, 175));
        gc.fillOval(6 * size, size, size, size);

        gc.setFill(Color.rgb(50, 0, 200));
        gc.fillOval(7 * size, size, size, size);

        gc.setFill(Color.rgb(25, 0, 225));
        gc.fillOval(8 * size, size, size, size);

        gc.setFill(Color.rgb(0, 0, 255));
        gc.fillOval(9 * size, size, size, size);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("démo couleurs RGB - Red Green Bleu");
        stage.show();
    }
}
