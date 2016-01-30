import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille värvi saab kasutaja muuta
 */
public class RingVarvRandom extends Application {

    int[] varvid;
    int r = 0;
    int g = 0;
    int b = 0;
    StackPane stack = new StackPane();


    @Override
    public void start(Stage primaryStage) throws Exception {
        stack.getChildren().addAll(uusRing());
        Scene sc = new Scene(stack);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    private Circle uusRing() {
        Circle circle = new Circle(50);
        circle.setFill(Color.rgb(r, g, b));

        circle.setOnMouseClicked(event -> {
            varviGeneraator();
            uusRing();
            circle.setFill(Color.rgb(varviGeneraator()[0], varviGeneraator()[1], varviGeneraator()[2]));
        });
        return circle;
    }

    private int[] varviGeneraator() {
        varvid = new int[3];
        for (int i = 0; i < 3; i++) {
            varvid[i] = (int) (Math.random()*256);
        }
        return varvid;
    }


}
