import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RunApplication extends Application {


    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Scene scene = new Scene(root, 600,600);
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








        scene.setOnMouseDragged(event -> {
            if(event.isPrimaryButtonDown()){
                //event.getSceneX()'erne er mouse pos
                //Ændre den sidste para for at skrift "mousestyle"
                followMouse.followTheDragMouse(event.getSceneX(),event.getSceneY(),stylusType.getTheNode());
            }

        });

        root.getChildren().add(stylusType.getTheNode());//Her tilføjer jeg node.





    }

    public static void main(String[] args) {
        launch(args);
    }
}
