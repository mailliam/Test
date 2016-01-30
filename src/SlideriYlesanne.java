import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista ring, mille suurust saab kasutaja Slideriga muuta
 */
public class SlideriYlesanne extends Application {
    Circle circle;
    Slider slider;
    StackPane stack;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox v = new VBox();
        stack = new StackPane();


        slider = new Slider();
        slider.setValue(40);
        slider.setShowTickLabels(true);

        circle = new Circle(slider.getValue());

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            circle.setRadius(slider.getValue());
        });

        circle.setOnMouseClicked(event -> {
            circle.setFill(Color.rgb((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256)));
        });

        v.getChildren().addAll(slider, circle);
        Scene sc = new Scene(v);
        primaryStage.setScene(sc);
        primaryStage.show();
    }



}
