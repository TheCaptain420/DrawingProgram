import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FollowMouse {
    void followTheDragMouse(double x, double y, Node node){
        TranslateTransition transition = new TranslateTransition();

        transition.setDuration(Duration.millis(0.1));//Hvor lang tid den tager at køre derned..
        transition.setToX(x);
        transition.setToY(y);
        transition.setNode(node);
        transition.play();
    }

}
