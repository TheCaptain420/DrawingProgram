import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class RunApplication extends Application {
    //scene.snapshot();//Ændrer baggrunden?

    //Komplet guide
    //https://docs.oracle.com/javafx/2/canvas/jfxpub-canvas.htm

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Scene scene = new Scene(root, 600,600);
        primaryStage.setX(300);
        primaryStage.setY(0);

        primaryStage.setTitle("Draw");
        primaryStage.setScene(scene);
        primaryStage.show();



        //Class der følger mus
        FollowMouse followMouse = new FollowMouse();
        //Class der bestemmer hvilken type man vil tegne med.
        StylusType stylusType = new StylusType(1,Color.RED,10);
        //SelectionWindow
        SelectionWindow selectionWindow = new SelectionWindow();
        selectionWindow.runSelectionWindow();

        Canvas canvas = new Canvas(600,600);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();






        scene.setOnMouseDragged(event -> {
            gc.setFill(Color.RED);
            gc.setStroke(Color.BLACK);
            gc.setLineWidth(selectionWindow.getSliderSize());
            //gc.strokeOval(event.getSceneX(),event.getSceneY(),1,1);
            gc.strokeLine(event.getSceneX(),event.getSceneY(),event.getSceneX(),event.getSceneY());
        });

        //Her tilføjer man den røde dot
        //root.getChildren().add(stylusType.getTheNode());//Her tilføjer jeg node.





    }

    public static void main(String[] args) {
        launch(args);
    }
}
