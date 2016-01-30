import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Maila on 30/01/2016.
 */
public class RingVarv1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(50);
        ColorPicker color = new ColorPicker();
        circle.setFill(color.getValue());

        color.setOnAction(event -> {
            circle.setFill(color.getValue());
        });

        VBox v = new VBox();
        v.setSpacing(10);
        v.setPadding(new Insets(10,10,10,10));
        v.getChildren().addAll(color, circle);
        v.setAlignment(Pos.CENTER);

        Scene sc = new Scene(v);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
