package eu.epfc.c6076.lesson06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OvalFullyInsideZone extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        double width = 40;
        Canvas canvas = new Canvas(5 * width, 3 * width);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.GREEN);
        gc.fillRect(0, 0, canvas.getWidth() - width, canvas.getHeight() - width);

        gc.setFill(Color.BLACK);
        double fontSize = 16;
        gc.setFont(new Font("courier new", fontSize));
        gc.setStroke(Color.BLACK);

        gc.strokeRect(50, canvas.getHeight() - width, 1, canvas.getHeight());
        gc.fillText((int) width + "px", 55, canvas.getHeight() - width / 2 + fontSize / 3);

        gc.strokeRect(canvas.getWidth() - width, 50, canvas.getWidth(), 1);
        gc.fillText((int) width + "px", canvas.getWidth() - width + 1, 50 + 1.2 * fontSize);

        stage.setScene(new Scene(new VBox(canvas)));
        stage.setTitle("random circle");
        stage.show();
    }
}
